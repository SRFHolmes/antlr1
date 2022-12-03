package com.example.testantlr4.service;

import com.alibaba.fastjson2.JSON;
import com.example.testantlr4.gen_cpp.*;
import com.example.testantlr4.utils.testCpp.EvalVisitor;
import org.antlr.v4.runtime.*;
import com.example.testantlr4.gen_cpp.TestCPPPaser;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class MainServiceImpl {
    private static boolean funAddAdded = false;

    public List<Map<String, Object>> getParserResult(String inputCode) {
        EvalVisitor evalByVisitor = new EvalVisitor();
        return evalByVisitor.visit(loadContext(inputCode));
    }

    public Map<String, Object> getTranslationResult(String inputCode) throws IOException {
        Map<String, Object> result = transLateResult(inputCode, null);
        funAddAdded = false;
        return result;
    }

    private Map<String, Object> transLateResult(String inputCode, MultipartFile file) throws IOException {
        Lexer lexer;
        List<String> codes;
        if (file == null) {
            lexer = new TestCPPLexer(CharStreams.fromString(inputCode));
            codes = Arrays.asList(inputCode.split("\n"));
        } else {
            lexer = new TestCPPLexer(CharStreams.fromStream(file.getInputStream(), StandardCharsets.UTF_8));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file.getInputStream()));
            String lineTxt = "";
            codes = new ArrayList<>();
            while ((lineTxt = bufferedReader.readLine()) != null) {
                codes.add(lineTxt);
            }
        }
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TestCPPPaser parser = new TestCPPPaser(tokenStream);
        TestCPPPaser.DeclarationseqContext context = parser.declarationseq();

        EvalVisitor evalByVisitor = new EvalVisitor();
        List<Map<String, Object>> visitResult = evalByVisitor.visit(context);
        System.out.println(visitResult);
        System.out.println();

        List<String> oldCodes = Arrays.asList(inputCode.split("\n"));

        int lineShift = 0;
        int addLines = 0;

        for (Map<String, Object> codeMatch : visitResult) {
            if ("例1".equals(codeMatch.get("ruleName"))) {
                if (!funAddAdded) {
                    codes = addFunctionCode(codes, getFunAddCode());
                    addLines += getFunAddCode().size();
                }
                codes = replaceCodeAsLiOne(codes, codeMatch, lineShift, addLines);
                lineShift += Integer.parseInt(String.valueOf(codeMatch.get("stopLine"))) - Integer.parseInt(String.valueOf(codeMatch.get("startLine")));
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < codes.size(); i++) {
            String color = "red";
            for (int j = 0; j < oldCodes.size(); j++) {
                if (oldCodes.contains(codes.get(i))) {
                    color = "black";
                    break;
                }
            }
            List<String> temp = new ArrayList<>();
            temp.add(codes.get(i));
            temp.add(color);
            result.add(temp);
        }
        Map<String, Object> results = new HashMap<>();
        results.put("codeWithColor", result);
        results.put("translationResult", codes);
        return results;
    }

    private TestCPPPaser.DeclarationseqContext loadContext(String inputCode) {
        Lexer lexer = new TestCPPLexer(CharStreams.fromString(inputCode));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TestCPPPaser parser = new TestCPPPaser(tokenStream);
        TestCPPPaser.DeclarationseqContext context = parser.declarationseq();
        return context;
    }

    private static List<String> addFunctionCode(List<String> codes, List<String> funAddCode) {
        int mainLine = -1;
        for (int i = 0; i < codes.size(); i++) {
            String code = codes.get(i);
            if (code.contains("main(")) {
                mainLine = i;
                break;
            }
        }
        List<String> headCodes = codes.subList(0, mainLine);
        List<String> tailCodes = codes.subList(mainLine, codes.size() - 1);
        List<String> result = new ArrayList<>();
        result.addAll(headCodes);
        result.addAll(funAddCode);
        result.addAll(tailCodes);
        return result;
    }


    private static List<String> replaceCodeAsLiOne(List<String> codes, Map<String, Object> codeMatch, int lineShift, int addLine) {
        int startLine = Integer.parseInt(String.valueOf(codeMatch.get("startLine"))) - lineShift + addLine;
        int stopLine = Integer.parseInt(String.valueOf(codeMatch.get("stopLine"))) - lineShift + addLine;
        for (int i = 0; i < codes.size(); i++) {
            System.out.println((i + 1) + ":\t" + codes.get(i));
        }
        System.out.println(startLine + ":" + codes.get(startLine - 1));
        System.out.println(stopLine + ":" + codes.get(stopLine - 1));
        Map<String, Object> elements = (Map<String, Object>) codeMatch.get("elements");
        String newCode = "";
        for (int i = 0; i < codes.get(startLine - 1).length(); i++) {
            String tempStr = codes.get(startLine - 1).substring(i, i + 1);
            if (" ".equals(tempStr)) {
                newCode += tempStr;
            } else {
                break;
            }
        }
        newCode += "add << <1, block >> > (" + elements.get("A") + ", " + elements.get("B") + ", " + elements.get("LenI") + "," + elements.get("LenJ") + ");  //1个kernel";
        System.out.println(newCode);
        codes.set(startLine - 1, newCode);
        for (int i = startLine; i < stopLine; i++) {
            codes.remove(startLine);
        }
        return codes;
    }

    private static List<String> getFunAddCode() {
        funAddAdded = true;
        List<String> funCodes = new ArrayList<>();
        funCodes.add("__global__ void add(int* A, int* B, int LenI, int LenJ) {");
        funCodes.add("    int index = threadIdx.x;");
        funCodes.add("    int stride = blockDim.x * blockDim.y;");
        funCodes.add("    for (; index < LenJ ; index = index + stride){");
        funCodes.add("        for (int i = 0; i < LenI - 1; i++) {   ");
        funCodes.add("            A[Index((i + 1), index)] = A[Index(i, index)] + B[Index(i, index)];");
        funCodes.add("        }");
        funCodes.add("    }");
        funCodes.add("}");
        funCodes.add("");
        return funCodes;
    }

    public Map<String, Object> getTranslationResultByFile(MultipartFile file, HttpServletResponse response) throws IOException {
        Map<String, Object> result = transLateResult("", file);
        String fileText = "";
        for (String code : (List<String>) result.get("translationResult")) {
            fileText += code + "\n";
        }
        String[] fileNameSplitResults = file.getOriginalFilename().split("[.]");
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-hh-mm-ss");

        String fileName = fileNameSplitResults[0] + "_trans" + "_" + dateFormat.format(date) + "." + fileNameSplitResults[fileNameSplitResults.length - 1];
        exportTxt(response, fileText, fileName);
        return result;
    }

    public void exportTxt(HttpServletResponse response, String text, String fileName) {
        response.setCharacterEncoding("utf-8");
        //设置响应的内容类型
        response.setContentType("text/plain");
        //设置文件的名称和格式
        response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
        BufferedOutputStream buff = null;
        ServletOutputStream outStr = null;
        try {
            outStr = response.getOutputStream();
            buff = new BufferedOutputStream(outStr);
            buff.write(text.getBytes("UTF-8"));
            buff.flush();
            buff.close();
        } catch (Exception e) {
            //LOGGER.error("导出文件文件出错:{}",e);
        } finally {
            try {
                buff.close();
                outStr.close();
            } catch (Exception e) {
                //LOGGER.error("关闭流对象出错 e:{}",e);
            }
        }
    }

}

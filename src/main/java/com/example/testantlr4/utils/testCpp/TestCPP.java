package com.example.testantlr4.utils.testCpp;

import com.example.testantlr4.gen_cpp.*;
import org.antlr.v4.runtime.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class TestCPP {
    public static boolean funAddAdded = false;

    public static void main(String[] args) throws IOException {

        String fileName = "test.cpp";

        String outputName = fileName.split("\\.")[0]+".cu";

        Lexer lexer = new TestCPPLexer(CharStreams.fromFileName(fileName));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TestCPPPaser parser = new TestCPPPaser(tokenStream);
        TestCPPPaser.DeclarationseqContext context = parser.declarationseq();

        System.out.println("Visitor:");
        EvalVisitor evalByVisitor = new EvalVisitor();
        List<Map<String, Object>> result = evalByVisitor.visit(context);
        System.out.println(result);
        System.out.println();

        List<String> codes = readCodeFile(fileName);

        int lineShift = 0;
        int addLines = 0;

        for (Map<String, Object> codeMatch : result) {


            if ("1".equals(codeMatch.get("ruleName"))) {
                if (!funAddAdded) {
                    codes = addFunctionCode(codes, getFunAddCode("1",codeMatch));
                    addLines += getFunAddCode("1",codeMatch).size();
                }
                codes = replaceCodeAsLiOne(codes, codeMatch, lineShift, addLines,"1");
                lineShift += Integer.parseInt(String.valueOf(codeMatch.get("stopLine"))) - Integer.parseInt(String.valueOf(codeMatch.get("startLine")));
            }else if("3".equals(codeMatch.get("ruleName"))){
                if (!funAddAdded) {
                    codes = addFunctionCode(codes, getFunAddCode("3",codeMatch));
                    addLines += getFunAddCode("3",codeMatch).size();
                }
                codes = replaceCodeAsLiOne(codes, codeMatch, lineShift, addLines,"3");
                lineShift += Integer.parseInt(String.valueOf(codeMatch.get("stopLine"))) - Integer.parseInt(String.valueOf(codeMatch.get("startLine")));
            }else if("4".equals(codeMatch.get("ruleName"))){
                if (!funAddAdded) {
                    codes = addFunctionCode(codes, getFunAddCode("4",codeMatch));
                    addLines += getFunAddCode("4",codeMatch).size();
                }
                codes = replaceCodeAsLiOne(codes, codeMatch, lineShift, addLines,"4");
                lineShift += Integer.parseInt(String.valueOf(codeMatch.get("stopLine"))) - Integer.parseInt(String.valueOf(codeMatch.get("startLine")));
            }
        }
        saveNewCode(codes, outputName);



//
//        System.out.println(context.toStringTree(parser));
//        for (ParseTree node : context.children) {
//            if (node.getText().equals("for")) {
//                System.out.println(node);
//            }
//        }
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


    private static List<String> replaceCodeAsLiOne(List<String> codes, Map<String, Object> codeMatch, int lineShift, int addLine,String ruleName) {
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
        String[] var=JSON.parseObject((String)elements.get("var"),String[].class);
        List<String> len=JSON.parseObject((String)elements.get("Len"),new TypeReference<List<String>>() {});

        for(int i=0;i<var.length;i++){
            newCode+="    int* dev_"+var[i]+";\n";
        }
        newCode+="   cudaMemcpy(";
        for(int i=0;i<var.length;i++){
            newCode+="dev_"+var[i]+", ";
        }
        newCode+="sizeof(int) * size, cudaMemcpyHostToDevice);\n";
        if(ruleName.equals("1")){

            String var1=var[0];
            String var2=var[1];
            String rest="";
            for(int i=0;i<3;i++){

                rest+=","+len.get(i);
            }

            newCode +=

                    "   add << <1, block >> > (dev_" + var1 + ", dev_" + var2 + ", " + rest+ ");  //1个kernel\n" +
                    "   cudaMemcpy("+var1+", dev_"+var1+", sizeof(int) * size, cudaMemcpyDeviceToHost);\n" ;

        }else if(ruleName.equals("3")){
            String[][] info = JSON.parseObject((String)elements.get("info"),String[][].class);
            String var1=var[0];
            String var2=var[1];
            int out=Integer.valueOf((String)elements.get("out"));
            String rest="";
            for(int i=0;i<3;i++){
                if(i!=out)
                    rest+=","+len.get(i);
            }
            newCode +=
                    "   add << <1, "+len.get(out)+" >> > (dev_" + var1 + ", dev_" + var2 + rest+ ");  //1个kernel\n" +
                    "   cudaMemcpy("+var1+", dev_"+var1+", sizeof(int) * size, cudaMemcpyDeviceToHost);\n" ;



        }else if(ruleName.equals("4")){
            String[][] info = JSON.parseObject((String)elements.get("info"),String[][].class);
            String var1=var[0];
            String var2=var[1];

            String[] constantValues=JSON.parseObject((String)elements.get("constant"),String[].class);
            String rest="";
            for(int i=0;i<constantValues.length;i++){

                rest+=","+constantValues[i];
            }
            newCode +=
                    "   add << <1, block >> > (dev_" + var1 + ", dev_" + var2 + rest+","+len.get(0)+ ");  //1个kernel\n" +
                            "   cudaMemcpy("+var1+", dev_"+var1+", sizeof(int) * size, cudaMemcpyDeviceToHost);\n" ;

        }

        for(int i=0;i<var.length;i++){
            newCode+="   cudaFree(dev_"+var[i]+");\n";
        }
        newCode+="}\n";
        System.out.println(newCode);
        codes.set(startLine - 1, newCode);
        for (int i = startLine; i < stopLine; i++) {
            codes.remove(startLine);
        }
        return codes;
    }

    private static List<String> getFunAddCode(String ruleName,Map<String, Object> codeMatch) {
        funAddAdded = true;
        List<String> funCodes = new ArrayList<>();
        Map<String, Object> elements = (Map<String, Object>) codeMatch.get("elements");

        String[][] info = JSON.parseObject((String)elements.get("info"),String[][].class);
        String[] var=JSON.parseObject((String)elements.get("var"),String[].class);
        String content=(String)elements.get("content");
        if(ruleName.equals("1")){
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
        }else if(ruleName.equals("3")){
            funCodes.add("__global__ void add(int* A, int* B, int LenI, int LenJ) {");
            funCodes.add("    int k = threadIdx.x;");
            funCodes.add("    for(int j=0;j<lenJ;j++)");
            funCodes.add("        for(int i=0;i<lenI;i++)");
            funCodes.add("            A[Index(i+1,j+1,k)] = A[Index(i,j,k)]+B[Index(i,j,k)];");
            funCodes.add("}");


        }else if(ruleName.equals("4")){
            funCodes.add("__global__ void add(int* A, int* B, int *D,int m,int n,int Len) {");
            funCodes.add("    int tid = threadIdx.x;");
            funCodes.add("    if(tid<Len){");
            funCodes.add("        "+content);
            funCodes.add("  }");
        }

        return funCodes;
    }


    private static List<String> readCodeFile(String fileName) {
        List<String> codeLines = new ArrayList<>();
        try {
            File file = new File(fileName);
            if (file.isFile() && file.exists()) { // 判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), "utf-8");// 编码格式必须和文件的一致
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    codeLines.add(lineTxt.split("\t")[0]);
                }
                read.close();
            } else {
                System.out.println("指定的文件不存在");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return codeLines;
    }

    private static void saveNewCode(List<String> codes, String outputName) {
        try (FileWriter fileWriter = new FileWriter(outputName)) {
            for (String code : codes) {
                fileWriter.append(code + "\n");
            }
        } catch (Exception e) {
            System.out.println("写入错误");
            e.printStackTrace();
        }

    }
}

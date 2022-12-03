package com.example.testantlr4.controller;

import com.alibaba.fastjson.JSON;
import com.example.testantlr4.CodePO;
import com.example.testantlr4.service.MainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/web")
public class MainController {

    @Autowired
    private MainServiceImpl mainService;

    @PostMapping("/checkCode")
    public String checkCode(@RequestBody CodePO codePO) throws SQLException {
        return JSON.toJSONString(mainService.getParserResult(codePO.getCode()));
    }

    @PostMapping("/translateCode")
    public String translateCode(@RequestBody CodePO codePO) throws SQLException, IOException {
        return JSON.toJSONString(mainService.getTranslationResult(codePO.getCode()));
    }

    @PostMapping("/uploadCodeFile")
    public String translateCodeByFile(MultipartFile file, HttpServletResponse response) throws IOException {
        return JSON.toJSONString(mainService.getTranslationResultByFile(file, response));
    }
}

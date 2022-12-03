package com.example.testantlr4.utils.testCpp;

import com.example.testantlr4.gen_cpp.TestCPPPaserBaseListener;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class Evaluator extends TestCPPPaserBaseListener {
    private Map<String, Double> vars = new HashMap<>();
    private ParseTreeProperty<Double> values = new ParseTreeProperty<>();

}

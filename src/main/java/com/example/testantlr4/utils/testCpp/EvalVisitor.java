package com.example.testantlr4.utils.testCpp;

import com.example.testantlr4.gen_cpp.TestCPPPaser;
import com.example.testantlr4.gen_cpp.TestCPPPaserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import com.alibaba.fastjson.JSON;

import java.util.*;

public class EvalVisitor extends TestCPPPaserBaseVisitor<List<Map<String, Object>>> {
    private List<Map<String, Object>> vars = new ArrayList<>();

//    @Override
    public List<Map<String, Object>> visit(TestCPPPaser.DeclarationseqContext context) {
        context.accept(this);
        return vars;
    }

    @Override
    public List<Map<String, Object>> visitTwoLoopAndTwoDimensionalArray(TestCPPPaser.TwoLoopAndTwoDimensionalArrayContext ctx) {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> elements = new HashMap<>();
        /*
        LenJ
        LenI
        A
        B
         **/
        result.put("ruleName", "1");//依赖分析能力
        result.put("matchCode", ctx.getText());
        result.put("startLine", String.valueOf(ctx.getStart().getLine()));
        result.put("stopLine", String.valueOf(ctx.getStop().getLine()));
        List<String> iteratorsStop = new ArrayList<>();
        Set<String> arrayVariables = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            String iterator = extractIterator(ctx.expression(i));
            iteratorsStop.add(extractIteratorStop(ctx.condition(i), iterator));
        }
        for (TestCPPPaser.TwoDimensionalArrayContext item : ctx.twoDimensionalArray()) {
//            boolean containIterationVariable = false;
//            for (TestCPPPaser.ConstantExpressionContext context : item.constantExpression()) {
//                for (String iterator : iterators) {
//                    containIterationVariable = checkExpressionContainsIterator(context, iterator);
//                    if (containIterationVariable) {
//                        break;
//                    }
//                }
//            }
//            for (TestCPPPaser.ExpressionContext expressionContext : item.expression()) {
//                for (String iterator : iterators) {
//                    containIterationVariable = checkExpressionContainsIterator(expressionContext, iterator);
//                    if (containIterationVariable) {
//                        break;
//                    }
//                }
//            }
//            System.out.println(item.getText() + "下标中是否包含变量：" + containIterationVariable);
            arrayVariables.add(item.getChild(0).getText());
        }
        elements.put("var",JSON.toJSONString(arrayVariables));


        elements.put("Len", JSON.toJSONString(iteratorsStop));

        result.put("elements", elements);
        vars.add(result);
        return null;
    }


    @Override
    public List<Map<String, Object>> visitThreeLoopAndThreeDimensionalArray(TestCPPPaser.ThreeLoopAndThreeDimensionalArrayContext ctx) {
        Map<String, Object> elements = new HashMap<>();
        Set<String> arrayVariables = new HashSet<>();

        Map<String, Object> result = new HashMap<>();
        result.put("ruleName", "3");//循环交换能力欠缺
        result.put("rule", ctx.getRuleContext().toString());
        result.put("matchCode", ctx.getText());
        result.put("startLine", String.valueOf(ctx.getStart().getLine()));
        result.put("stopLine", String.valueOf(ctx.getStop().getLine()));
        List<String> iterators = extractIterator(ctx);
        System.out.println("循环变量是" + iterators.toString());
        List<String> iteratorsStop = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String iterator = extractIterator(ctx.expression(i));
            iteratorsStop.add(extractIteratorStop(ctx.condition(i), iterator));
        }
        elements.put("Len", JSON.toJSONString(iteratorsStop));
        int len=ctx.threeDimensionalArray().size();
        String[][] info=new String[len][4];
        boolean[] isValid=new boolean[3];
        Arrays.fill(isValid,false);
        System.out.println("三维数组是：");
        for(int index=0;index<len;index++) {
            TestCPPPaser.ThreeDimensionalArrayContext item=ctx.threeDimensionalArray().get(index);
            info[index][0]=item.getChild(0).getText();
            arrayVariables.add(item.getChild(0).getText());

            for(int iindex=0;iindex< item.constantExpression().size();iindex++){
                TestCPPPaser.ConstantExpressionContext context=item.constantExpression().get(iindex);
                ParseTree item1 = context.getChild(0);
                info[index][iindex+1]=item1.getText();
                if(index!=0 && !isValid[iindex]&&info[index][0].equals(info[0][0])){
                    if(info[index][iindex+1].equals(info[0][iindex+1]))
                        isValid[iindex]=true;
                }
            }
        }

        for(int i=2;i>=0;i--){
            if(isValid[i])
                elements.put("out",String.valueOf(i));
        }
        elements.put("info",JSON.toJSONString(info));
        result.put("elements", elements);
        System.out.println("===============================");
        vars.add(result);
        return null;
    }

    @Override
    public List<Map<String, Object>> visitContinuousLoop(TestCPPPaser.ContinuousLoopContext ctx) {
        Map<String, Object> elements = new HashMap<>();

        Map<String, Object> result = new HashMap<>();
        Set<String> arrayVariables = new HashSet<>();
        Set<String> constantValues = new HashSet<>();

        result.put("ruleName", "4");//循环合并
        result.put("rule", ctx.getRuleContext().toString());
        result.put("matchCode", ctx.getText());
        result.put("startLine", String.valueOf(ctx.getStart().getLine()));
        result.put("stopLine", String.valueOf(ctx.getStop().getLine()));

        for(int i=0;i<ctx.Identifier().size();i++){
//            System.out.println(ctx.Identifier(i).getText());
            arrayVariables.add(ctx.Identifier(i).getText());
        }
        for(int i=0;i<ctx.expressionWithArray().size();i++){
//            System.out.println(ctx.expressionWithArray(i).Identifier().getText());
            arrayVariables.add(ctx.expressionWithArray(i).Identifier().getText());
            constantValues.add(ctx.expressionWithArray(i).multiplicativeExpression(0).getText());

        }
        List<String> iteratorsStop = new ArrayList<>();
        String iterator = extractIterator(ctx.expression(0));
        iteratorsStop.add(extractIteratorStop(ctx.condition(0), iterator));
        System.out.println(extractIteratorStop(ctx.condition(0), iterator));

        elements.put("Len", JSON.toJSONString(iteratorsStop));

        String tmp1=extractIterator(ctx.expression(0));
        System.out.println("第一次循环变量为：" + tmp1);
        String content1 = ctx.Identifier(0).getText() + "[" + ctx.constantExpression(0).getText().replace(tmp1,"tid") + "]" + ctx.Assign(0).getText() + ctx.expressionWithArray(0).getText().replace(tmp1,"tid");

        System.out.println("第一次循环内容：" + content1);

        System.out.println("第二次循环变量为：" + extractIterator(ctx.expression(1)));
        String content2 = ctx.Identifier(1).getText() + "[" + ctx.constantExpression(1).getText().replace(tmp1,"tid") + "]" + ctx.Assign(1).getText() + ctx.expressionWithArray(1).getText().replace(tmp1,"tid");
        System.out.println("第二次循环内容：" + content2);
        System.out.println("===============================");
        elements.put("content",content1+";\n        "+content2);
        elements.put("var",JSON.toJSONString(arrayVariables));
        elements.put("constant",JSON.toJSONString(constantValues));

        result.put("elements", elements);

        vars.add(result);
        return null;
    }

    @Override
    public List<Map<String, Object>> visitLoopDistribution(TestCPPPaser.LoopDistributionContext ctx) {
        Map<String, Object> result = new HashMap<>();
        result.put("ruleName", "5");//循环分布
        result.put("rule", ctx.getRuleContext().toString());
        result.put("matchCode", ctx.getText());
        result.put("startLine", String.valueOf(ctx.getStart().getLine()));
        result.put("stopLine", String.valueOf(ctx.getStop().getLine()));
        System.out.println("外层循环循环变量为：" + extractIterator(ctx.expression(0)));
        System.out.println("===============================");
        vars.add(result);
        return null;
    }

    public boolean checkExpressionContainsIterator(ParseTree expressionContext, String iterator) {
        for (int i = 0; i < expressionContext.getChildCount(); i++) {
            ParseTree item = expressionContext.getChild(i);
            System.out.println(i);
//            checkExpressionContainsIterator(item, iterator);

            System.out.print(item.getText()+" ");
            if (item.getText().equals(iterator)) {
                return true;
            }
            System.out.println();
        }
        return false;
    }

    public List<String> extractIterator(ParseTree ctx) {
        List<String> iterators = new ArrayList<>();
        List<TestCPPPaser.ExpressionContext> expressionContexts = new ArrayList<>();
        if (ctx.getClass().equals(TestCPPPaser.TwoLoopAndTwoDimensionalArrayContext.class)) {
            expressionContexts = ((TestCPPPaser.TwoLoopAndTwoDimensionalArrayContext) ctx).expression();
        } else if (ctx.getClass().equals(TestCPPPaser.ThreeLoopAndThreeDimensionalArrayContext.class)) {
            expressionContexts = ((TestCPPPaser.ThreeLoopAndThreeDimensionalArrayContext) ctx).expression();
        }
        for (TestCPPPaser.ExpressionContext item : expressionContexts) {
            ParseTree temp_item = item;
            while (temp_item.getChildCount() == 1) {
                temp_item = temp_item.getChild(0);
            }
            if (temp_item.getClass().equals(TestCPPPaser.PostfixExpressionContext.class)) {
                // 一般对应 i++
                iterators.add(temp_item.getChild(0).getText());
            } else if (temp_item.getClass().equals(TestCPPPaser.UnaryExpressionContext.class)) {
                // 一般对应 ++i
                iterators.add(temp_item.getChild(1).getText());
            }
        }
        return iterators;
    }

    private String extractIteratorStop(TestCPPPaser.ConditionContext conditionContext, String iterator) {
        String iteratorsStops = "";
        ParseTree temp_item = conditionContext;
        while (temp_item.getChildCount() == 1) {
            temp_item = temp_item.getChild(0);
        }
        if (temp_item.getClass().equals(TestCPPPaser.RelationalExpressionContext.class)) {
            iteratorsStops = temp_item.getChild(2).getText();
        }
        return iteratorsStops;
    }

    public String extractIterator(TestCPPPaser.ExpressionContext expressionContexts) {
        String iterators = "";
        ParseTree temp_item = expressionContexts;
        while (temp_item.getChildCount() == 1) {
            temp_item = temp_item.getChild(0);
        }
        if (temp_item.getClass().equals(TestCPPPaser.PostfixExpressionContext.class)) {
            // 一般对应 i++
            iterators = (temp_item.getChild(0).getText());
        } else if (temp_item.getClass().equals(TestCPPPaser.UnaryExpressionContext.class)) {
            // 一般对应 ++i
            iterators = (temp_item.getChild(1).getText());
        }
        return iterators;
    }

    private String extractIteratorChange(TestCPPPaser.ExpressionContext expressionContext) {
        String iteratorsChange = "";
        ParseTree temp_item = expressionContext;
        while (temp_item.getChildCount() == 1) {
            temp_item = temp_item.getChild(0);
        }
        iteratorsChange = temp_item.getText();
        return iteratorsChange;
    }
}

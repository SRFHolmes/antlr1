// Generated from D:/antlr\TestCPPPaser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestCPPPaser}.
 */
public interface TestCPPPaserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(TestCPPPaser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(TestCPPPaser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(TestCPPPaser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(TestCPPPaser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(TestCPPPaser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(TestCPPPaser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedId(TestCPPPaser.UnqualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedId(TestCPPPaser.UnqualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedId(TestCPPPaser.QualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedId(TestCPPPaser.QualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedNameSpecifier(TestCPPPaser.NestedNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedNameSpecifier(TestCPPPaser.NestedNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(TestCPPPaser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(TestCPPPaser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIntroducer(TestCPPPaser.LambdaIntroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIntroducer(TestCPPPaser.LambdaIntroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCapture(TestCPPPaser.LambdaCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCapture(TestCPPPaser.LambdaCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaptureDefault(TestCPPPaser.CaptureDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaptureDefault(TestCPPPaser.CaptureDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(TestCPPPaser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(TestCPPPaser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(TestCPPPaser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(TestCPPPaser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCapture(TestCPPPaser.SimpleCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCapture(TestCPPPaser.SimpleCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(TestCPPPaser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(TestCPPPaser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDeclarator(TestCPPPaser.LambdaDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDeclarator(TestCPPPaser.LambdaDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(TestCPPPaser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(TestCPPPaser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdOfTheTypeId(TestCPPPaser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdOfTheTypeId(TestCPPPaser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(TestCPPPaser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(TestCPPPaser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void enterPseudoDestructorName(TestCPPPaser.PseudoDestructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void exitPseudoDestructorName(TestCPPPaser.PseudoDestructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TestCPPPaser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TestCPPPaser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(TestCPPPaser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(TestCPPPaser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(TestCPPPaser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(TestCPPPaser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void enterNewPlacement(TestCPPPaser.NewPlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void exitNewPlacement(TestCPPPaser.NewPlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeId(TestCPPPaser.NewTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeId(TestCPPPaser.NewTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(TestCPPPaser.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(TestCPPPaser.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerNewDeclarator(TestCPPPaser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerNewDeclarator(TestCPPPaser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewInitializer(TestCPPPaser.NewInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewInitializer(TestCPPPaser.NewInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(TestCPPPaser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(TestCPPPaser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void enterNoExceptExpression(TestCPPPaser.NoExceptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void exitNoExceptExpression(TestCPPPaser.NoExceptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(TestCPPPaser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(TestCPPPaser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointerMemberExpression(TestCPPPaser.PointerMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointerMemberExpression(TestCPPPaser.PointerMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TestCPPPaser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TestCPPPaser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TestCPPPaser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TestCPPPaser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(TestCPPPaser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(TestCPPPaser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(TestCPPPaser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(TestCPPPaser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TestCPPPaser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TestCPPPaser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TestCPPPaser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TestCPPPaser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(TestCPPPaser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(TestCPPPaser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(TestCPPPaser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(TestCPPPaser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(TestCPPPaser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(TestCPPPaser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(TestCPPPaser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(TestCPPPaser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(TestCPPPaser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(TestCPPPaser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(TestCPPPaser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(TestCPPPaser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(TestCPPPaser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(TestCPPPaser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(TestCPPPaser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(TestCPPPaser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TestCPPPaser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TestCPPPaser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(TestCPPPaser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(TestCPPPaser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TestCPPPaser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TestCPPPaser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(TestCPPPaser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(TestCPPPaser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TestCPPPaser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TestCPPPaser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(TestCPPPaser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(TestCPPPaser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(TestCPPPaser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(TestCPPPaser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(TestCPPPaser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(TestCPPPaser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TestCPPPaser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TestCPPPaser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(TestCPPPaser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(TestCPPPaser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(TestCPPPaser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(TestCPPPaser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForRangeDeclaration(TestCPPPaser.ForRangeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForRangeDeclaration(TestCPPPaser.ForRangeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForRangeInitializer(TestCPPPaser.ForRangeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForRangeInitializer(TestCPPPaser.ForRangeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(TestCPPPaser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(TestCPPPaser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(TestCPPPaser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(TestCPPPaser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(TestCPPPaser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(TestCPPPaser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TestCPPPaser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TestCPPPaser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(TestCPPPaser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(TestCPPPaser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(TestCPPPaser.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(TestCPPPaser.AliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(TestCPPPaser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(TestCPPPaser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(TestCPPPaser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(TestCPPPaser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDeclaration(TestCPPPaser.EmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDeclaration(TestCPPPaser.EmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(TestCPPPaser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(TestCPPPaser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifier(TestCPPPaser.DeclSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifier(TestCPPPaser.DeclSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSeq(TestCPPPaser.DeclSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSeq(TestCPPPaser.DeclSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(TestCPPPaser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(TestCPPPaser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(TestCPPPaser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(TestCPPPaser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(TestCPPPaser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(TestCPPPaser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(TestCPPPaser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(TestCPPPaser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifier(TestCPPPaser.TrailingTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifier(TestCPPPaser.TrailingTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSeq(TestCPPPaser.TypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSeq(TestCPPPaser.TypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifierSeq(TestCPPPaser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifierSeq(TestCPPPaser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeLengthModifier(TestCPPPaser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeLengthModifier(TestCPPPaser.SimpleTypeLengthModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSignednessModifier(TestCPPPaser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSignednessModifier(TestCPPPaser.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(TestCPPPaser.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(TestCPPPaser.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeName(TestCPPPaser.TheTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeName(TestCPPPaser.TheTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypeSpecifier(TestCPPPaser.DecltypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypeSpecifier(TestCPPPaser.DecltypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedTypeSpecifier(TestCPPPaser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedTypeSpecifier(TestCPPPaser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(TestCPPPaser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(TestCPPPaser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(TestCPPPaser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(TestCPPPaser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumHead}.
	 * @param ctx the parse tree
	 */
	void enterEnumHead(TestCPPPaser.EnumHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumHead}.
	 * @param ctx the parse tree
	 */
	void exitEnumHead(TestCPPPaser.EnumHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueEnumDeclaration(TestCPPPaser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueEnumDeclaration(TestCPPPaser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(TestCPPPaser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(TestCPPPaser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(TestCPPPaser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(TestCPPPaser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(TestCPPPaser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(TestCPPPaser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorDefinition(TestCPPPaser.EnumeratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorDefinition(TestCPPPaser.EnumeratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(TestCPPPaser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(TestCPPPaser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(TestCPPPaser.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(TestCPPPaser.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespaceName(TestCPPPaser.OriginalNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespaceName(TestCPPPaser.OriginalNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(TestCPPPaser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(TestCPPPaser.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAlias(TestCPPPaser.NamespaceAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAlias(TestCPPPaser.NamespaceAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAliasDefinition(TestCPPPaser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAliasDefinition(TestCPPPaser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(TestCPPPaser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(TestCPPPaser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingDeclaration(TestCPPPaser.UsingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingDeclaration(TestCPPPaser.UsingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingDirective(TestCPPPaser.UsingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingDirective(TestCPPPaser.UsingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmDefinition(TestCPPPaser.AsmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmDefinition(TestCPPPaser.AsmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSpecification(TestCPPPaser.LinkageSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSpecification(TestCPPPaser.LinkageSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifierSeq(TestCPPPaser.AttributeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifierSeq(TestCPPPaser.AttributeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(TestCPPPaser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(TestCPPPaser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(TestCPPPaser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(TestCPPPaser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(TestCPPPaser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(TestCPPPaser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(TestCPPPaser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(TestCPPPaser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNamespace(TestCPPPaser.AttributeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNamespace(TestCPPPaser.AttributeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(TestCPPPaser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(TestCPPPaser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokenSeq(TestCPPPaser.BalancedTokenSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokenSeq(TestCPPPaser.BalancedTokenSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(TestCPPPaser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(TestCPPPaser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(TestCPPPaser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(TestCPPPaser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(TestCPPPaser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(TestCPPPaser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(TestCPPPaser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(TestCPPPaser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerDeclarator(TestCPPPaser.PointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerDeclarator(TestCPPPaser.PointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerDeclarator(TestCPPPaser.NoPointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerDeclarator(TestCPPPaser.NoPointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(TestCPPPaser.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(TestCPPPaser.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void enterTrailingReturnType(TestCPPPaser.TrailingReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void exitTrailingReturnType(TestCPPPaser.TrailingReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPointerOperator(TestCPPPaser.PointerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPointerOperator(TestCPPPaser.PointerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(TestCPPPaser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(TestCPPPaser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvQualifier(TestCPPPaser.CvQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvQualifier(TestCPPPaser.CvQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(TestCPPPaser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(TestCPPPaser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(TestCPPPaser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(TestCPPPaser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeId(TestCPPPaser.TheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeId(TestCPPPaser.TheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(TestCPPPaser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(TestCPPPaser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerAbstractDeclarator(TestCPPPaser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerAbstractDeclarator(TestCPPPaser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractDeclarator(TestCPPPaser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractDeclarator(TestCPPPaser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPackDeclarator(TestCPPPaser.AbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPackDeclarator(TestCPPPaser.AbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractPackDeclarator(TestCPPPaser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractPackDeclarator(TestCPPPaser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(TestCPPPaser.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(TestCPPPaser.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(TestCPPPaser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(TestCPPPaser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(TestCPPPaser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(TestCPPPaser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(TestCPPPaser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(TestCPPPaser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(TestCPPPaser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(TestCPPPaser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(TestCPPPaser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(TestCPPPaser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceOrEqualInitializer(TestCPPPaser.BraceOrEqualInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceOrEqualInitializer(TestCPPPaser.BraceOrEqualInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerClause(TestCPPPaser.InitializerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerClause(TestCPPPaser.InitializerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(TestCPPPaser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(TestCPPPaser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(TestCPPPaser.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(TestCPPPaser.BracedInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(TestCPPPaser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(TestCPPPaser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassSpecifier(TestCPPPaser.ClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassSpecifier(TestCPPPaser.ClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#classHead}.
	 * @param ctx the parse tree
	 */
	void enterClassHead(TestCPPPaser.ClassHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#classHead}.
	 * @param ctx the parse tree
	 */
	void exitClassHead(TestCPPPaser.ClassHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void enterClassHeadName(TestCPPPaser.ClassHeadNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void exitClassHeadName(TestCPPPaser.ClassHeadNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassVirtSpecifier(TestCPPPaser.ClassVirtSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassVirtSpecifier(TestCPPPaser.ClassVirtSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#classKey}.
	 * @param ctx the parse tree
	 */
	void enterClassKey(TestCPPPaser.ClassKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#classKey}.
	 * @param ctx the parse tree
	 */
	void exitClassKey(TestCPPPaser.ClassKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberSpecification(TestCPPPaser.MemberSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberSpecification(TestCPPPaser.MemberSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(TestCPPPaser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(TestCPPPaser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaratorList(TestCPPPaser.MemberDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaratorList(TestCPPPaser.MemberDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarator(TestCPPPaser.MemberDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarator(TestCPPPaser.MemberDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifierSeq(TestCPPPaser.VirtualSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifierSeq(TestCPPPaser.VirtualSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifier(TestCPPPaser.VirtualSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifier(TestCPPPaser.VirtualSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterPureSpecifier(TestCPPPaser.PureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitPureSpecifier(TestCPPPaser.PureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#baseClause}.
	 * @param ctx the parse tree
	 */
	void enterBaseClause(TestCPPPaser.BaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#baseClause}.
	 * @param ctx the parse tree
	 */
	void exitBaseClause(TestCPPPaser.BaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifierList(TestCPPPaser.BaseSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifierList(TestCPPPaser.BaseSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifier(TestCPPPaser.BaseSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifier(TestCPPPaser.BaseSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrDeclType(TestCPPPaser.ClassOrDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrDeclType(TestCPPPaser.ClassOrDeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpecifier(TestCPPPaser.BaseTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpecifier(TestCPPPaser.BaseTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessSpecifier(TestCPPPaser.AccessSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessSpecifier(TestCPPPaser.AccessSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterConversionFunctionId(TestCPPPaser.ConversionFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitConversionFunctionId(TestCPPPaser.ConversionFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void enterConversionTypeId(TestCPPPaser.ConversionTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void exitConversionTypeId(TestCPPPaser.ConversionTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversionDeclarator(TestCPPPaser.ConversionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversionDeclarator(TestCPPPaser.ConversionDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInitializer(TestCPPPaser.ConstructorInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInitializer(TestCPPPaser.ConstructorInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializerList(TestCPPPaser.MemInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializerList(TestCPPPaser.MemInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializer(TestCPPPaser.MemInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializer(TestCPPPaser.MemInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(TestCPPPaser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(TestCPPPaser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterOperatorFunctionId(TestCPPPaser.OperatorFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitOperatorFunctionId(TestCPPPaser.OperatorFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOperatorId(TestCPPPaser.LiteralOperatorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOperatorId(TestCPPPaser.LiteralOperatorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(TestCPPPaser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(TestCPPPaser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterList(TestCPPPaser.TemplateparameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterList(TestCPPPaser.TemplateparameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateParameter(TestCPPPaser.TemplateParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateParameter(TestCPPPaser.TemplateParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(TestCPPPaser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(TestCPPPaser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTemplateId(TestCPPPaser.SimpleTemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTemplateId(TestCPPPaser.SimpleTemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#templateId}.
	 * @param ctx the parse tree
	 */
	void enterTemplateId(TestCPPPaser.TemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#templateId}.
	 * @param ctx the parse tree
	 */
	void exitTemplateId(TestCPPPaser.TemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#templateName}.
	 * @param ctx the parse tree
	 */
	void enterTemplateName(TestCPPPaser.TemplateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#templateName}.
	 * @param ctx the parse tree
	 */
	void exitTemplateName(TestCPPPaser.TemplateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgumentList(TestCPPPaser.TemplateArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgumentList(TestCPPPaser.TemplateArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgument(TestCPPPaser.TemplateArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgument(TestCPPPaser.TemplateArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameSpecifier(TestCPPPaser.TypeNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameSpecifier(TestCPPPaser.TypeNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitInstantiation(TestCPPPaser.ExplicitInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitInstantiation(TestCPPPaser.ExplicitInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitSpecialization(TestCPPPaser.ExplicitSpecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitSpecialization(TestCPPPaser.ExplicitSpecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(TestCPPPaser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(TestCPPPaser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTryBlock(TestCPPPaser.FunctionTryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTryBlock(TestCPPPaser.FunctionTryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerSeq(TestCPPPaser.HandlerSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerSeq(TestCPPPaser.HandlerSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(TestCPPPaser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(TestCPPPaser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptionDeclaration(TestCPPPaser.ExceptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptionDeclaration(TestCPPPaser.ExceptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(TestCPPPaser.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(TestCPPPaser.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSpecification(TestCPPPaser.ExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSpecification(TestCPPPaser.ExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicExceptionSpecification(TestCPPPaser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicExceptionSpecification(TestCPPPaser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdList(TestCPPPaser.TypeIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdList(TestCPPPaser.TypeIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#twoDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void enterTwoDimensionalArray(TestCPPPaser.TwoDimensionalArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#twoDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void exitTwoDimensionalArray(TestCPPPaser.TwoDimensionalArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#threeDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void enterThreeDimensionalArray(TestCPPPaser.ThreeDimensionalArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#threeDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void exitThreeDimensionalArray(TestCPPPaser.ThreeDimensionalArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNoeExceptSpecification(TestCPPPaser.NoeExceptSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNoeExceptSpecification(TestCPPPaser.NoeExceptSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#twoLoopAndTwoDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void enterTwoLoopAndTwoDimensionalArray(TestCPPPaser.TwoLoopAndTwoDimensionalArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#twoLoopAndTwoDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void exitTwoLoopAndTwoDimensionalArray(TestCPPPaser.TwoLoopAndTwoDimensionalArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#threeLoopAndThreeDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void enterThreeLoopAndThreeDimensionalArray(TestCPPPaser.ThreeLoopAndThreeDimensionalArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#threeLoopAndThreeDimensionalArray}.
	 * @param ctx the parse tree
	 */
	void exitThreeLoopAndThreeDimensionalArray(TestCPPPaser.ThreeLoopAndThreeDimensionalArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#expressionWithArray}.
	 * @param ctx the parse tree
	 */
	void enterExpressionWithArray(TestCPPPaser.ExpressionWithArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#expressionWithArray}.
	 * @param ctx the parse tree
	 */
	void exitExpressionWithArray(TestCPPPaser.ExpressionWithArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#continuousLoop}.
	 * @param ctx the parse tree
	 */
	void enterContinuousLoop(TestCPPPaser.ContinuousLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#continuousLoop}.
	 * @param ctx the parse tree
	 */
	void exitContinuousLoop(TestCPPPaser.ContinuousLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#loopDistribution}.
	 * @param ctx the parse tree
	 */
	void enterLoopDistribution(TestCPPPaser.LoopDistributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#loopDistribution}.
	 * @param ctx the parse tree
	 */
	void exitLoopDistribution(TestCPPPaser.LoopDistributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#branchNestedLoop}.
	 * @param ctx the parse tree
	 */
	void enterBranchNestedLoop(TestCPPPaser.BranchNestedLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#branchNestedLoop}.
	 * @param ctx the parse tree
	 */
	void exitBranchNestedLoop(TestCPPPaser.BranchNestedLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#theOperator}.
	 * @param ctx the parse tree
	 */
	void enterTheOperator(TestCPPPaser.TheOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#theOperator}.
	 * @param ctx the parse tree
	 */
	void exitTheOperator(TestCPPPaser.TheOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestCPPPaser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TestCPPPaser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestCPPPaser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TestCPPPaser.LiteralContext ctx);
}
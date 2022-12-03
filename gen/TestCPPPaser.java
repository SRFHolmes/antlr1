// Generated from D:/antlr\TestCPPPaser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestCPPPaser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, CharacterLiteral=2, FloatingLiteral=3, StringLiteral=4, 
		BooleanLiteral=5, PointerLiteral=6, UserDefinedLiteral=7, MultiLineMacro=8, 
		Directive=9, Alignas=10, Alignof=11, Asm=12, Auto=13, Bool=14, Break=15, 
		Case=16, Catch=17, Char=18, Char16=19, Char32=20, Class=21, Const=22, 
		Constexpr=23, Const_cast=24, Continue=25, Decltype=26, Default=27, Delete=28, 
		Do=29, Double=30, Dynamic_cast=31, Else=32, Enum=33, Explicit=34, Export=35, 
		Extern=36, False_=37, Final=38, Float=39, For=40, Friend=41, Goto=42, 
		If=43, Inline=44, Int=45, Long=46, Mutable=47, Namespace=48, New=49, Noexcept=50, 
		Nullptr=51, Operator=52, Override=53, Private=54, Protected=55, Public=56, 
		Register=57, Reinterpret_cast=58, Return=59, Short=60, Signed=61, Sizeof=62, 
		Static=63, Static_assert=64, Static_cast=65, Struct=66, Switch=67, Template=68, 
		This=69, Thread_local=70, Throw=71, True_=72, Try=73, Typedef=74, Typeid_=75, 
		Typename_=76, Union=77, Unsigned=78, Using=79, Virtual=80, Void=81, Volatile=82, 
		Wchar=83, While=84, LeftParen=85, RightParen=86, LeftBracket=87, RightBracket=88, 
		LeftBrace=89, RightBrace=90, Plus=91, Minus=92, Star=93, Div=94, Mod=95, 
		Caret=96, And=97, Or=98, Tilde=99, Not=100, Assign=101, Less=102, Greater=103, 
		PlusAssign=104, MinusAssign=105, StarAssign=106, DivAssign=107, ModAssign=108, 
		XorAssign=109, AndAssign=110, OrAssign=111, LeftShiftAssign=112, RightShiftAssign=113, 
		Equal=114, NotEqual=115, LessEqual=116, GreaterEqual=117, AndAnd=118, 
		OrOr=119, PlusPlus=120, MinusMinus=121, Comma=122, ArrowStar=123, Arrow=124, 
		Question=125, Colon=126, Doublecolon=127, Semi=128, Dot=129, DotStar=130, 
		Ellipsis=131, Identifier=132, DecimalLiteral=133, OctalLiteral=134, HexadecimalLiteral=135, 
		BinaryLiteral=136, Integersuffix=137, UserDefinedIntegerLiteral=138, UserDefinedFloatingLiteral=139, 
		UserDefinedStringLiteral=140, UserDefinedCharacterLiteral=141, Whitespace=142, 
		Newline=143, BlockComment=144, LineComment=145;
	public static final int
		RULE_translationUnit = 0, RULE_primaryExpression = 1, RULE_idExpression = 2, 
		RULE_unqualifiedId = 3, RULE_qualifiedId = 4, RULE_nestedNameSpecifier = 5, 
		RULE_lambdaExpression = 6, RULE_lambdaIntroducer = 7, RULE_lambdaCapture = 8, 
		RULE_captureDefault = 9, RULE_captureList = 10, RULE_capture = 11, RULE_simpleCapture = 12, 
		RULE_initcapture = 13, RULE_lambdaDeclarator = 14, RULE_postfixExpression = 15, 
		RULE_typeIdOfTheTypeId = 16, RULE_expressionList = 17, RULE_pseudoDestructorName = 18, 
		RULE_unaryExpression = 19, RULE_unaryOperator = 20, RULE_newExpression = 21, 
		RULE_newPlacement = 22, RULE_newTypeId = 23, RULE_newDeclarator = 24, 
		RULE_noPointerNewDeclarator = 25, RULE_newInitializer = 26, RULE_deleteExpression = 27, 
		RULE_noExceptExpression = 28, RULE_castExpression = 29, RULE_pointerMemberExpression = 30, 
		RULE_multiplicativeExpression = 31, RULE_additiveExpression = 32, RULE_shiftExpression = 33, 
		RULE_shiftOperator = 34, RULE_relationalExpression = 35, RULE_equalityExpression = 36, 
		RULE_andExpression = 37, RULE_exclusiveOrExpression = 38, RULE_inclusiveOrExpression = 39, 
		RULE_logicalAndExpression = 40, RULE_logicalOrExpression = 41, RULE_conditionalExpression = 42, 
		RULE_assignmentExpression = 43, RULE_assignmentOperator = 44, RULE_expression = 45, 
		RULE_constantExpression = 46, RULE_statement = 47, RULE_labeledStatement = 48, 
		RULE_expressionStatement = 49, RULE_compoundStatement = 50, RULE_statementSeq = 51, 
		RULE_selectionStatement = 52, RULE_condition = 53, RULE_iterationStatement = 54, 
		RULE_forInitStatement = 55, RULE_forRangeDeclaration = 56, RULE_forRangeInitializer = 57, 
		RULE_jumpStatement = 58, RULE_declarationStatement = 59, RULE_declarationseq = 60, 
		RULE_declaration = 61, RULE_blockDeclaration = 62, RULE_aliasDeclaration = 63, 
		RULE_simpleDeclaration = 64, RULE_staticAssertDeclaration = 65, RULE_emptyDeclaration = 66, 
		RULE_attributeDeclaration = 67, RULE_declSpecifier = 68, RULE_declSpecifierSeq = 69, 
		RULE_storageClassSpecifier = 70, RULE_functionSpecifier = 71, RULE_typedefName = 72, 
		RULE_typeSpecifier = 73, RULE_trailingTypeSpecifier = 74, RULE_typeSpecifierSeq = 75, 
		RULE_trailingTypeSpecifierSeq = 76, RULE_simpleTypeLengthModifier = 77, 
		RULE_simpleTypeSignednessModifier = 78, RULE_simpleTypeSpecifier = 79, 
		RULE_theTypeName = 80, RULE_decltypeSpecifier = 81, RULE_elaboratedTypeSpecifier = 82, 
		RULE_enumName = 83, RULE_enumSpecifier = 84, RULE_enumHead = 85, RULE_opaqueEnumDeclaration = 86, 
		RULE_enumkey = 87, RULE_enumbase = 88, RULE_enumeratorList = 89, RULE_enumeratorDefinition = 90, 
		RULE_enumerator = 91, RULE_namespaceName = 92, RULE_originalNamespaceName = 93, 
		RULE_namespaceDefinition = 94, RULE_namespaceAlias = 95, RULE_namespaceAliasDefinition = 96, 
		RULE_qualifiednamespacespecifier = 97, RULE_usingDeclaration = 98, RULE_usingDirective = 99, 
		RULE_asmDefinition = 100, RULE_linkageSpecification = 101, RULE_attributeSpecifierSeq = 102, 
		RULE_attributeSpecifier = 103, RULE_alignmentspecifier = 104, RULE_attributeList = 105, 
		RULE_attribute = 106, RULE_attributeNamespace = 107, RULE_attributeArgumentClause = 108, 
		RULE_balancedTokenSeq = 109, RULE_balancedtoken = 110, RULE_initDeclaratorList = 111, 
		RULE_initDeclarator = 112, RULE_declarator = 113, RULE_pointerDeclarator = 114, 
		RULE_noPointerDeclarator = 115, RULE_parametersAndQualifiers = 116, RULE_trailingReturnType = 117, 
		RULE_pointerOperator = 118, RULE_cvqualifierseq = 119, RULE_cvQualifier = 120, 
		RULE_refqualifier = 121, RULE_declaratorid = 122, RULE_theTypeId = 123, 
		RULE_abstractDeclarator = 124, RULE_pointerAbstractDeclarator = 125, RULE_noPointerAbstractDeclarator = 126, 
		RULE_abstractPackDeclarator = 127, RULE_noPointerAbstractPackDeclarator = 128, 
		RULE_parameterDeclarationClause = 129, RULE_parameterDeclarationList = 130, 
		RULE_parameterDeclaration = 131, RULE_functionDefinition = 132, RULE_functionBody = 133, 
		RULE_initializer = 134, RULE_braceOrEqualInitializer = 135, RULE_initializerClause = 136, 
		RULE_initializerList = 137, RULE_bracedInitList = 138, RULE_className = 139, 
		RULE_classSpecifier = 140, RULE_classHead = 141, RULE_classHeadName = 142, 
		RULE_classVirtSpecifier = 143, RULE_classKey = 144, RULE_memberSpecification = 145, 
		RULE_memberdeclaration = 146, RULE_memberDeclaratorList = 147, RULE_memberDeclarator = 148, 
		RULE_virtualSpecifierSeq = 149, RULE_virtualSpecifier = 150, RULE_pureSpecifier = 151, 
		RULE_baseClause = 152, RULE_baseSpecifierList = 153, RULE_baseSpecifier = 154, 
		RULE_classOrDeclType = 155, RULE_baseTypeSpecifier = 156, RULE_accessSpecifier = 157, 
		RULE_conversionFunctionId = 158, RULE_conversionTypeId = 159, RULE_conversionDeclarator = 160, 
		RULE_constructorInitializer = 161, RULE_memInitializerList = 162, RULE_memInitializer = 163, 
		RULE_meminitializerid = 164, RULE_operatorFunctionId = 165, RULE_literalOperatorId = 166, 
		RULE_templateDeclaration = 167, RULE_templateparameterList = 168, RULE_templateParameter = 169, 
		RULE_typeParameter = 170, RULE_simpleTemplateId = 171, RULE_templateId = 172, 
		RULE_templateName = 173, RULE_templateArgumentList = 174, RULE_templateArgument = 175, 
		RULE_typeNameSpecifier = 176, RULE_explicitInstantiation = 177, RULE_explicitSpecialization = 178, 
		RULE_tryBlock = 179, RULE_functionTryBlock = 180, RULE_handlerSeq = 181, 
		RULE_handler = 182, RULE_exceptionDeclaration = 183, RULE_throwExpression = 184, 
		RULE_exceptionSpecification = 185, RULE_dynamicExceptionSpecification = 186, 
		RULE_typeIdList = 187, RULE_twoDimensionalArray = 188, RULE_threeDimensionalArray = 189, 
		RULE_noeExceptSpecification = 190, RULE_twoLoopAndTwoDimensionalArray = 191, 
		RULE_threeLoopAndThreeDimensionalArray = 192, RULE_expressionWithArray = 193, 
		RULE_continuousLoop = 194, RULE_loopDistribution = 195, RULE_branchNestedLoop = 196, 
		RULE_theOperator = 197, RULE_literal = 198;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "primaryExpression", "idExpression", "unqualifiedId", 
			"qualifiedId", "nestedNameSpecifier", "lambdaExpression", "lambdaIntroducer", 
			"lambdaCapture", "captureDefault", "captureList", "capture", "simpleCapture", 
			"initcapture", "lambdaDeclarator", "postfixExpression", "typeIdOfTheTypeId", 
			"expressionList", "pseudoDestructorName", "unaryExpression", "unaryOperator", 
			"newExpression", "newPlacement", "newTypeId", "newDeclarator", "noPointerNewDeclarator", 
			"newInitializer", "deleteExpression", "noExceptExpression", "castExpression", 
			"pointerMemberExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "shiftOperator", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "statement", 
			"labeledStatement", "expressionStatement", "compoundStatement", "statementSeq", 
			"selectionStatement", "condition", "iterationStatement", "forInitStatement", 
			"forRangeDeclaration", "forRangeInitializer", "jumpStatement", "declarationStatement", 
			"declarationseq", "declaration", "blockDeclaration", "aliasDeclaration", 
			"simpleDeclaration", "staticAssertDeclaration", "emptyDeclaration", "attributeDeclaration", 
			"declSpecifier", "declSpecifierSeq", "storageClassSpecifier", "functionSpecifier", 
			"typedefName", "typeSpecifier", "trailingTypeSpecifier", "typeSpecifierSeq", 
			"trailingTypeSpecifierSeq", "simpleTypeLengthModifier", "simpleTypeSignednessModifier", 
			"simpleTypeSpecifier", "theTypeName", "decltypeSpecifier", "elaboratedTypeSpecifier", 
			"enumName", "enumSpecifier", "enumHead", "opaqueEnumDeclaration", "enumkey", 
			"enumbase", "enumeratorList", "enumeratorDefinition", "enumerator", "namespaceName", 
			"originalNamespaceName", "namespaceDefinition", "namespaceAlias", "namespaceAliasDefinition", 
			"qualifiednamespacespecifier", "usingDeclaration", "usingDirective", 
			"asmDefinition", "linkageSpecification", "attributeSpecifierSeq", "attributeSpecifier", 
			"alignmentspecifier", "attributeList", "attribute", "attributeNamespace", 
			"attributeArgumentClause", "balancedTokenSeq", "balancedtoken", "initDeclaratorList", 
			"initDeclarator", "declarator", "pointerDeclarator", "noPointerDeclarator", 
			"parametersAndQualifiers", "trailingReturnType", "pointerOperator", "cvqualifierseq", 
			"cvQualifier", "refqualifier", "declaratorid", "theTypeId", "abstractDeclarator", 
			"pointerAbstractDeclarator", "noPointerAbstractDeclarator", "abstractPackDeclarator", 
			"noPointerAbstractPackDeclarator", "parameterDeclarationClause", "parameterDeclarationList", 
			"parameterDeclaration", "functionDefinition", "functionBody", "initializer", 
			"braceOrEqualInitializer", "initializerClause", "initializerList", "bracedInitList", 
			"className", "classSpecifier", "classHead", "classHeadName", "classVirtSpecifier", 
			"classKey", "memberSpecification", "memberdeclaration", "memberDeclaratorList", 
			"memberDeclarator", "virtualSpecifierSeq", "virtualSpecifier", "pureSpecifier", 
			"baseClause", "baseSpecifierList", "baseSpecifier", "classOrDeclType", 
			"baseTypeSpecifier", "accessSpecifier", "conversionFunctionId", "conversionTypeId", 
			"conversionDeclarator", "constructorInitializer", "memInitializerList", 
			"memInitializer", "meminitializerid", "operatorFunctionId", "literalOperatorId", 
			"templateDeclaration", "templateparameterList", "templateParameter", 
			"typeParameter", "simpleTemplateId", "templateId", "templateName", "templateArgumentList", 
			"templateArgument", "typeNameSpecifier", "explicitInstantiation", "explicitSpecialization", 
			"tryBlock", "functionTryBlock", "handlerSeq", "handler", "exceptionDeclaration", 
			"throwExpression", "exceptionSpecification", "dynamicExceptionSpecification", 
			"typeIdList", "twoDimensionalArray", "threeDimensionalArray", "noeExceptSpecification", 
			"twoLoopAndTwoDimensionalArray", "threeLoopAndThreeDimensionalArray", 
			"expressionWithArray", "continuousLoop", "loopDistribution", "branchNestedLoop", 
			"theOperator", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'alignas'", 
			"'alignof'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
			"'char'", "'char16_t'", "'char32_t'", "'class'", "'const'", "'constexpr'", 
			"'const_cast'", "'continue'", "'decltype'", "'default'", "'delete'", 
			"'do'", "'double'", "'dynamic_cast'", "'else'", "'enum'", "'explicit'", 
			"'export'", "'extern'", "'false'", "'final'", "'float'", "'for'", "'friend'", 
			"'goto'", "'if'", "'inline'", "'int'", "'long'", "'mutable'", "'namespace'", 
			"'new'", "'noexcept'", "'nullptr'", "'operator'", "'override'", "'private'", 
			"'protected'", "'public'", "'register'", "'reinterpret_cast'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'static'", "'static_assert'", "'static_cast'", 
			"'struct'", "'switch'", "'template'", "'this'", "'thread_local'", "'throw'", 
			"'true'", "'try'", "'typedef'", "'typeid'", "'typename'", "'union'", 
			"'unsigned'", "'using'", "'virtual'", "'void'", "'volatile'", "'wchar_t'", 
			"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", 
			"'>>='", "'=='", "'!='", "'<='", "'>='", null, null, "'++'", "'--'", 
			"','", "'->*'", "'->'", "'?'", "':'", "'::'", "';'", "'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "PointerLiteral", "UserDefinedLiteral", "MultiLineMacro", 
			"Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", "Case", 
			"Catch", "Char", "Char16", "Char32", "Class", "Const", "Constexpr", "Const_cast", 
			"Continue", "Decltype", "Default", "Delete", "Do", "Double", "Dynamic_cast", 
			"Else", "Enum", "Explicit", "Export", "Extern", "False_", "Final", "Float", 
			"For", "Friend", "Goto", "If", "Inline", "Int", "Long", "Mutable", "Namespace", 
			"New", "Noexcept", "Nullptr", "Operator", "Override", "Private", "Protected", 
			"Public", "Register", "Reinterpret_cast", "Return", "Short", "Signed", 
			"Sizeof", "Static", "Static_assert", "Static_cast", "Struct", "Switch", 
			"Template", "This", "Thread_local", "Throw", "True_", "Try", "Typedef", 
			"Typeid_", "Typename_", "Union", "Unsigned", "Using", "Virtual", "Void", 
			"Volatile", "Wchar", "While", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", 
			"Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", 
			"PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
			"XorAssign", "AndAssign", "OrAssign", "LeftShiftAssign", "RightShiftAssign", 
			"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "DecimalLiteral", 
			"OctalLiteral", "HexadecimalLiteral", "BinaryLiteral", "Integersuffix", 
			"UserDefinedIntegerLiteral", "UserDefinedFloatingLiteral", "UserDefinedStringLiteral", 
			"UserDefinedCharacterLiteral", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TestCPPPaser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestCPPPaser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TestCPPPaser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(398);
				declarationseq();
				}
			}

			setState(401);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode This() { return getToken(TestCPPPaser.This, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			int _alt;
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(404); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(403);
						literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(406); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(LeftParen);
				setState(410);
				expression();
				setState(411);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				idExpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				lambdaExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdExpressionContext extends ParserRuleContext {
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public IdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExpressionContext idExpression() throws RecognitionException {
		IdExpressionContext _localctx = new IdExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idExpression);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				unqualifiedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				qualifiedId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public ConversionFunctionIdContext conversionFunctionId() {
			return getRuleContext(ConversionFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(TestCPPPaser.Tilde, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public UnqualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterUnqualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitUnqualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitUnqualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedIdContext unqualifiedId() throws RecognitionException {
		UnqualifiedIdContext _localctx = new UnqualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedId);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				operatorFunctionId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				conversionFunctionId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				literalOperatorId();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				match(Tilde);
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(426);
					className();
					}
					break;
				case Decltype:
					{
					setState(427);
					decltypeSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				templateId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdContext extends ParserRuleContext {
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public QualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterQualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitQualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitQualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdContext qualifiedId() throws RecognitionException {
		QualifiedIdContext _localctx = new QualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			nestedNameSpecifier(0);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(434);
				match(Template);
				}
			}

			setState(437);
			unqualifiedId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(TestCPPPaser.Doublecolon, 0); }
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public NestedNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNestedNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNestedNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNestedNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedNameSpecifierContext nestedNameSpecifier() throws RecognitionException {
		return nestedNameSpecifier(0);
	}

	private NestedNameSpecifierContext nestedNameSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestedNameSpecifierContext _localctx = new NestedNameSpecifierContext(_ctx, _parentState);
		NestedNameSpecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestedNameSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(440);
				theTypeName();
				}
				break;
			case 2:
				{
				setState(441);
				namespaceName();
				}
				break;
			case 3:
				{
				setState(442);
				decltypeSpecifier();
				}
				break;
			}
			setState(445);
			match(Doublecolon);
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NestedNameSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nestedNameSpecifier);
					setState(447);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(453);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(448);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(450);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(449);
							match(Template);
							}
						}

						setState(452);
						simpleTemplateId();
						}
						break;
					}
					setState(455);
					match(Doublecolon);
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaIntroducerContext lambdaIntroducer() {
			return getRuleContext(LambdaIntroducerContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public LambdaDeclaratorContext lambdaDeclarator() {
			return getRuleContext(LambdaDeclaratorContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			lambdaIntroducer();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(462);
				lambdaDeclarator();
				}
			}

			setState(465);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaIntroducerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public LambdaCaptureContext lambdaCapture() {
			return getRuleContext(LambdaCaptureContext.class,0);
		}
		public LambdaIntroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaIntroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLambdaIntroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLambdaIntroducer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLambdaIntroducer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaIntroducerContext lambdaIntroducer() throws RecognitionException {
		LambdaIntroducerContext _localctx = new LambdaIntroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaIntroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(LeftBracket);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (This - 69)) | (1L << (And - 69)) | (1L << (Assign - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(468);
				lambdaCapture();
				}
			}

			setState(471);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaCaptureContext extends ParserRuleContext {
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public CaptureDefaultContext captureDefault() {
			return getRuleContext(CaptureDefaultContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TestCPPPaser.Comma, 0); }
		public LambdaCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLambdaCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLambdaCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLambdaCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaCaptureContext lambdaCapture() throws RecognitionException {
		LambdaCaptureContext _localctx = new LambdaCaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaCapture);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				captureList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				captureDefault();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(475);
					match(Comma);
					setState(476);
					captureList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureDefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TestCPPPaser.And, 0); }
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public CaptureDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCaptureDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCaptureDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCaptureDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureDefaultContext captureDefault() throws RecognitionException {
		CaptureDefaultContext _localctx = new CaptureDefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_captureDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListContext extends ParserRuleContext {
		public List<CaptureContext> capture() {
			return getRuleContexts(CaptureContext.class);
		}
		public CaptureContext capture(int i) {
			return getRuleContext(CaptureContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCaptureList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCaptureList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		CaptureListContext _localctx = new CaptureListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_captureList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			capture();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(484);
				match(Comma);
				setState(485);
				capture();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(491);
				match(Ellipsis);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimpleCaptureContext simpleCapture() {
			return getRuleContext(SimpleCaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				simpleCapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleCaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode And() { return getToken(TestCPPPaser.And, 0); }
		public TerminalNode This() { return getToken(TestCPPPaser.This, 0); }
		public SimpleCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterSimpleCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitSimpleCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitSimpleCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaptureContext simpleCapture() throws RecognitionException {
		SimpleCaptureContext _localctx = new SimpleCaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleCapture);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(498);
					match(And);
					}
				}

				setState(501);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(TestCPPPaser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitInitcapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitInitcapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(505);
				match(And);
				}
			}

			setState(508);
			match(Identifier);
			setState(509);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(TestCPPPaser.Mutable, 0); }
		public ExceptionSpecificationContext exceptionSpecification() {
			return getRuleContext(ExceptionSpecificationContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public LambdaDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLambdaDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLambdaDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLambdaDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaDeclaratorContext lambdaDeclarator() throws RecognitionException {
		LambdaDeclaratorContext _localctx = new LambdaDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdaDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(LeftParen);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Struct - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftBracket - 74)) | (1L << (Doublecolon - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(512);
				parameterDeclarationClause();
				}
			}

			setState(515);
			match(RightParen);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(516);
				match(Mutable);
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(519);
				exceptionSpecification();
				}
			}

			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(522);
				attributeSpecifierSeq();
				}
			}

			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(525);
				trailingReturnType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public TypeNameSpecifierContext typeNameSpecifier() {
			return getRuleContext(TypeNameSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Less() { return getToken(TestCPPPaser.Less, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Greater() { return getToken(TestCPPPaser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(TestCPPPaser.Dynamic_cast, 0); }
		public TerminalNode Static_cast() { return getToken(TestCPPPaser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(TestCPPPaser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(TestCPPPaser.Const_cast, 0); }
		public TypeIdOfTheTypeIdContext typeIdOfTheTypeId() {
			return getRuleContext(TypeIdOfTheTypeIdContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(TestCPPPaser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(TestCPPPaser.Arrow, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public TerminalNode PlusPlus() { return getToken(TestCPPPaser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(TestCPPPaser.MinusMinus, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(529);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(532);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Decltype:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Signed:
				case Unsigned:
				case Void:
				case Wchar:
				case Doublecolon:
				case Identifier:
					{
					setState(530);
					simpleTypeSpecifier();
					}
					break;
				case Typename_:
					{
					setState(531);
					typeNameSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(540);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(534);
					match(LeftParen);
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
						{
						setState(535);
						expressionList();
						}
					}

					setState(538);
					match(RightParen);
					}
					break;
				case LeftBrace:
					{
					setState(539);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(542);
				_la = _input.LA(1);
				if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (Const_cast - 24)) | (1L << (Dynamic_cast - 24)) | (1L << (Reinterpret_cast - 24)) | (1L << (Static_cast - 24)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(543);
				match(Less);
				setState(544);
				theTypeId();
				setState(545);
				match(Greater);
				setState(546);
				match(LeftParen);
				setState(547);
				expression();
				setState(548);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(550);
				typeIdOfTheTypeId();
				setState(551);
				match(LeftParen);
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(552);
					expression();
					}
					break;
				case 2:
					{
					setState(553);
					theTypeId();
					}
					break;
				}
				setState(556);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(585);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(560);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(561);
						match(LeftBracket);
						setState(564);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IntegerLiteral:
						case CharacterLiteral:
						case FloatingLiteral:
						case StringLiteral:
						case BooleanLiteral:
						case PointerLiteral:
						case UserDefinedLiteral:
						case Alignof:
						case Auto:
						case Bool:
						case Char:
						case Char16:
						case Char32:
						case Const_cast:
						case Decltype:
						case Delete:
						case Double:
						case Dynamic_cast:
						case Float:
						case Int:
						case Long:
						case New:
						case Noexcept:
						case Operator:
						case Reinterpret_cast:
						case Short:
						case Signed:
						case Sizeof:
						case Static_cast:
						case This:
						case Throw:
						case Typeid_:
						case Typename_:
						case Unsigned:
						case Void:
						case Wchar:
						case LeftParen:
						case LeftBracket:
						case Plus:
						case Minus:
						case Star:
						case And:
						case Or:
						case Tilde:
						case Not:
						case PlusPlus:
						case MinusMinus:
						case Doublecolon:
						case Identifier:
							{
							setState(562);
							expression();
							}
							break;
						case LeftBrace:
							{
							setState(563);
							bracedInitList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(566);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(568);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(569);
						match(LeftParen);
						setState(571);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
							{
							setState(570);
							expressionList();
							}
						}

						setState(573);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(574);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(575);
						_la = _input.LA(1);
						if ( !(_la==Arrow || _la==Dot) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(581);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(577);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(576);
								match(Template);
								}
							}

							setState(579);
							idExpression();
							}
							break;
						case 2:
							{
							setState(580);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(583);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(584);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeIdOfTheTypeIdContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(TestCPPPaser.Typeid_, 0); }
		public TypeIdOfTheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdOfTheTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTypeIdOfTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTypeIdOfTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTypeIdOfTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdOfTheTypeIdContext typeIdOfTheTypeId() throws RecognitionException {
		TypeIdOfTheTypeIdContext _localctx = new TypeIdOfTheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeIdOfTheTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(Typeid_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			initializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoDestructorNameContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(TestCPPPaser.Tilde, 0); }
		public List<TheTypeNameContext> theTypeName() {
			return getRuleContexts(TheTypeNameContext.class);
		}
		public TheTypeNameContext theTypeName(int i) {
			return getRuleContext(TheTypeNameContext.class,i);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(TestCPPPaser.Doublecolon, 0); }
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public PseudoDestructorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoDestructorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPseudoDestructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPseudoDestructorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPseudoDestructorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoDestructorNameContext pseudoDestructorName() throws RecognitionException {
		PseudoDestructorNameContext _localctx = new PseudoDestructorNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudoDestructorName);
		int _la;
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(594);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(597);
					theTypeName();
					setState(598);
					match(Doublecolon);
					}
				}

				setState(602);
				match(Tilde);
				setState(603);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				nestedNameSpecifier(0);
				setState(605);
				match(Template);
				setState(606);
				simpleTemplateId();
				setState(607);
				match(Doublecolon);
				setState(608);
				match(Tilde);
				setState(609);
				theTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				match(Tilde);
				setState(612);
				decltypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(TestCPPPaser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(TestCPPPaser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(TestCPPPaser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(TestCPPPaser.Alignof, 0); }
		public NoExceptExpressionContext noExceptExpression() {
			return getRuleContext(NoExceptExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public DeleteExpressionContext deleteExpression() {
			return getRuleContext(DeleteExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(616);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(617);
					match(MinusMinus);
					}
					break;
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
					{
					setState(618);
					unaryOperator();
					}
					break;
				case Sizeof:
					{
					setState(619);
					match(Sizeof);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(622);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				match(Sizeof);
				setState(632);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(624);
					match(LeftParen);
					setState(625);
					theTypeId();
					setState(626);
					match(RightParen);
					}
					break;
				case Ellipsis:
					{
					setState(628);
					match(Ellipsis);
					setState(629);
					match(LeftParen);
					setState(630);
					match(Identifier);
					setState(631);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				match(Alignof);
				setState(635);
				match(LeftParen);
				setState(636);
				theTypeId();
				setState(637);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				noExceptExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				newExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				deleteExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(TestCPPPaser.Or, 0); }
		public TerminalNode Star() { return getToken(TestCPPPaser.Star, 0); }
		public TerminalNode And() { return getToken(TestCPPPaser.And, 0); }
		public TerminalNode Plus() { return getToken(TestCPPPaser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(TestCPPPaser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(TestCPPPaser.Minus, 0); }
		public TerminalNode Not() { return getToken(TestCPPPaser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Plus - 91)) | (1L << (Minus - 91)) | (1L << (Star - 91)) | (1L << (And - 91)) | (1L << (Or - 91)) | (1L << (Tilde - 91)) | (1L << (Not - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TestCPPPaser.New, 0); }
		public NewTypeIdContext newTypeId() {
			return getRuleContext(NewTypeIdContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(TestCPPPaser.Doublecolon, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(646);
				match(Doublecolon);
				}
			}

			setState(649);
			match(New);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(650);
				newPlacement();
				}
				break;
			}
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				{
				setState(653);
				newTypeId();
				}
				break;
			case LeftParen:
				{
				{
				setState(654);
				match(LeftParen);
				setState(655);
				theTypeId();
				setState(656);
				match(RightParen);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBrace) {
				{
				setState(660);
				newInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewPlacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNewPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNewPlacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNewPlacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LeftParen);
			setState(664);
			expressionList();
			setState(665);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NewTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNewTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNewTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNewTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeIdContext newTypeId() throws RecognitionException {
		NewTypeIdContext _localctx = new NewTypeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			typeSpecifierSeq();
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(668);
				newDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewDeclaratorContext extends ParserRuleContext {
		public PointerOperatorContext pointerOperator() {
			return getRuleContext(PointerOperatorContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public NewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclaratorContext newDeclarator() throws RecognitionException {
		NewDeclaratorContext _localctx = new NewDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newDeclarator);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				pointerOperator();
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(672);
					newDeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				noPointerNewDeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoPointerNewDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerNewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerNewDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNoPointerNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNoPointerNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNoPointerNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerNewDeclaratorContext noPointerNewDeclarator() throws RecognitionException {
		return noPointerNewDeclarator(0);
	}

	private NoPointerNewDeclaratorContext noPointerNewDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerNewDeclaratorContext _localctx = new NoPointerNewDeclaratorContext(_ctx, _parentState);
		NoPointerNewDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_noPointerNewDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(679);
			match(LeftBracket);
			setState(680);
			expression();
			setState(681);
			match(RightBracket);
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(682);
				attributeSpecifierSeq();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerNewDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerNewDeclarator);
					setState(685);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(686);
					match(LeftBracket);
					setState(687);
					constantExpression();
					setState(688);
					match(RightBracket);
					setState(690);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(689);
						attributeSpecifierSeq();
						}
						break;
					}
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewInitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public NewInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNewInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNewInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNewInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newInitializer);
		int _la;
		try {
			setState(703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(LeftParen);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(698);
					expressionList();
					}
				}

				setState(701);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteExpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(TestCPPPaser.Delete, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(TestCPPPaser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteExpressionContext deleteExpression() throws RecognitionException {
		DeleteExpressionContext _localctx = new DeleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deleteExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(705);
				match(Doublecolon);
				}
			}

			setState(708);
			match(Delete);
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(709);
				match(LeftBracket);
				setState(710);
				match(RightBracket);
				}
				break;
			}
			setState(713);
			castExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoExceptExpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(TestCPPPaser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public NoExceptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noExceptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNoExceptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNoExceptExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNoExceptExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoExceptExpressionContext noExceptExpression() throws RecognitionException {
		NoExceptExpressionContext _localctx = new NoExceptExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_noExceptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(Noexcept);
			setState(716);
			match(LeftParen);
			setState(717);
			expression();
			setState(718);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_castExpression);
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(LeftParen);
				setState(722);
				theTypeId();
				setState(723);
				match(RightParen);
				setState(724);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerMemberExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> DotStar() { return getTokens(TestCPPPaser.DotStar); }
		public TerminalNode DotStar(int i) {
			return getToken(TestCPPPaser.DotStar, i);
		}
		public List<TerminalNode> ArrowStar() { return getTokens(TestCPPPaser.ArrowStar); }
		public TerminalNode ArrowStar(int i) {
			return getToken(TestCPPPaser.ArrowStar, i);
		}
		public TwoDimensionalArrayContext twoDimensionalArray() {
			return getRuleContext(TwoDimensionalArrayContext.class,0);
		}
		public ThreeDimensionalArrayContext threeDimensionalArray() {
			return getRuleContext(ThreeDimensionalArrayContext.class,0);
		}
		public PointerMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPointerMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPointerMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPointerMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerMemberExpressionContext pointerMemberExpression() throws RecognitionException {
		PointerMemberExpressionContext _localctx = new PointerMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pointerMemberExpression);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				castExpression();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ArrowStar || _la==DotStar) {
					{
					{
					setState(729);
					_la = _input.LA(1);
					if ( !(_la==ArrowStar || _la==DotStar) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(730);
					castExpression();
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				twoDimensionalArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				threeDimensionalArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PointerMemberExpressionContext> pointerMemberExpression() {
			return getRuleContexts(PointerMemberExpressionContext.class);
		}
		public PointerMemberExpressionContext pointerMemberExpression(int i) {
			return getRuleContext(PointerMemberExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(TestCPPPaser.Star); }
		public TerminalNode Star(int i) {
			return getToken(TestCPPPaser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(TestCPPPaser.Div); }
		public TerminalNode Div(int i) {
			return getToken(TestCPPPaser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(TestCPPPaser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(TestCPPPaser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			pointerMemberExpression();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (Div - 93)) | (1L << (Mod - 93)))) != 0)) {
				{
				{
				setState(741);
				_la = _input.LA(1);
				if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (Div - 93)) | (1L << (Mod - 93)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(742);
				pointerMemberExpression();
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(TestCPPPaser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(TestCPPPaser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(TestCPPPaser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(TestCPPPaser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			multiplicativeExpression();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(749);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(750);
				multiplicativeExpression();
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			additiveExpression();
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757);
					shiftOperator();
					setState(758);
					additiveExpression();
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOperatorContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(TestCPPPaser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(TestCPPPaser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(TestCPPPaser.Less); }
		public TerminalNode Less(int i) {
			return getToken(TestCPPPaser.Less, i);
		}
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shiftOperator);
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(Greater);
				setState(766);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(Less);
				setState(768);
				match(Less);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(TestCPPPaser.Less); }
		public TerminalNode Less(int i) {
			return getToken(TestCPPPaser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(TestCPPPaser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(TestCPPPaser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(TestCPPPaser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(TestCPPPaser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(TestCPPPaser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(TestCPPPaser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			shiftExpression();
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772);
					_la = _input.LA(1);
					if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Less - 102)) | (1L << (Greater - 102)) | (1L << (LessEqual - 102)) | (1L << (GreaterEqual - 102)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(773);
					shiftExpression();
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(TestCPPPaser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(TestCPPPaser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(TestCPPPaser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(TestCPPPaser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			relationalExpression();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(780);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(781);
				relationalExpression();
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(TestCPPPaser.And); }
		public TerminalNode And(int i) {
			return getToken(TestCPPPaser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			equalityExpression();
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(788);
				match(And);
				setState(789);
				equalityExpression();
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(TestCPPPaser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(TestCPPPaser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			andExpression();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(796);
				match(Caret);
				setState(797);
				andExpression();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(TestCPPPaser.Or); }
		public TerminalNode Or(int i) {
			return getToken(TestCPPPaser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			exclusiveOrExpression();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(804);
				match(Or);
				setState(805);
				exclusiveOrExpression();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(TestCPPPaser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(TestCPPPaser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			inclusiveOrExpression();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(812);
				match(AndAnd);
				setState(813);
				inclusiveOrExpression();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(TestCPPPaser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(TestCPPPaser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			logicalAndExpression();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(820);
				match(OrOr);
				setState(821);
				logicalAndExpression();
				}
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(TestCPPPaser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			logicalOrExpression();
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(828);
				match(Question);
				setState(829);
				expression();
				setState(830);
				match(Colon);
				setState(831);
				assignmentExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public ThrowExpressionContext throwExpression() {
			return getRuleContext(ThrowExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignmentExpression);
		try {
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				logicalOrExpression();
				setState(837);
				assignmentOperator();
				setState(838);
				initializerClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				throwExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(TestCPPPaser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(TestCPPPaser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(TestCPPPaser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(TestCPPPaser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(TestCPPPaser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(TestCPPPaser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(TestCPPPaser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(TestCPPPaser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(TestCPPPaser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(TestCPPPaser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Assign - 101)) | (1L << (PlusAssign - 101)) | (1L << (MinusAssign - 101)) | (1L << (StarAssign - 101)) | (1L << (DivAssign - 101)) | (1L << (ModAssign - 101)) | (1L << (XorAssign - 101)) | (1L << (AndAssign - 101)) | (1L << (OrAssign - 101)) | (1L << (LeftShiftAssign - 101)) | (1L << (RightShiftAssign - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			assignmentExpression();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(846);
				match(Comma);
				setState(847);
				assignmentExpression();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public TwoLoopAndTwoDimensionalArrayContext twoLoopAndTwoDimensionalArray() {
			return getRuleContext(TwoLoopAndTwoDimensionalArrayContext.class,0);
		}
		public ThreeLoopAndThreeDimensionalArrayContext threeLoopAndThreeDimensionalArray() {
			return getRuleContext(ThreeLoopAndThreeDimensionalArrayContext.class,0);
		}
		public ContinuousLoopContext continuousLoop() {
			return getRuleContext(ContinuousLoopContext.class,0);
		}
		public LoopDistributionContext loopDistribution() {
			return getRuleContext(LoopDistributionContext.class,0);
		}
		public BranchNestedLoopContext branchNestedLoop() {
			return getRuleContext(BranchNestedLoopContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				twoLoopAndTwoDimensionalArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				threeLoopAndThreeDimensionalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				continuousLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(859);
				loopDistribution();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(860);
				branchNestedLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(861);
				declarationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(862);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(871);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
				case Alignof:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Const_cast:
				case Decltype:
				case Delete:
				case Double:
				case Dynamic_cast:
				case Float:
				case Int:
				case Long:
				case New:
				case Noexcept:
				case Operator:
				case Reinterpret_cast:
				case Short:
				case Signed:
				case Sizeof:
				case Static_cast:
				case This:
				case Throw:
				case Typeid_:
				case Typename_:
				case Unsigned:
				case Void:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Doublecolon:
				case Semi:
				case Identifier:
					{
					setState(865);
					expressionStatement();
					}
					break;
				case LeftBrace:
					{
					setState(866);
					compoundStatement();
					}
					break;
				case If:
				case Switch:
					{
					setState(867);
					selectionStatement();
					}
					break;
				case Do:
				case For:
				case While:
					{
					setState(868);
					iterationStatement();
					}
					break;
				case Break:
				case Continue:
				case Goto:
				case Return:
					{
					setState(869);
					jumpStatement();
					}
					break;
				case Try:
					{
					setState(870);
					tryBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode Case() { return getToken(TestCPPPaser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(TestCPPPaser.Default, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_labeledStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(875);
				attributeSpecifierSeq();
				}
			}

			setState(882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(878);
				match(Identifier);
				}
				break;
			case Case:
				{
				setState(879);
				match(Case);
				setState(880);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(881);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(884);
			match(Colon);
			setState(885);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(887);
				expression();
				}
			}

			setState(890);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TestCPPPaser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TestCPPPaser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(LeftBrace);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)))) != 0)) {
				{
				setState(893);
				statementSeq();
				}
			}

			setState(896);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitStatementSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitStatementSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(898);
				statement();
				}
				}
				setState(901); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TestCPPPaser.If, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(TestCPPPaser.Else, 0); }
		public TerminalNode Switch() { return getToken(TestCPPPaser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectionStatement);
		try {
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				match(If);
				setState(904);
				match(LeftParen);
				setState(905);
				condition();
				setState(906);
				match(RightParen);
				setState(907);
				statement();
				setState(910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(908);
					match(Else);
					setState(909);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(Switch);
				setState(913);
				match(LeftParen);
				setState(914);
				condition();
				setState(915);
				match(RightParen);
				setState(916);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_condition);
		int _la;
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(921);
					attributeSpecifierSeq();
					}
				}

				setState(924);
				declSpecifierSeq();
				setState(925);
				declarator();
				setState(929);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(926);
					match(Assign);
					setState(927);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(928);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(TestCPPPaser.While, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(TestCPPPaser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public TerminalNode For() { return getToken(TestCPPPaser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public ForRangeInitializerContext forRangeInitializer() {
			return getRuleContext(ForRangeInitializerContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_iterationStatement);
		int _la;
		try {
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				match(While);
				setState(934);
				match(LeftParen);
				setState(935);
				condition();
				setState(936);
				match(RightParen);
				setState(937);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				match(Do);
				setState(940);
				statement();
				setState(941);
				match(While);
				setState(942);
				match(LeftParen);
				setState(943);
				expression();
				setState(944);
				match(RightParen);
				setState(945);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(947);
				match(For);
				setState(948);
				match(LeftParen);
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(949);
					forInitStatement();
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
						{
						setState(950);
						condition();
						}
					}

					setState(953);
					match(Semi);
					setState(955);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
						{
						setState(954);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(957);
					forRangeDeclaration();
					setState(958);
					match(Colon);
					setState(959);
					forRangeInitializer();
					}
					break;
				}
				setState(963);
				match(RightParen);
				setState(964);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forInitStatement);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				simpleDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForRangeDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ForRangeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterForRangeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitForRangeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitForRangeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeDeclarationContext forRangeDeclaration() throws RecognitionException {
		ForRangeDeclarationContext _localctx = new ForRangeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forRangeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(972);
				attributeSpecifierSeq();
				}
			}

			setState(975);
			declSpecifierSeq();
			setState(976);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForRangeInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ForRangeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterForRangeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitForRangeInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitForRangeInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeInitializerContext forRangeInitializer() throws RecognitionException {
		ForRangeInitializerContext _localctx = new ForRangeInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forRangeInitializer);
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				expression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public TerminalNode Break() { return getToken(TestCPPPaser.Break, 0); }
		public TerminalNode Continue() { return getToken(TestCPPPaser.Continue, 0); }
		public TerminalNode Return() { return getToken(TestCPPPaser.Return, 0); }
		public TerminalNode Goto() { return getToken(TestCPPPaser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(982);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(983);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(984);
				match(Return);
				setState(987);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
				case Alignof:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Const_cast:
				case Decltype:
				case Delete:
				case Double:
				case Dynamic_cast:
				case Float:
				case Int:
				case Long:
				case New:
				case Noexcept:
				case Operator:
				case Reinterpret_cast:
				case Short:
				case Signed:
				case Sizeof:
				case Static_cast:
				case This:
				case Throw:
				case Typeid_:
				case Typename_:
				case Unsigned:
				case Void:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Doublecolon:
				case Identifier:
					{
					setState(985);
					expression();
					}
					break;
				case LeftBrace:
					{
					setState(986);
					bracedInitList();
					}
					break;
				case Semi:
					break;
				default:
					break;
				}
				}
				break;
			case Goto:
				{
				setState(989);
				match(Goto);
				setState(990);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(993);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			blockDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeclarationseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(997);
				declaration();
				}
				}
				setState(1000); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public ExplicitInstantiationContext explicitInstantiation() {
			return getRuleContext(ExplicitInstantiationContext.class,0);
		}
		public ExplicitSpecializationContext explicitSpecialization() {
			return getRuleContext(ExplicitSpecializationContext.class,0);
		}
		public LinkageSpecificationContext linkageSpecification() {
			return getRuleContext(LinkageSpecificationContext.class,0);
		}
		public NamespaceDefinitionContext namespaceDefinition() {
			return getRuleContext(NamespaceDefinitionContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				templateDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1005);
				explicitInstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1006);
				explicitSpecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1007);
				linkageSpecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1008);
				namespaceDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1009);
				emptyDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1010);
				attributeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public AsmDefinitionContext asmDefinition() {
			return getRuleContext(AsmDefinitionContext.class,0);
		}
		public NamespaceAliasDefinitionContext namespaceAliasDefinition() {
			return getRuleContext(NamespaceAliasDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public AliasDeclarationContext aliasDeclaration() {
			return getRuleContext(AliasDeclarationContext.class,0);
		}
		public OpaqueEnumDeclarationContext opaqueEnumDeclaration() {
			return getRuleContext(OpaqueEnumDeclarationContext.class,0);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockDeclaration);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				asmDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1015);
				namespaceAliasDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1016);
				usingDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1017);
				usingDirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1018);
				staticAssertDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1019);
				aliasDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1020);
				opaqueEnumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(TestCPPPaser.Using, 0); }
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public AliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAliasDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAliasDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasDeclarationContext aliasDeclaration() throws RecognitionException {
		AliasDeclarationContext _localctx = new AliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_aliasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(Using);
			setState(1024);
			match(Identifier);
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1025);
				attributeSpecifierSeq();
				}
			}

			setState(1028);
			match(Assign);
			setState(1029);
			theTypeId();
			setState(1030);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simpleDeclaration);
		int _la;
		try {
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1032);
					declSpecifierSeq();
					}
					break;
				}
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (Star - 85)) | (1L << (And - 85)) | (1L << (Tilde - 85)) | (1L << (AndAnd - 85)) | (1L << (Doublecolon - 85)) | (1L << (Ellipsis - 85)) | (1L << (Identifier - 85)))) != 0)) {
					{
					setState(1035);
					initDeclaratorList();
					}
				}

				setState(1038);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				attributeSpecifierSeq();
				setState(1041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1040);
					declSpecifierSeq();
					}
					break;
				}
				setState(1043);
				initDeclaratorList();
				setState(1044);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(TestCPPPaser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TestCPPPaser.Comma, 0); }
		public TerminalNode StringLiteral() { return getToken(TestCPPPaser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_staticAssertDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(Static_assert);
			setState(1049);
			match(LeftParen);
			setState(1050);
			constantExpression();
			setState(1051);
			match(Comma);
			setState(1052);
			match(StringLiteral);
			setState(1053);
			match(RightParen);
			setState(1054);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			attributeSpecifierSeq();
			setState(1059);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(TestCPPPaser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(TestCPPPaser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(TestCPPPaser.Constexpr, 0); }
		public DeclSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeclSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeclSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeclSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierContext declSpecifier() throws RecognitionException {
		DeclSpecifierContext _localctx = new DeclSpecifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declSpecifier);
		try {
			setState(1067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				storageClassSpecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				typeSpecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063);
				functionSpecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1064);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1065);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1066);
				match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclSpecifierSeqContext extends ParserRuleContext {
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeclSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeclSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeclSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierSeqContext declSpecifierSeq() throws RecognitionException {
		DeclSpecifierSeqContext _localctx = new DeclSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1070); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(1069);
					declSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1072); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1074);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(TestCPPPaser.Register, 0); }
		public TerminalNode Static() { return getToken(TestCPPPaser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(TestCPPPaser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(TestCPPPaser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(TestCPPPaser.Mutable, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (Extern - 36)) | (1L << (Mutable - 36)) | (1L << (Register - 36)) | (1L << (Static - 36)) | (1L << (Thread_local - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(TestCPPPaser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(TestCPPPaser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(TestCPPPaser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (Explicit - 34)) | (1L << (Inline - 34)) | (1L << (Virtual - 34)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TrailingTypeSpecifierContext trailingTypeSpecifier() {
			return getRuleContext(TrailingTypeSpecifierContext.class,0);
		}
		public ClassSpecifierContext classSpecifier() {
			return getRuleContext(ClassSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typeSpecifier);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				trailingTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				classSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				enumSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingTypeSpecifierContext extends ParserRuleContext {
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() {
			return getRuleContext(ElaboratedTypeSpecifierContext.class,0);
		}
		public TypeNameSpecifierContext typeNameSpecifier() {
			return getRuleContext(TypeNameSpecifierContext.class,0);
		}
		public CvQualifierContext cvQualifier() {
			return getRuleContext(CvQualifierContext.class,0);
		}
		public TrailingTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTrailingTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTrailingTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTrailingTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierContext trailingTypeSpecifier() throws RecognitionException {
		TrailingTypeSpecifierContext _localctx = new TrailingTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trailingTypeSpecifier);
		try {
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				simpleTypeSpecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				elaboratedTypeSpecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1090);
				typeNameSpecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1091);
				cvQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierSeqContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierSeqContext typeSpecifierSeq() throws RecognitionException {
		TypeSpecifierSeqContext _localctx = new TypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1094);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1097); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1099);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingTypeSpecifierSeqContext extends ParserRuleContext {
		public List<TrailingTypeSpecifierContext> trailingTypeSpecifier() {
			return getRuleContexts(TrailingTypeSpecifierContext.class);
		}
		public TrailingTypeSpecifierContext trailingTypeSpecifier(int i) {
			return getRuleContext(TrailingTypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingTypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTrailingTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTrailingTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTrailingTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() throws RecognitionException {
		TrailingTypeSpecifierSeqContext _localctx = new TrailingTypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trailingTypeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1102);
					trailingTypeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1107);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeLengthModifierContext extends ParserRuleContext {
		public TerminalNode Short() { return getToken(TestCPPPaser.Short, 0); }
		public TerminalNode Long() { return getToken(TestCPPPaser.Long, 0); }
		public SimpleTypeLengthModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeLengthModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterSimpleTypeLengthModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitSimpleTypeLengthModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitSimpleTypeLengthModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeLengthModifierContext simpleTypeLengthModifier() throws RecognitionException {
		SimpleTypeLengthModifierContext _localctx = new SimpleTypeLengthModifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_simpleTypeLengthModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_la = _input.LA(1);
			if ( !(_la==Long || _la==Short) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeSignednessModifierContext extends ParserRuleContext {
		public TerminalNode Unsigned() { return getToken(TestCPPPaser.Unsigned, 0); }
		public TerminalNode Signed() { return getToken(TestCPPPaser.Signed, 0); }
		public SimpleTypeSignednessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSignednessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterSimpleTypeSignednessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitSimpleTypeSignednessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitSimpleTypeSignednessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSignednessModifierContext simpleTypeSignednessModifier() throws RecognitionException {
		SimpleTypeSignednessModifierContext _localctx = new SimpleTypeSignednessModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_simpleTypeSignednessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_la = _input.LA(1);
			if ( !(_la==Signed || _la==Unsigned) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeSpecifierContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public SimpleTypeSignednessModifierContext simpleTypeSignednessModifier() {
			return getRuleContext(SimpleTypeSignednessModifierContext.class,0);
		}
		public List<SimpleTypeLengthModifierContext> simpleTypeLengthModifier() {
			return getRuleContexts(SimpleTypeLengthModifierContext.class);
		}
		public SimpleTypeLengthModifierContext simpleTypeLengthModifier(int i) {
			return getRuleContext(SimpleTypeLengthModifierContext.class,i);
		}
		public TerminalNode Char() { return getToken(TestCPPPaser.Char, 0); }
		public TerminalNode Char16() { return getToken(TestCPPPaser.Char16, 0); }
		public TerminalNode Char32() { return getToken(TestCPPPaser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(TestCPPPaser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(TestCPPPaser.Bool, 0); }
		public TerminalNode Int() { return getToken(TestCPPPaser.Int, 0); }
		public TerminalNode Float() { return getToken(TestCPPPaser.Float, 0); }
		public TerminalNode Double() { return getToken(TestCPPPaser.Double, 0); }
		public TerminalNode Void() { return getToken(TestCPPPaser.Void, 0); }
		public TerminalNode Auto() { return getToken(TestCPPPaser.Auto, 0); }
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public SimpleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitSimpleTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSpecifierContext simpleTypeSpecifier() throws RecognitionException {
		SimpleTypeSpecifierContext _localctx = new SimpleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_simpleTypeSpecifier);
		int _la;
		try {
			int _alt;
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1114);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1117);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				nestedNameSpecifier(0);
				setState(1119);
				match(Template);
				setState(1120);
				simpleTemplateId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				simpleTypeSignednessModifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1123);
					simpleTypeSignednessModifier();
					}
				}

				setState(1127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1126);
						simpleTypeLengthModifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1131);
					simpleTypeSignednessModifier();
					}
				}

				setState(1134);
				match(Char);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1135);
					simpleTypeSignednessModifier();
					}
				}

				setState(1138);
				match(Char16);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1139);
					simpleTypeSignednessModifier();
					}
				}

				setState(1142);
				match(Char32);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1143);
					simpleTypeSignednessModifier();
					}
				}

				setState(1146);
				match(Wchar);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1147);
				match(Bool);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Signed || _la==Unsigned) {
					{
					setState(1148);
					simpleTypeSignednessModifier();
					}
				}

				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Long || _la==Short) {
					{
					{
					setState(1151);
					simpleTypeLengthModifier();
					}
					}
					setState(1156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1157);
				match(Int);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1158);
				match(Float);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Long || _la==Short) {
					{
					setState(1159);
					simpleTypeLengthModifier();
					}
				}

				setState(1162);
				match(Double);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1163);
				match(Void);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1164);
				match(Auto);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1165);
				decltypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheTypeNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TheTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTheTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTheTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTheTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeNameContext theTypeName() throws RecognitionException {
		TheTypeNameContext _localctx = new TheTypeNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_theTypeName);
		try {
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				enumName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1170);
				typedefName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1171);
				simpleTemplateId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecltypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(TestCPPPaser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(TestCPPPaser.Auto, 0); }
		public DecltypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDecltypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDecltypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDecltypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecltypeSpecifierContext decltypeSpecifier() throws RecognitionException {
		DecltypeSpecifierContext _localctx = new DecltypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_decltypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(Decltype);
			setState(1175);
			match(LeftParen);
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1176);
				expression();
				}
				break;
			case 2:
				{
				setState(1177);
				match(Auto);
				}
				break;
			}
			setState(1180);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedTypeSpecifierContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public TerminalNode Enum() { return getToken(TestCPPPaser.Enum, 0); }
		public ElaboratedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterElaboratedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitElaboratedTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitElaboratedTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() throws RecognitionException {
		ElaboratedTypeSpecifierContext _localctx = new ElaboratedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elaboratedTypeSpecifier);
		int _la;
		try {
			setState(1204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				classKey();
				setState(1197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Alignas || _la==LeftBracket) {
						{
						setState(1183);
						attributeSpecifierSeq();
						}
					}

					setState(1187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(1186);
						nestedNameSpecifier(0);
						}
						break;
					}
					setState(1189);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1190);
					simpleTemplateId();
					}
					break;
				case 3:
					{
					setState(1191);
					nestedNameSpecifier(0);
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Template) {
						{
						setState(1192);
						match(Template);
						}
					}

					setState(1195);
					simpleTemplateId();
					}
					break;
				}
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(Enum);
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1200);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1203);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumHeadContext enumHead() {
			return getRuleContext(EnumHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TestCPPPaser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TestCPPPaser.RightBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TestCPPPaser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			enumHead();
			setState(1209);
			match(LeftBrace);
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1210);
				enumeratorList();
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1211);
					match(Comma);
					}
				}

				}
			}

			setState(1216);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumHeadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public EnumHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumHeadContext enumHead() throws RecognitionException {
		EnumHeadContext _localctx = new EnumHeadContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			enumkey();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1219);
				attributeSpecifierSeq();
				}
			}

			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
				{
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1222);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1225);
				match(Identifier);
				}
			}

			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1228);
				enumbase();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueEnumDeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueEnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueEnumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterOpaqueEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitOpaqueEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitOpaqueEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueEnumDeclarationContext opaqueEnumDeclaration() throws RecognitionException {
		OpaqueEnumDeclarationContext _localctx = new OpaqueEnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_opaqueEnumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			enumkey();
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1232);
				attributeSpecifierSeq();
				}
			}

			setState(1235);
			match(Identifier);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1236);
				enumbase();
				}
			}

			setState(1239);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(TestCPPPaser.Enum, 0); }
		public TerminalNode Class() { return getToken(TestCPPPaser.Class, 0); }
		public TerminalNode Struct() { return getToken(TestCPPPaser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumkey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumkey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(Enum);
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Class || _la==Struct) {
				{
				setState(1242);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Struct) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumbaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumbase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(Colon);
			setState(1246);
			typeSpecifierSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorDefinitionContext> enumeratorDefinition() {
			return getRuleContexts(EnumeratorDefinitionContext.class);
		}
		public EnumeratorDefinitionContext enumeratorDefinition(int i) {
			return getRuleContext(EnumeratorDefinitionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			enumeratorDefinition();
			setState(1253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					match(Comma);
					setState(1250);
					enumeratorDefinition();
					}
					} 
				}
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorDefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumeratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumeratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumeratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorDefinitionContext enumeratorDefinition() throws RecognitionException {
		EnumeratorDefinitionContext _localctx = new EnumeratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumeratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			enumerator();
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1257);
				match(Assign);
				setState(1258);
				constantExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNameContext extends ParserRuleContext {
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public NamespaceAliasContext namespaceAlias() {
			return getRuleContext(NamespaceAliasContext.class,0);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namespaceName);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				originalNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				namespaceAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalNamespaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public OriginalNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterOriginalNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitOriginalNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitOriginalNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalNamespaceNameContext originalNamespaceName() throws RecognitionException {
		OriginalNamespaceNameContext _localctx = new OriginalNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_originalNamespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDefinitionContext extends ParserRuleContext {
		public DeclarationseqContext namespaceBody;
		public TerminalNode Namespace() { return getToken(TestCPPPaser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(TestCPPPaser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TestCPPPaser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(TestCPPPaser.Inline, 0); }
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1269);
				match(Inline);
				}
			}

			setState(1272);
			match(Namespace);
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1273);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1274);
				originalNamespaceName();
				}
				break;
			}
			setState(1277);
			match(LeftBrace);
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1278);
				((NamespaceDefinitionContext)_localctx).namespaceBody = declarationseq();
				}
			}

			setState(1281);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNamespaceAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNamespaceAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNamespaceAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasContext namespaceAlias() throws RecognitionException {
		NamespaceAliasContext _localctx = new NamespaceAliasContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceAliasDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(TestCPPPaser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public NamespaceAliasDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAliasDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNamespaceAliasDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNamespaceAliasDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNamespaceAliasDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasDefinitionContext namespaceAliasDefinition() throws RecognitionException {
		NamespaceAliasDefinitionContext _localctx = new NamespaceAliasDefinitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespaceAliasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(Namespace);
			setState(1286);
			match(Identifier);
			setState(1287);
			match(Assign);
			setState(1288);
			qualifiednamespacespecifier();
			setState(1289);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitQualifiednamespacespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1291);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1294);
			namespaceName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(TestCPPPaser.Using, 0); }
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public TerminalNode Doublecolon() { return getToken(TestCPPPaser.Doublecolon, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(TestCPPPaser.Typename_, 0); }
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitUsingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_usingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(Using);
			setState(1302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				{
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1297);
					match(Typename_);
					}
				}

				setState(1300);
				nestedNameSpecifier(0);
				}
				}
				break;
			case 2:
				{
				setState(1301);
				match(Doublecolon);
				}
				break;
			}
			setState(1304);
			unqualifiedId();
			setState(1305);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(TestCPPPaser.Using, 0); }
		public TerminalNode Namespace() { return getToken(TestCPPPaser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitUsingDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitUsingDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1307);
				attributeSpecifierSeq();
				}
			}

			setState(1310);
			match(Using);
			setState(1311);
			match(Namespace);
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1312);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1315);
			namespaceName();
			setState(1316);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmDefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(TestCPPPaser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(TestCPPPaser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public AsmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAsmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAsmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAsmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmDefinitionContext asmDefinition() throws RecognitionException {
		AsmDefinitionContext _localctx = new AsmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_asmDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(Asm);
			setState(1319);
			match(LeftParen);
			setState(1320);
			match(StringLiteral);
			setState(1321);
			match(RightParen);
			setState(1322);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkageSpecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(TestCPPPaser.Extern, 0); }
		public TerminalNode StringLiteral() { return getToken(TestCPPPaser.StringLiteral, 0); }
		public TerminalNode LeftBrace() { return getToken(TestCPPPaser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TestCPPPaser.RightBrace, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public LinkageSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLinkageSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLinkageSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLinkageSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkageSpecificationContext linkageSpecification() throws RecognitionException {
		LinkageSpecificationContext _localctx = new LinkageSpecificationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_linkageSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(Extern);
			setState(1325);
			match(StringLiteral);
			setState(1332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(1326);
				match(LeftBrace);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
					{
					setState(1327);
					declarationseq();
					}
				}

				setState(1330);
				match(RightBrace);
				}
				break;
			case Alignas:
			case Asm:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				{
				setState(1331);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSpecifierSeqContext extends ParserRuleContext {
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAttributeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAttributeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAttributeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierSeqContext attributeSpecifierSeq() throws RecognitionException {
		AttributeSpecifierSeqContext _localctx = new AttributeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attributeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1335); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1334);
					attributeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1337); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(TestCPPPaser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(TestCPPPaser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(TestCPPPaser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(TestCPPPaser.RightBracket, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_attributeSpecifier);
		int _la;
		try {
			setState(1347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1339);
				match(LeftBracket);
				setState(1340);
				match(LeftBracket);
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1341);
					attributeList();
					}
				}

				setState(1344);
				match(RightBracket);
				setState(1345);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(TestCPPPaser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAlignmentspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAlignmentspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_alignmentspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(Alignas);
			setState(1350);
			match(LeftParen);
			setState(1353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1351);
				theTypeId();
				}
				break;
			case 2:
				{
				setState(1352);
				constantExpression();
				}
				break;
			}
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1355);
				match(Ellipsis);
				}
			}

			setState(1358);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			attribute();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1361);
				match(Comma);
				setState(1362);
				attribute();
				}
				}
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1368);
				match(Ellipsis);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public AttributeNamespaceContext attributeNamespace() {
			return getRuleContext(AttributeNamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(TestCPPPaser.Doublecolon, 0); }
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1371);
				attributeNamespace();
				setState(1372);
				match(Doublecolon);
				}
				break;
			}
			setState(1376);
			match(Identifier);
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(1377);
				attributeArgumentClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public AttributeNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAttributeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAttributeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAttributeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamespaceContext attributeNamespace() throws RecognitionException {
		AttributeNamespaceContext _localctx = new AttributeNamespaceContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attributeNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeArgumentClauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAttributeArgumentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAttributeArgumentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(LeftParen);
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << MultiLineMacro) | (1L << Directive) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False_) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True_ - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Dot - 128)) | (1L << (DotStar - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (UserDefinedIntegerLiteral - 128)) | (1L << (UserDefinedFloatingLiteral - 128)) | (1L << (UserDefinedStringLiteral - 128)) | (1L << (UserDefinedCharacterLiteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0)) {
				{
				setState(1383);
				balancedTokenSeq();
				}
			}

			setState(1386);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedTokenSeqContext extends ParserRuleContext {
		public List<BalancedtokenContext> balancedtoken() {
			return getRuleContexts(BalancedtokenContext.class);
		}
		public BalancedtokenContext balancedtoken(int i) {
			return getRuleContext(BalancedtokenContext.class,i);
		}
		public BalancedTokenSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedTokenSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBalancedTokenSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBalancedTokenSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBalancedTokenSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedTokenSeqContext balancedTokenSeq() throws RecognitionException {
		BalancedTokenSeqContext _localctx = new BalancedTokenSeqContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_balancedTokenSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1388);
				balancedtoken();
				}
				}
				setState(1391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << MultiLineMacro) | (1L << Directive) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False_) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True_ - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Dot - 128)) | (1L << (DotStar - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (UserDefinedIntegerLiteral - 128)) | (1L << (UserDefinedFloatingLiteral - 128)) | (1L << (UserDefinedStringLiteral - 128)) | (1L << (UserDefinedCharacterLiteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(TestCPPPaser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TestCPPPaser.LeftParen, i);
		}
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(TestCPPPaser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TestCPPPaser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(TestCPPPaser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(TestCPPPaser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(TestCPPPaser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(TestCPPPaser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(TestCPPPaser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(TestCPPPaser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(TestCPPPaser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(TestCPPPaser.RightBrace, i);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBalancedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				match(LeftParen);
				setState(1394);
				balancedTokenSeq();
				setState(1395);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				match(LeftBracket);
				setState(1398);
				balancedTokenSeq();
				setState(1399);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1401);
				match(LeftBrace);
				setState(1402);
				balancedTokenSeq();
				setState(1403);
				match(RightBrace);
				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case MultiLineMacro:
			case Directive:
			case Alignas:
			case Alignof:
			case Asm:
			case Auto:
			case Bool:
			case Break:
			case Case:
			case Catch:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Const_cast:
			case Continue:
			case Decltype:
			case Default:
			case Delete:
			case Do:
			case Double:
			case Dynamic_cast:
			case Else:
			case Enum:
			case Explicit:
			case Export:
			case Extern:
			case False_:
			case Final:
			case Float:
			case For:
			case Friend:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Override:
			case Private:
			case Protected:
			case Public:
			case Register:
			case Reinterpret_cast:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Static_assert:
			case Static_cast:
			case Struct:
			case Switch:
			case Template:
			case This:
			case Thread_local:
			case Throw:
			case True_:
			case Try:
			case Typedef:
			case Typeid_:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Or:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case Identifier:
			case DecimalLiteral:
			case OctalLiteral:
			case HexadecimalLiteral:
			case BinaryLiteral:
			case Integersuffix:
			case UserDefinedIntegerLiteral:
			case UserDefinedFloatingLiteral:
			case UserDefinedStringLiteral:
			case UserDefinedCharacterLiteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1406); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1405);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (RightParen - 85)) | (1L << (LeftBracket - 85)) | (1L << (RightBracket - 85)) | (1L << (LeftBrace - 85)) | (1L << (RightBrace - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1408); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			initDeclarator();
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1413);
				match(Comma);
				setState(1414);
				initDeclarator();
				}
				}
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			declarator();
			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (LeftBrace - 85)) | (1L << (Assign - 85)))) != 0)) {
				{
				setState(1421);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_declarator);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				pointerDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				noPointerDeclarator(0);
				setState(1426);
				parametersAndQualifiers();
				setState(1427);
				trailingReturnType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerDeclaratorContext extends ParserRuleContext {
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public List<TerminalNode> Const() { return getTokens(TestCPPPaser.Const); }
		public TerminalNode Const(int i) {
			return getToken(TestCPPPaser.Const, i);
		}
		public PointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPointerDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerDeclaratorContext pointerDeclarator() throws RecognitionException {
		PointerDeclaratorContext _localctx = new PointerDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_pointerDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1431);
					pointerOperator();
					setState(1433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Const) {
						{
						setState(1432);
						match(Const);
						}
					}

					}
					} 
				}
				setState(1439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			setState(1440);
			noPointerDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoPointerDeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TwoDimensionalArrayContext twoDimensionalArray() {
			return getRuleContext(TwoDimensionalArrayContext.class,0);
		}
		public ThreeDimensionalArrayContext threeDimensionalArray() {
			return getRuleContext(ThreeDimensionalArrayContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNoPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNoPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNoPointerDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerDeclaratorContext noPointerDeclarator() throws RecognitionException {
		return noPointerDeclarator(0);
	}

	private NoPointerDeclaratorContext noPointerDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerDeclaratorContext _localctx = new NoPointerDeclaratorContext(_ctx, _parentState);
		NoPointerDeclaratorContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_noPointerDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1443);
				declaratorid();
				setState(1445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1444);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1447);
				twoDimensionalArray();
				}
				break;
			case 3:
				{
				setState(1448);
				threeDimensionalArray();
				}
				break;
			case 4:
				{
				setState(1449);
				match(LeftParen);
				setState(1450);
				pointerDeclarator();
				setState(1451);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerDeclarator);
					setState(1455);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1465);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1456);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1457);
						match(LeftBracket);
						setState(1459);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
							{
							setState(1458);
							constantExpression();
							}
						}

						setState(1461);
						match(RightBracket);
						setState(1463);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1462);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersAndQualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionSpecificationContext exceptionSpecification() {
			return getRuleContext(ExceptionSpecificationContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ParametersAndQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersAndQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterParametersAndQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitParametersAndQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitParametersAndQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_parametersAndQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(LeftParen);
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Struct - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftBracket - 74)) | (1L << (Doublecolon - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1473);
				parameterDeclarationClause();
				}
			}

			setState(1476);
			match(RightParen);
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1477);
				cvqualifierseq();
				}
				break;
			}
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1480);
				refqualifier();
				}
				break;
			}
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1483);
				exceptionSpecification();
				}
				break;
			}
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1486);
				attributeSpecifierSeq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingReturnTypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(TestCPPPaser.Arrow, 0); }
		public TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() {
			return getRuleContext(TrailingTypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TrailingReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTrailingReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTrailingReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTrailingReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingReturnTypeContext trailingReturnType() throws RecognitionException {
		TrailingReturnTypeContext _localctx = new TrailingReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_trailingReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(Arrow);
			setState(1490);
			trailingTypeSpecifierSeq();
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1491);
				abstractDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TestCPPPaser.And, 0); }
		public TerminalNode AndAnd() { return getToken(TestCPPPaser.AndAnd, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Star() { return getToken(TestCPPPaser.Star, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public PointerOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPointerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPointerOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPointerOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerOperatorContext pointerOperator() throws RecognitionException {
		PointerOperatorContext _localctx = new PointerOperatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_pointerOperator);
		int _la;
		try {
			setState(1508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case AndAnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494);
				_la = _input.LA(1);
				if ( !(_la==And || _la==AndAnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1495);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case Decltype:
			case Star:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1498);
					nestedNameSpecifier(0);
					}
				}

				setState(1501);
				match(Star);
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1502);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1505);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public List<CvQualifierContext> cvQualifier() {
			return getRuleContexts(CvQualifierContext.class);
		}
		public CvQualifierContext cvQualifier(int i) {
			return getRuleContext(CvQualifierContext.class,i);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCvqualifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_cvqualifierseq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1511); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1510);
					cvQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1513); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(TestCPPPaser.Const, 0); }
		public TerminalNode Volatile() { return getToken(TestCPPPaser.Volatile, 0); }
		public CvQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterCvQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitCvQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitCvQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvQualifierContext cvQualifier() throws RecognitionException {
		CvQualifierContext _localctx = new CvQualifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_cvQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TestCPPPaser.And, 0); }
		public TerminalNode AndAnd() { return getToken(TestCPPPaser.AndAnd, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitRefqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDeclaratorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1519);
				match(Ellipsis);
				}
			}

			setState(1522);
			idExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeIdContext theTypeId() throws RecognitionException {
		TheTypeIdContext _localctx = new TheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_theTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			typeSpecifierSeq();
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1525);
				abstractDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public AbstractPackDeclaratorContext abstractPackDeclarator() {
			return getRuleContext(AbstractPackDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_abstractDeclarator);
		try {
			setState(1536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				pointerAbstractDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1529);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				setState(1532);
				parametersAndQualifiers();
				setState(1533);
				trailingReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				abstractPackDeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerAbstractDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public PointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerAbstractDeclaratorContext pointerAbstractDeclarator() throws RecognitionException {
		PointerAbstractDeclaratorContext _localctx = new PointerAbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_pointerAbstractDeclarator);
		int _la;
		try {
			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1538);
				noPointerAbstractDeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1539);
					pointerOperator();
					}
					}
					setState(1542); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Decltype || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (And - 93)) | (1L << (AndAnd - 93)) | (1L << (Doublecolon - 93)) | (1L << (Identifier - 93)))) != 0) );
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1544);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoPointerAbstractDeclaratorContext extends ParserRuleContext {
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public List<NoPointerAbstractDeclaratorContext> noPointerAbstractDeclarator() {
			return getRuleContexts(NoPointerAbstractDeclaratorContext.class);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int i) {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,i);
		}
		public NoPointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNoPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNoPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNoPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() throws RecognitionException {
		return noPointerAbstractDeclarator(0);
	}

	private NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractDeclaratorContext _localctx = new NoPointerAbstractDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_noPointerAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1550);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(1551);
				match(LeftBracket);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(1552);
					constantExpression();
					}
				}

				setState(1555);
				match(RightBracket);
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1556);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1559);
				match(LeftParen);
				setState(1560);
				pointerAbstractDeclarator();
				setState(1561);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractDeclarator);
					setState(1565);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1576);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
					case 1:
						{
						setState(1566);
						parametersAndQualifiers();
						}
						break;
					case 2:
						{
						setState(1567);
						noPointerAbstractDeclarator(0);
						setState(1568);
						match(LeftBracket);
						setState(1570);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
							{
							setState(1569);
							constantExpression();
							}
						}

						setState(1572);
						match(RightBracket);
						setState(1574);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
						case 1:
							{
							setState(1573);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					}
					}
					} 
				}
				setState(1582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractPackDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public AbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractPackDeclaratorContext abstractPackDeclarator() throws RecognitionException {
		AbstractPackDeclaratorContext _localctx = new AbstractPackDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_abstractPackDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decltype || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (And - 93)) | (1L << (AndAnd - 93)) | (1L << (Doublecolon - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				{
				setState(1583);
				pointerOperator();
				}
				}
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1589);
			noPointerAbstractPackDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoPointerAbstractPackDeclaratorContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerAbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNoPointerAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() throws RecognitionException {
		return noPointerAbstractPackDeclarator(0);
	}

	private NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractPackDeclaratorContext _localctx = new NoPointerAbstractPackDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractPackDeclaratorContext _prevctx = _localctx;
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_noPointerAbstractPackDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1592);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractPackDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractPackDeclarator);
					setState(1594);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1604);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1595);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1596);
						match(LeftBracket);
						setState(1598);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
							{
							setState(1597);
							constantExpression();
							}
						}

						setState(1600);
						match(RightBracket);
						setState(1602);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
						case 1:
							{
							setState(1601);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(TestCPPPaser.Comma, 0); }
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitParameterDeclarationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitParameterDeclarationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_parameterDeclarationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			parameterDeclarationList();
			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma || _la==Ellipsis) {
				{
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1612);
					match(Comma);
					}
				}

				setState(1615);
				match(Ellipsis);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitParameterDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			parameterDeclaration();
			setState(1623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1619);
					match(Comma);
					setState(1620);
					parameterDeclaration();
					}
					} 
				}
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1626);
				attributeSpecifierSeq();
				}
			}

			setState(1629);
			declSpecifierSeq();
			{
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1630);
				declarator();
				}
				break;
			case 2:
				{
				setState(1632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1631);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1636);
				match(Assign);
				setState(1637);
				initializerClause();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public VirtualSpecifierSeqContext virtualSpecifierSeq() {
			return getRuleContext(VirtualSpecifierSeqContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1640);
				attributeSpecifierSeq();
				}
			}

			setState(1644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1643);
				declSpecifierSeq();
				}
				break;
			}
			setState(1646);
			declarator();
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1647);
				virtualSpecifierSeq();
				}
			}

			setState(1650);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConstructorInitializerContext constructorInitializer() {
			return getRuleContext(ConstructorInitializerContext.class,0);
		}
		public FunctionTryBlockContext functionTryBlock() {
			return getRuleContext(FunctionTryBlockContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public TerminalNode Default() { return getToken(TestCPPPaser.Default, 0); }
		public TerminalNode Delete() { return getToken(TestCPPPaser.Delete, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_functionBody);
		int _la;
		try {
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1652);
					constructorInitializer();
					}
				}

				setState(1655);
				compoundStatement();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				functionTryBlock();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1657);
				match(Assign);
				setState(1658);
				_la = _input.LA(1);
				if ( !(_la==Default || _la==Delete) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1659);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_initializer);
		try {
			setState(1667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				match(LeftParen);
				setState(1664);
				expressionList();
				setState(1665);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceOrEqualInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public BraceOrEqualInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceOrEqualInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBraceOrEqualInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBraceOrEqualInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBraceOrEqualInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_braceOrEqualInitializer);
		try {
			setState(1672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				match(Assign);
				setState(1670);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerClauseContext extends ParserRuleContext {
		public ExpressionWithArrayContext expressionWithArray() {
			return getRuleContext(ExpressionWithArrayContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public InitializerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitInitializerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitInitializerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initializerClause);
		try {
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674);
				expressionWithArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676);
				bracedInitList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerClauseContext> initializerClause() {
			return getRuleContexts(InitializerClauseContext.class);
		}
		public InitializerClauseContext initializerClause(int i) {
			return getRuleContext(InitializerClauseContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(TestCPPPaser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(TestCPPPaser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			initializerClause();
			setState(1681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1680);
				match(Ellipsis);
				}
			}

			setState(1690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1683);
					match(Comma);
					setState(1684);
					initializerClause();
					setState(1686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(1685);
						match(Ellipsis);
						}
					}

					}
					} 
				}
				setState(1692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracedInitListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TestCPPPaser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TestCPPPaser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TestCPPPaser.Comma, 0); }
		public BracedInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBracedInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBracedInitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBracedInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(LeftBrace);
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(1694);
				initializerList();
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1695);
					match(Comma);
					}
				}

				}
			}

			setState(1700);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_className);
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1702);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1703);
				simpleTemplateId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassSpecifierContext extends ParserRuleContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TestCPPPaser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TestCPPPaser.RightBrace, 0); }
		public MemberSpecificationContext memberSpecification() {
			return getRuleContext(MemberSpecificationContext.class,0);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			classHead();
			setState(1707);
			match(LeftBrace);
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Operator - 10)) | (1L << (Private - 10)) | (1L << (Protected - 10)) | (1L << (Public - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Colon - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1708);
				memberSpecification();
				}
			}

			setState(1711);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeadContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ClassHeadNameContext classHeadName() {
			return getRuleContext(ClassHeadNameContext.class,0);
		}
		public BaseClauseContext baseClause() {
			return getRuleContext(BaseClauseContext.class,0);
		}
		public ClassVirtSpecifierContext classVirtSpecifier() {
			return getRuleContext(ClassVirtSpecifierContext.class,0);
		}
		public TerminalNode Union() { return getToken(TestCPPPaser.Union, 0); }
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterClassHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitClassHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitClassHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_classHead);
		int _la;
		try {
			setState(1736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				classKey();
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1714);
					attributeSpecifierSeq();
					}
				}

				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1717);
					classHeadName();
					setState(1719);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1718);
						classVirtSpecifier();
						}
					}

					}
				}

				setState(1724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1723);
					baseClause();
					}
				}

				}
				break;
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				match(Union);
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1727);
					attributeSpecifierSeq();
					}
				}

				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1730);
					classHeadName();
					setState(1732);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1731);
						classVirtSpecifier();
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeadNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public ClassHeadNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeadName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterClassHeadName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitClassHeadName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitClassHeadName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadNameContext classHeadName() throws RecognitionException {
		ClassHeadNameContext _localctx = new ClassHeadNameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_classHeadName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1738);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1741);
			className();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassVirtSpecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(TestCPPPaser.Final, 0); }
		public ClassVirtSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVirtSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterClassVirtSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitClassVirtSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitClassVirtSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVirtSpecifierContext classVirtSpecifier() throws RecognitionException {
		ClassVirtSpecifierContext _localctx = new ClassVirtSpecifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_classVirtSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassKeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(TestCPPPaser.Class, 0); }
		public TerminalNode Struct() { return getToken(TestCPPPaser.Struct, 0); }
		public ClassKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterClassKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitClassKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitClassKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassKeyContext classKey() throws RecognitionException {
		ClassKeyContext _localctx = new ClassKeyContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_classKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Struct) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberSpecificationContext extends ParserRuleContext {
		public List<MemberdeclarationContext> memberdeclaration() {
			return getRuleContexts(MemberdeclarationContext.class);
		}
		public MemberdeclarationContext memberdeclaration(int i) {
			return getRuleContext(MemberdeclarationContext.class,i);
		}
		public List<AccessSpecifierContext> accessSpecifier() {
			return getRuleContexts(AccessSpecifierContext.class);
		}
		public AccessSpecifierContext accessSpecifier(int i) {
			return getRuleContext(AccessSpecifierContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(TestCPPPaser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TestCPPPaser.Colon, i);
		}
		public MemberSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMemberSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMemberSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMemberSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberSpecificationContext memberSpecification() throws RecognitionException {
		MemberSpecificationContext _localctx = new MemberSpecificationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_memberSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1751);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Alignas:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Class:
				case Const:
				case Constexpr:
				case Decltype:
				case Double:
				case Enum:
				case Explicit:
				case Extern:
				case Float:
				case Friend:
				case Inline:
				case Int:
				case Long:
				case Mutable:
				case Operator:
				case Register:
				case Short:
				case Signed:
				case Static:
				case Static_assert:
				case Struct:
				case Template:
				case Thread_local:
				case Typedef:
				case Typename_:
				case Union:
				case Unsigned:
				case Using:
				case Virtual:
				case Void:
				case Volatile:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Star:
				case And:
				case Tilde:
				case AndAnd:
				case Colon:
				case Doublecolon:
				case Semi:
				case Ellipsis:
				case Identifier:
					{
					setState(1747);
					memberdeclaration();
					}
					break;
				case Private:
				case Protected:
				case Public:
					{
					setState(1748);
					accessSpecifier();
					setState(1749);
					match(Colon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Operator - 10)) | (1L << (Private - 10)) | (1L << (Protected - 10)) | (1L << (Public - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Colon - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public MemberDeclaratorListContext memberDeclaratorList() {
			return getRuleContext(MemberDeclaratorListContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public AliasDeclarationContext aliasDeclaration() {
			return getRuleContext(AliasDeclarationContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMemberdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMemberdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_memberdeclaration);
		int _la;
		try {
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1755);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1758);
					declSpecifierSeq();
					}
					break;
				}
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (LeftBracket - 85)) | (1L << (Star - 85)) | (1L << (And - 85)) | (1L << (Tilde - 85)) | (1L << (AndAnd - 85)) | (1L << (Colon - 85)) | (1L << (Doublecolon - 85)) | (1L << (Ellipsis - 85)) | (1L << (Identifier - 85)))) != 0)) {
					{
					setState(1761);
					memberDeclaratorList();
					}
				}

				setState(1764);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1765);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1766);
				usingDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1767);
				staticAssertDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1768);
				templateDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1769);
				aliasDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1770);
				emptyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclaratorListContext extends ParserRuleContext {
		public List<MemberDeclaratorContext> memberDeclarator() {
			return getRuleContexts(MemberDeclaratorContext.class);
		}
		public MemberDeclaratorContext memberDeclarator(int i) {
			return getRuleContext(MemberDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public MemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMemberDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMemberDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			memberDeclarator();
			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1774);
				match(Comma);
				setState(1775);
				memberDeclarator();
				}
				}
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtualSpecifierSeqContext virtualSpecifierSeq() {
			return getRuleContext(VirtualSpecifierSeqContext.class,0);
		}
		public PureSpecifierContext pureSpecifier() {
			return getRuleContext(PureSpecifierContext.class,0);
		}
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public MemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMemberDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMemberDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMemberDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_memberDeclarator);
		int _la;
		try {
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				declarator();
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final || _la==Override) {
						{
						setState(1782);
						virtualSpecifierSeq();
						}
					}

					setState(1786);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(1785);
						pureSpecifier();
						}
					}

					}
					break;
				case 2:
					{
					setState(1789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBrace || _la==Assign) {
						{
						setState(1788);
						braceOrEqualInitializer();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1793);
					match(Identifier);
					}
				}

				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1796);
					attributeSpecifierSeq();
					}
				}

				setState(1799);
				match(Colon);
				setState(1800);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtualSpecifierSeqContext extends ParserRuleContext {
		public List<VirtualSpecifierContext> virtualSpecifier() {
			return getRuleContexts(VirtualSpecifierContext.class);
		}
		public VirtualSpecifierContext virtualSpecifier(int i) {
			return getRuleContext(VirtualSpecifierContext.class,i);
		}
		public VirtualSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterVirtualSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitVirtualSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitVirtualSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierSeqContext virtualSpecifierSeq() throws RecognitionException {
		VirtualSpecifierSeqContext _localctx = new VirtualSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_virtualSpecifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1803);
				virtualSpecifier();
				}
				}
				setState(1806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Final || _la==Override );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtualSpecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(TestCPPPaser.Override, 0); }
		public TerminalNode Final() { return getToken(TestCPPPaser.Final, 0); }
		public VirtualSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterVirtualSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitVirtualSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitVirtualSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierContext virtualSpecifier() throws RecognitionException {
		VirtualSpecifierContext _localctx = new VirtualSpecifierContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_virtualSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PureSpecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public TerminalNode OctalLiteral() { return getToken(TestCPPPaser.OctalLiteral, 0); }
		public PureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterPureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitPureSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitPureSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureSpecifierContext pureSpecifier() throws RecognitionException {
		PureSpecifierContext _localctx = new PureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_pureSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(Assign);
			setState(1811);
			((PureSpecifierContext)_localctx).val = match(OctalLiteral);
			if((((PureSpecifierContext)_localctx).val!=null?((PureSpecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseClauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public BaseSpecifierListContext baseSpecifierList() {
			return getRuleContext(BaseSpecifierListContext.class,0);
		}
		public BaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseClauseContext baseClause() throws RecognitionException {
		BaseClauseContext _localctx = new BaseClauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(Colon);
			setState(1815);
			baseSpecifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseSpecifierListContext extends ParserRuleContext {
		public List<BaseSpecifierContext> baseSpecifier() {
			return getRuleContexts(BaseSpecifierContext.class);
		}
		public BaseSpecifierContext baseSpecifier(int i) {
			return getRuleContext(BaseSpecifierContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(TestCPPPaser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(TestCPPPaser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public BaseSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBaseSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBaseSpecifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBaseSpecifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierListContext baseSpecifierList() throws RecognitionException {
		BaseSpecifierListContext _localctx = new BaseSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			baseSpecifier();
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1818);
				match(Ellipsis);
				}
			}

			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1821);
				match(Comma);
				setState(1822);
				baseSpecifier();
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1823);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseSpecifierContext extends ParserRuleContext {
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(TestCPPPaser.Virtual, 0); }
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public BaseSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBaseSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBaseSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBaseSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierContext baseSpecifier() throws RecognitionException {
		BaseSpecifierContext _localctx = new BaseSpecifierContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_baseSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1831);
				attributeSpecifierSeq();
				}
			}

			setState(1846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Doublecolon:
			case Identifier:
				{
				setState(1834);
				baseTypeSpecifier();
				}
				break;
			case Virtual:
				{
				setState(1835);
				match(Virtual);
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(1836);
					accessSpecifier();
					}
				}

				setState(1839);
				baseTypeSpecifier();
				}
				break;
			case Private:
			case Protected:
			case Public:
				{
				setState(1840);
				accessSpecifier();
				setState(1842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1841);
					match(Virtual);
					}
				}

				setState(1844);
				baseTypeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrDeclTypeContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public ClassOrDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrDeclType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterClassOrDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitClassOrDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitClassOrDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrDeclTypeContext classOrDeclType() throws RecognitionException {
		ClassOrDeclTypeContext _localctx = new ClassOrDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_classOrDeclType);
		try {
			setState(1853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1848);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1851);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1852);
				decltypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeSpecifierContext extends ParserRuleContext {
		public ClassOrDeclTypeContext classOrDeclType() {
			return getRuleContext(ClassOrDeclTypeContext.class,0);
		}
		public BaseTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBaseTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBaseTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBaseTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeSpecifierContext baseTypeSpecifier() throws RecognitionException {
		BaseTypeSpecifierContext _localctx = new BaseTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_baseTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			classOrDeclType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessSpecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(TestCPPPaser.Private, 0); }
		public TerminalNode Protected() { return getToken(TestCPPPaser.Protected, 0); }
		public TerminalNode Public() { return getToken(TestCPPPaser.Public, 0); }
		public AccessSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterAccessSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitAccessSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitAccessSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessSpecifierContext accessSpecifier() throws RecognitionException {
		AccessSpecifierContext _localctx = new AccessSpecifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_accessSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(TestCPPPaser.Operator, 0); }
		public ConversionTypeIdContext conversionTypeId() {
			return getRuleContext(ConversionTypeIdContext.class,0);
		}
		public ConversionFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterConversionFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitConversionFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitConversionFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionFunctionIdContext conversionFunctionId() throws RecognitionException {
		ConversionFunctionIdContext _localctx = new ConversionFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_conversionFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(Operator);
			setState(1860);
			conversionTypeId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public ConversionDeclaratorContext conversionDeclarator() {
			return getRuleContext(ConversionDeclaratorContext.class,0);
		}
		public ConversionTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterConversionTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitConversionTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitConversionTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionTypeIdContext conversionTypeId() throws RecognitionException {
		ConversionTypeIdContext _localctx = new ConversionTypeIdContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_conversionTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			typeSpecifierSeq();
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(1863);
				conversionDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionDeclaratorContext extends ParserRuleContext {
		public PointerOperatorContext pointerOperator() {
			return getRuleContext(PointerOperatorContext.class,0);
		}
		public ConversionDeclaratorContext conversionDeclarator() {
			return getRuleContext(ConversionDeclaratorContext.class,0);
		}
		public ConversionDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterConversionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitConversionDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitConversionDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionDeclaratorContext conversionDeclarator() throws RecognitionException {
		ConversionDeclaratorContext _localctx = new ConversionDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_conversionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			pointerOperator();
			setState(1868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1867);
				conversionDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorInitializerContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public MemInitializerListContext memInitializerList() {
			return getRuleContext(MemInitializerListContext.class,0);
		}
		public ConstructorInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterConstructorInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitConstructorInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitConstructorInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorInitializerContext constructorInitializer() throws RecognitionException {
		ConstructorInitializerContext _localctx = new ConstructorInitializerContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_constructorInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(Colon);
			setState(1871);
			memInitializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemInitializerListContext extends ParserRuleContext {
		public List<MemInitializerContext> memInitializer() {
			return getRuleContexts(MemInitializerContext.class);
		}
		public MemInitializerContext memInitializer(int i) {
			return getRuleContext(MemInitializerContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(TestCPPPaser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(TestCPPPaser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public MemInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMemInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMemInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMemInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerListContext memInitializerList() throws RecognitionException {
		MemInitializerListContext _localctx = new MemInitializerListContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_memInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			memInitializer();
			setState(1875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1874);
				match(Ellipsis);
				}
			}

			setState(1884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1877);
				match(Comma);
				setState(1878);
				memInitializer();
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1879);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemInitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMemInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMemInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMemInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerContext memInitializer() throws RecognitionException {
		MemInitializerContext _localctx = new MemInitializerContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_memInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			meminitializerid();
			setState(1894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(1888);
				match(LeftParen);
				setState(1890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(1889);
					expressionList();
					}
				}

				setState(1892);
				match(RightParen);
				}
				break;
			case LeftBrace:
				{
				setState(1893);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassOrDeclTypeContext classOrDeclType() {
			return getRuleContext(ClassOrDeclTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitMeminitializerid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_meminitializerid);
		try {
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1896);
				classOrDeclType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1897);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(TestCPPPaser.Operator, 0); }
		public TheOperatorContext theOperator() {
			return getRuleContext(TheOperatorContext.class,0);
		}
		public OperatorFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterOperatorFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitOperatorFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitOperatorFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorFunctionIdContext operatorFunctionId() throws RecognitionException {
		OperatorFunctionIdContext _localctx = new OperatorFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_operatorFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(Operator);
			setState(1901);
			theOperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralOperatorIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(TestCPPPaser.Operator, 0); }
		public TerminalNode StringLiteral() { return getToken(TestCPPPaser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode UserDefinedStringLiteral() { return getToken(TestCPPPaser.UserDefinedStringLiteral, 0); }
		public LiteralOperatorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalOperatorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLiteralOperatorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLiteralOperatorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLiteralOperatorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralOperatorIdContext literalOperatorId() throws RecognitionException {
		LiteralOperatorIdContext _localctx = new LiteralOperatorIdContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_literalOperatorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(Operator);
			setState(1907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(1904);
				match(StringLiteral);
				setState(1905);
				match(Identifier);
				}
				break;
			case UserDefinedStringLiteral:
				{
				setState(1906);
				match(UserDefinedStringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public TerminalNode Less() { return getToken(TestCPPPaser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(TestCPPPaser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			match(Template);
			setState(1910);
			match(Less);
			setState(1911);
			templateparameterList();
			setState(1912);
			match(Greater);
			setState(1913);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterListContext extends ParserRuleContext {
		public List<TemplateParameterContext> templateParameter() {
			return getRuleContexts(TemplateParameterContext.class);
		}
		public TemplateParameterContext templateParameter(int i) {
			return getRuleContext(TemplateParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public TemplateparameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTemplateparameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTemplateparameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTemplateparameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterListContext templateparameterList() throws RecognitionException {
		TemplateparameterListContext _localctx = new TemplateparameterListContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_templateparameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			templateParameter();
			setState(1920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1916);
				match(Comma);
				setState(1917);
				templateParameter();
				}
				}
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateParameterContext extends ParserRuleContext {
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public TemplateParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTemplateParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTemplateParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTemplateParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateParameterContext templateParameter() throws RecognitionException {
		TemplateParameterContext _localctx = new TemplateParameterContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_templateParameter);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1923);
				typeParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				parameterDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(TestCPPPaser.Class, 0); }
		public TerminalNode Typename_() { return getToken(TestCPPPaser.Typename_, 0); }
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public TerminalNode Less() { return getToken(TestCPPPaser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(TestCPPPaser.Greater, 0); }
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Template:
				{
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1927);
					match(Template);
					setState(1928);
					match(Less);
					setState(1929);
					templateparameterList();
					setState(1930);
					match(Greater);
					}
				}

				setState(1934);
				match(Class);
				}
				break;
			case Typename_:
				{
				setState(1935);
				match(Typename_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				{
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1938);
					match(Ellipsis);
					}
				}

				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1941);
					match(Identifier);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1944);
					match(Identifier);
					}
				}

				setState(1947);
				match(Assign);
				setState(1948);
				theTypeId();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTemplateIdContext extends ParserRuleContext {
		public TemplateNameContext templateName() {
			return getRuleContext(TemplateNameContext.class,0);
		}
		public TerminalNode Less() { return getToken(TestCPPPaser.Less, 0); }
		public TerminalNode Greater() { return getToken(TestCPPPaser.Greater, 0); }
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public SimpleTemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTemplateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterSimpleTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitSimpleTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitSimpleTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTemplateIdContext simpleTemplateId() throws RecognitionException {
		SimpleTemplateIdContext _localctx = new SimpleTemplateIdContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_simpleTemplateId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			templateName();
			setState(1952);
			match(Less);
			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(1953);
				templateArgumentList();
				}
			}

			setState(1956);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateIdContext extends ParserRuleContext {
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Less() { return getToken(TestCPPPaser.Less, 0); }
		public TerminalNode Greater() { return getToken(TestCPPPaser.Greater, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public TemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateIdContext templateId() throws RecognitionException {
		TemplateIdContext _localctx = new TemplateIdContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_templateId);
		int _la;
		try {
			setState(1969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1958);
				simpleTemplateId();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(1961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(1959);
					operatorFunctionId();
					}
					break;
				case 2:
					{
					setState(1960);
					literalOperatorId();
					}
					break;
				}
				setState(1963);
				match(Less);
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(1964);
					templateArgumentList();
					}
				}

				setState(1967);
				match(Greater);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TemplateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTemplateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTemplateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTemplateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateNameContext templateName() throws RecognitionException {
		TemplateNameContext _localctx = new TemplateNameContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_templateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateArgumentListContext extends ParserRuleContext {
		public List<TemplateArgumentContext> templateArgument() {
			return getRuleContexts(TemplateArgumentContext.class);
		}
		public TemplateArgumentContext templateArgument(int i) {
			return getRuleContext(TemplateArgumentContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(TestCPPPaser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(TestCPPPaser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public TemplateArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTemplateArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTemplateArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTemplateArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentListContext templateArgumentList() throws RecognitionException {
		TemplateArgumentListContext _localctx = new TemplateArgumentListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_templateArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			templateArgument();
			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1974);
				match(Ellipsis);
				}
			}

			setState(1984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1977);
				match(Comma);
				setState(1978);
				templateArgument();
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1979);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateArgumentContext extends ParserRuleContext {
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TemplateArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTemplateArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTemplateArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTemplateArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentContext templateArgument() throws RecognitionException {
		TemplateArgumentContext _localctx = new TemplateArgumentContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_templateArgument);
		try {
			setState(1990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1987);
				theTypeId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1988);
				constantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1989);
				idExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Typename_() { return getToken(TestCPPPaser.Typename_, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public TypeNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTypeNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTypeNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTypeNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameSpecifierContext typeNameSpecifier() throws RecognitionException {
		TypeNameSpecifierContext _localctx = new TypeNameSpecifierContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_typeNameSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			match(Typename_);
			setState(1993);
			nestedNameSpecifier(0);
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(1994);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1995);
					match(Template);
					}
				}

				setState(1998);
				simpleTemplateId();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitInstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(TestCPPPaser.Extern, 0); }
		public ExplicitInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExplicitInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExplicitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExplicitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitInstantiationContext explicitInstantiation() throws RecognitionException {
		ExplicitInstantiationContext _localctx = new ExplicitInstantiationContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_explicitInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2001);
				match(Extern);
				}
			}

			setState(2004);
			match(Template);
			setState(2005);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitSpecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(TestCPPPaser.Template, 0); }
		public TerminalNode Less() { return getToken(TestCPPPaser.Less, 0); }
		public TerminalNode Greater() { return getToken(TestCPPPaser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitSpecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExplicitSpecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExplicitSpecialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExplicitSpecialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitSpecializationContext explicitSpecialization() throws RecognitionException {
		ExplicitSpecializationContext _localctx = new ExplicitSpecializationContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_explicitSpecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			match(Template);
			setState(2008);
			match(Less);
			setState(2009);
			match(Greater);
			setState(2010);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryBlockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(TestCPPPaser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			match(Try);
			setState(2013);
			compoundStatement();
			setState(2014);
			handlerSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTryBlockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(TestCPPPaser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public ConstructorInitializerContext constructorInitializer() {
			return getRuleContext(ConstructorInitializerContext.class,0);
		}
		public FunctionTryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterFunctionTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitFunctionTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitFunctionTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTryBlockContext functionTryBlock() throws RecognitionException {
		FunctionTryBlockContext _localctx = new FunctionTryBlockContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_functionTryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			match(Try);
			setState(2018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2017);
				constructorInitializer();
				}
			}

			setState(2020);
			compoundStatement();
			setState(2021);
			handlerSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerSeqContext extends ParserRuleContext {
		public List<HandlerContext> handler() {
			return getRuleContexts(HandlerContext.class);
		}
		public HandlerContext handler(int i) {
			return getRuleContext(HandlerContext.class,i);
		}
		public HandlerSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterHandlerSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitHandlerSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitHandlerSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerSeqContext handlerSeq() throws RecognitionException {
		HandlerSeqContext _localctx = new HandlerSeqContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_handlerSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2023);
				handler();
				}
				}
				setState(2026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Catch );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(TestCPPPaser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ExceptionDeclarationContext exceptionDeclaration() {
			return getRuleContext(ExceptionDeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			match(Catch);
			setState(2029);
			match(LeftParen);
			setState(2030);
			exceptionDeclaration();
			setState(2031);
			match(RightParen);
			setState(2032);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionDeclarationContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(TestCPPPaser.Ellipsis, 0); }
		public ExceptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExceptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExceptionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExceptionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_exceptionDeclaration);
		int _la;
		try {
			setState(2043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case LeftBracket:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2034);
					attributeSpecifierSeq();
					}
				}

				setState(2037);
				typeSpecifierSeq();
				setState(2040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2038);
					declarator();
					}
					break;
				case 2:
					{
					setState(2039);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				match(Ellipsis);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowExpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(TestCPPPaser.Throw, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitThrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitThrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExpressionContext throwExpression() throws RecognitionException {
		ThrowExpressionContext _localctx = new ThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_throwExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			match(Throw);
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(2046);
				assignmentExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionSpecificationContext extends ParserRuleContext {
		public DynamicExceptionSpecificationContext dynamicExceptionSpecification() {
			return getRuleContext(DynamicExceptionSpecificationContext.class,0);
		}
		public NoeExceptSpecificationContext noeExceptSpecification() {
			return getRuleContext(NoeExceptSpecificationContext.class,0);
		}
		public ExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSpecificationContext exceptionSpecification() throws RecognitionException {
		ExceptionSpecificationContext _localctx = new ExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_exceptionSpecification);
		try {
			setState(2051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2049);
				dynamicExceptionSpecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2050);
				noeExceptSpecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicExceptionSpecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(TestCPPPaser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public TypeIdListContext typeIdList() {
			return getRuleContext(TypeIdListContext.class,0);
		}
		public DynamicExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicExceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterDynamicExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitDynamicExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitDynamicExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicExceptionSpecificationContext dynamicExceptionSpecification() throws RecognitionException {
		DynamicExceptionSpecificationContext _localctx = new DynamicExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_dynamicExceptionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(Throw);
			setState(2054);
			match(LeftParen);
			setState(2056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (Auto - 13)) | (1L << (Bool - 13)) | (1L << (Char - 13)) | (1L << (Char16 - 13)) | (1L << (Char32 - 13)) | (1L << (Class - 13)) | (1L << (Const - 13)) | (1L << (Decltype - 13)) | (1L << (Double - 13)) | (1L << (Enum - 13)) | (1L << (Float - 13)) | (1L << (Int - 13)) | (1L << (Long - 13)) | (1L << (Short - 13)) | (1L << (Signed - 13)) | (1L << (Struct - 13)) | (1L << (Typename_ - 13)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Union - 77)) | (1L << (Unsigned - 77)) | (1L << (Void - 77)) | (1L << (Volatile - 77)) | (1L << (Wchar - 77)) | (1L << (Doublecolon - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(2055);
				typeIdList();
				}
			}

			setState(2058);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdListContext extends ParserRuleContext {
		public List<TheTypeIdContext> theTypeId() {
			return getRuleContexts(TheTypeIdContext.class);
		}
		public TheTypeIdContext theTypeId(int i) {
			return getRuleContext(TheTypeIdContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(TestCPPPaser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(TestCPPPaser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TestCPPPaser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TestCPPPaser.Comma, i);
		}
		public TypeIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTypeIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTypeIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTypeIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdListContext typeIdList() throws RecognitionException {
		TypeIdListContext _localctx = new TypeIdListContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_typeIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			theTypeId();
			setState(2062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(2061);
				match(Ellipsis);
				}
			}

			setState(2071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2064);
				match(Comma);
				setState(2065);
				theTypeId();
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2066);
					match(Ellipsis);
					}
				}

				}
				}
				setState(2073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TwoDimensionalArrayContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(TestCPPPaser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(TestCPPPaser.LeftBracket, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(TestCPPPaser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(TestCPPPaser.RightBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TwoDimensionalArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoDimensionalArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTwoDimensionalArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTwoDimensionalArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTwoDimensionalArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoDimensionalArrayContext twoDimensionalArray() throws RecognitionException {
		TwoDimensionalArrayContext _localctx = new TwoDimensionalArrayContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_twoDimensionalArray);
		try {
			setState(2090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2074);
				match(Identifier);
				setState(2075);
				match(LeftBracket);
				setState(2076);
				constantExpression();
				setState(2077);
				match(RightBracket);
				setState(2078);
				match(LeftBracket);
				setState(2079);
				constantExpression();
				setState(2080);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2082);
				match(Identifier);
				setState(2083);
				match(LeftBracket);
				setState(2084);
				expression();
				setState(2085);
				match(RightBracket);
				setState(2086);
				match(LeftBracket);
				setState(2087);
				expression();
				setState(2088);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThreeDimensionalArrayContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(TestCPPPaser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(TestCPPPaser.LeftBracket, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(TestCPPPaser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(TestCPPPaser.RightBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ThreeDimensionalArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threeDimensionalArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterThreeDimensionalArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitThreeDimensionalArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitThreeDimensionalArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThreeDimensionalArrayContext threeDimensionalArray() throws RecognitionException {
		ThreeDimensionalArrayContext _localctx = new ThreeDimensionalArrayContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_threeDimensionalArray);
		try {
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2092);
				match(Identifier);
				setState(2093);
				match(LeftBracket);
				setState(2094);
				constantExpression();
				setState(2095);
				match(RightBracket);
				setState(2096);
				match(LeftBracket);
				setState(2097);
				constantExpression();
				setState(2098);
				match(RightBracket);
				setState(2099);
				match(LeftBracket);
				setState(2100);
				constantExpression();
				setState(2101);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2103);
				match(Identifier);
				setState(2104);
				match(LeftBracket);
				setState(2105);
				expression();
				setState(2106);
				match(RightBracket);
				setState(2107);
				match(LeftBracket);
				setState(2108);
				expression();
				setState(2109);
				match(RightBracket);
				setState(2110);
				match(LeftBracket);
				setState(2111);
				expression();
				setState(2112);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoeExceptSpecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(TestCPPPaser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public NoeExceptSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noeExceptSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterNoeExceptSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitNoeExceptSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitNoeExceptSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoeExceptSpecificationContext noeExceptSpecification() throws RecognitionException {
		NoeExceptSpecificationContext _localctx = new NoeExceptSpecificationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_noeExceptSpecification);
		try {
			setState(2122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2116);
				match(Noexcept);
				setState(2117);
				match(LeftParen);
				setState(2118);
				constantExpression();
				setState(2119);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2121);
				match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TwoLoopAndTwoDimensionalArrayContext extends ParserRuleContext {
		public List<TerminalNode> For() { return getTokens(TestCPPPaser.For); }
		public TerminalNode For(int i) {
			return getToken(TestCPPPaser.For, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(TestCPPPaser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TestCPPPaser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(TestCPPPaser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TestCPPPaser.RightParen, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(TestCPPPaser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(TestCPPPaser.LeftBrace, i);
		}
		public List<TwoDimensionalArrayContext> twoDimensionalArray() {
			return getRuleContexts(TwoDimensionalArrayContext.class);
		}
		public TwoDimensionalArrayContext twoDimensionalArray(int i) {
			return getRuleContext(TwoDimensionalArrayContext.class,i);
		}
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public TerminalNode Plus() { return getToken(TestCPPPaser.Plus, 0); }
		public List<TerminalNode> Semi() { return getTokens(TestCPPPaser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(TestCPPPaser.Semi, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(TestCPPPaser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(TestCPPPaser.RightBrace, i);
		}
		public List<ForInitStatementContext> forInitStatement() {
			return getRuleContexts(ForInitStatementContext.class);
		}
		public ForInitStatementContext forInitStatement(int i) {
			return getRuleContext(ForInitStatementContext.class,i);
		}
		public List<ForRangeDeclarationContext> forRangeDeclaration() {
			return getRuleContexts(ForRangeDeclarationContext.class);
		}
		public ForRangeDeclarationContext forRangeDeclaration(int i) {
			return getRuleContext(ForRangeDeclarationContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(TestCPPPaser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TestCPPPaser.Colon, i);
		}
		public List<ForRangeInitializerContext> forRangeInitializer() {
			return getRuleContexts(ForRangeInitializerContext.class);
		}
		public ForRangeInitializerContext forRangeInitializer(int i) {
			return getRuleContext(ForRangeInitializerContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TwoLoopAndTwoDimensionalArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoLoopAndTwoDimensionalArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTwoLoopAndTwoDimensionalArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTwoLoopAndTwoDimensionalArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTwoLoopAndTwoDimensionalArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoLoopAndTwoDimensionalArrayContext twoLoopAndTwoDimensionalArray() throws RecognitionException {
		TwoLoopAndTwoDimensionalArrayContext _localctx = new TwoLoopAndTwoDimensionalArrayContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_twoLoopAndTwoDimensionalArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			match(For);
			setState(2125);
			match(LeftParen);
			setState(2138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2126);
				forInitStatement();
				setState(2128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2127);
					condition();
					}
				}

				setState(2130);
				match(Semi);
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2131);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2134);
				forRangeDeclaration();
				setState(2135);
				match(Colon);
				setState(2136);
				forRangeInitializer();
				}
				break;
			}
			setState(2140);
			match(RightParen);
			setState(2141);
			match(LeftBrace);
			setState(2142);
			match(For);
			setState(2143);
			match(LeftParen);
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2144);
				forInitStatement();
				setState(2146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2145);
					condition();
					}
				}

				setState(2148);
				match(Semi);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2149);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2152);
				forRangeDeclaration();
				setState(2153);
				match(Colon);
				setState(2154);
				forRangeInitializer();
				}
				break;
			}
			setState(2158);
			match(RightParen);
			setState(2160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2159);
				match(LeftBrace);
				}
			}

			setState(2162);
			twoDimensionalArray();
			setState(2163);
			match(Assign);
			setState(2164);
			twoDimensionalArray();
			setState(2165);
			match(Plus);
			setState(2166);
			twoDimensionalArray();
			setState(2167);
			match(Semi);
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2168);
				match(RightBrace);
				}
				break;
			}
			setState(2171);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThreeLoopAndThreeDimensionalArrayContext extends ParserRuleContext {
		public List<TerminalNode> For() { return getTokens(TestCPPPaser.For); }
		public TerminalNode For(int i) {
			return getToken(TestCPPPaser.For, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(TestCPPPaser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TestCPPPaser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(TestCPPPaser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TestCPPPaser.RightParen, i);
		}
		public List<ThreeDimensionalArrayContext> threeDimensionalArray() {
			return getRuleContexts(ThreeDimensionalArrayContext.class);
		}
		public ThreeDimensionalArrayContext threeDimensionalArray(int i) {
			return getRuleContext(ThreeDimensionalArrayContext.class,i);
		}
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public TerminalNode Plus() { return getToken(TestCPPPaser.Plus, 0); }
		public List<TerminalNode> Semi() { return getTokens(TestCPPPaser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(TestCPPPaser.Semi, i);
		}
		public List<ForInitStatementContext> forInitStatement() {
			return getRuleContexts(ForInitStatementContext.class);
		}
		public ForInitStatementContext forInitStatement(int i) {
			return getRuleContext(ForInitStatementContext.class,i);
		}
		public List<ForRangeDeclarationContext> forRangeDeclaration() {
			return getRuleContexts(ForRangeDeclarationContext.class);
		}
		public ForRangeDeclarationContext forRangeDeclaration(int i) {
			return getRuleContext(ForRangeDeclarationContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(TestCPPPaser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TestCPPPaser.Colon, i);
		}
		public List<ForRangeInitializerContext> forRangeInitializer() {
			return getRuleContexts(ForRangeInitializerContext.class);
		}
		public ForRangeInitializerContext forRangeInitializer(int i) {
			return getRuleContext(ForRangeInitializerContext.class,i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(TestCPPPaser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(TestCPPPaser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(TestCPPPaser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(TestCPPPaser.RightBrace, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ThreeLoopAndThreeDimensionalArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threeLoopAndThreeDimensionalArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterThreeLoopAndThreeDimensionalArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitThreeLoopAndThreeDimensionalArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitThreeLoopAndThreeDimensionalArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThreeLoopAndThreeDimensionalArrayContext threeLoopAndThreeDimensionalArray() throws RecognitionException {
		ThreeLoopAndThreeDimensionalArrayContext _localctx = new ThreeLoopAndThreeDimensionalArrayContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_threeLoopAndThreeDimensionalArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			match(For);
			setState(2174);
			match(LeftParen);
			setState(2187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2175);
				forInitStatement();
				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2176);
					condition();
					}
				}

				setState(2179);
				match(Semi);
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2180);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2183);
				forRangeDeclaration();
				setState(2184);
				match(Colon);
				setState(2185);
				forRangeInitializer();
				}
				break;
			}
			setState(2189);
			match(RightParen);
			setState(2191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2190);
				match(LeftBrace);
				}
			}

			setState(2193);
			match(For);
			setState(2194);
			match(LeftParen);
			setState(2207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2195);
				forInitStatement();
				setState(2197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2196);
					condition();
					}
				}

				setState(2199);
				match(Semi);
				setState(2201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2200);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2203);
				forRangeDeclaration();
				setState(2204);
				match(Colon);
				setState(2205);
				forRangeInitializer();
				}
				break;
			}
			setState(2209);
			match(RightParen);
			setState(2211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2210);
				match(LeftBrace);
				}
			}

			setState(2213);
			match(For);
			setState(2214);
			match(LeftParen);
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2215);
				forInitStatement();
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2216);
					condition();
					}
				}

				setState(2219);
				match(Semi);
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2220);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2223);
				forRangeDeclaration();
				setState(2224);
				match(Colon);
				setState(2225);
				forRangeInitializer();
				}
				break;
			}
			setState(2229);
			match(RightParen);
			setState(2231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2230);
				match(LeftBrace);
				}
			}

			setState(2233);
			threeDimensionalArray();
			setState(2234);
			match(Assign);
			setState(2235);
			threeDimensionalArray();
			setState(2236);
			match(Plus);
			setState(2237);
			threeDimensionalArray();
			setState(2238);
			match(Semi);
			setState(2240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				setState(2239);
				match(RightBrace);
				}
				break;
			}
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2242);
				match(RightBrace);
				}
				break;
			}
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2245);
				match(RightBrace);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionWithArrayContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TestCPPPaser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(TestCPPPaser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(TestCPPPaser.Plus, i);
		}
		public TwoDimensionalArrayContext twoDimensionalArray() {
			return getRuleContext(TwoDimensionalArrayContext.class,0);
		}
		public ExpressionWithArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterExpressionWithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitExpressionWithArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitExpressionWithArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithArrayContext expressionWithArray() throws RecognitionException {
		ExpressionWithArrayContext _localctx = new ExpressionWithArrayContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_expressionWithArray);
		int _la;
		try {
			int _alt;
			setState(2283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2248);
						multiplicativeExpression();
						setState(2249);
						match(Plus);
						}
						} 
					}
					setState(2255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				}
				setState(2256);
				match(Identifier);
				setState(2257);
				match(LeftBracket);
				setState(2258);
				expression();
				setState(2259);
				match(RightBracket);
				setState(2264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus) {
					{
					{
					setState(2260);
					match(Plus);
					setState(2261);
					multiplicativeExpression();
					}
					}
					setState(2266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2267);
						multiplicativeExpression();
						setState(2268);
						match(Plus);
						}
						} 
					}
					setState(2274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
				}
				setState(2275);
				twoDimensionalArray();
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus) {
					{
					{
					setState(2276);
					match(Plus);
					setState(2277);
					multiplicativeExpression();
					}
					}
					setState(2282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinuousLoopContext extends ParserRuleContext {
		public List<TerminalNode> For() { return getTokens(TestCPPPaser.For); }
		public TerminalNode For(int i) {
			return getToken(TestCPPPaser.For, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(TestCPPPaser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TestCPPPaser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(TestCPPPaser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TestCPPPaser.RightParen, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(TestCPPPaser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TestCPPPaser.Identifier, i);
		}
		public List<TerminalNode> Assign() { return getTokens(TestCPPPaser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(TestCPPPaser.Assign, i);
		}
		public List<ExpressionWithArrayContext> expressionWithArray() {
			return getRuleContexts(ExpressionWithArrayContext.class);
		}
		public ExpressionWithArrayContext expressionWithArray(int i) {
			return getRuleContext(ExpressionWithArrayContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(TestCPPPaser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(TestCPPPaser.Semi, i);
		}
		public List<ForInitStatementContext> forInitStatement() {
			return getRuleContexts(ForInitStatementContext.class);
		}
		public ForInitStatementContext forInitStatement(int i) {
			return getRuleContext(ForInitStatementContext.class,i);
		}
		public List<ForRangeDeclarationContext> forRangeDeclaration() {
			return getRuleContexts(ForRangeDeclarationContext.class);
		}
		public ForRangeDeclarationContext forRangeDeclaration(int i) {
			return getRuleContext(ForRangeDeclarationContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(TestCPPPaser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TestCPPPaser.Colon, i);
		}
		public List<ForRangeInitializerContext> forRangeInitializer() {
			return getRuleContexts(ForRangeInitializerContext.class);
		}
		public ForRangeInitializerContext forRangeInitializer(int i) {
			return getRuleContext(ForRangeInitializerContext.class,i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(TestCPPPaser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(TestCPPPaser.LeftBrace, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(TestCPPPaser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(TestCPPPaser.LeftBracket, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(TestCPPPaser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(TestCPPPaser.RightBracket, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(TestCPPPaser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(TestCPPPaser.RightBrace, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContinuousLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuousLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterContinuousLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitContinuousLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitContinuousLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuousLoopContext continuousLoop() throws RecognitionException {
		ContinuousLoopContext _localctx = new ContinuousLoopContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_continuousLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			match(For);
			setState(2286);
			match(LeftParen);
			setState(2299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2287);
				forInitStatement();
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2288);
					condition();
					}
				}

				setState(2291);
				match(Semi);
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2292);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2295);
				forRangeDeclaration();
				setState(2296);
				match(Colon);
				setState(2297);
				forRangeInitializer();
				}
				break;
			}
			setState(2301);
			match(RightParen);
			setState(2303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2302);
				match(LeftBrace);
				}
			}

			setState(2305);
			match(Identifier);
			setState(2310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2306);
				match(LeftBracket);
				setState(2307);
				constantExpression();
				setState(2308);
				match(RightBracket);
				}
				}
				setState(2312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket );
			setState(2314);
			match(Assign);
			setState(2315);
			expressionWithArray();
			setState(2316);
			match(Semi);
			setState(2318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RightBrace) {
				{
				setState(2317);
				match(RightBrace);
				}
			}

			setState(2320);
			match(For);
			setState(2321);
			match(LeftParen);
			setState(2334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2322);
				forInitStatement();
				setState(2324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2323);
					condition();
					}
				}

				setState(2326);
				match(Semi);
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2327);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2330);
				forRangeDeclaration();
				setState(2331);
				match(Colon);
				setState(2332);
				forRangeInitializer();
				}
				break;
			}
			setState(2336);
			match(RightParen);
			setState(2338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2337);
				match(LeftBrace);
				}
			}

			setState(2340);
			match(Identifier);
			setState(2345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2341);
				match(LeftBracket);
				setState(2342);
				constantExpression();
				setState(2343);
				match(RightBracket);
				}
				}
				setState(2347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket );
			setState(2349);
			match(Assign);
			setState(2350);
			expressionWithArray();
			setState(2351);
			match(Semi);
			setState(2353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2352);
				match(RightBrace);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopDistributionContext extends ParserRuleContext {
		public List<TerminalNode> For() { return getTokens(TestCPPPaser.For); }
		public TerminalNode For(int i) {
			return getToken(TestCPPPaser.For, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(TestCPPPaser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TestCPPPaser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(TestCPPPaser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TestCPPPaser.RightParen, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(TestCPPPaser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TestCPPPaser.Identifier, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(TestCPPPaser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(TestCPPPaser.LeftBracket, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(TestCPPPaser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(TestCPPPaser.RightBracket, i);
		}
		public List<TerminalNode> Assign() { return getTokens(TestCPPPaser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(TestCPPPaser.Assign, i);
		}
		public List<ExpressionWithArrayContext> expressionWithArray() {
			return getRuleContexts(ExpressionWithArrayContext.class);
		}
		public ExpressionWithArrayContext expressionWithArray(int i) {
			return getRuleContext(ExpressionWithArrayContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(TestCPPPaser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(TestCPPPaser.Semi, i);
		}
		public List<ForInitStatementContext> forInitStatement() {
			return getRuleContexts(ForInitStatementContext.class);
		}
		public ForInitStatementContext forInitStatement(int i) {
			return getRuleContext(ForInitStatementContext.class,i);
		}
		public List<ForRangeDeclarationContext> forRangeDeclaration() {
			return getRuleContexts(ForRangeDeclarationContext.class);
		}
		public ForRangeDeclarationContext forRangeDeclaration(int i) {
			return getRuleContext(ForRangeDeclarationContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(TestCPPPaser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TestCPPPaser.Colon, i);
		}
		public List<ForRangeInitializerContext> forRangeInitializer() {
			return getRuleContexts(ForRangeInitializerContext.class);
		}
		public ForRangeInitializerContext forRangeInitializer(int i) {
			return getRuleContext(ForRangeInitializerContext.class,i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(TestCPPPaser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(TestCPPPaser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(TestCPPPaser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(TestCPPPaser.RightBrace, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopDistributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDistribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLoopDistribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLoopDistribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLoopDistribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDistributionContext loopDistribution() throws RecognitionException {
		LoopDistributionContext _localctx = new LoopDistributionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_loopDistribution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(For);
			setState(2356);
			match(LeftParen);
			setState(2369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				setState(2357);
				forInitStatement();
				setState(2359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2358);
					condition();
					}
				}

				setState(2361);
				match(Semi);
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2362);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2365);
				forRangeDeclaration();
				setState(2366);
				match(Colon);
				setState(2367);
				forRangeInitializer();
				}
				break;
			}
			setState(2371);
			match(RightParen);
			setState(2373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2372);
				match(LeftBrace);
				}
			}

			setState(2385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(2375);
				match(Identifier);
				setState(2376);
				match(LeftBracket);
				setState(2377);
				constantExpression();
				setState(2378);
				match(RightBracket);
				setState(2379);
				match(Assign);
				setState(2380);
				expressionWithArray();
				setState(2381);
				match(Semi);
				}
				}
				setState(2387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2388);
			match(For);
			setState(2389);
			match(LeftParen);
			setState(2402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(2390);
				forInitStatement();
				setState(2392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2391);
					condition();
					}
				}

				setState(2394);
				match(Semi);
				setState(2396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2395);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2398);
				forRangeDeclaration();
				setState(2399);
				match(Colon);
				setState(2400);
				forRangeInitializer();
				}
				break;
			}
			setState(2404);
			match(RightParen);
			setState(2406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2405);
				match(LeftBrace);
				}
			}

			setState(2408);
			match(Identifier);
			setState(2409);
			match(LeftBracket);
			setState(2410);
			constantExpression();
			setState(2411);
			match(RightBracket);
			setState(2412);
			match(LeftBracket);
			setState(2413);
			constantExpression();
			setState(2414);
			match(RightBracket);
			setState(2415);
			match(Assign);
			setState(2416);
			expressionWithArray();
			setState(2417);
			match(Semi);
			setState(2419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				{
				setState(2418);
				match(RightBrace);
				}
				break;
			}
			setState(2422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				setState(2421);
				match(RightBrace);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchNestedLoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(TestCPPPaser.For, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TestCPPPaser.Semi, 0); }
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TestCPPPaser.Colon, 0); }
		public ForRangeInitializerContext forRangeInitializer() {
			return getRuleContext(ForRangeInitializerContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TestCPPPaser.LeftBrace, 0); }
		public List<ContinuousLoopContext> continuousLoop() {
			return getRuleContexts(ContinuousLoopContext.class);
		}
		public ContinuousLoopContext continuousLoop(int i) {
			return getRuleContext(ContinuousLoopContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(TestCPPPaser.RightBrace, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BranchNestedLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchNestedLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterBranchNestedLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitBranchNestedLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitBranchNestedLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchNestedLoopContext branchNestedLoop() throws RecognitionException {
		BranchNestedLoopContext _localctx = new BranchNestedLoopContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_branchNestedLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			match(For);
			setState(2425);
			match(LeftParen);
			setState(2438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2426);
				forInitStatement();
				setState(2428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2427);
					condition();
					}
				}

				setState(2430);
				match(Semi);
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(2431);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(2434);
				forRangeDeclaration();
				setState(2435);
				match(Colon);
				setState(2436);
				forRangeInitializer();
				}
				break;
			}
			setState(2440);
			match(RightParen);
			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(2441);
				match(LeftBrace);
				}
			}

			setState(2445); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2444);
					continuousLoop();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2447); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2449);
				match(RightBrace);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheOperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TestCPPPaser.New, 0); }
		public TerminalNode LeftBracket() { return getToken(TestCPPPaser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TestCPPPaser.RightBracket, 0); }
		public TerminalNode Delete() { return getToken(TestCPPPaser.Delete, 0); }
		public TerminalNode Plus() { return getToken(TestCPPPaser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TestCPPPaser.Minus, 0); }
		public TerminalNode Star() { return getToken(TestCPPPaser.Star, 0); }
		public TerminalNode Div() { return getToken(TestCPPPaser.Div, 0); }
		public TerminalNode Mod() { return getToken(TestCPPPaser.Mod, 0); }
		public TerminalNode Caret() { return getToken(TestCPPPaser.Caret, 0); }
		public TerminalNode And() { return getToken(TestCPPPaser.And, 0); }
		public TerminalNode Or() { return getToken(TestCPPPaser.Or, 0); }
		public TerminalNode Tilde() { return getToken(TestCPPPaser.Tilde, 0); }
		public TerminalNode Not() { return getToken(TestCPPPaser.Not, 0); }
		public TerminalNode Assign() { return getToken(TestCPPPaser.Assign, 0); }
		public List<TerminalNode> Greater() { return getTokens(TestCPPPaser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(TestCPPPaser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(TestCPPPaser.Less); }
		public TerminalNode Less(int i) {
			return getToken(TestCPPPaser.Less, i);
		}
		public TerminalNode GreaterEqual() { return getToken(TestCPPPaser.GreaterEqual, 0); }
		public TerminalNode PlusAssign() { return getToken(TestCPPPaser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(TestCPPPaser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(TestCPPPaser.StarAssign, 0); }
		public TerminalNode ModAssign() { return getToken(TestCPPPaser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(TestCPPPaser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(TestCPPPaser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(TestCPPPaser.OrAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(TestCPPPaser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(TestCPPPaser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(TestCPPPaser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(TestCPPPaser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(TestCPPPaser.LessEqual, 0); }
		public TerminalNode AndAnd() { return getToken(TestCPPPaser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(TestCPPPaser.OrOr, 0); }
		public TerminalNode PlusPlus() { return getToken(TestCPPPaser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(TestCPPPaser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(TestCPPPaser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(TestCPPPaser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(TestCPPPaser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(TestCPPPaser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TestCPPPaser.RightParen, 0); }
		public TheOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterTheOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitTheOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitTheOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheOperatorContext theOperator() throws RecognitionException {
		TheOperatorContext _localctx = new TheOperatorContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_theOperator);
		try {
			setState(2503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2452);
				match(New);
				setState(2455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(2453);
					match(LeftBracket);
					setState(2454);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2457);
				match(Delete);
				setState(2460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
				case 1:
					{
					setState(2458);
					match(LeftBracket);
					setState(2459);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2462);
				match(Plus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2463);
				match(Minus);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2464);
				match(Star);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2465);
				match(Div);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2466);
				match(Mod);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2467);
				match(Caret);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2468);
				match(And);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2469);
				match(Or);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2470);
				match(Tilde);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2471);
				match(Not);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2472);
				match(Assign);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2473);
				match(Greater);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2474);
				match(Less);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2475);
				match(GreaterEqual);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2476);
				match(PlusAssign);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2477);
				match(MinusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2478);
				match(StarAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2479);
				match(ModAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2480);
				match(XorAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2481);
				match(AndAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2482);
				match(OrAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2483);
				match(Less);
				setState(2484);
				match(Less);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2485);
				match(Greater);
				setState(2486);
				match(Greater);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2487);
				match(RightShiftAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2488);
				match(LeftShiftAssign);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2489);
				match(Equal);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2490);
				match(NotEqual);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2491);
				match(LessEqual);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2492);
				match(AndAnd);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2493);
				match(OrOr);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2494);
				match(PlusPlus);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2495);
				match(MinusMinus);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2496);
				match(Comma);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2497);
				match(ArrowStar);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2498);
				match(Arrow);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2499);
				match(LeftParen);
				setState(2500);
				match(RightParen);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2501);
				match(LeftBracket);
				setState(2502);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(TestCPPPaser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(TestCPPPaser.CharacterLiteral, 0); }
		public TerminalNode FloatingLiteral() { return getToken(TestCPPPaser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(TestCPPPaser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TestCPPPaser.BooleanLiteral, 0); }
		public TerminalNode PointerLiteral() { return getToken(TestCPPPaser.PointerLiteral, 0); }
		public TerminalNode UserDefinedLiteral() { return getToken(TestCPPPaser.UserDefinedLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestCPPPaserListener ) ((TestCPPPaserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestCPPPaserVisitor ) return ((TestCPPPaserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestedNameSpecifier_sempred((NestedNameSpecifierContext)_localctx, predIndex);
		case 15:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 25:
			return noPointerNewDeclarator_sempred((NoPointerNewDeclaratorContext)_localctx, predIndex);
		case 115:
			return noPointerDeclarator_sempred((NoPointerDeclaratorContext)_localctx, predIndex);
		case 126:
			return noPointerAbstractDeclarator_sempred((NoPointerAbstractDeclaratorContext)_localctx, predIndex);
		case 128:
			return noPointerAbstractPackDeclarator_sempred((NoPointerAbstractPackDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestedNameSpecifier_sempred(NestedNameSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noPointerNewDeclarator_sempred(NoPointerNewDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noPointerDeclarator_sempred(NoPointerDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noPointerAbstractDeclarator_sempred(NoPointerAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean noPointerAbstractPackDeclarator_sempred(NoPointerAbstractPackDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u0091\u09cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0001\u0000\u0003\u0000\u0190\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0195\b\u0001\u000b\u0001\f"+
		"\u0001\u0196\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u01a0\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u01a4\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01ad\b\u0003\u0001\u0003"+
		"\u0003\u0003\u01b0\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u01b4\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u01bc\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u01c3\b\u0005\u0001\u0005\u0003\u0005\u01c6"+
		"\b\u0005\u0001\u0005\u0005\u0005\u01c9\b\u0005\n\u0005\f\u0005\u01cc\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u01d0\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u01d6\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u01de\b\b\u0003\b\u01e0"+
		"\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u01e7\b\n\n\n\f\n"+
		"\u01ea\t\n\u0001\n\u0003\n\u01ed\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u01f1\b\u000b\u0001\f\u0003\f\u01f4\b\f\u0001\f\u0001\f\u0003\f\u01f8"+
		"\b\f\u0001\r\u0003\r\u01fb\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0202\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0206"+
		"\b\u000e\u0001\u000e\u0003\u000e\u0209\b\u000e\u0001\u000e\u0003\u000e"+
		"\u020c\b\u000e\u0001\u000e\u0003\u000e\u020f\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0215\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0219\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u021d"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u022b\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u022f"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0235"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u023c\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0242\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0246\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u024a\b\u000f\n\u000f\f\u000f\u024d"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0003"+
		"\u0012\u0254\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0259"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0266\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u026d\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0279\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0283"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u0288\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u028c\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0293\b\u0015\u0001\u0015"+
		"\u0003\u0015\u0296\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u029e\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u02a2\b\u0018\u0001\u0018\u0003\u0018\u02a5\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u02ac"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u02b3\b\u0019\u0005\u0019\u02b5\b\u0019\n\u0019\f\u0019\u02b8\t"+
		"\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u02bc\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u02c0\b\u001a\u0001\u001b\u0003\u001b\u02c3\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u02c8\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u02d7\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u02dc\b\u001e\n\u001e\f\u001e\u02df\t\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u02e3\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u02e8"+
		"\b\u001f\n\u001f\f\u001f\u02eb\t\u001f\u0001 \u0001 \u0001 \u0005 \u02f0"+
		"\b \n \f \u02f3\t \u0001!\u0001!\u0001!\u0001!\u0005!\u02f9\b!\n!\f!\u02fc"+
		"\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0302\b\"\u0001#\u0001#\u0001"+
		"#\u0005#\u0307\b#\n#\f#\u030a\t#\u0001$\u0001$\u0001$\u0005$\u030f\b$"+
		"\n$\f$\u0312\t$\u0001%\u0001%\u0001%\u0005%\u0317\b%\n%\f%\u031a\t%\u0001"+
		"&\u0001&\u0001&\u0005&\u031f\b&\n&\f&\u0322\t&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u0327\b\'\n\'\f\'\u032a\t\'\u0001(\u0001(\u0001(\u0005(\u032f"+
		"\b(\n(\f(\u0332\t(\u0001)\u0001)\u0001)\u0005)\u0337\b)\n)\f)\u033a\t"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0342\b*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u034a\b+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0005-\u0351\b-\n-\f-\u0354\t-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0360\b/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u0368\b/\u0003/\u036a\b/\u00010\u00030\u036d"+
		"\b0\u00010\u00010\u00010\u00010\u00030\u0373\b0\u00010\u00010\u00010\u0001"+
		"1\u00031\u0379\b1\u00011\u00011\u00012\u00012\u00032\u037f\b2\u00012\u0001"+
		"2\u00013\u00043\u0384\b3\u000b3\f3\u0385\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00034\u038f\b4\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u0397\b4\u00015\u00015\u00035\u039b\b5\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u03a2\b5\u00035\u03a4\b5\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u03b8\b6\u00016\u00016\u00036\u03bc\b6\u0001"+
		"6\u00016\u00016\u00016\u00036\u03c2\b6\u00016\u00016\u00016\u00036\u03c7"+
		"\b6\u00017\u00017\u00037\u03cb\b7\u00018\u00038\u03ce\b8\u00018\u0001"+
		"8\u00018\u00019\u00019\u00039\u03d5\b9\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u03dc\b:\u0001:\u0001:\u0003:\u03e0\b:\u0001:\u0001:\u0001;\u0001"+
		";\u0001<\u0004<\u03e7\b<\u000b<\f<\u03e8\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0003=\u03f4\b=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0003>\u03fe\b>\u0001?\u0001?\u0001?\u0003"+
		"?\u0403\b?\u0001?\u0001?\u0001?\u0001?\u0001@\u0003@\u040a\b@\u0001@\u0003"+
		"@\u040d\b@\u0001@\u0001@\u0001@\u0003@\u0412\b@\u0001@\u0001@\u0001@\u0003"+
		"@\u0417\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u042c\bD\u0001E\u0004E\u042f\bE\u000bE\fE\u0430\u0001E\u0003"+
		"E\u0434\bE\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0003I\u043f\bI\u0001J\u0001J\u0001J\u0001J\u0003J\u0445\bJ\u0001K\u0004"+
		"K\u0448\bK\u000bK\fK\u0449\u0001K\u0003K\u044d\bK\u0001L\u0004L\u0450"+
		"\bL\u000bL\fL\u0451\u0001L\u0003L\u0455\bL\u0001M\u0001M\u0001N\u0001"+
		"N\u0001O\u0003O\u045c\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0003O\u0465\bO\u0001O\u0004O\u0468\bO\u000bO\fO\u0469\u0001O\u0003"+
		"O\u046d\bO\u0001O\u0001O\u0003O\u0471\bO\u0001O\u0001O\u0003O\u0475\b"+
		"O\u0001O\u0001O\u0003O\u0479\bO\u0001O\u0001O\u0001O\u0003O\u047e\bO\u0001"+
		"O\u0005O\u0481\bO\nO\fO\u0484\tO\u0001O\u0001O\u0001O\u0003O\u0489\bO"+
		"\u0001O\u0001O\u0001O\u0001O\u0003O\u048f\bO\u0001P\u0001P\u0001P\u0001"+
		"P\u0003P\u0495\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u049b\bQ\u0001Q\u0001"+
		"Q\u0001R\u0001R\u0003R\u04a1\bR\u0001R\u0003R\u04a4\bR\u0001R\u0001R\u0001"+
		"R\u0001R\u0003R\u04aa\bR\u0001R\u0001R\u0003R\u04ae\bR\u0001R\u0001R\u0003"+
		"R\u04b2\bR\u0001R\u0003R\u04b5\bR\u0001S\u0001S\u0001T\u0001T\u0001T\u0001"+
		"T\u0003T\u04bd\bT\u0003T\u04bf\bT\u0001T\u0001T\u0001U\u0001U\u0003U\u04c5"+
		"\bU\u0001U\u0003U\u04c8\bU\u0001U\u0003U\u04cb\bU\u0001U\u0003U\u04ce"+
		"\bU\u0001V\u0001V\u0003V\u04d2\bV\u0001V\u0001V\u0003V\u04d6\bV\u0001"+
		"V\u0001V\u0001W\u0001W\u0003W\u04dc\bW\u0001X\u0001X\u0001X\u0001Y\u0001"+
		"Y\u0001Y\u0005Y\u04e4\bY\nY\fY\u04e7\tY\u0001Z\u0001Z\u0001Z\u0003Z\u04ec"+
		"\bZ\u0001[\u0001[\u0001\\\u0001\\\u0003\\\u04f2\b\\\u0001]\u0001]\u0001"+
		"^\u0003^\u04f7\b^\u0001^\u0001^\u0001^\u0003^\u04fc\b^\u0001^\u0001^\u0003"+
		"^\u0500\b^\u0001^\u0001^\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001a\u0003a\u050d\ba\u0001a\u0001a\u0001b\u0001b\u0003b\u0513"+
		"\bb\u0001b\u0001b\u0003b\u0517\bb\u0001b\u0001b\u0001b\u0001c\u0003c\u051d"+
		"\bc\u0001c\u0001c\u0001c\u0003c\u0522\bc\u0001c\u0001c\u0001c\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0003e\u0531"+
		"\be\u0001e\u0001e\u0003e\u0535\be\u0001f\u0004f\u0538\bf\u000bf\ff\u0539"+
		"\u0001g\u0001g\u0001g\u0003g\u053f\bg\u0001g\u0001g\u0001g\u0003g\u0544"+
		"\bg\u0001h\u0001h\u0001h\u0001h\u0003h\u054a\bh\u0001h\u0003h\u054d\b"+
		"h\u0001h\u0001h\u0001i\u0001i\u0001i\u0005i\u0554\bi\ni\fi\u0557\ti\u0001"+
		"i\u0003i\u055a\bi\u0001j\u0001j\u0001j\u0003j\u055f\bj\u0001j\u0001j\u0003"+
		"j\u0563\bj\u0001k\u0001k\u0001l\u0001l\u0003l\u0569\bl\u0001l\u0001l\u0001"+
		"m\u0004m\u056e\bm\u000bm\fm\u056f\u0001n\u0001n\u0001n\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0004n\u057f\bn\u000b"+
		"n\fn\u0580\u0003n\u0583\bn\u0001o\u0001o\u0001o\u0005o\u0588\bo\no\fo"+
		"\u058b\to\u0001p\u0001p\u0003p\u058f\bp\u0001q\u0001q\u0001q\u0001q\u0001"+
		"q\u0003q\u0596\bq\u0001r\u0001r\u0003r\u059a\br\u0005r\u059c\br\nr\fr"+
		"\u059f\tr\u0001r\u0001r\u0001s\u0001s\u0001s\u0003s\u05a6\bs\u0001s\u0001"+
		"s\u0001s\u0001s\u0001s\u0001s\u0003s\u05ae\bs\u0001s\u0001s\u0001s\u0001"+
		"s\u0003s\u05b4\bs\u0001s\u0001s\u0003s\u05b8\bs\u0003s\u05ba\bs\u0005"+
		"s\u05bc\bs\ns\fs\u05bf\ts\u0001t\u0001t\u0003t\u05c3\bt\u0001t\u0001t"+
		"\u0003t\u05c7\bt\u0001t\u0003t\u05ca\bt\u0001t\u0003t\u05cd\bt\u0001t"+
		"\u0003t\u05d0\bt\u0001u\u0001u\u0001u\u0003u\u05d5\bu\u0001v\u0001v\u0003"+
		"v\u05d9\bv\u0001v\u0003v\u05dc\bv\u0001v\u0001v\u0003v\u05e0\bv\u0001"+
		"v\u0003v\u05e3\bv\u0003v\u05e5\bv\u0001w\u0004w\u05e8\bw\u000bw\fw\u05e9"+
		"\u0001x\u0001x\u0001y\u0001y\u0001z\u0003z\u05f1\bz\u0001z\u0001z\u0001"+
		"{\u0001{\u0003{\u05f7\b{\u0001|\u0001|\u0003|\u05fb\b|\u0001|\u0001|\u0001"+
		"|\u0001|\u0003|\u0601\b|\u0001}\u0001}\u0004}\u0605\b}\u000b}\f}\u0606"+
		"\u0001}\u0003}\u060a\b}\u0003}\u060c\b}\u0001~\u0001~\u0001~\u0001~\u0003"+
		"~\u0612\b~\u0001~\u0001~\u0003~\u0616\b~\u0001~\u0001~\u0001~\u0001~\u0003"+
		"~\u061c\b~\u0001~\u0001~\u0001~\u0001~\u0001~\u0003~\u0623\b~\u0001~\u0001"+
		"~\u0003~\u0627\b~\u0003~\u0629\b~\u0005~\u062b\b~\n~\f~\u062e\t~\u0001"+
		"\u007f\u0005\u007f\u0631\b\u007f\n\u007f\f\u007f\u0634\t\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0003\u0080\u063f\b\u0080\u0001\u0080\u0001\u0080"+
		"\u0003\u0080\u0643\b\u0080\u0003\u0080\u0645\b\u0080\u0005\u0080\u0647"+
		"\b\u0080\n\u0080\f\u0080\u064a\t\u0080\u0001\u0081\u0001\u0081\u0003\u0081"+
		"\u064e\b\u0081\u0001\u0081\u0003\u0081\u0651\b\u0081\u0001\u0082\u0001"+
		"\u0082\u0001\u0082\u0005\u0082\u0656\b\u0082\n\u0082\f\u0082\u0659\t\u0082"+
		"\u0001\u0083\u0003\u0083\u065c\b\u0083\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0003\u0083\u0661\b\u0083\u0003\u0083\u0663\b\u0083\u0001\u0083\u0001"+
		"\u0083\u0003\u0083\u0667\b\u0083\u0001\u0084\u0003\u0084\u066a\b\u0084"+
		"\u0001\u0084\u0003\u0084\u066d\b\u0084\u0001\u0084\u0001\u0084\u0003\u0084"+
		"\u0671\b\u0084\u0001\u0084\u0001\u0084\u0001\u0085\u0003\u0085\u0676\b"+
		"\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0003"+
		"\u0085\u067d\b\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0003\u0086\u0684\b\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0003"+
		"\u0087\u0689\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0003\u0088\u068e"+
		"\b\u0088\u0001\u0089\u0001\u0089\u0003\u0089\u0692\b\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0003\u0089\u0697\b\u0089\u0005\u0089\u0699\b"+
		"\u0089\n\u0089\f\u0089\u069c\t\u0089\u0001\u008a\u0001\u008a\u0001\u008a"+
		"\u0003\u008a\u06a1\b\u008a\u0003\u008a\u06a3\b\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008b\u0001\u008b\u0003\u008b\u06a9\b\u008b\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0003\u008c\u06ae\b\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008d\u0001\u008d\u0003\u008d\u06b4\b\u008d\u0001\u008d\u0001\u008d\u0003"+
		"\u008d\u06b8\b\u008d\u0003\u008d\u06ba\b\u008d\u0001\u008d\u0003\u008d"+
		"\u06bd\b\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u06c1\b\u008d\u0001"+
		"\u008d\u0001\u008d\u0003\u008d\u06c5\b\u008d\u0003\u008d\u06c7\b\u008d"+
		"\u0003\u008d\u06c9\b\u008d\u0001\u008e\u0003\u008e\u06cc\b\u008e\u0001"+
		"\u008e\u0001\u008e\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001"+
		"\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0004\u0091\u06d8\b\u0091\u000b"+
		"\u0091\f\u0091\u06d9\u0001\u0092\u0003\u0092\u06dd\b\u0092\u0001\u0092"+
		"\u0003\u0092\u06e0\b\u0092\u0001\u0092\u0003\u0092\u06e3\b\u0092\u0001"+
		"\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001"+
		"\u0092\u0003\u0092\u06ec\b\u0092\u0001\u0093\u0001\u0093\u0001\u0093\u0005"+
		"\u0093\u06f1\b\u0093\n\u0093\f\u0093\u06f4\t\u0093\u0001\u0094\u0001\u0094"+
		"\u0003\u0094\u06f8\b\u0094\u0001\u0094\u0003\u0094\u06fb\b\u0094\u0001"+
		"\u0094\u0003\u0094\u06fe\b\u0094\u0003\u0094\u0700\b\u0094\u0001\u0094"+
		"\u0003\u0094\u0703\b\u0094\u0001\u0094\u0003\u0094\u0706\b\u0094\u0001"+
		"\u0094\u0001\u0094\u0003\u0094\u070a\b\u0094\u0001\u0095\u0004\u0095\u070d"+
		"\b\u0095\u000b\u0095\f\u0095\u070e\u0001\u0096\u0001\u0096\u0001\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0099\u0001\u0099\u0003\u0099\u071c\b\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0003\u0099\u0721\b\u0099\u0005\u0099\u0723\b\u0099\n\u0099"+
		"\f\u0099\u0726\t\u0099\u0001\u009a\u0003\u009a\u0729\b\u009a\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0003\u009a\u072e\b\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0003\u009a\u0733\b\u009a\u0001\u009a\u0001\u009a\u0003\u009a"+
		"\u0737\b\u009a\u0001\u009b\u0003\u009b\u073a\b\u009b\u0001\u009b\u0001"+
		"\u009b\u0003\u009b\u073e\b\u009b\u0001\u009c\u0001\u009c\u0001\u009d\u0001"+
		"\u009d\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0003"+
		"\u009f\u0749\b\u009f\u0001\u00a0\u0001\u00a0\u0003\u00a0\u074d\b\u00a0"+
		"\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0003\u00a2"+
		"\u0754\b\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0003\u00a2\u0759\b"+
		"\u00a2\u0005\u00a2\u075b\b\u00a2\n\u00a2\f\u00a2\u075e\t\u00a2\u0001\u00a3"+
		"\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0763\b\u00a3\u0001\u00a3\u0001\u00a3"+
		"\u0003\u00a3\u0767\b\u00a3\u0001\u00a4\u0001\u00a4\u0003\u00a4\u076b\b"+
		"\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0001"+
		"\u00a6\u0001\u00a6\u0003\u00a6\u0774\b\u00a6\u0001\u00a7\u0001\u00a7\u0001"+
		"\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a8\u0001\u00a8\u0001"+
		"\u00a8\u0005\u00a8\u077f\b\u00a8\n\u00a8\f\u00a8\u0782\t\u00a8\u0001\u00a9"+
		"\u0001\u00a9\u0003\u00a9\u0786\b\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00aa"+
		"\u0001\u00aa\u0001\u00aa\u0003\u00aa\u078d\b\u00aa\u0001\u00aa\u0001\u00aa"+
		"\u0003\u00aa\u0791\b\u00aa\u0001\u00aa\u0003\u00aa\u0794\b\u00aa\u0001"+
		"\u00aa\u0003\u00aa\u0797\b\u00aa\u0001\u00aa\u0003\u00aa\u079a\b\u00aa"+
		"\u0001\u00aa\u0001\u00aa\u0003\u00aa\u079e\b\u00aa\u0001\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0003\u00ab\u07a3\b\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ac"+
		"\u0001\u00ac\u0001\u00ac\u0003\u00ac\u07aa\b\u00ac\u0001\u00ac\u0001\u00ac"+
		"\u0003\u00ac\u07ae\b\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac\u07b2\b"+
		"\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ae\u0001\u00ae\u0003\u00ae\u07b8"+
		"\b\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0003\u00ae\u07bd\b\u00ae"+
		"\u0005\u00ae\u07bf\b\u00ae\n\u00ae\f\u00ae\u07c2\t\u00ae\u0001\u00af\u0001"+
		"\u00af\u0001\u00af\u0003\u00af\u07c7\b\u00af\u0001\u00b0\u0001\u00b0\u0001"+
		"\u00b0\u0001\u00b0\u0003\u00b0\u07cd\b\u00b0\u0001\u00b0\u0003\u00b0\u07d0"+
		"\b\u00b0\u0001\u00b1\u0003\u00b1\u07d3\b\u00b1\u0001\u00b1\u0001\u00b1"+
		"\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2"+
		"\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4"+
		"\u0003\u00b4\u07e3\b\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b5"+
		"\u0004\u00b5\u07e9\b\u00b5\u000b\u00b5\f\u00b5\u07ea\u0001\u00b6\u0001"+
		"\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b7\u0003"+
		"\u00b7\u07f4\b\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7\u07f9"+
		"\b\u00b7\u0001\u00b7\u0003\u00b7\u07fc\b\u00b7\u0001\u00b8\u0001\u00b8"+
		"\u0003\u00b8\u0800\b\u00b8\u0001\u00b9\u0001\u00b9\u0003\u00b9\u0804\b"+
		"\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0003\u00ba\u0809\b\u00ba\u0001"+
		"\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb\u0003\u00bb\u080f\b\u00bb\u0001"+
		"\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0814\b\u00bb\u0005\u00bb\u0816"+
		"\b\u00bb\n\u00bb\f\u00bb\u0819\t\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bc\u0003\u00bc\u082b\b\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0003\u00bd\u0843\b\u00bd\u0001\u00be\u0001\u00be\u0001\u00be"+
		"\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u084b\b\u00be\u0001\u00bf"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0851\b\u00bf\u0001\u00bf"+
		"\u0001\u00bf\u0003\u00bf\u0855\b\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0001\u00bf\u0003\u00bf\u085b\b\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0863\b\u00bf\u0001\u00bf"+
		"\u0001\u00bf\u0003\u00bf\u0867\b\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0001\u00bf\u0003\u00bf\u086d\b\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf"+
		"\u0871\b\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0001\u00bf\u0001\u00bf\u0003\u00bf\u087a\b\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u0882\b\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0003\u00c0\u0886\b\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0003\u00c0\u088c\b\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0003\u00c0\u0890\b\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0003\u00c0\u0896\b\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u089a\b"+
		"\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u08a0"+
		"\b\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u08a4\b\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u08aa\b\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0003\u00c0\u08ae\b\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0003\u00c0\u08b4\b\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0"+
		"\u08b8\b\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0003\u00c0\u08c1\b\u00c0\u0001\u00c0\u0003\u00c0"+
		"\u08c4\b\u00c0\u0001\u00c0\u0003\u00c0\u08c7\b\u00c0\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0005\u00c1\u08cc\b\u00c1\n\u00c1\f\u00c1\u08cf\t\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0005\u00c1\u08d7\b\u00c1\n\u00c1\f\u00c1\u08da\t\u00c1\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0005\u00c1\u08df\b\u00c1\n\u00c1\f\u00c1\u08e2\t\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0005\u00c1\u08e7\b\u00c1\n\u00c1"+
		"\f\u00c1\u08ea\t\u00c1\u0003\u00c1\u08ec\b\u00c1\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0003\u00c2\u08f2\b\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0003\u00c2\u08f6\b\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0003\u00c2\u08fc\b\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0900\b"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0004"+
		"\u00c2\u0907\b\u00c2\u000b\u00c2\f\u00c2\u0908\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0003\u00c2\u090f\b\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0915\b\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0003\u00c2\u0919\b\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0003\u00c2\u091f\b\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0923\b"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0004"+
		"\u00c2\u092a\b\u00c2\u000b\u00c2\f\u00c2\u092b\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0932\b\u00c2\u0001\u00c3\u0001\u00c3"+
		"\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0938\b\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0003\u00c3\u093c\b\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0003\u00c3\u0942\b\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0946\b"+
		"\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0001\u00c3\u0005\u00c3\u0950\b\u00c3\n\u00c3\f\u00c3"+
		"\u0953\t\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3"+
		"\u0959\b\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u095d\b\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0963\b\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0003\u00c3\u0967\b\u00c3\u0001\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0001\u00c3\u0003\u00c3\u0974\b\u00c3\u0001\u00c3\u0003"+
		"\u00c3\u0977\b\u00c3\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0003"+
		"\u00c4\u097d\b\u00c4\u0001\u00c4\u0001\u00c4\u0003\u00c4\u0981\b\u00c4"+
		"\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0003\u00c4\u0987\b\u00c4"+
		"\u0001\u00c4\u0001\u00c4\u0003\u00c4\u098b\b\u00c4\u0001\u00c4\u0004\u00c4"+
		"\u098e\b\u00c4\u000b\u00c4\f\u00c4\u098f\u0001\u00c4\u0003\u00c4\u0993"+
		"\b\u00c4\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u0998\b\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u099d\b\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u09c8\b\u00c5"+
		"\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u0430\u0006\n\u001e2\u00e6"+
		"\u00fc\u0100\u00c7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u0000\u0017\u0002\u0000aaee\u0004\u0000"+
		"\u0018\u0018\u001f\u001f::AA\u0002\u0000||\u0081\u0081\u0001\u0000xy\u0002"+
		"\u0000[]ad\u0002\u0000{{\u0082\u0082\u0001\u0000]_\u0001\u0000[\\\u0002"+
		"\u0000fgtu\u0001\u0000rs\u0002\u0000eehq\u0005\u0000$$//99??FF\u0003\u0000"+
		"\"\",,PP\u0002\u0000..<<\u0002\u0000==NN\u0002\u0000\u0015\u0015BB\u0001"+
		"\u0000UZ\u0002\u0000aavv\u0002\u0000\u0016\u0016RR\u0001\u0000\u001b\u001c"+
		"\u0002\u0000&&55\u0001\u000068\u0001\u0000\u0001\u0007\u0af2\u0000\u018f"+
		"\u0001\u0000\u0000\u0000\u0002\u019f\u0001\u0000\u0000\u0000\u0004\u01a3"+
		"\u0001\u0000\u0000\u0000\u0006\u01af\u0001\u0000\u0000\u0000\b\u01b1\u0001"+
		"\u0000\u0000\u0000\n\u01b7\u0001\u0000\u0000\u0000\f\u01cd\u0001\u0000"+
		"\u0000\u0000\u000e\u01d3\u0001\u0000\u0000\u0000\u0010\u01df\u0001\u0000"+
		"\u0000\u0000\u0012\u01e1\u0001\u0000\u0000\u0000\u0014\u01e3\u0001\u0000"+
		"\u0000\u0000\u0016\u01f0\u0001\u0000\u0000\u0000\u0018\u01f7\u0001\u0000"+
		"\u0000\u0000\u001a\u01fa\u0001\u0000\u0000\u0000\u001c\u01ff\u0001\u0000"+
		"\u0000\u0000\u001e\u022e\u0001\u0000\u0000\u0000 \u024e\u0001\u0000\u0000"+
		"\u0000\"\u0250\u0001\u0000\u0000\u0000$\u0265\u0001\u0000\u0000\u0000"+
		"&\u0282\u0001\u0000\u0000\u0000(\u0284\u0001\u0000\u0000\u0000*\u0287"+
		"\u0001\u0000\u0000\u0000,\u0297\u0001\u0000\u0000\u0000.\u029b\u0001\u0000"+
		"\u0000\u00000\u02a4\u0001\u0000\u0000\u00002\u02a6\u0001\u0000\u0000\u0000"+
		"4\u02bf\u0001\u0000\u0000\u00006\u02c2\u0001\u0000\u0000\u00008\u02cb"+
		"\u0001\u0000\u0000\u0000:\u02d6\u0001\u0000\u0000\u0000<\u02e2\u0001\u0000"+
		"\u0000\u0000>\u02e4\u0001\u0000\u0000\u0000@\u02ec\u0001\u0000\u0000\u0000"+
		"B\u02f4\u0001\u0000\u0000\u0000D\u0301\u0001\u0000\u0000\u0000F\u0303"+
		"\u0001\u0000\u0000\u0000H\u030b\u0001\u0000\u0000\u0000J\u0313\u0001\u0000"+
		"\u0000\u0000L\u031b\u0001\u0000\u0000\u0000N\u0323\u0001\u0000\u0000\u0000"+
		"P\u032b\u0001\u0000\u0000\u0000R\u0333\u0001\u0000\u0000\u0000T\u033b"+
		"\u0001\u0000\u0000\u0000V\u0349\u0001\u0000\u0000\u0000X\u034b\u0001\u0000"+
		"\u0000\u0000Z\u034d\u0001\u0000\u0000\u0000\\\u0355\u0001\u0000\u0000"+
		"\u0000^\u0369\u0001\u0000\u0000\u0000`\u036c\u0001\u0000\u0000\u0000b"+
		"\u0378\u0001\u0000\u0000\u0000d\u037c\u0001\u0000\u0000\u0000f\u0383\u0001"+
		"\u0000\u0000\u0000h\u0396\u0001\u0000\u0000\u0000j\u03a3\u0001\u0000\u0000"+
		"\u0000l\u03c6\u0001\u0000\u0000\u0000n\u03ca\u0001\u0000\u0000\u0000p"+
		"\u03cd\u0001\u0000\u0000\u0000r\u03d4\u0001\u0000\u0000\u0000t\u03df\u0001"+
		"\u0000\u0000\u0000v\u03e3\u0001\u0000\u0000\u0000x\u03e6\u0001\u0000\u0000"+
		"\u0000z\u03f3\u0001\u0000\u0000\u0000|\u03fd\u0001\u0000\u0000\u0000~"+
		"\u03ff\u0001\u0000\u0000\u0000\u0080\u0416\u0001\u0000\u0000\u0000\u0082"+
		"\u0418\u0001\u0000\u0000\u0000\u0084\u0420\u0001\u0000\u0000\u0000\u0086"+
		"\u0422\u0001\u0000\u0000\u0000\u0088\u042b\u0001\u0000\u0000\u0000\u008a"+
		"\u042e\u0001\u0000\u0000\u0000\u008c\u0435\u0001\u0000\u0000\u0000\u008e"+
		"\u0437\u0001\u0000\u0000\u0000\u0090\u0439\u0001\u0000\u0000\u0000\u0092"+
		"\u043e\u0001\u0000\u0000\u0000\u0094\u0444\u0001\u0000\u0000\u0000\u0096"+
		"\u0447\u0001\u0000\u0000\u0000\u0098\u044f\u0001\u0000\u0000\u0000\u009a"+
		"\u0456\u0001\u0000\u0000\u0000\u009c\u0458\u0001\u0000\u0000\u0000\u009e"+
		"\u048e\u0001\u0000\u0000\u0000\u00a0\u0494\u0001\u0000\u0000\u0000\u00a2"+
		"\u0496\u0001\u0000\u0000\u0000\u00a4\u04b4\u0001\u0000\u0000\u0000\u00a6"+
		"\u04b6\u0001\u0000\u0000\u0000\u00a8\u04b8\u0001\u0000\u0000\u0000\u00aa"+
		"\u04c2\u0001\u0000\u0000\u0000\u00ac\u04cf\u0001\u0000\u0000\u0000\u00ae"+
		"\u04d9\u0001\u0000\u0000\u0000\u00b0\u04dd\u0001\u0000\u0000\u0000\u00b2"+
		"\u04e0\u0001\u0000\u0000\u0000\u00b4\u04e8\u0001\u0000\u0000\u0000\u00b6"+
		"\u04ed\u0001\u0000\u0000\u0000\u00b8\u04f1\u0001\u0000\u0000\u0000\u00ba"+
		"\u04f3\u0001\u0000\u0000\u0000\u00bc\u04f6\u0001\u0000\u0000\u0000\u00be"+
		"\u0503\u0001\u0000\u0000\u0000\u00c0\u0505\u0001\u0000\u0000\u0000\u00c2"+
		"\u050c\u0001\u0000\u0000\u0000\u00c4\u0510\u0001\u0000\u0000\u0000\u00c6"+
		"\u051c\u0001\u0000\u0000\u0000\u00c8\u0526\u0001\u0000\u0000\u0000\u00ca"+
		"\u052c\u0001\u0000\u0000\u0000\u00cc\u0537\u0001\u0000\u0000\u0000\u00ce"+
		"\u0543\u0001\u0000\u0000\u0000\u00d0\u0545\u0001\u0000\u0000\u0000\u00d2"+
		"\u0550\u0001\u0000\u0000\u0000\u00d4\u055e\u0001\u0000\u0000\u0000\u00d6"+
		"\u0564\u0001\u0000\u0000\u0000\u00d8\u0566\u0001\u0000\u0000\u0000\u00da"+
		"\u056d\u0001\u0000\u0000\u0000\u00dc\u0582\u0001\u0000\u0000\u0000\u00de"+
		"\u0584\u0001\u0000\u0000\u0000\u00e0\u058c\u0001\u0000\u0000\u0000\u00e2"+
		"\u0595\u0001\u0000\u0000\u0000\u00e4\u059d\u0001\u0000\u0000\u0000\u00e6"+
		"\u05ad\u0001\u0000\u0000\u0000\u00e8\u05c0\u0001\u0000\u0000\u0000\u00ea"+
		"\u05d1\u0001\u0000\u0000\u0000\u00ec\u05e4\u0001\u0000\u0000\u0000\u00ee"+
		"\u05e7\u0001\u0000\u0000\u0000\u00f0\u05eb\u0001\u0000\u0000\u0000\u00f2"+
		"\u05ed\u0001\u0000\u0000\u0000\u00f4\u05f0\u0001\u0000\u0000\u0000\u00f6"+
		"\u05f4\u0001\u0000\u0000\u0000\u00f8\u0600\u0001\u0000\u0000\u0000\u00fa"+
		"\u060b\u0001\u0000\u0000\u0000\u00fc\u061b\u0001\u0000\u0000\u0000\u00fe"+
		"\u0632\u0001\u0000\u0000\u0000\u0100\u0637\u0001\u0000\u0000\u0000\u0102"+
		"\u064b\u0001\u0000\u0000\u0000\u0104\u0652\u0001\u0000\u0000\u0000\u0106"+
		"\u065b\u0001\u0000\u0000\u0000\u0108\u0669\u0001\u0000\u0000\u0000\u010a"+
		"\u067c\u0001\u0000\u0000\u0000\u010c\u0683\u0001\u0000\u0000\u0000\u010e"+
		"\u0688\u0001\u0000\u0000\u0000\u0110\u068d\u0001\u0000\u0000\u0000\u0112"+
		"\u068f\u0001\u0000\u0000\u0000\u0114\u069d\u0001\u0000\u0000\u0000\u0116"+
		"\u06a8\u0001\u0000\u0000\u0000\u0118\u06aa\u0001\u0000\u0000\u0000\u011a"+
		"\u06c8\u0001\u0000\u0000\u0000\u011c\u06cb\u0001\u0000\u0000\u0000\u011e"+
		"\u06cf\u0001\u0000\u0000\u0000\u0120\u06d1\u0001\u0000\u0000\u0000\u0122"+
		"\u06d7\u0001\u0000\u0000\u0000\u0124\u06eb\u0001\u0000\u0000\u0000\u0126"+
		"\u06ed\u0001\u0000\u0000\u0000\u0128\u0709\u0001\u0000\u0000\u0000\u012a"+
		"\u070c\u0001\u0000\u0000\u0000\u012c\u0710\u0001\u0000\u0000\u0000\u012e"+
		"\u0712\u0001\u0000\u0000\u0000\u0130\u0716\u0001\u0000\u0000\u0000\u0132"+
		"\u0719\u0001\u0000\u0000\u0000\u0134\u0728\u0001\u0000\u0000\u0000\u0136"+
		"\u073d\u0001\u0000\u0000\u0000\u0138\u073f\u0001\u0000\u0000\u0000\u013a"+
		"\u0741\u0001\u0000\u0000\u0000\u013c\u0743\u0001\u0000\u0000\u0000\u013e"+
		"\u0746\u0001\u0000\u0000\u0000\u0140\u074a\u0001\u0000\u0000\u0000\u0142"+
		"\u074e\u0001\u0000\u0000\u0000\u0144\u0751\u0001\u0000\u0000\u0000\u0146"+
		"\u075f\u0001\u0000\u0000\u0000\u0148\u076a\u0001\u0000\u0000\u0000\u014a"+
		"\u076c\u0001\u0000\u0000\u0000\u014c\u076f\u0001\u0000\u0000\u0000\u014e"+
		"\u0775\u0001\u0000\u0000\u0000\u0150\u077b\u0001\u0000\u0000\u0000\u0152"+
		"\u0785\u0001\u0000\u0000\u0000\u0154\u0790\u0001\u0000\u0000\u0000\u0156"+
		"\u079f\u0001\u0000\u0000\u0000\u0158\u07b1\u0001\u0000\u0000\u0000\u015a"+
		"\u07b3\u0001\u0000\u0000\u0000\u015c\u07b5\u0001\u0000\u0000\u0000\u015e"+
		"\u07c6\u0001\u0000\u0000\u0000\u0160\u07c8\u0001\u0000\u0000\u0000\u0162"+
		"\u07d2\u0001\u0000\u0000\u0000\u0164\u07d7\u0001\u0000\u0000\u0000\u0166"+
		"\u07dc\u0001\u0000\u0000\u0000\u0168\u07e0\u0001\u0000\u0000\u0000\u016a"+
		"\u07e8\u0001\u0000\u0000\u0000\u016c\u07ec\u0001\u0000\u0000\u0000\u016e"+
		"\u07fb\u0001\u0000\u0000\u0000\u0170\u07fd\u0001\u0000\u0000\u0000\u0172"+
		"\u0803\u0001\u0000\u0000\u0000\u0174\u0805\u0001\u0000\u0000\u0000\u0176"+
		"\u080c\u0001\u0000\u0000\u0000\u0178\u082a\u0001\u0000\u0000\u0000\u017a"+
		"\u0842\u0001\u0000\u0000\u0000\u017c\u084a\u0001\u0000\u0000\u0000\u017e"+
		"\u084c\u0001\u0000\u0000\u0000\u0180\u087d\u0001\u0000\u0000\u0000\u0182"+
		"\u08eb\u0001\u0000\u0000\u0000\u0184\u08ed\u0001\u0000\u0000\u0000\u0186"+
		"\u0933\u0001\u0000\u0000\u0000\u0188\u0978\u0001\u0000\u0000\u0000\u018a"+
		"\u09c7\u0001\u0000\u0000\u0000\u018c\u09c9\u0001\u0000\u0000\u0000\u018e"+
		"\u0190\u0003x<\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0000\u0000\u0001\u0192\u0001\u0001\u0000\u0000\u0000\u0193\u0195\u0003"+
		"\u018c\u00c6\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001"+
		"\u0000\u0000\u0000\u0197\u01a0\u0001\u0000\u0000\u0000\u0198\u01a0\u0005"+
		"E\u0000\u0000\u0199\u019a\u0005U\u0000\u0000\u019a\u019b\u0003Z-\u0000"+
		"\u019b\u019c\u0005V\u0000\u0000\u019c\u01a0\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0003\u0004\u0002\u0000\u019e\u01a0\u0003\f\u0006\u0000\u019f\u0194"+
		"\u0001\u0000\u0000\u0000\u019f\u0198\u0001\u0000\u0000\u0000\u019f\u0199"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u0003\u0001\u0000\u0000\u0000\u01a1\u01a4"+
		"\u0003\u0006\u0003\u0000\u01a2\u01a4\u0003\b\u0004\u0000\u01a3\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4\u0005\u0001"+
		"\u0000\u0000\u0000\u01a5\u01b0\u0005\u0084\u0000\u0000\u01a6\u01b0\u0003"+
		"\u014a\u00a5\u0000\u01a7\u01b0\u0003\u013c\u009e\u0000\u01a8\u01b0\u0003"+
		"\u014c\u00a6\u0000\u01a9\u01ac\u0005c\u0000\u0000\u01aa\u01ad\u0003\u0116"+
		"\u008b\u0000\u01ab\u01ad\u0003\u00a2Q\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b0\u0003\u0158\u00ac\u0000\u01af\u01a5\u0001\u0000\u0000"+
		"\u0000\u01af\u01a6\u0001\u0000\u0000\u0000\u01af\u01a7\u0001\u0000\u0000"+
		"\u0000\u01af\u01a8\u0001\u0000\u0000\u0000\u01af\u01a9\u0001\u0000\u0000"+
		"\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u0007\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0003\n\u0005\u0000\u01b2\u01b4\u0005D\u0000\u0000"+
		"\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003\u0006\u0003\u0000"+
		"\u01b6\t\u0001\u0000\u0000\u0000\u01b7\u01bb\u0006\u0005\uffff\uffff\u0000"+
		"\u01b8\u01bc\u0003\u00a0P\u0000\u01b9\u01bc\u0003\u00b8\\\u0000\u01ba"+
		"\u01bc\u0003\u00a2Q\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0005\u007f\u0000\u0000\u01be\u01ca\u0001\u0000\u0000\u0000\u01bf\u01c5"+
		"\n\u0001\u0000\u0000\u01c0\u01c6\u0005\u0084\u0000\u0000\u01c1\u01c3\u0005"+
		"D\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0003\u0156"+
		"\u00ab\u0000\u01c5\u01c0\u0001\u0000\u0000\u0000\u01c5\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0005\u007f"+
		"\u0000\u0000\u01c8\u01bf\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cb\u000b\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cf\u0003\u000e\u0007\u0000\u01ce\u01d0\u0003\u001c"+
		"\u000e\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0003d2\u0000"+
		"\u01d2\r\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005W\u0000\u0000\u01d4"+
		"\u01d6\u0003\u0010\b\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0005X\u0000\u0000\u01d8\u000f\u0001\u0000\u0000\u0000\u01d9\u01e0\u0003"+
		"\u0014\n\u0000\u01da\u01dd\u0003\u0012\t\u0000\u01db\u01dc\u0005z\u0000"+
		"\u0000\u01dc\u01de\u0003\u0014\n\u0000\u01dd\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000"+
		"\u01df\u01d9\u0001\u0000\u0000\u0000\u01df\u01da\u0001\u0000\u0000\u0000"+
		"\u01e0\u0011\u0001\u0000\u0000\u0000\u01e1\u01e2\u0007\u0000\u0000\u0000"+
		"\u01e2\u0013\u0001\u0000\u0000\u0000\u01e3\u01e8\u0003\u0016\u000b\u0000"+
		"\u01e4\u01e5\u0005z\u0000\u0000\u01e5\u01e7\u0003\u0016\u000b\u0000\u01e6"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ed\u0005\u0083\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ed\u0015\u0001\u0000\u0000\u0000\u01ee"+
		"\u01f1\u0003\u0018\f\u0000\u01ef\u01f1\u0003\u001a\r\u0000\u01f0\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1\u0017"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f4\u0005a\u0000\u0000\u01f3\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f8\u0005\u0084\u0000\u0000\u01f6\u01f8\u0005"+
		"E\u0000\u0000\u01f7\u01f3\u0001\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f8\u0019\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005a\u0000"+
		"\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\u0084\u0000"+
		"\u0000\u01fd\u01fe\u0003\u010c\u0086\u0000\u01fe\u001b\u0001\u0000\u0000"+
		"\u0000\u01ff\u0201\u0005U\u0000\u0000\u0200\u0202\u0003\u0102\u0081\u0000"+
		"\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0005V\u0000\u0000\u0204"+
		"\u0206\u0005/\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0001\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209"+
		"\u0003\u0172\u00b9\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a\u020c"+
		"\u0003\u00ccf\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u020e\u0001\u0000\u0000\u0000\u020d\u020f\u0003"+
		"\u00eau\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000"+
		"\u0000\u0000\u020f\u001d\u0001\u0000\u0000\u0000\u0210\u0211\u0006\u000f"+
		"\uffff\uffff\u0000\u0211\u022f\u0003\u0002\u0001\u0000\u0212\u0215\u0003"+
		"\u009eO\u0000\u0213\u0215\u0003\u0160\u00b0\u0000\u0214\u0212\u0001\u0000"+
		"\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u021c\u0001\u0000"+
		"\u0000\u0000\u0216\u0218\u0005U\u0000\u0000\u0217\u0219\u0003\"\u0011"+
		"\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021d\u0005V\u0000\u0000"+
		"\u021b\u021d\u0003\u0114\u008a\u0000\u021c\u0216\u0001\u0000\u0000\u0000"+
		"\u021c\u021b\u0001\u0000\u0000\u0000\u021d\u022f\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0007\u0001\u0000\u0000\u021f\u0220\u0005f\u0000\u0000\u0220"+
		"\u0221\u0003\u00f6{\u0000\u0221\u0222\u0005g\u0000\u0000\u0222\u0223\u0005"+
		"U\u0000\u0000\u0223\u0224\u0003Z-\u0000\u0224\u0225\u0005V\u0000\u0000"+
		"\u0225\u022f\u0001\u0000\u0000\u0000\u0226\u0227\u0003 \u0010\u0000\u0227"+
		"\u022a\u0005U\u0000\u0000\u0228\u022b\u0003Z-\u0000\u0229\u022b\u0003"+
		"\u00f6{\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u0229\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0005V\u0000"+
		"\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u0210\u0001\u0000\u0000"+
		"\u0000\u022e\u0214\u0001\u0000\u0000\u0000\u022e\u021e\u0001\u0000\u0000"+
		"\u0000\u022e\u0226\u0001\u0000\u0000\u0000\u022f\u024b\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\n\u0007\u0000\u0000\u0231\u0234\u0005W\u0000\u0000"+
		"\u0232\u0235\u0003Z-\u0000\u0233\u0235\u0003\u0114\u008a\u0000\u0234\u0232"+
		"\u0001\u0000\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0005X\u0000\u0000\u0237\u024a\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\n\u0006\u0000\u0000\u0239\u023b\u0005U"+
		"\u0000\u0000\u023a\u023c\u0003\"\u0011\u0000\u023b\u023a\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u024a\u0005V\u0000\u0000\u023e\u023f\n\u0004\u0000\u0000"+
		"\u023f\u0245\u0007\u0002\u0000\u0000\u0240\u0242\u0005D\u0000\u0000\u0241"+
		"\u0240\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0246\u0003\u0004\u0002\u0000\u0244"+
		"\u0246\u0003$\u0012\u0000\u0245\u0241\u0001\u0000\u0000\u0000\u0245\u0244"+
		"\u0001\u0000\u0000\u0000\u0246\u024a\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\n\u0003\u0000\u0000\u0248\u024a\u0007\u0003\u0000\u0000\u0249\u0230\u0001"+
		"\u0000\u0000\u0000\u0249\u0238\u0001\u0000\u0000\u0000\u0249\u023e\u0001"+
		"\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u024a\u024d\u0001"+
		"\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u001f\u0001\u0000\u0000\u0000\u024d\u024b\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0005K\u0000\u0000\u024f!\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0003\u0112\u0089\u0000\u0251#\u0001\u0000\u0000\u0000"+
		"\u0252\u0254\u0003\n\u0005\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0258\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0003\u00a0P\u0000\u0256\u0257\u0005\u007f\u0000\u0000\u0257\u0259"+
		"\u0001\u0000\u0000\u0000\u0258\u0255\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0005c\u0000\u0000\u025b\u0266\u0003\u00a0P\u0000\u025c\u025d\u0003\n"+
		"\u0005\u0000\u025d\u025e\u0005D\u0000\u0000\u025e\u025f\u0003\u0156\u00ab"+
		"\u0000\u025f\u0260\u0005\u007f\u0000\u0000\u0260\u0261\u0005c\u0000\u0000"+
		"\u0261\u0262\u0003\u00a0P\u0000\u0262\u0266\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0005c\u0000\u0000\u0264\u0266\u0003\u00a2Q\u0000\u0265\u0253\u0001"+
		"\u0000\u0000\u0000\u0265\u025c\u0001\u0000\u0000\u0000\u0265\u0263\u0001"+
		"\u0000\u0000\u0000\u0266%\u0001\u0000\u0000\u0000\u0267\u0283\u0003\u001e"+
		"\u000f\u0000\u0268\u026d\u0005x\u0000\u0000\u0269\u026d\u0005y\u0000\u0000"+
		"\u026a\u026d\u0003(\u0014\u0000\u026b\u026d\u0005>\u0000\u0000\u026c\u0268"+
		"\u0001\u0000\u0000\u0000\u026c\u0269\u0001\u0000\u0000\u0000\u026c\u026a"+
		"\u0001\u0000\u0000\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026e\u0283\u0003&\u0013\u0000\u026f\u0278\u0005"+
		">\u0000\u0000\u0270\u0271\u0005U\u0000\u0000\u0271\u0272\u0003\u00f6{"+
		"\u0000\u0272\u0273\u0005V\u0000\u0000\u0273\u0279\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0005\u0083\u0000\u0000\u0275\u0276\u0005U\u0000\u0000\u0276"+
		"\u0277\u0005\u0084\u0000\u0000\u0277\u0279\u0005V\u0000\u0000\u0278\u0270"+
		"\u0001\u0000\u0000\u0000\u0278\u0274\u0001\u0000\u0000\u0000\u0279\u0283"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0005\u000b\u0000\u0000\u027b\u027c"+
		"\u0005U\u0000\u0000\u027c\u027d\u0003\u00f6{\u0000\u027d\u027e\u0005V"+
		"\u0000\u0000\u027e\u0283\u0001\u0000\u0000\u0000\u027f\u0283\u00038\u001c"+
		"\u0000\u0280\u0283\u0003*\u0015\u0000\u0281\u0283\u00036\u001b\u0000\u0282"+
		"\u0267\u0001\u0000\u0000\u0000\u0282\u026c\u0001\u0000\u0000\u0000\u0282"+
		"\u026f\u0001\u0000\u0000\u0000\u0282\u027a\u0001\u0000\u0000\u0000\u0282"+
		"\u027f\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0282"+
		"\u0281\u0001\u0000\u0000\u0000\u0283\'\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0007\u0004\u0000\u0000\u0285)\u0001\u0000\u0000\u0000\u0286\u0288\u0005"+
		"\u007f\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b\u0005"+
		"1\u0000\u0000\u028a\u028c\u0003,\u0016\u0000\u028b\u028a\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u0292\u0001\u0000\u0000"+
		"\u0000\u028d\u0293\u0003.\u0017\u0000\u028e\u028f\u0005U\u0000\u0000\u028f"+
		"\u0290\u0003\u00f6{\u0000\u0290\u0291\u0005V\u0000\u0000\u0291\u0293\u0001"+
		"\u0000\u0000\u0000\u0292\u028d\u0001\u0000\u0000\u0000\u0292\u028e\u0001"+
		"\u0000\u0000\u0000\u0293\u0295\u0001\u0000\u0000\u0000\u0294\u0296\u0003"+
		"4\u001a\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000"+
		"\u0000\u0000\u0296+\u0001\u0000\u0000\u0000\u0297\u0298\u0005U\u0000\u0000"+
		"\u0298\u0299\u0003\"\u0011\u0000\u0299\u029a\u0005V\u0000\u0000\u029a"+
		"-\u0001\u0000\u0000\u0000\u029b\u029d\u0003\u0096K\u0000\u029c\u029e\u0003"+
		"0\u0018\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000"+
		"\u0000\u0000\u029e/\u0001\u0000\u0000\u0000\u029f\u02a1\u0003\u00ecv\u0000"+
		"\u02a0\u02a2\u00030\u0018\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a5\u00032\u0019\u0000\u02a4\u029f\u0001\u0000\u0000\u0000\u02a4\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a51\u0001\u0000\u0000\u0000\u02a6\u02a7\u0006"+
		"\u0019\uffff\uffff\u0000\u02a7\u02a8\u0005W\u0000\u0000\u02a8\u02a9\u0003"+
		"Z-\u0000\u02a9\u02ab\u0005X\u0000\u0000\u02aa\u02ac\u0003\u00ccf\u0000"+
		"\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000"+
		"\u02ac\u02b6\u0001\u0000\u0000\u0000\u02ad\u02ae\n\u0001\u0000\u0000\u02ae"+
		"\u02af\u0005W\u0000\u0000\u02af\u02b0\u0003\\.\u0000\u02b0\u02b2\u0005"+
		"X\u0000\u0000\u02b1\u02b3\u0003\u00ccf\u0000\u02b2\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b4\u02ad\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b73\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b9\u02bb\u0005U\u0000\u0000\u02ba\u02bc\u0003\"\u0011\u0000\u02bb"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bd\u02c0\u0005V\u0000\u0000\u02be\u02c0"+
		"\u0003\u0114\u008a\u0000\u02bf\u02b9\u0001\u0000\u0000\u0000\u02bf\u02be"+
		"\u0001\u0000\u0000\u0000\u02c05\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005"+
		"\u007f\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c7\u0005"+
		"\u001c\u0000\u0000\u02c5\u02c6\u0005W\u0000\u0000\u02c6\u02c8\u0005X\u0000"+
		"\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0003:\u001d\u0000"+
		"\u02ca7\u0001\u0000\u0000\u0000\u02cb\u02cc\u00052\u0000\u0000\u02cc\u02cd"+
		"\u0005U\u0000\u0000\u02cd\u02ce\u0003Z-\u0000\u02ce\u02cf\u0005V\u0000"+
		"\u0000\u02cf9\u0001\u0000\u0000\u0000\u02d0\u02d7\u0003&\u0013\u0000\u02d1"+
		"\u02d2\u0005U\u0000\u0000\u02d2\u02d3\u0003\u00f6{\u0000\u02d3\u02d4\u0005"+
		"V\u0000\u0000\u02d4\u02d5\u0003:\u001d\u0000\u02d5\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d0\u0001\u0000\u0000\u0000\u02d6\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d7;\u0001\u0000\u0000\u0000\u02d8\u02dd\u0003:\u001d\u0000\u02d9"+
		"\u02da\u0007\u0005\u0000\u0000\u02da\u02dc\u0003:\u001d\u0000\u02db\u02d9"+
		"\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db"+
		"\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02e3"+
		"\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e3"+
		"\u0003\u0178\u00bc\u0000\u02e1\u02e3\u0003\u017a\u00bd\u0000\u02e2\u02d8"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e3=\u0001\u0000\u0000\u0000\u02e4\u02e9\u0003"+
		"<\u001e\u0000\u02e5\u02e6\u0007\u0006\u0000\u0000\u02e6\u02e8\u0003<\u001e"+
		"\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000"+
		"\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ea?\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000"+
		"\u02ec\u02f1\u0003>\u001f\u0000\u02ed\u02ee\u0007\u0007\u0000\u0000\u02ee"+
		"\u02f0\u0003>\u001f\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f2A\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f4\u02fa\u0003@ \u0000\u02f5\u02f6\u0003D\"\u0000"+
		"\u02f6\u02f7\u0003@ \u0000\u02f7\u02f9\u0001\u0000\u0000\u0000\u02f8\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000\u0000\u02fa\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fbC\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005"+
		"g\u0000\u0000\u02fe\u0302\u0005g\u0000\u0000\u02ff\u0300\u0005f\u0000"+
		"\u0000\u0300\u0302\u0005f\u0000\u0000\u0301\u02fd\u0001\u0000\u0000\u0000"+
		"\u0301\u02ff\u0001\u0000\u0000\u0000\u0302E\u0001\u0000\u0000\u0000\u0303"+
		"\u0308\u0003B!\u0000\u0304\u0305\u0007\b\u0000\u0000\u0305\u0307\u0003"+
		"B!\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000"+
		"\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000"+
		"\u0000\u0309G\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000"+
		"\u030b\u0310\u0003F#\u0000\u030c\u030d\u0007\t\u0000\u0000\u030d\u030f"+
		"\u0003F#\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000"+
		"\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000"+
		"\u0000\u0000\u0311I\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0313\u0318\u0003H$\u0000\u0314\u0315\u0005a\u0000\u0000\u0315"+
		"\u0317\u0003H$\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u031a\u0001"+
		"\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001"+
		"\u0000\u0000\u0000\u0319K\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000"+
		"\u0000\u0000\u031b\u0320\u0003J%\u0000\u031c\u031d\u0005`\u0000\u0000"+
		"\u031d\u031f\u0003J%\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0322"+
		"\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0001\u0000\u0000\u0000\u0321M\u0001\u0000\u0000\u0000\u0322\u0320\u0001"+
		"\u0000\u0000\u0000\u0323\u0328\u0003L&\u0000\u0324\u0325\u0005b\u0000"+
		"\u0000\u0325\u0327\u0003L&\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327"+
		"\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328"+
		"\u0329\u0001\u0000\u0000\u0000\u0329O\u0001\u0000\u0000\u0000\u032a\u0328"+
		"\u0001\u0000\u0000\u0000\u032b\u0330\u0003N\'\u0000\u032c\u032d\u0005"+
		"v\u0000\u0000\u032d\u032f\u0003N\'\u0000\u032e\u032c\u0001\u0000\u0000"+
		"\u0000\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000"+
		"\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331Q\u0001\u0000\u0000\u0000"+
		"\u0332\u0330\u0001\u0000\u0000\u0000\u0333\u0338\u0003P(\u0000\u0334\u0335"+
		"\u0005w\u0000\u0000\u0335\u0337\u0003P(\u0000\u0336\u0334\u0001\u0000"+
		"\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339S\u0001\u0000\u0000"+
		"\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u0341\u0003R)\u0000\u033c"+
		"\u033d\u0005}\u0000\u0000\u033d\u033e\u0003Z-\u0000\u033e\u033f\u0005"+
		"~\u0000\u0000\u033f\u0340\u0003V+\u0000\u0340\u0342\u0001\u0000\u0000"+
		"\u0000\u0341\u033c\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000"+
		"\u0000\u0342U\u0001\u0000\u0000\u0000\u0343\u034a\u0003T*\u0000\u0344"+
		"\u0345\u0003R)\u0000\u0345\u0346\u0003X,\u0000\u0346\u0347\u0003\u0110"+
		"\u0088\u0000\u0347\u034a\u0001\u0000\u0000\u0000\u0348\u034a\u0003\u0170"+
		"\u00b8\u0000\u0349\u0343\u0001\u0000\u0000\u0000\u0349\u0344\u0001\u0000"+
		"\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u034aW\u0001\u0000\u0000"+
		"\u0000\u034b\u034c\u0007\n\u0000\u0000\u034cY\u0001\u0000\u0000\u0000"+
		"\u034d\u0352\u0003V+\u0000\u034e\u034f\u0005z\u0000\u0000\u034f\u0351"+
		"\u0003V+\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351\u0354\u0001\u0000"+
		"\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000"+
		"\u0000\u0000\u0353[\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000"+
		"\u0000\u0355\u0356\u0003T*\u0000\u0356]\u0001\u0000\u0000\u0000\u0357"+
		"\u036a\u0003`0\u0000\u0358\u036a\u0003\u017e\u00bf\u0000\u0359\u036a\u0003"+
		"\u0180\u00c0\u0000\u035a\u036a\u0003\u0184\u00c2\u0000\u035b\u036a\u0003"+
		"\u0186\u00c3\u0000\u035c\u036a\u0003\u0188\u00c4\u0000\u035d\u036a\u0003"+
		"v;\u0000\u035e\u0360\u0003\u00ccf\u0000\u035f\u035e\u0001\u0000\u0000"+
		"\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0367\u0001\u0000\u0000"+
		"\u0000\u0361\u0368\u0003b1\u0000\u0362\u0368\u0003d2\u0000\u0363\u0368"+
		"\u0003h4\u0000\u0364\u0368\u0003l6\u0000\u0365\u0368\u0003t:\u0000\u0366"+
		"\u0368\u0003\u0166\u00b3\u0000\u0367\u0361\u0001\u0000\u0000\u0000\u0367"+
		"\u0362\u0001\u0000\u0000\u0000\u0367\u0363\u0001\u0000\u0000\u0000\u0367"+
		"\u0364\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367"+
		"\u0366\u0001\u0000\u0000\u0000\u0368\u036a\u0001\u0000\u0000\u0000\u0369"+
		"\u0357\u0001\u0000\u0000\u0000\u0369\u0358\u0001\u0000\u0000\u0000\u0369"+
		"\u0359\u0001\u0000\u0000\u0000\u0369\u035a\u0001\u0000\u0000\u0000\u0369"+
		"\u035b\u0001\u0000\u0000\u0000\u0369\u035c\u0001\u0000\u0000\u0000\u0369"+
		"\u035d\u0001\u0000\u0000\u0000\u0369\u035f\u0001\u0000\u0000\u0000\u036a"+
		"_\u0001\u0000\u0000\u0000\u036b\u036d\u0003\u00ccf\u0000\u036c\u036b\u0001"+
		"\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u0372\u0001"+
		"\u0000\u0000\u0000\u036e\u0373\u0005\u0084\u0000\u0000\u036f\u0370\u0005"+
		"\u0010\u0000\u0000\u0370\u0373\u0003\\.\u0000\u0371\u0373\u0005\u001b"+
		"\u0000\u0000\u0372\u036e\u0001\u0000\u0000\u0000\u0372\u036f\u0001\u0000"+
		"\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0005~\u0000\u0000\u0375\u0376\u0003^/\u0000"+
		"\u0376a\u0001\u0000\u0000\u0000\u0377\u0379\u0003Z-\u0000\u0378\u0377"+
		"\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037a"+
		"\u0001\u0000\u0000\u0000\u037a\u037b\u0005\u0080\u0000\u0000\u037bc\u0001"+
		"\u0000\u0000\u0000\u037c\u037e\u0005Y\u0000\u0000\u037d\u037f\u0003f3"+
		"\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000"+
		"\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0005Z\u0000\u0000"+
		"\u0381e\u0001\u0000\u0000\u0000\u0382\u0384\u0003^/\u0000\u0383\u0382"+
		"\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0383"+
		"\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386g\u0001"+
		"\u0000\u0000\u0000\u0387\u0388\u0005+\u0000\u0000\u0388\u0389\u0005U\u0000"+
		"\u0000\u0389\u038a\u0003j5\u0000\u038a\u038b\u0005V\u0000\u0000\u038b"+
		"\u038e\u0003^/\u0000\u038c\u038d\u0005 \u0000\u0000\u038d\u038f\u0003"+
		"^/\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000"+
		"\u0000\u038f\u0397\u0001\u0000\u0000\u0000\u0390\u0391\u0005C\u0000\u0000"+
		"\u0391\u0392\u0005U\u0000\u0000\u0392\u0393\u0003j5\u0000\u0393\u0394"+
		"\u0005V\u0000\u0000\u0394\u0395\u0003^/\u0000\u0395\u0397\u0001\u0000"+
		"\u0000\u0000\u0396\u0387\u0001\u0000\u0000\u0000\u0396\u0390\u0001\u0000"+
		"\u0000\u0000\u0397i\u0001\u0000\u0000\u0000\u0398\u03a4\u0003Z-\u0000"+
		"\u0399\u039b\u0003\u00ccf\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039a"+
		"\u039b\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c"+
		"\u039d\u0003\u008aE\u0000\u039d\u03a1\u0003\u00e2q\u0000\u039e\u039f\u0005"+
		"e\u0000\u0000\u039f\u03a2\u0003\u0110\u0088\u0000\u03a0\u03a2\u0003\u0114"+
		"\u008a\u0000\u03a1\u039e\u0001\u0000\u0000\u0000\u03a1\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a4\u0001\u0000\u0000\u0000\u03a3\u0398\u0001\u0000"+
		"\u0000\u0000\u03a3\u039a\u0001\u0000\u0000\u0000\u03a4k\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a6\u0005T\u0000\u0000\u03a6\u03a7\u0005U\u0000\u0000\u03a7"+
		"\u03a8\u0003j5\u0000\u03a8\u03a9\u0005V\u0000\u0000\u03a9\u03aa\u0003"+
		"^/\u0000\u03aa\u03c7\u0001\u0000\u0000\u0000\u03ab\u03ac\u0005\u001d\u0000"+
		"\u0000\u03ac\u03ad\u0003^/\u0000\u03ad\u03ae\u0005T\u0000\u0000\u03ae"+
		"\u03af\u0005U\u0000\u0000\u03af\u03b0\u0003Z-\u0000\u03b0\u03b1\u0005"+
		"V\u0000\u0000\u03b1\u03b2\u0005\u0080\u0000\u0000\u03b2\u03c7\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b4\u0005(\u0000\u0000\u03b4\u03c1\u0005U\u0000\u0000"+
		"\u03b5\u03b7\u0003n7\u0000\u03b6\u03b8\u0003j5\u0000\u03b7\u03b6\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001"+
		"\u0000\u0000\u0000\u03b9\u03bb\u0005\u0080\u0000\u0000\u03ba\u03bc\u0003"+
		"Z-\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000"+
		"\u0000\u03bc\u03c2\u0001\u0000\u0000\u0000\u03bd\u03be\u0003p8\u0000\u03be"+
		"\u03bf\u0005~\u0000\u0000\u03bf\u03c0\u0003r9\u0000\u03c0\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c1\u03b5\u0001\u0000\u0000\u0000\u03c1\u03bd\u0001"+
		"\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005"+
		"V\u0000\u0000\u03c4\u03c5\u0003^/\u0000\u03c5\u03c7\u0001\u0000\u0000"+
		"\u0000\u03c6\u03a5\u0001\u0000\u0000\u0000\u03c6\u03ab\u0001\u0000\u0000"+
		"\u0000\u03c6\u03b3\u0001\u0000\u0000\u0000\u03c7m\u0001\u0000\u0000\u0000"+
		"\u03c8\u03cb\u0003b1\u0000\u03c9\u03cb\u0003\u0080@\u0000\u03ca\u03c8"+
		"\u0001\u0000\u0000\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03cbo\u0001"+
		"\u0000\u0000\u0000\u03cc\u03ce\u0003\u00ccf\u0000\u03cd\u03cc\u0001\u0000"+
		"\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000"+
		"\u0000\u0000\u03cf\u03d0\u0003\u008aE\u0000\u03d0\u03d1\u0003\u00e2q\u0000"+
		"\u03d1q\u0001\u0000\u0000\u0000\u03d2\u03d5\u0003Z-\u0000\u03d3\u03d5"+
		"\u0003\u0114\u008a\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d3"+
		"\u0001\u0000\u0000\u0000\u03d5s\u0001\u0000\u0000\u0000\u03d6\u03e0\u0005"+
		"\u000f\u0000\u0000\u03d7\u03e0\u0005\u0019\u0000\u0000\u03d8\u03db\u0005"+
		";\u0000\u0000\u03d9\u03dc\u0003Z-\u0000\u03da\u03dc\u0003\u0114\u008a"+
		"\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db\u03da\u0001\u0000\u0000"+
		"\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03e0\u0001\u0000\u0000"+
		"\u0000\u03dd\u03de\u0005*\u0000\u0000\u03de\u03e0\u0005\u0084\u0000\u0000"+
		"\u03df\u03d6\u0001\u0000\u0000\u0000\u03df\u03d7\u0001\u0000\u0000\u0000"+
		"\u03df\u03d8\u0001\u0000\u0000\u0000\u03df\u03dd\u0001\u0000\u0000\u0000"+
		"\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e2\u0005\u0080\u0000\u0000"+
		"\u03e2u\u0001\u0000\u0000\u0000\u03e3\u03e4\u0003|>\u0000\u03e4w\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e7\u0003z=\u0000\u03e6\u03e5\u0001\u0000\u0000"+
		"\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000"+
		"\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9y\u0001\u0000\u0000\u0000"+
		"\u03ea\u03f4\u0003|>\u0000\u03eb\u03f4\u0003\u0108\u0084\u0000\u03ec\u03f4"+
		"\u0003\u014e\u00a7\u0000\u03ed\u03f4\u0003\u0162\u00b1\u0000\u03ee\u03f4"+
		"\u0003\u0164\u00b2\u0000\u03ef\u03f4\u0003\u00cae\u0000\u03f0\u03f4\u0003"+
		"\u00bc^\u0000\u03f1\u03f4\u0003\u0084B\u0000\u03f2\u03f4\u0003\u0086C"+
		"\u0000\u03f3\u03ea\u0001\u0000\u0000\u0000\u03f3\u03eb\u0001\u0000\u0000"+
		"\u0000\u03f3\u03ec\u0001\u0000\u0000\u0000\u03f3\u03ed\u0001\u0000\u0000"+
		"\u0000\u03f3\u03ee\u0001\u0000\u0000\u0000\u03f3\u03ef\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f4{\u0001\u0000\u0000\u0000"+
		"\u03f5\u03fe\u0003\u0080@\u0000\u03f6\u03fe\u0003\u00c8d\u0000\u03f7\u03fe"+
		"\u0003\u00c0`\u0000\u03f8\u03fe\u0003\u00c4b\u0000\u03f9\u03fe\u0003\u00c6"+
		"c\u0000\u03fa\u03fe\u0003\u0082A\u0000\u03fb\u03fe\u0003~?\u0000\u03fc"+
		"\u03fe\u0003\u00acV\u0000\u03fd\u03f5\u0001\u0000\u0000\u0000\u03fd\u03f6"+
		"\u0001\u0000\u0000\u0000\u03fd\u03f7\u0001\u0000\u0000\u0000\u03fd\u03f8"+
		"\u0001\u0000\u0000\u0000\u03fd\u03f9\u0001\u0000\u0000\u0000\u03fd\u03fa"+
		"\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd\u03fc"+
		"\u0001\u0000\u0000\u0000\u03fe}\u0001\u0000\u0000\u0000\u03ff\u0400\u0005"+
		"O\u0000\u0000\u0400\u0402\u0005\u0084\u0000\u0000\u0401\u0403\u0003\u00cc"+
		"f\u0000\u0402\u0401\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
		"\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0405\u0005e\u0000\u0000"+
		"\u0405\u0406\u0003\u00f6{\u0000\u0406\u0407\u0005\u0080\u0000\u0000\u0407"+
		"\u007f\u0001\u0000\u0000\u0000\u0408\u040a\u0003\u008aE\u0000\u0409\u0408"+
		"\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u040c"+
		"\u0001\u0000\u0000\u0000\u040b\u040d\u0003\u00deo\u0000\u040c\u040b\u0001"+
		"\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u040e\u0001"+
		"\u0000\u0000\u0000\u040e\u0417\u0005\u0080\u0000\u0000\u040f\u0411\u0003"+
		"\u00ccf\u0000\u0410\u0412\u0003\u008aE\u0000\u0411\u0410\u0001\u0000\u0000"+
		"\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000\u0000"+
		"\u0000\u0413\u0414\u0003\u00deo\u0000\u0414\u0415\u0005\u0080\u0000\u0000"+
		"\u0415\u0417\u0001\u0000\u0000\u0000\u0416\u0409\u0001\u0000\u0000\u0000"+
		"\u0416\u040f\u0001\u0000\u0000\u0000\u0417\u0081\u0001\u0000\u0000\u0000"+
		"\u0418\u0419\u0005@\u0000\u0000\u0419\u041a\u0005U\u0000\u0000\u041a\u041b"+
		"\u0003\\.\u0000\u041b\u041c\u0005z\u0000\u0000\u041c\u041d\u0005\u0004"+
		"\u0000\u0000\u041d\u041e\u0005V\u0000\u0000\u041e\u041f\u0005\u0080\u0000"+
		"\u0000\u041f\u0083\u0001\u0000\u0000\u0000\u0420\u0421\u0005\u0080\u0000"+
		"\u0000\u0421\u0085\u0001\u0000\u0000\u0000\u0422\u0423\u0003\u00ccf\u0000"+
		"\u0423\u0424\u0005\u0080\u0000\u0000\u0424\u0087\u0001\u0000\u0000\u0000"+
		"\u0425\u042c\u0003\u008cF\u0000\u0426\u042c\u0003\u0092I\u0000\u0427\u042c"+
		"\u0003\u008eG\u0000\u0428\u042c\u0005)\u0000\u0000\u0429\u042c\u0005J"+
		"\u0000\u0000\u042a\u042c\u0005\u0017\u0000\u0000\u042b\u0425\u0001\u0000"+
		"\u0000\u0000\u042b\u0426\u0001\u0000\u0000\u0000\u042b\u0427\u0001\u0000"+
		"\u0000\u0000\u042b\u0428\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000"+
		"\u0000\u0000\u042b\u042a\u0001\u0000\u0000\u0000\u042c\u0089\u0001\u0000"+
		"\u0000\u0000\u042d\u042f\u0003\u0088D\u0000\u042e\u042d\u0001\u0000\u0000"+
		"\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000"+
		"\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0431\u0433\u0001\u0000\u0000"+
		"\u0000\u0432\u0434\u0003\u00ccf\u0000\u0433\u0432\u0001\u0000\u0000\u0000"+
		"\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u008b\u0001\u0000\u0000\u0000"+
		"\u0435\u0436\u0007\u000b\u0000\u0000\u0436\u008d\u0001\u0000\u0000\u0000"+
		"\u0437\u0438\u0007\f\u0000\u0000\u0438\u008f\u0001\u0000\u0000\u0000\u0439"+
		"\u043a\u0005\u0084\u0000\u0000\u043a\u0091\u0001\u0000\u0000\u0000\u043b"+
		"\u043f\u0003\u0094J\u0000\u043c\u043f\u0003\u0118\u008c\u0000\u043d\u043f"+
		"\u0003\u00a8T\u0000\u043e\u043b\u0001\u0000\u0000\u0000\u043e\u043c\u0001"+
		"\u0000\u0000\u0000\u043e\u043d\u0001\u0000\u0000\u0000\u043f\u0093\u0001"+
		"\u0000\u0000\u0000\u0440\u0445\u0003\u009eO\u0000\u0441\u0445\u0003\u00a4"+
		"R\u0000\u0442\u0445\u0003\u0160\u00b0\u0000\u0443\u0445\u0003\u00f0x\u0000"+
		"\u0444\u0440\u0001\u0000\u0000\u0000\u0444\u0441\u0001\u0000\u0000\u0000"+
		"\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0443\u0001\u0000\u0000\u0000"+
		"\u0445\u0095\u0001\u0000\u0000\u0000\u0446\u0448\u0003\u0092I\u0000\u0447"+
		"\u0446\u0001\u0000\u0000\u0000\u0448\u0449\u0001\u0000\u0000\u0000\u0449"+
		"\u0447\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044a"+
		"\u044c\u0001\u0000\u0000\u0000\u044b\u044d\u0003\u00ccf\u0000\u044c\u044b"+
		"\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u0097"+
		"\u0001\u0000\u0000\u0000\u044e\u0450\u0003\u0094J\u0000\u044f\u044e\u0001"+
		"\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u044f\u0001"+
		"\u0000\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0454\u0001"+
		"\u0000\u0000\u0000\u0453\u0455\u0003\u00ccf\u0000\u0454\u0453\u0001\u0000"+
		"\u0000\u0000\u0454\u0455\u0001\u0000\u0000\u0000\u0455\u0099\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\u0007\r\u0000\u0000\u0457\u009b\u0001\u0000\u0000"+
		"\u0000\u0458\u0459\u0007\u000e\u0000\u0000\u0459\u009d\u0001\u0000\u0000"+
		"\u0000\u045a\u045c\u0003\n\u0005\u0000\u045b\u045a\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000"+
		"\u045d\u048f\u0003\u00a0P\u0000\u045e\u045f\u0003\n\u0005\u0000\u045f"+
		"\u0460\u0005D\u0000\u0000\u0460\u0461\u0003\u0156\u00ab\u0000\u0461\u048f"+
		"\u0001\u0000\u0000\u0000\u0462\u048f\u0003\u009cN\u0000\u0463\u0465\u0003"+
		"\u009cN\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000"+
		"\u0000\u0000\u0465\u0467\u0001\u0000\u0000\u0000\u0466\u0468\u0003\u009a"+
		"M\u0000\u0467\u0466\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000"+
		"\u0000\u0469\u0467\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000"+
		"\u0000\u046a\u048f\u0001\u0000\u0000\u0000\u046b\u046d\u0003\u009cN\u0000"+
		"\u046c\u046b\u0001\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000\u0000"+
		"\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u048f\u0005\u0012\u0000\u0000"+
		"\u046f\u0471\u0003\u009cN\u0000\u0470\u046f\u0001\u0000\u0000\u0000\u0470"+
		"\u0471\u0001\u0000\u0000\u0000\u0471\u0472\u0001\u0000\u0000\u0000\u0472"+
		"\u048f\u0005\u0013\u0000\u0000\u0473\u0475\u0003\u009cN\u0000\u0474\u0473"+
		"\u0001\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0476"+
		"\u0001\u0000\u0000\u0000\u0476\u048f\u0005\u0014\u0000\u0000\u0477\u0479"+
		"\u0003\u009cN\u0000\u0478\u0477\u0001\u0000\u0000\u0000\u0478\u0479\u0001"+
		"\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u048f\u0005"+
		"S\u0000\u0000\u047b\u048f\u0005\u000e\u0000\u0000\u047c\u047e\u0003\u009c"+
		"N\u0000\u047d\u047c\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000\u0000"+
		"\u0000\u047e\u0482\u0001\u0000\u0000\u0000\u047f\u0481\u0003\u009aM\u0000"+
		"\u0480\u047f\u0001\u0000\u0000\u0000\u0481\u0484\u0001\u0000\u0000\u0000"+
		"\u0482\u0480\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000"+
		"\u0483\u0485\u0001\u0000\u0000\u0000\u0484\u0482\u0001\u0000\u0000\u0000"+
		"\u0485\u048f\u0005-\u0000\u0000\u0486\u048f\u0005\'\u0000\u0000\u0487"+
		"\u0489\u0003\u009aM\u0000\u0488\u0487\u0001\u0000\u0000\u0000\u0488\u0489"+
		"\u0001\u0000\u0000\u0000\u0489\u048a\u0001\u0000\u0000\u0000\u048a\u048f"+
		"\u0005\u001e\u0000\u0000\u048b\u048f\u0005Q\u0000\u0000\u048c\u048f\u0005"+
		"\r\u0000\u0000\u048d\u048f\u0003\u00a2Q\u0000\u048e\u045b\u0001\u0000"+
		"\u0000\u0000\u048e\u045e\u0001\u0000\u0000\u0000\u048e\u0462\u0001\u0000"+
		"\u0000\u0000\u048e\u0464\u0001\u0000\u0000\u0000\u048e\u046c\u0001\u0000"+
		"\u0000\u0000\u048e\u0470\u0001\u0000\u0000\u0000\u048e\u0474\u0001\u0000"+
		"\u0000\u0000\u048e\u0478\u0001\u0000\u0000\u0000\u048e\u047b\u0001\u0000"+
		"\u0000\u0000\u048e\u047d\u0001\u0000\u0000\u0000\u048e\u0486\u0001\u0000"+
		"\u0000\u0000\u048e\u0488\u0001\u0000\u0000\u0000\u048e\u048b\u0001\u0000"+
		"\u0000\u0000\u048e\u048c\u0001\u0000\u0000\u0000\u048e\u048d\u0001\u0000"+
		"\u0000\u0000\u048f\u009f\u0001\u0000\u0000\u0000\u0490\u0495\u0003\u0116"+
		"\u008b\u0000\u0491\u0495\u0003\u00a6S\u0000\u0492\u0495\u0003\u0090H\u0000"+
		"\u0493\u0495\u0003\u0156\u00ab\u0000\u0494\u0490\u0001\u0000\u0000\u0000"+
		"\u0494\u0491\u0001\u0000\u0000\u0000\u0494\u0492\u0001\u0000\u0000\u0000"+
		"\u0494\u0493\u0001\u0000\u0000\u0000\u0495\u00a1\u0001\u0000\u0000\u0000"+
		"\u0496\u0497\u0005\u001a\u0000\u0000\u0497\u049a\u0005U\u0000\u0000\u0498"+
		"\u049b\u0003Z-\u0000\u0499\u049b\u0005\r\u0000\u0000\u049a\u0498\u0001"+
		"\u0000\u0000\u0000\u049a\u0499\u0001\u0000\u0000\u0000\u049b\u049c\u0001"+
		"\u0000\u0000\u0000\u049c\u049d\u0005V\u0000\u0000\u049d\u00a3\u0001\u0000"+
		"\u0000\u0000\u049e\u04ad\u0003\u0120\u0090\u0000\u049f\u04a1\u0003\u00cc"+
		"f\u0000\u04a0\u049f\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a3\u0001\u0000\u0000\u0000\u04a2\u04a4\u0003\n\u0005\u0000"+
		"\u04a3\u04a2\u0001\u0000\u0000\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000"+
		"\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5\u04ae\u0005\u0084\u0000\u0000"+
		"\u04a6\u04ae\u0003\u0156\u00ab\u0000\u04a7\u04a9\u0003\n\u0005\u0000\u04a8"+
		"\u04aa\u0005D\u0000\u0000\u04a9\u04a8\u0001\u0000\u0000\u0000\u04a9\u04aa"+
		"\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ac"+
		"\u0003\u0156\u00ab\u0000\u04ac\u04ae\u0001\u0000\u0000\u0000\u04ad\u04a0"+
		"\u0001\u0000\u0000\u0000\u04ad\u04a6\u0001\u0000\u0000\u0000\u04ad\u04a7"+
		"\u0001\u0000\u0000\u0000\u04ae\u04b5\u0001\u0000\u0000\u0000\u04af\u04b1"+
		"\u0005!\u0000\u0000\u04b0\u04b2\u0003\n\u0005\u0000\u04b1\u04b0\u0001"+
		"\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001"+
		"\u0000\u0000\u0000\u04b3\u04b5\u0005\u0084\u0000\u0000\u04b4\u049e\u0001"+
		"\u0000\u0000\u0000\u04b4\u04af\u0001\u0000\u0000\u0000\u04b5\u00a5\u0001"+
		"\u0000\u0000\u0000\u04b6\u04b7\u0005\u0084\u0000\u0000\u04b7\u00a7\u0001"+
		"\u0000\u0000\u0000\u04b8\u04b9\u0003\u00aaU\u0000\u04b9\u04be\u0005Y\u0000"+
		"\u0000\u04ba\u04bc\u0003\u00b2Y\u0000\u04bb\u04bd\u0005z\u0000\u0000\u04bc"+
		"\u04bb\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd"+
		"\u04bf\u0001\u0000\u0000\u0000\u04be\u04ba\u0001\u0000\u0000\u0000\u04be"+
		"\u04bf\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0"+
		"\u04c1\u0005Z\u0000\u0000\u04c1\u00a9\u0001\u0000\u0000\u0000\u04c2\u04c4"+
		"\u0003\u00aeW\u0000\u04c3\u04c5\u0003\u00ccf\u0000\u04c4\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5\u04ca\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c8\u0003\n\u0005\u0000\u04c7\u04c6\u0001\u0000\u0000"+
		"\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000"+
		"\u0000\u04c9\u04cb\u0005\u0084\u0000\u0000\u04ca\u04c7\u0001\u0000\u0000"+
		"\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cd\u0001\u0000\u0000"+
		"\u0000\u04cc\u04ce\u0003\u00b0X\u0000\u04cd\u04cc\u0001\u0000\u0000\u0000"+
		"\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u00ab\u0001\u0000\u0000\u0000"+
		"\u04cf\u04d1\u0003\u00aeW\u0000\u04d0\u04d2\u0003\u00ccf\u0000\u04d1\u04d0"+
		"\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000\u04d2\u04d3"+
		"\u0001\u0000\u0000\u0000\u04d3\u04d5\u0005\u0084\u0000\u0000\u04d4\u04d6"+
		"\u0003\u00b0X\u0000\u04d5\u04d4\u0001\u0000\u0000\u0000\u04d5\u04d6\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04d8\u0005"+
		"\u0080\u0000\u0000\u04d8\u00ad\u0001\u0000\u0000\u0000\u04d9\u04db\u0005"+
		"!\u0000\u0000\u04da\u04dc\u0007\u000f\u0000\u0000\u04db\u04da\u0001\u0000"+
		"\u0000\u0000\u04db\u04dc\u0001\u0000\u0000\u0000\u04dc\u00af\u0001\u0000"+
		"\u0000\u0000\u04dd\u04de\u0005~\u0000\u0000\u04de\u04df\u0003\u0096K\u0000"+
		"\u04df\u00b1\u0001\u0000\u0000\u0000\u04e0\u04e5\u0003\u00b4Z\u0000\u04e1"+
		"\u04e2\u0005z\u0000\u0000\u04e2\u04e4\u0003\u00b4Z\u0000\u04e3\u04e1\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e7\u0001\u0000\u0000\u0000\u04e5\u04e3\u0001"+
		"\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000\u0000\u04e6\u00b3\u0001"+
		"\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e8\u04eb\u0003"+
		"\u00b6[\u0000\u04e9\u04ea\u0005e\u0000\u0000\u04ea\u04ec\u0003\\.\u0000"+
		"\u04eb\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000\u0000"+
		"\u04ec\u00b5\u0001\u0000\u0000\u0000\u04ed\u04ee\u0005\u0084\u0000\u0000"+
		"\u04ee\u00b7\u0001\u0000\u0000\u0000\u04ef\u04f2\u0003\u00ba]\u0000\u04f0"+
		"\u04f2\u0003\u00be_\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f1\u04f0"+
		"\u0001\u0000\u0000\u0000\u04f2\u00b9\u0001\u0000\u0000\u0000\u04f3\u04f4"+
		"\u0005\u0084\u0000\u0000\u04f4\u00bb\u0001\u0000\u0000\u0000\u04f5\u04f7"+
		"\u0005,\u0000\u0000\u04f6\u04f5\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001"+
		"\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04fb\u0005"+
		"0\u0000\u0000\u04f9\u04fc\u0005\u0084\u0000\u0000\u04fa\u04fc\u0003\u00ba"+
		"]\u0000\u04fb\u04f9\u0001\u0000\u0000\u0000\u04fb\u04fa\u0001\u0000\u0000"+
		"\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000"+
		"\u0000\u04fd\u04ff\u0005Y\u0000\u0000\u04fe\u0500\u0003x<\u0000\u04ff"+
		"\u04fe\u0001\u0000\u0000\u0000\u04ff\u0500\u0001\u0000\u0000\u0000\u0500"+
		"\u0501\u0001\u0000\u0000\u0000\u0501\u0502\u0005Z\u0000\u0000\u0502\u00bd"+
		"\u0001\u0000\u0000\u0000\u0503\u0504\u0005\u0084\u0000\u0000\u0504\u00bf"+
		"\u0001\u0000\u0000\u0000\u0505\u0506\u00050\u0000\u0000\u0506\u0507\u0005"+
		"\u0084\u0000\u0000\u0507\u0508\u0005e\u0000\u0000\u0508\u0509\u0003\u00c2"+
		"a\u0000\u0509\u050a\u0005\u0080\u0000\u0000\u050a\u00c1\u0001\u0000\u0000"+
		"\u0000\u050b\u050d\u0003\n\u0005\u0000\u050c\u050b\u0001\u0000\u0000\u0000"+
		"\u050c\u050d\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000\u0000\u0000"+
		"\u050e\u050f\u0003\u00b8\\\u0000\u050f\u00c3\u0001\u0000\u0000\u0000\u0510"+
		"\u0516\u0005O\u0000\u0000\u0511\u0513\u0005L\u0000\u0000\u0512\u0511\u0001"+
		"\u0000\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000\u0513\u0514\u0001"+
		"\u0000\u0000\u0000\u0514\u0517\u0003\n\u0005\u0000\u0515\u0517\u0005\u007f"+
		"\u0000\u0000\u0516\u0512\u0001\u0000\u0000\u0000\u0516\u0515\u0001\u0000"+
		"\u0000\u0000\u0517\u0518\u0001\u0000\u0000\u0000\u0518\u0519\u0003\u0006"+
		"\u0003\u0000\u0519\u051a\u0005\u0080\u0000\u0000\u051a\u00c5\u0001\u0000"+
		"\u0000\u0000\u051b\u051d\u0003\u00ccf\u0000\u051c\u051b\u0001\u0000\u0000"+
		"\u0000\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u051e\u0001\u0000\u0000"+
		"\u0000\u051e\u051f\u0005O\u0000\u0000\u051f\u0521\u00050\u0000\u0000\u0520"+
		"\u0522\u0003\n\u0005\u0000\u0521\u0520\u0001\u0000\u0000\u0000\u0521\u0522"+
		"\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000\u0000\u0000\u0523\u0524"+
		"\u0003\u00b8\\\u0000\u0524\u0525\u0005\u0080\u0000\u0000\u0525\u00c7\u0001"+
		"\u0000\u0000\u0000\u0526\u0527\u0005\f\u0000\u0000\u0527\u0528\u0005U"+
		"\u0000\u0000\u0528\u0529\u0005\u0004\u0000\u0000\u0529\u052a\u0005V\u0000"+
		"\u0000\u052a\u052b\u0005\u0080\u0000\u0000\u052b\u00c9\u0001\u0000\u0000"+
		"\u0000\u052c\u052d\u0005$\u0000\u0000\u052d\u0534\u0005\u0004\u0000\u0000"+
		"\u052e\u0530\u0005Y\u0000\u0000\u052f\u0531\u0003x<\u0000\u0530\u052f"+
		"\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000\u0000\u0000\u0531\u0532"+
		"\u0001\u0000\u0000\u0000\u0532\u0535\u0005Z\u0000\u0000\u0533\u0535\u0003"+
		"z=\u0000\u0534\u052e\u0001\u0000\u0000\u0000\u0534\u0533\u0001\u0000\u0000"+
		"\u0000\u0535\u00cb\u0001\u0000\u0000\u0000\u0536\u0538\u0003\u00ceg\u0000"+
		"\u0537\u0536\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000"+
		"\u0539\u0537\u0001\u0000\u0000\u0000\u0539\u053a\u0001\u0000\u0000\u0000"+
		"\u053a\u00cd\u0001\u0000\u0000\u0000\u053b\u053c\u0005W\u0000\u0000\u053c"+
		"\u053e\u0005W\u0000\u0000\u053d\u053f\u0003\u00d2i\u0000\u053e\u053d\u0001"+
		"\u0000\u0000\u0000\u053e\u053f\u0001\u0000\u0000\u0000\u053f\u0540\u0001"+
		"\u0000\u0000\u0000\u0540\u0541\u0005X\u0000\u0000\u0541\u0544\u0005X\u0000"+
		"\u0000\u0542\u0544\u0003\u00d0h\u0000\u0543\u053b\u0001\u0000\u0000\u0000"+
		"\u0543\u0542\u0001\u0000\u0000\u0000\u0544\u00cf\u0001\u0000\u0000\u0000"+
		"\u0545\u0546\u0005\n\u0000\u0000\u0546\u0549\u0005U\u0000\u0000\u0547"+
		"\u054a\u0003\u00f6{\u0000\u0548\u054a\u0003\\.\u0000\u0549\u0547\u0001"+
		"\u0000\u0000\u0000\u0549\u0548\u0001\u0000\u0000\u0000\u054a\u054c\u0001"+
		"\u0000\u0000\u0000\u054b\u054d\u0005\u0083\u0000\u0000\u054c\u054b\u0001"+
		"\u0000\u0000\u0000\u054c\u054d\u0001\u0000\u0000\u0000\u054d\u054e\u0001"+
		"\u0000\u0000\u0000\u054e\u054f\u0005V\u0000\u0000\u054f\u00d1\u0001\u0000"+
		"\u0000\u0000\u0550\u0555\u0003\u00d4j\u0000\u0551\u0552\u0005z\u0000\u0000"+
		"\u0552\u0554\u0003\u00d4j\u0000\u0553\u0551\u0001\u0000\u0000\u0000\u0554"+
		"\u0557\u0001\u0000\u0000\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0555"+
		"\u0556\u0001\u0000\u0000\u0000\u0556\u0559\u0001\u0000\u0000\u0000\u0557"+
		"\u0555\u0001\u0000\u0000\u0000\u0558\u055a\u0005\u0083\u0000\u0000\u0559"+
		"\u0558\u0001\u0000\u0000\u0000\u0559\u055a\u0001\u0000\u0000\u0000\u055a"+
		"\u00d3\u0001\u0000\u0000\u0000\u055b\u055c\u0003\u00d6k\u0000\u055c\u055d"+
		"\u0005\u007f\u0000\u0000\u055d\u055f\u0001\u0000\u0000\u0000\u055e\u055b"+
		"\u0001\u0000\u0000\u0000\u055e\u055f\u0001\u0000\u0000\u0000\u055f\u0560"+
		"\u0001\u0000\u0000\u0000\u0560\u0562\u0005\u0084\u0000\u0000\u0561\u0563"+
		"\u0003\u00d8l\u0000\u0562\u0561\u0001\u0000\u0000\u0000\u0562\u0563\u0001"+
		"\u0000\u0000\u0000\u0563\u00d5\u0001\u0000\u0000\u0000\u0564\u0565\u0005"+
		"\u0084\u0000\u0000\u0565\u00d7\u0001\u0000\u0000\u0000\u0566\u0568\u0005"+
		"U\u0000\u0000\u0567\u0569\u0003\u00dam\u0000\u0568\u0567\u0001\u0000\u0000"+
		"\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000"+
		"\u0000\u056a\u056b\u0005V\u0000\u0000\u056b\u00d9\u0001\u0000\u0000\u0000"+
		"\u056c\u056e\u0003\u00dcn\u0000\u056d\u056c\u0001\u0000\u0000\u0000\u056e"+
		"\u056f\u0001\u0000\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u056f"+
		"\u0570\u0001\u0000\u0000\u0000\u0570\u00db\u0001\u0000\u0000\u0000\u0571"+
		"\u0572\u0005U\u0000\u0000\u0572\u0573\u0003\u00dam\u0000\u0573\u0574\u0005"+
		"V\u0000\u0000\u0574\u0583\u0001\u0000\u0000\u0000\u0575\u0576\u0005W\u0000"+
		"\u0000\u0576\u0577\u0003\u00dam\u0000\u0577\u0578\u0005X\u0000\u0000\u0578"+
		"\u0583\u0001\u0000\u0000\u0000\u0579\u057a\u0005Y\u0000\u0000\u057a\u057b"+
		"\u0003\u00dam\u0000\u057b\u057c\u0005Z\u0000\u0000\u057c\u0583\u0001\u0000"+
		"\u0000\u0000\u057d\u057f\b\u0010\u0000\u0000\u057e\u057d\u0001\u0000\u0000"+
		"\u0000\u057f\u0580\u0001\u0000\u0000\u0000\u0580\u057e\u0001\u0000\u0000"+
		"\u0000\u0580\u0581\u0001\u0000\u0000\u0000\u0581\u0583\u0001\u0000\u0000"+
		"\u0000\u0582\u0571\u0001\u0000\u0000\u0000\u0582\u0575\u0001\u0000\u0000"+
		"\u0000\u0582\u0579\u0001\u0000\u0000\u0000\u0582\u057e\u0001\u0000\u0000"+
		"\u0000\u0583\u00dd\u0001\u0000\u0000\u0000\u0584\u0589\u0003\u00e0p\u0000"+
		"\u0585\u0586\u0005z\u0000\u0000\u0586\u0588\u0003\u00e0p\u0000\u0587\u0585"+
		"\u0001\u0000\u0000\u0000\u0588\u058b\u0001\u0000\u0000\u0000\u0589\u0587"+
		"\u0001\u0000\u0000\u0000\u0589\u058a\u0001\u0000\u0000\u0000\u058a\u00df"+
		"\u0001\u0000\u0000\u0000\u058b\u0589\u0001\u0000\u0000\u0000\u058c\u058e"+
		"\u0003\u00e2q\u0000\u058d\u058f\u0003\u010c\u0086\u0000\u058e\u058d\u0001"+
		"\u0000\u0000\u0000\u058e\u058f\u0001\u0000\u0000\u0000\u058f\u00e1\u0001"+
		"\u0000\u0000\u0000\u0590\u0596\u0003\u00e4r\u0000\u0591\u0592\u0003\u00e6"+
		"s\u0000\u0592\u0593\u0003\u00e8t\u0000\u0593\u0594\u0003\u00eau\u0000"+
		"\u0594\u0596\u0001\u0000\u0000\u0000\u0595\u0590\u0001\u0000\u0000\u0000"+
		"\u0595\u0591\u0001\u0000\u0000\u0000\u0596\u00e3\u0001\u0000\u0000\u0000"+
		"\u0597\u0599\u0003\u00ecv\u0000\u0598\u059a\u0005\u0016\u0000\u0000\u0599"+
		"\u0598\u0001\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a"+
		"\u059c\u0001\u0000\u0000\u0000\u059b\u0597\u0001\u0000\u0000\u0000\u059c"+
		"\u059f\u0001\u0000\u0000\u0000\u059d\u059b\u0001\u0000\u0000\u0000\u059d"+
		"\u059e\u0001\u0000\u0000\u0000\u059e\u05a0\u0001\u0000\u0000\u0000\u059f"+
		"\u059d\u0001\u0000\u0000\u0000\u05a0\u05a1\u0003\u00e6s\u0000\u05a1\u00e5"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a3\u0006s\uffff\uffff\u0000\u05a3\u05a5"+
		"\u0003\u00f4z\u0000\u05a4\u05a6\u0003\u00ccf\u0000\u05a5\u05a4\u0001\u0000"+
		"\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000\u0000\u05a6\u05ae\u0001\u0000"+
		"\u0000\u0000\u05a7\u05ae\u0003\u0178\u00bc\u0000\u05a8\u05ae\u0003\u017a"+
		"\u00bd\u0000\u05a9\u05aa\u0005U\u0000\u0000\u05aa\u05ab\u0003\u00e4r\u0000"+
		"\u05ab\u05ac\u0005V\u0000\u0000\u05ac\u05ae\u0001\u0000\u0000\u0000\u05ad"+
		"\u05a2\u0001\u0000\u0000\u0000\u05ad\u05a7\u0001\u0000\u0000\u0000\u05ad"+
		"\u05a8\u0001\u0000\u0000\u0000\u05ad\u05a9\u0001\u0000\u0000\u0000\u05ae"+
		"\u05bd\u0001\u0000\u0000\u0000\u05af\u05b9\n\u0002\u0000\u0000\u05b0\u05ba"+
		"\u0003\u00e8t\u0000\u05b1\u05b3\u0005W\u0000\u0000\u05b2\u05b4\u0003\\"+
		".\u0000\u05b3\u05b2\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001\u0000\u0000"+
		"\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5\u05b7\u0005X\u0000\u0000"+
		"\u05b6\u05b8\u0003\u00ccf\u0000\u05b7\u05b6\u0001\u0000\u0000\u0000\u05b7"+
		"\u05b8\u0001\u0000\u0000\u0000\u05b8\u05ba\u0001\u0000\u0000\u0000\u05b9"+
		"\u05b0\u0001\u0000\u0000\u0000\u05b9\u05b1\u0001\u0000\u0000\u0000\u05ba"+
		"\u05bc\u0001\u0000\u0000\u0000\u05bb\u05af\u0001\u0000\u0000\u0000\u05bc"+
		"\u05bf\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000\u05bd"+
		"\u05be\u0001\u0000\u0000\u0000\u05be\u00e7\u0001\u0000\u0000\u0000\u05bf"+
		"\u05bd\u0001\u0000\u0000\u0000\u05c0\u05c2\u0005U\u0000\u0000\u05c1\u05c3"+
		"\u0003\u0102\u0081\u0000\u05c2\u05c1\u0001\u0000\u0000\u0000\u05c2\u05c3"+
		"\u0001\u0000\u0000\u0000\u05c3\u05c4\u0001\u0000\u0000\u0000\u05c4\u05c6"+
		"\u0005V\u0000\u0000\u05c5\u05c7\u0003\u00eew\u0000\u05c6\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c9\u0001\u0000"+
		"\u0000\u0000\u05c8\u05ca\u0003\u00f2y\u0000\u05c9\u05c8\u0001\u0000\u0000"+
		"\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cc\u0001\u0000\u0000"+
		"\u0000\u05cb\u05cd\u0003\u0172\u00b9\u0000\u05cc\u05cb\u0001\u0000\u0000"+
		"\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000\u05cd\u05cf\u0001\u0000\u0000"+
		"\u0000\u05ce\u05d0\u0003\u00ccf\u0000\u05cf\u05ce\u0001\u0000\u0000\u0000"+
		"\u05cf\u05d0\u0001\u0000\u0000\u0000\u05d0\u00e9\u0001\u0000\u0000\u0000"+
		"\u05d1\u05d2\u0005|\u0000\u0000\u05d2\u05d4\u0003\u0098L\u0000\u05d3\u05d5"+
		"\u0003\u00f8|\u0000\u05d4\u05d3\u0001\u0000\u0000\u0000\u05d4\u05d5\u0001"+
		"\u0000\u0000\u0000\u05d5\u00eb\u0001\u0000\u0000\u0000\u05d6\u05d8\u0007"+
		"\u0011\u0000\u0000\u05d7\u05d9\u0003\u00ccf\u0000\u05d8\u05d7\u0001\u0000"+
		"\u0000\u0000\u05d8\u05d9\u0001\u0000\u0000\u0000\u05d9\u05e5\u0001\u0000"+
		"\u0000\u0000\u05da\u05dc\u0003\n\u0005\u0000\u05db\u05da\u0001\u0000\u0000"+
		"\u0000\u05db\u05dc\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000"+
		"\u0000\u05dd\u05df\u0005]\u0000\u0000\u05de\u05e0\u0003\u00ccf\u0000\u05df"+
		"\u05de\u0001\u0000\u0000\u0000\u05df\u05e0\u0001\u0000\u0000\u0000\u05e0"+
		"\u05e2\u0001\u0000\u0000\u0000\u05e1\u05e3\u0003\u00eew\u0000\u05e2\u05e1"+
		"\u0001\u0000\u0000\u0000\u05e2\u05e3\u0001\u0000\u0000\u0000\u05e3\u05e5"+
		"\u0001\u0000\u0000\u0000\u05e4\u05d6\u0001\u0000\u0000\u0000\u05e4\u05db"+
		"\u0001\u0000\u0000\u0000\u05e5\u00ed\u0001\u0000\u0000\u0000\u05e6\u05e8"+
		"\u0003\u00f0x\u0000\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e8\u05e9\u0001"+
		"\u0000\u0000\u0000\u05e9\u05e7\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001"+
		"\u0000\u0000\u0000\u05ea\u00ef\u0001\u0000\u0000\u0000\u05eb\u05ec\u0007"+
		"\u0012\u0000\u0000\u05ec\u00f1\u0001\u0000\u0000\u0000\u05ed\u05ee\u0007"+
		"\u0011\u0000\u0000\u05ee\u00f3\u0001\u0000\u0000\u0000\u05ef\u05f1\u0005"+
		"\u0083\u0000\u0000\u05f0\u05ef\u0001\u0000\u0000\u0000\u05f0\u05f1\u0001"+
		"\u0000\u0000\u0000\u05f1\u05f2\u0001\u0000\u0000\u0000\u05f2\u05f3\u0003"+
		"\u0004\u0002\u0000\u05f3\u00f5\u0001\u0000\u0000\u0000\u05f4\u05f6\u0003"+
		"\u0096K\u0000\u05f5\u05f7\u0003\u00f8|\u0000\u05f6\u05f5\u0001\u0000\u0000"+
		"\u0000\u05f6\u05f7\u0001\u0000\u0000\u0000\u05f7\u00f7\u0001\u0000\u0000"+
		"\u0000\u05f8\u0601\u0003\u00fa}\u0000\u05f9\u05fb\u0003\u00fc~\u0000\u05fa"+
		"\u05f9\u0001\u0000\u0000\u0000\u05fa\u05fb\u0001\u0000\u0000\u0000\u05fb"+
		"\u05fc\u0001\u0000\u0000\u0000\u05fc\u05fd\u0003\u00e8t\u0000\u05fd\u05fe"+
		"\u0003\u00eau\u0000\u05fe\u0601\u0001\u0000\u0000\u0000\u05ff\u0601\u0003"+
		"\u00fe\u007f\u0000\u0600\u05f8\u0001\u0000\u0000\u0000\u0600\u05fa\u0001"+
		"\u0000\u0000\u0000\u0600\u05ff\u0001\u0000\u0000\u0000\u0601\u00f9\u0001"+
		"\u0000\u0000\u0000\u0602\u060c\u0003\u00fc~\u0000\u0603\u0605\u0003\u00ec"+
		"v\u0000\u0604\u0603\u0001\u0000\u0000\u0000\u0605\u0606\u0001\u0000\u0000"+
		"\u0000\u0606\u0604\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000"+
		"\u0000\u0607\u0609\u0001\u0000\u0000\u0000\u0608\u060a\u0003\u00fc~\u0000"+
		"\u0609\u0608\u0001\u0000\u0000\u0000\u0609\u060a\u0001\u0000\u0000\u0000"+
		"\u060a\u060c\u0001\u0000\u0000\u0000\u060b\u0602\u0001\u0000\u0000\u0000"+
		"\u060b\u0604\u0001\u0000\u0000\u0000\u060c\u00fb\u0001\u0000\u0000\u0000"+
		"\u060d\u060e\u0006~\uffff\uffff\u0000\u060e\u061c\u0003\u00e8t\u0000\u060f"+
		"\u0611\u0005W\u0000\u0000\u0610\u0612\u0003\\.\u0000\u0611\u0610\u0001"+
		"\u0000\u0000\u0000\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0613\u0001"+
		"\u0000\u0000\u0000\u0613\u0615\u0005X\u0000\u0000\u0614\u0616\u0003\u00cc"+
		"f\u0000\u0615\u0614\u0001\u0000\u0000\u0000\u0615\u0616\u0001\u0000\u0000"+
		"\u0000\u0616\u061c\u0001\u0000\u0000\u0000\u0617\u0618\u0005U\u0000\u0000"+
		"\u0618\u0619\u0003\u00fa}\u0000\u0619\u061a\u0005V\u0000\u0000\u061a\u061c"+
		"\u0001\u0000\u0000\u0000\u061b\u060d\u0001\u0000\u0000\u0000\u061b\u060f"+
		"\u0001\u0000\u0000\u0000\u061b\u0617\u0001\u0000\u0000\u0000\u061c\u062c"+
		"\u0001\u0000\u0000\u0000\u061d\u0628\n\u0004\u0000\u0000\u061e\u0629\u0003"+
		"\u00e8t\u0000\u061f\u0620\u0003\u00fc~\u0000\u0620\u0622\u0005W\u0000"+
		"\u0000\u0621\u0623\u0003\\.\u0000\u0622\u0621\u0001\u0000\u0000\u0000"+
		"\u0622\u0623\u0001\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000\u0000"+
		"\u0624\u0626\u0005X\u0000\u0000\u0625\u0627\u0003\u00ccf\u0000\u0626\u0625"+
		"\u0001\u0000\u0000\u0000\u0626\u0627\u0001\u0000\u0000\u0000\u0627\u0629"+
		"\u0001\u0000\u0000\u0000\u0628\u061e\u0001\u0000\u0000\u0000\u0628\u061f"+
		"\u0001\u0000\u0000\u0000\u0629\u062b\u0001\u0000\u0000\u0000\u062a\u061d"+
		"\u0001\u0000\u0000\u0000\u062b\u062e\u0001\u0000\u0000\u0000\u062c\u062a"+
		"\u0001\u0000\u0000\u0000\u062c\u062d\u0001\u0000\u0000\u0000\u062d\u00fd"+
		"\u0001\u0000\u0000\u0000\u062e\u062c\u0001\u0000\u0000\u0000\u062f\u0631"+
		"\u0003\u00ecv\u0000\u0630\u062f\u0001\u0000\u0000\u0000\u0631\u0634\u0001"+
		"\u0000\u0000\u0000\u0632\u0630\u0001\u0000\u0000\u0000\u0632\u0633\u0001"+
		"\u0000\u0000\u0000\u0633\u0635\u0001\u0000\u0000\u0000\u0634\u0632\u0001"+
		"\u0000\u0000\u0000\u0635\u0636\u0003\u0100\u0080\u0000\u0636\u00ff\u0001"+
		"\u0000\u0000\u0000\u0637\u0638\u0006\u0080\uffff\uffff\u0000\u0638\u0639"+
		"\u0005\u0083\u0000\u0000\u0639\u0648\u0001\u0000\u0000\u0000\u063a\u0644"+
		"\n\u0002\u0000\u0000\u063b\u0645\u0003\u00e8t\u0000\u063c\u063e\u0005"+
		"W\u0000\u0000\u063d\u063f\u0003\\.\u0000\u063e\u063d\u0001\u0000\u0000"+
		"\u0000\u063e\u063f\u0001\u0000\u0000\u0000\u063f\u0640\u0001\u0000\u0000"+
		"\u0000\u0640\u0642\u0005X\u0000\u0000\u0641\u0643\u0003\u00ccf\u0000\u0642"+
		"\u0641\u0001\u0000\u0000\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643"+
		"\u0645\u0001\u0000\u0000\u0000\u0644\u063b\u0001\u0000\u0000\u0000\u0644"+
		"\u063c\u0001\u0000\u0000\u0000\u0645\u0647\u0001\u0000\u0000\u0000\u0646"+
		"\u063a\u0001\u0000\u0000\u0000\u0647\u064a\u0001\u0000\u0000\u0000\u0648"+
		"\u0646\u0001\u0000\u0000\u0000\u0648\u0649\u0001\u0000\u0000\u0000\u0649"+
		"\u0101\u0001\u0000\u0000\u0000\u064a\u0648\u0001\u0000\u0000\u0000\u064b"+
		"\u0650\u0003\u0104\u0082\u0000\u064c\u064e\u0005z\u0000\u0000\u064d\u064c"+
		"\u0001\u0000\u0000\u0000\u064d\u064e\u0001\u0000\u0000\u0000\u064e\u064f"+
		"\u0001\u0000\u0000\u0000\u064f\u0651\u0005\u0083\u0000\u0000\u0650\u064d"+
		"\u0001\u0000\u0000\u0000\u0650\u0651\u0001\u0000\u0000\u0000\u0651\u0103"+
		"\u0001\u0000\u0000\u0000\u0652\u0657\u0003\u0106\u0083\u0000\u0653\u0654"+
		"\u0005z\u0000\u0000\u0654\u0656\u0003\u0106\u0083\u0000\u0655\u0653\u0001"+
		"\u0000\u0000\u0000\u0656\u0659\u0001\u0000\u0000\u0000\u0657\u0655\u0001"+
		"\u0000\u0000\u0000\u0657\u0658\u0001\u0000\u0000\u0000\u0658\u0105\u0001"+
		"\u0000\u0000\u0000\u0659\u0657\u0001\u0000\u0000\u0000\u065a\u065c\u0003"+
		"\u00ccf\u0000\u065b\u065a\u0001\u0000\u0000\u0000\u065b\u065c\u0001\u0000"+
		"\u0000\u0000\u065c\u065d\u0001\u0000\u0000\u0000\u065d\u0662\u0003\u008a"+
		"E\u0000\u065e\u0663\u0003\u00e2q\u0000\u065f\u0661\u0003\u00f8|\u0000"+
		"\u0660\u065f\u0001\u0000\u0000\u0000\u0660\u0661\u0001\u0000\u0000\u0000"+
		"\u0661\u0663\u0001\u0000\u0000\u0000\u0662\u065e\u0001\u0000\u0000\u0000"+
		"\u0662\u0660\u0001\u0000\u0000\u0000\u0663\u0666\u0001\u0000\u0000\u0000"+
		"\u0664\u0665\u0005e\u0000\u0000\u0665\u0667\u0003\u0110\u0088\u0000\u0666"+
		"\u0664\u0001\u0000\u0000\u0000\u0666\u0667\u0001\u0000\u0000\u0000\u0667"+
		"\u0107\u0001\u0000\u0000\u0000\u0668\u066a\u0003\u00ccf\u0000\u0669\u0668"+
		"\u0001\u0000\u0000\u0000\u0669\u066a\u0001\u0000\u0000\u0000\u066a\u066c"+
		"\u0001\u0000\u0000\u0000\u066b\u066d\u0003\u008aE\u0000\u066c\u066b\u0001"+
		"\u0000\u0000\u0000\u066c\u066d\u0001\u0000\u0000\u0000\u066d\u066e\u0001"+
		"\u0000\u0000\u0000\u066e\u0670\u0003\u00e2q\u0000\u066f\u0671\u0003\u012a"+
		"\u0095\u0000\u0670\u066f\u0001\u0000\u0000\u0000\u0670\u0671\u0001\u0000"+
		"\u0000\u0000\u0671\u0672\u0001\u0000\u0000\u0000\u0672\u0673\u0003\u010a"+
		"\u0085\u0000\u0673\u0109\u0001\u0000\u0000\u0000\u0674\u0676\u0003\u0142"+
		"\u00a1\u0000\u0675\u0674\u0001\u0000\u0000\u0000\u0675\u0676\u0001\u0000"+
		"\u0000\u0000\u0676\u0677\u0001\u0000\u0000\u0000\u0677\u067d\u0003d2\u0000"+
		"\u0678\u067d\u0003\u0168\u00b4\u0000\u0679\u067a\u0005e\u0000\u0000\u067a"+
		"\u067b\u0007\u0013\u0000\u0000\u067b\u067d\u0005\u0080\u0000\u0000\u067c"+
		"\u0675\u0001\u0000\u0000\u0000\u067c\u0678\u0001\u0000\u0000\u0000\u067c"+
		"\u0679\u0001\u0000\u0000\u0000\u067d\u010b\u0001\u0000\u0000\u0000\u067e"+
		"\u0684\u0003\u010e\u0087\u0000\u067f\u0680\u0005U\u0000\u0000\u0680\u0681"+
		"\u0003\"\u0011\u0000\u0681\u0682\u0005V\u0000\u0000\u0682\u0684\u0001"+
		"\u0000\u0000\u0000\u0683\u067e\u0001\u0000\u0000\u0000\u0683\u067f\u0001"+
		"\u0000\u0000\u0000\u0684\u010d\u0001\u0000\u0000\u0000\u0685\u0686\u0005"+
		"e\u0000\u0000\u0686\u0689\u0003\u0110\u0088\u0000\u0687\u0689\u0003\u0114"+
		"\u008a\u0000\u0688\u0685\u0001\u0000\u0000\u0000\u0688\u0687\u0001\u0000"+
		"\u0000\u0000\u0689\u010f\u0001\u0000\u0000\u0000\u068a\u068e\u0003\u0182"+
		"\u00c1\u0000\u068b\u068e\u0003V+\u0000\u068c\u068e\u0003\u0114\u008a\u0000"+
		"\u068d\u068a\u0001\u0000\u0000\u0000\u068d\u068b\u0001\u0000\u0000\u0000"+
		"\u068d\u068c\u0001\u0000\u0000\u0000\u068e\u0111\u0001\u0000\u0000\u0000"+
		"\u068f\u0691\u0003\u0110\u0088\u0000\u0690\u0692\u0005\u0083\u0000\u0000"+
		"\u0691\u0690\u0001\u0000\u0000\u0000\u0691\u0692\u0001\u0000\u0000\u0000"+
		"\u0692\u069a\u0001\u0000\u0000\u0000\u0693\u0694\u0005z\u0000\u0000\u0694"+
		"\u0696\u0003\u0110\u0088\u0000\u0695\u0697\u0005\u0083\u0000\u0000\u0696"+
		"\u0695\u0001\u0000\u0000\u0000\u0696\u0697\u0001\u0000\u0000\u0000\u0697"+
		"\u0699\u0001\u0000\u0000\u0000\u0698\u0693\u0001\u0000\u0000\u0000\u0699"+
		"\u069c\u0001\u0000\u0000\u0000\u069a\u0698\u0001\u0000\u0000\u0000\u069a"+
		"\u069b\u0001\u0000\u0000\u0000\u069b\u0113\u0001\u0000\u0000\u0000\u069c"+
		"\u069a\u0001\u0000\u0000\u0000\u069d\u06a2\u0005Y\u0000\u0000\u069e\u06a0"+
		"\u0003\u0112\u0089\u0000\u069f\u06a1\u0005z\u0000\u0000\u06a0\u069f\u0001"+
		"\u0000\u0000\u0000\u06a0\u06a1\u0001\u0000\u0000\u0000\u06a1\u06a3\u0001"+
		"\u0000\u0000\u0000\u06a2\u069e\u0001\u0000\u0000\u0000\u06a2\u06a3\u0001"+
		"\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000\u06a4\u06a5\u0005"+
		"Z\u0000\u0000\u06a5\u0115\u0001\u0000\u0000\u0000\u06a6\u06a9\u0005\u0084"+
		"\u0000\u0000\u06a7\u06a9\u0003\u0156\u00ab\u0000\u06a8\u06a6\u0001\u0000"+
		"\u0000\u0000\u06a8\u06a7\u0001\u0000\u0000\u0000\u06a9\u0117\u0001\u0000"+
		"\u0000\u0000\u06aa\u06ab\u0003\u011a\u008d\u0000\u06ab\u06ad\u0005Y\u0000"+
		"\u0000\u06ac\u06ae\u0003\u0122\u0091\u0000\u06ad\u06ac\u0001\u0000\u0000"+
		"\u0000\u06ad\u06ae\u0001\u0000\u0000\u0000\u06ae\u06af\u0001\u0000\u0000"+
		"\u0000\u06af\u06b0\u0005Z\u0000\u0000\u06b0\u0119\u0001\u0000\u0000\u0000"+
		"\u06b1\u06b3\u0003\u0120\u0090\u0000\u06b2\u06b4\u0003\u00ccf\u0000\u06b3"+
		"\u06b2\u0001\u0000\u0000\u0000\u06b3\u06b4\u0001\u0000\u0000\u0000\u06b4"+
		"\u06b9\u0001\u0000\u0000\u0000\u06b5\u06b7\u0003\u011c\u008e\u0000\u06b6"+
		"\u06b8\u0003\u011e\u008f\u0000\u06b7\u06b6\u0001\u0000\u0000\u0000\u06b7"+
		"\u06b8\u0001\u0000\u0000\u0000\u06b8\u06ba\u0001\u0000\u0000\u0000\u06b9"+
		"\u06b5\u0001\u0000\u0000\u0000\u06b9\u06ba\u0001\u0000\u0000\u0000\u06ba"+
		"\u06bc\u0001\u0000\u0000\u0000\u06bb\u06bd\u0003\u0130\u0098\u0000\u06bc"+
		"\u06bb\u0001\u0000\u0000\u0000\u06bc\u06bd\u0001\u0000\u0000\u0000\u06bd"+
		"\u06c9\u0001\u0000\u0000\u0000\u06be\u06c0\u0005M\u0000\u0000\u06bf\u06c1"+
		"\u0003\u00ccf\u0000\u06c0\u06bf\u0001\u0000\u0000\u0000\u06c0\u06c1\u0001"+
		"\u0000\u0000\u0000\u06c1\u06c6\u0001\u0000\u0000\u0000\u06c2\u06c4\u0003"+
		"\u011c\u008e\u0000\u06c3\u06c5\u0003\u011e\u008f\u0000\u06c4\u06c3\u0001"+
		"\u0000\u0000\u0000\u06c4\u06c5\u0001\u0000\u0000\u0000\u06c5\u06c7\u0001"+
		"\u0000\u0000\u0000\u06c6\u06c2\u0001\u0000\u0000\u0000\u06c6\u06c7\u0001"+
		"\u0000\u0000\u0000\u06c7\u06c9\u0001\u0000\u0000\u0000\u06c8\u06b1\u0001"+
		"\u0000\u0000\u0000\u06c8\u06be\u0001\u0000\u0000\u0000\u06c9\u011b\u0001"+
		"\u0000\u0000\u0000\u06ca\u06cc\u0003\n\u0005\u0000\u06cb\u06ca\u0001\u0000"+
		"\u0000\u0000\u06cb\u06cc\u0001\u0000\u0000\u0000\u06cc\u06cd\u0001\u0000"+
		"\u0000\u0000\u06cd\u06ce\u0003\u0116\u008b\u0000\u06ce\u011d\u0001\u0000"+
		"\u0000\u0000\u06cf\u06d0\u0005&\u0000\u0000\u06d0\u011f\u0001\u0000\u0000"+
		"\u0000\u06d1\u06d2\u0007\u000f\u0000\u0000\u06d2\u0121\u0001\u0000\u0000"+
		"\u0000\u06d3\u06d8\u0003\u0124\u0092\u0000\u06d4\u06d5\u0003\u013a\u009d"+
		"\u0000\u06d5\u06d6\u0005~\u0000\u0000\u06d6\u06d8\u0001\u0000\u0000\u0000"+
		"\u06d7\u06d3\u0001\u0000\u0000\u0000\u06d7\u06d4\u0001\u0000\u0000\u0000"+
		"\u06d8\u06d9\u0001\u0000\u0000\u0000\u06d9\u06d7\u0001\u0000\u0000\u0000"+
		"\u06d9\u06da\u0001\u0000\u0000\u0000\u06da\u0123\u0001\u0000\u0000\u0000"+
		"\u06db\u06dd\u0003\u00ccf\u0000\u06dc\u06db\u0001\u0000\u0000\u0000\u06dc"+
		"\u06dd\u0001\u0000\u0000\u0000\u06dd\u06df\u0001\u0000\u0000\u0000\u06de"+
		"\u06e0\u0003\u008aE\u0000\u06df\u06de\u0001\u0000\u0000\u0000\u06df\u06e0"+
		"\u0001\u0000\u0000\u0000\u06e0\u06e2\u0001\u0000\u0000\u0000\u06e1\u06e3"+
		"\u0003\u0126\u0093\u0000\u06e2\u06e1\u0001\u0000\u0000\u0000\u06e2\u06e3"+
		"\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000\u06e4\u06ec"+
		"\u0005\u0080\u0000\u0000\u06e5\u06ec\u0003\u0108\u0084\u0000\u06e6\u06ec"+
		"\u0003\u00c4b\u0000\u06e7\u06ec\u0003\u0082A\u0000\u06e8\u06ec\u0003\u014e"+
		"\u00a7\u0000\u06e9\u06ec\u0003~?\u0000\u06ea\u06ec\u0003\u0084B\u0000"+
		"\u06eb\u06dc\u0001\u0000\u0000\u0000\u06eb\u06e5\u0001\u0000\u0000\u0000"+
		"\u06eb\u06e6\u0001\u0000\u0000\u0000\u06eb\u06e7\u0001\u0000\u0000\u0000"+
		"\u06eb\u06e8\u0001\u0000\u0000\u0000\u06eb\u06e9\u0001\u0000\u0000\u0000"+
		"\u06eb\u06ea\u0001\u0000\u0000\u0000\u06ec\u0125\u0001\u0000\u0000\u0000"+
		"\u06ed\u06f2\u0003\u0128\u0094\u0000\u06ee\u06ef\u0005z\u0000\u0000\u06ef"+
		"\u06f1\u0003\u0128\u0094\u0000\u06f0\u06ee\u0001\u0000\u0000\u0000\u06f1"+
		"\u06f4\u0001\u0000\u0000\u0000\u06f2\u06f0\u0001\u0000\u0000\u0000\u06f2"+
		"\u06f3\u0001\u0000\u0000\u0000\u06f3\u0127\u0001\u0000\u0000\u0000\u06f4"+
		"\u06f2\u0001\u0000\u0000\u0000\u06f5\u06ff\u0003\u00e2q\u0000\u06f6\u06f8"+
		"\u0003\u012a\u0095\u0000\u06f7\u06f6\u0001\u0000\u0000\u0000\u06f7\u06f8"+
		"\u0001\u0000\u0000\u0000\u06f8\u06fa\u0001\u0000\u0000\u0000\u06f9\u06fb"+
		"\u0003\u012e\u0097\u0000\u06fa\u06f9\u0001\u0000\u0000\u0000\u06fa\u06fb"+
		"\u0001\u0000\u0000\u0000\u06fb\u0700\u0001\u0000\u0000\u0000\u06fc\u06fe"+
		"\u0003\u010e\u0087\u0000\u06fd\u06fc\u0001\u0000\u0000\u0000\u06fd\u06fe"+
		"\u0001\u0000\u0000\u0000\u06fe\u0700\u0001\u0000\u0000\u0000\u06ff\u06f7"+
		"\u0001\u0000\u0000\u0000\u06ff\u06fd\u0001\u0000\u0000\u0000\u0700\u070a"+
		"\u0001\u0000\u0000\u0000\u0701\u0703\u0005\u0084\u0000\u0000\u0702\u0701"+
		"\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000\u0000\u0703\u0705"+
		"\u0001\u0000\u0000\u0000\u0704\u0706\u0003\u00ccf\u0000\u0705\u0704\u0001"+
		"\u0000\u0000\u0000\u0705\u0706\u0001\u0000\u0000\u0000\u0706\u0707\u0001"+
		"\u0000\u0000\u0000\u0707\u0708\u0005~\u0000\u0000\u0708\u070a\u0003\\"+
		".\u0000\u0709\u06f5\u0001\u0000\u0000\u0000\u0709\u0702\u0001\u0000\u0000"+
		"\u0000\u070a\u0129\u0001\u0000\u0000\u0000\u070b\u070d\u0003\u012c\u0096"+
		"\u0000\u070c\u070b\u0001\u0000\u0000\u0000\u070d\u070e\u0001\u0000\u0000"+
		"\u0000\u070e\u070c\u0001\u0000\u0000\u0000\u070e\u070f\u0001\u0000\u0000"+
		"\u0000\u070f\u012b\u0001\u0000\u0000\u0000\u0710\u0711\u0007\u0014\u0000"+
		"\u0000\u0711\u012d\u0001\u0000\u0000\u0000\u0712\u0713\u0005e\u0000\u0000"+
		"\u0713\u0714\u0005\u0086\u0000\u0000\u0714\u0715\u0006\u0097\uffff\uffff"+
		"\u0000\u0715\u012f\u0001\u0000\u0000\u0000\u0716\u0717\u0005~\u0000\u0000"+
		"\u0717\u0718\u0003\u0132\u0099\u0000\u0718\u0131\u0001\u0000\u0000\u0000"+
		"\u0719\u071b\u0003\u0134\u009a\u0000\u071a\u071c\u0005\u0083\u0000\u0000"+
		"\u071b\u071a\u0001\u0000\u0000\u0000\u071b\u071c\u0001\u0000\u0000\u0000"+
		"\u071c\u0724\u0001\u0000\u0000\u0000\u071d\u071e\u0005z\u0000\u0000\u071e"+
		"\u0720\u0003\u0134\u009a\u0000\u071f\u0721\u0005\u0083\u0000\u0000\u0720"+
		"\u071f\u0001\u0000\u0000\u0000\u0720\u0721\u0001\u0000\u0000\u0000\u0721"+
		"\u0723\u0001\u0000\u0000\u0000\u0722\u071d\u0001\u0000\u0000\u0000\u0723"+
		"\u0726\u0001\u0000\u0000\u0000\u0724\u0722\u0001\u0000\u0000\u0000\u0724"+
		"\u0725\u0001\u0000\u0000\u0000\u0725\u0133\u0001\u0000\u0000\u0000\u0726"+
		"\u0724\u0001\u0000\u0000\u0000\u0727\u0729\u0003\u00ccf\u0000\u0728\u0727"+
		"\u0001\u0000\u0000\u0000\u0728\u0729\u0001\u0000\u0000\u0000\u0729\u0736"+
		"\u0001\u0000\u0000\u0000\u072a\u0737\u0003\u0138\u009c\u0000\u072b\u072d"+
		"\u0005P\u0000\u0000\u072c\u072e\u0003\u013a\u009d\u0000\u072d\u072c\u0001"+
		"\u0000\u0000\u0000\u072d\u072e\u0001\u0000\u0000\u0000\u072e\u072f\u0001"+
		"\u0000\u0000\u0000\u072f\u0737\u0003\u0138\u009c\u0000\u0730\u0732\u0003"+
		"\u013a\u009d\u0000\u0731\u0733\u0005P\u0000\u0000\u0732\u0731\u0001\u0000"+
		"\u0000\u0000\u0732\u0733\u0001\u0000\u0000\u0000\u0733\u0734\u0001\u0000"+
		"\u0000\u0000\u0734\u0735\u0003\u0138\u009c\u0000\u0735\u0737\u0001\u0000"+
		"\u0000\u0000\u0736\u072a\u0001\u0000\u0000\u0000\u0736\u072b\u0001\u0000"+
		"\u0000\u0000\u0736\u0730\u0001\u0000\u0000\u0000\u0737\u0135\u0001\u0000"+
		"\u0000\u0000\u0738\u073a\u0003\n\u0005\u0000\u0739\u0738\u0001\u0000\u0000"+
		"\u0000\u0739\u073a\u0001\u0000\u0000\u0000\u073a\u073b\u0001\u0000\u0000"+
		"\u0000\u073b\u073e\u0003\u0116\u008b\u0000\u073c\u073e\u0003\u00a2Q\u0000"+
		"\u073d\u0739\u0001\u0000\u0000\u0000\u073d\u073c\u0001\u0000\u0000\u0000"+
		"\u073e\u0137\u0001\u0000\u0000\u0000\u073f\u0740\u0003\u0136\u009b\u0000"+
		"\u0740\u0139\u0001\u0000\u0000\u0000\u0741\u0742\u0007\u0015\u0000\u0000"+
		"\u0742\u013b\u0001\u0000\u0000\u0000\u0743\u0744\u00054\u0000\u0000\u0744"+
		"\u0745\u0003\u013e\u009f\u0000\u0745\u013d\u0001\u0000\u0000\u0000\u0746"+
		"\u0748\u0003\u0096K\u0000\u0747\u0749\u0003\u0140\u00a0\u0000\u0748\u0747"+
		"\u0001\u0000\u0000\u0000\u0748\u0749\u0001\u0000\u0000\u0000\u0749\u013f"+
		"\u0001\u0000\u0000\u0000\u074a\u074c\u0003\u00ecv\u0000\u074b\u074d\u0003"+
		"\u0140\u00a0\u0000\u074c\u074b\u0001\u0000\u0000\u0000\u074c\u074d\u0001"+
		"\u0000\u0000\u0000\u074d\u0141\u0001\u0000\u0000\u0000\u074e\u074f\u0005"+
		"~\u0000\u0000\u074f\u0750\u0003\u0144\u00a2\u0000\u0750\u0143\u0001\u0000"+
		"\u0000\u0000\u0751\u0753\u0003\u0146\u00a3\u0000\u0752\u0754\u0005\u0083"+
		"\u0000\u0000\u0753\u0752\u0001\u0000\u0000\u0000\u0753\u0754\u0001\u0000"+
		"\u0000\u0000\u0754\u075c\u0001\u0000\u0000\u0000\u0755\u0756\u0005z\u0000"+
		"\u0000\u0756\u0758\u0003\u0146\u00a3\u0000\u0757\u0759\u0005\u0083\u0000"+
		"\u0000\u0758\u0757\u0001\u0000\u0000\u0000\u0758\u0759\u0001\u0000\u0000"+
		"\u0000\u0759\u075b\u0001\u0000\u0000\u0000\u075a\u0755\u0001\u0000\u0000"+
		"\u0000\u075b\u075e\u0001\u0000\u0000\u0000\u075c\u075a\u0001\u0000\u0000"+
		"\u0000\u075c\u075d\u0001\u0000\u0000\u0000\u075d\u0145\u0001\u0000\u0000"+
		"\u0000\u075e\u075c\u0001\u0000\u0000\u0000\u075f\u0766\u0003\u0148\u00a4"+
		"\u0000\u0760\u0762\u0005U\u0000\u0000\u0761\u0763\u0003\"\u0011\u0000"+
		"\u0762\u0761\u0001\u0000\u0000\u0000\u0762\u0763\u0001\u0000\u0000\u0000"+
		"\u0763\u0764\u0001\u0000\u0000\u0000\u0764\u0767\u0005V\u0000\u0000\u0765"+
		"\u0767\u0003\u0114\u008a\u0000\u0766\u0760\u0001\u0000\u0000\u0000\u0766"+
		"\u0765\u0001\u0000\u0000\u0000\u0767\u0147\u0001\u0000\u0000\u0000\u0768"+
		"\u076b\u0003\u0136\u009b\u0000\u0769\u076b\u0005\u0084\u0000\u0000\u076a"+
		"\u0768\u0001\u0000\u0000\u0000\u076a\u0769\u0001\u0000\u0000\u0000\u076b"+
		"\u0149\u0001\u0000\u0000\u0000\u076c\u076d\u00054\u0000\u0000\u076d\u076e"+
		"\u0003\u018a\u00c5\u0000\u076e\u014b\u0001\u0000\u0000\u0000\u076f\u0773"+
		"\u00054\u0000\u0000\u0770\u0771\u0005\u0004\u0000\u0000\u0771\u0774\u0005"+
		"\u0084\u0000\u0000\u0772\u0774\u0005\u008c\u0000\u0000\u0773\u0770\u0001"+
		"\u0000\u0000\u0000\u0773\u0772\u0001\u0000\u0000\u0000\u0774\u014d\u0001"+
		"\u0000\u0000\u0000\u0775\u0776\u0005D\u0000\u0000\u0776\u0777\u0005f\u0000"+
		"\u0000\u0777\u0778\u0003\u0150\u00a8\u0000\u0778\u0779\u0005g\u0000\u0000"+
		"\u0779\u077a\u0003z=\u0000\u077a\u014f\u0001\u0000\u0000\u0000\u077b\u0780"+
		"\u0003\u0152\u00a9\u0000\u077c\u077d\u0005z\u0000\u0000\u077d\u077f\u0003"+
		"\u0152\u00a9\u0000\u077e\u077c\u0001\u0000\u0000\u0000\u077f\u0782\u0001"+
		"\u0000\u0000\u0000\u0780\u077e\u0001\u0000\u0000\u0000\u0780\u0781\u0001"+
		"\u0000\u0000\u0000\u0781\u0151\u0001\u0000\u0000\u0000\u0782\u0780\u0001"+
		"\u0000\u0000\u0000\u0783\u0786\u0003\u0154\u00aa\u0000\u0784\u0786\u0003"+
		"\u0106\u0083\u0000\u0785\u0783\u0001\u0000\u0000\u0000\u0785\u0784\u0001"+
		"\u0000\u0000\u0000\u0786\u0153\u0001\u0000\u0000\u0000\u0787\u0788\u0005"+
		"D\u0000\u0000\u0788\u0789\u0005f\u0000\u0000\u0789\u078a\u0003\u0150\u00a8"+
		"\u0000\u078a\u078b\u0005g\u0000\u0000\u078b\u078d\u0001\u0000\u0000\u0000"+
		"\u078c\u0787\u0001\u0000\u0000\u0000\u078c\u078d\u0001\u0000\u0000\u0000"+
		"\u078d\u078e\u0001\u0000\u0000\u0000\u078e\u0791\u0005\u0015\u0000\u0000"+
		"\u078f\u0791\u0005L\u0000\u0000\u0790\u078c\u0001\u0000\u0000\u0000\u0790"+
		"\u078f\u0001\u0000\u0000\u0000\u0791\u079d\u0001\u0000\u0000\u0000\u0792"+
		"\u0794\u0005\u0083\u0000\u0000\u0793\u0792\u0001\u0000\u0000\u0000\u0793"+
		"\u0794\u0001\u0000\u0000\u0000\u0794\u0796\u0001\u0000\u0000\u0000\u0795"+
		"\u0797\u0005\u0084\u0000\u0000\u0796\u0795\u0001\u0000\u0000\u0000\u0796"+
		"\u0797\u0001\u0000\u0000\u0000\u0797\u079e\u0001\u0000\u0000\u0000\u0798"+
		"\u079a\u0005\u0084\u0000\u0000\u0799\u0798\u0001\u0000\u0000\u0000\u0799"+
		"\u079a\u0001\u0000\u0000\u0000\u079a\u079b\u0001\u0000\u0000\u0000\u079b"+
		"\u079c\u0005e\u0000\u0000\u079c\u079e\u0003\u00f6{\u0000\u079d\u0793\u0001"+
		"\u0000\u0000\u0000\u079d\u0799\u0001\u0000\u0000\u0000\u079e\u0155\u0001"+
		"\u0000\u0000\u0000\u079f\u07a0\u0003\u015a\u00ad\u0000\u07a0\u07a2\u0005"+
		"f\u0000\u0000\u07a1\u07a3\u0003\u015c\u00ae\u0000\u07a2\u07a1\u0001\u0000"+
		"\u0000\u0000\u07a2\u07a3\u0001\u0000\u0000\u0000\u07a3\u07a4\u0001\u0000"+
		"\u0000\u0000\u07a4\u07a5\u0005g\u0000\u0000\u07a5\u0157\u0001\u0000\u0000"+
		"\u0000\u07a6\u07b2\u0003\u0156\u00ab\u0000\u07a7\u07aa\u0003\u014a\u00a5"+
		"\u0000\u07a8\u07aa\u0003\u014c\u00a6\u0000\u07a9\u07a7\u0001\u0000\u0000"+
		"\u0000\u07a9\u07a8\u0001\u0000\u0000\u0000\u07aa\u07ab\u0001\u0000\u0000"+
		"\u0000\u07ab\u07ad\u0005f\u0000\u0000\u07ac\u07ae\u0003\u015c\u00ae\u0000"+
		"\u07ad\u07ac\u0001\u0000\u0000\u0000\u07ad\u07ae\u0001\u0000\u0000\u0000"+
		"\u07ae\u07af\u0001\u0000\u0000\u0000\u07af\u07b0\u0005g\u0000\u0000\u07b0"+
		"\u07b2\u0001\u0000\u0000\u0000\u07b1\u07a6\u0001\u0000\u0000\u0000\u07b1"+
		"\u07a9\u0001\u0000\u0000\u0000\u07b2\u0159\u0001\u0000\u0000\u0000\u07b3"+
		"\u07b4\u0005\u0084\u0000\u0000\u07b4\u015b\u0001\u0000\u0000\u0000\u07b5"+
		"\u07b7\u0003\u015e\u00af\u0000\u07b6\u07b8\u0005\u0083\u0000\u0000\u07b7"+
		"\u07b6\u0001\u0000\u0000\u0000\u07b7\u07b8\u0001\u0000\u0000\u0000\u07b8"+
		"\u07c0\u0001\u0000\u0000\u0000\u07b9\u07ba\u0005z\u0000\u0000\u07ba\u07bc"+
		"\u0003\u015e\u00af\u0000\u07bb\u07bd\u0005\u0083\u0000\u0000\u07bc\u07bb"+
		"\u0001\u0000\u0000\u0000\u07bc\u07bd\u0001\u0000\u0000\u0000\u07bd\u07bf"+
		"\u0001\u0000\u0000\u0000\u07be\u07b9\u0001\u0000\u0000\u0000\u07bf\u07c2"+
		"\u0001\u0000\u0000\u0000\u07c0\u07be\u0001\u0000\u0000\u0000\u07c0\u07c1"+
		"\u0001\u0000\u0000\u0000\u07c1\u015d\u0001\u0000\u0000\u0000\u07c2\u07c0"+
		"\u0001\u0000\u0000\u0000\u07c3\u07c7\u0003\u00f6{\u0000\u07c4\u07c7\u0003"+
		"\\.\u0000\u07c5\u07c7\u0003\u0004\u0002\u0000\u07c6\u07c3\u0001\u0000"+
		"\u0000\u0000\u07c6\u07c4\u0001\u0000\u0000\u0000\u07c6\u07c5\u0001\u0000"+
		"\u0000\u0000\u07c7\u015f\u0001\u0000\u0000\u0000\u07c8\u07c9\u0005L\u0000"+
		"\u0000\u07c9\u07cf\u0003\n\u0005\u0000\u07ca\u07d0\u0005\u0084\u0000\u0000"+
		"\u07cb\u07cd\u0005D\u0000\u0000\u07cc\u07cb\u0001\u0000\u0000\u0000\u07cc"+
		"\u07cd\u0001\u0000\u0000\u0000\u07cd\u07ce\u0001\u0000\u0000\u0000\u07ce"+
		"\u07d0\u0003\u0156\u00ab\u0000\u07cf\u07ca\u0001\u0000\u0000\u0000\u07cf"+
		"\u07cc\u0001\u0000\u0000\u0000\u07d0\u0161\u0001\u0000\u0000\u0000\u07d1"+
		"\u07d3\u0005$\u0000\u0000\u07d2\u07d1\u0001\u0000\u0000\u0000\u07d2\u07d3"+
		"\u0001\u0000\u0000\u0000\u07d3\u07d4\u0001\u0000\u0000\u0000\u07d4\u07d5"+
		"\u0005D\u0000\u0000\u07d5\u07d6\u0003z=\u0000\u07d6\u0163\u0001\u0000"+
		"\u0000\u0000\u07d7\u07d8\u0005D\u0000\u0000\u07d8\u07d9\u0005f\u0000\u0000"+
		"\u07d9\u07da\u0005g\u0000\u0000\u07da\u07db\u0003z=\u0000\u07db\u0165"+
		"\u0001\u0000\u0000\u0000\u07dc\u07dd\u0005I\u0000\u0000\u07dd\u07de\u0003"+
		"d2\u0000\u07de\u07df\u0003\u016a\u00b5\u0000\u07df\u0167\u0001\u0000\u0000"+
		"\u0000\u07e0\u07e2\u0005I\u0000\u0000\u07e1\u07e3\u0003\u0142\u00a1\u0000"+
		"\u07e2\u07e1\u0001\u0000\u0000\u0000\u07e2\u07e3\u0001\u0000\u0000\u0000"+
		"\u07e3\u07e4\u0001\u0000\u0000\u0000\u07e4\u07e5\u0003d2\u0000\u07e5\u07e6"+
		"\u0003\u016a\u00b5\u0000\u07e6\u0169\u0001\u0000\u0000\u0000\u07e7\u07e9"+
		"\u0003\u016c\u00b6\u0000\u07e8\u07e7\u0001\u0000\u0000\u0000\u07e9\u07ea"+
		"\u0001\u0000\u0000\u0000\u07ea\u07e8\u0001\u0000\u0000\u0000\u07ea\u07eb"+
		"\u0001\u0000\u0000\u0000\u07eb\u016b\u0001\u0000\u0000\u0000\u07ec\u07ed"+
		"\u0005\u0011\u0000\u0000\u07ed\u07ee\u0005U\u0000\u0000\u07ee\u07ef\u0003"+
		"\u016e\u00b7\u0000\u07ef\u07f0\u0005V\u0000\u0000\u07f0\u07f1\u0003d2"+
		"\u0000\u07f1\u016d\u0001\u0000\u0000\u0000\u07f2\u07f4\u0003\u00ccf\u0000"+
		"\u07f3\u07f2\u0001\u0000\u0000\u0000\u07f3\u07f4\u0001\u0000\u0000\u0000"+
		"\u07f4\u07f5\u0001\u0000\u0000\u0000\u07f5\u07f8\u0003\u0096K\u0000\u07f6"+
		"\u07f9\u0003\u00e2q\u0000\u07f7\u07f9\u0003\u00f8|\u0000\u07f8\u07f6\u0001"+
		"\u0000\u0000\u0000\u07f8\u07f7\u0001\u0000\u0000\u0000\u07f8\u07f9\u0001"+
		"\u0000\u0000\u0000\u07f9\u07fc\u0001\u0000\u0000\u0000\u07fa\u07fc\u0005"+
		"\u0083\u0000\u0000\u07fb\u07f3\u0001\u0000\u0000\u0000\u07fb\u07fa\u0001"+
		"\u0000\u0000\u0000\u07fc\u016f\u0001\u0000\u0000\u0000\u07fd\u07ff\u0005"+
		"G\u0000\u0000\u07fe\u0800\u0003V+\u0000\u07ff\u07fe\u0001\u0000\u0000"+
		"\u0000\u07ff\u0800\u0001\u0000\u0000\u0000\u0800\u0171\u0001\u0000\u0000"+
		"\u0000\u0801\u0804\u0003\u0174\u00ba\u0000\u0802\u0804\u0003\u017c\u00be"+
		"\u0000\u0803\u0801\u0001\u0000\u0000\u0000\u0803\u0802\u0001\u0000\u0000"+
		"\u0000\u0804\u0173\u0001\u0000\u0000\u0000\u0805\u0806\u0005G\u0000\u0000"+
		"\u0806\u0808\u0005U\u0000\u0000\u0807\u0809\u0003\u0176\u00bb\u0000\u0808"+
		"\u0807\u0001\u0000\u0000\u0000\u0808\u0809\u0001\u0000\u0000\u0000\u0809"+
		"\u080a\u0001\u0000\u0000\u0000\u080a\u080b\u0005V\u0000\u0000\u080b\u0175"+
		"\u0001\u0000\u0000\u0000\u080c\u080e\u0003\u00f6{\u0000\u080d\u080f\u0005"+
		"\u0083\u0000\u0000\u080e\u080d\u0001\u0000\u0000\u0000\u080e\u080f\u0001"+
		"\u0000\u0000\u0000\u080f\u0817\u0001\u0000\u0000\u0000\u0810\u0811\u0005"+
		"z\u0000\u0000\u0811\u0813\u0003\u00f6{\u0000\u0812\u0814\u0005\u0083\u0000"+
		"\u0000\u0813\u0812\u0001\u0000\u0000\u0000\u0813\u0814\u0001\u0000\u0000"+
		"\u0000\u0814\u0816\u0001\u0000\u0000\u0000\u0815\u0810\u0001\u0000\u0000"+
		"\u0000\u0816\u0819\u0001\u0000\u0000\u0000\u0817\u0815\u0001\u0000\u0000"+
		"\u0000\u0817\u0818\u0001\u0000\u0000\u0000\u0818\u0177\u0001\u0000\u0000"+
		"\u0000\u0819\u0817\u0001\u0000\u0000\u0000\u081a\u081b\u0005\u0084\u0000"+
		"\u0000\u081b\u081c\u0005W\u0000\u0000\u081c\u081d\u0003\\.\u0000\u081d"+
		"\u081e\u0005X\u0000\u0000\u081e\u081f\u0005W\u0000\u0000\u081f\u0820\u0003"+
		"\\.\u0000\u0820\u0821\u0005X\u0000\u0000\u0821\u082b\u0001\u0000\u0000"+
		"\u0000\u0822\u0823\u0005\u0084\u0000\u0000\u0823\u0824\u0005W\u0000\u0000"+
		"\u0824\u0825\u0003Z-\u0000\u0825\u0826\u0005X\u0000\u0000\u0826\u0827"+
		"\u0005W\u0000\u0000\u0827\u0828\u0003Z-\u0000\u0828\u0829\u0005X\u0000"+
		"\u0000\u0829\u082b\u0001\u0000\u0000\u0000\u082a\u081a\u0001\u0000\u0000"+
		"\u0000\u082a\u0822\u0001\u0000\u0000\u0000\u082b\u0179\u0001\u0000\u0000"+
		"\u0000\u082c\u082d\u0005\u0084\u0000\u0000\u082d\u082e\u0005W\u0000\u0000"+
		"\u082e\u082f\u0003\\.\u0000\u082f\u0830\u0005X\u0000\u0000\u0830\u0831"+
		"\u0005W\u0000\u0000\u0831\u0832\u0003\\.\u0000\u0832\u0833\u0005X\u0000"+
		"\u0000\u0833\u0834\u0005W\u0000\u0000\u0834\u0835\u0003\\.\u0000\u0835"+
		"\u0836\u0005X\u0000\u0000\u0836\u0843\u0001\u0000\u0000\u0000\u0837\u0838"+
		"\u0005\u0084\u0000\u0000\u0838\u0839\u0005W\u0000\u0000\u0839\u083a\u0003"+
		"Z-\u0000\u083a\u083b\u0005X\u0000\u0000\u083b\u083c\u0005W\u0000\u0000"+
		"\u083c\u083d\u0003Z-\u0000\u083d\u083e\u0005X\u0000\u0000\u083e\u083f"+
		"\u0005W\u0000\u0000\u083f\u0840\u0003Z-\u0000\u0840\u0841\u0005X\u0000"+
		"\u0000\u0841\u0843\u0001\u0000\u0000\u0000\u0842\u082c\u0001\u0000\u0000"+
		"\u0000\u0842\u0837\u0001\u0000\u0000\u0000\u0843\u017b\u0001\u0000\u0000"+
		"\u0000\u0844\u0845\u00052\u0000\u0000\u0845\u0846\u0005U\u0000\u0000\u0846"+
		"\u0847\u0003\\.\u0000\u0847\u0848\u0005V\u0000\u0000\u0848\u084b\u0001"+
		"\u0000\u0000\u0000\u0849\u084b\u00052\u0000\u0000\u084a\u0844\u0001\u0000"+
		"\u0000\u0000\u084a\u0849\u0001\u0000\u0000\u0000\u084b\u017d\u0001\u0000"+
		"\u0000\u0000\u084c\u084d\u0005(\u0000\u0000\u084d\u085a\u0005U\u0000\u0000"+
		"\u084e\u0850\u0003n7\u0000\u084f\u0851\u0003j5\u0000\u0850\u084f\u0001"+
		"\u0000\u0000\u0000\u0850\u0851\u0001\u0000\u0000\u0000\u0851\u0852\u0001"+
		"\u0000\u0000\u0000\u0852\u0854\u0005\u0080\u0000\u0000\u0853\u0855\u0003"+
		"Z-\u0000\u0854\u0853\u0001\u0000\u0000\u0000\u0854\u0855\u0001\u0000\u0000"+
		"\u0000\u0855\u085b\u0001\u0000\u0000\u0000\u0856\u0857\u0003p8\u0000\u0857"+
		"\u0858\u0005~\u0000\u0000\u0858\u0859\u0003r9\u0000\u0859\u085b\u0001"+
		"\u0000\u0000\u0000\u085a\u084e\u0001\u0000\u0000\u0000\u085a\u0856\u0001"+
		"\u0000\u0000\u0000\u085b\u085c\u0001\u0000\u0000\u0000\u085c\u085d\u0005"+
		"V\u0000\u0000\u085d\u085e\u0005Y\u0000\u0000\u085e\u085f\u0005(\u0000"+
		"\u0000\u085f\u086c\u0005U\u0000\u0000\u0860\u0862\u0003n7\u0000\u0861"+
		"\u0863\u0003j5\u0000\u0862\u0861\u0001\u0000\u0000\u0000\u0862\u0863\u0001"+
		"\u0000\u0000\u0000\u0863\u0864\u0001\u0000\u0000\u0000\u0864\u0866\u0005"+
		"\u0080\u0000\u0000\u0865\u0867\u0003Z-\u0000\u0866\u0865\u0001\u0000\u0000"+
		"\u0000\u0866\u0867\u0001\u0000\u0000\u0000\u0867\u086d\u0001\u0000\u0000"+
		"\u0000\u0868\u0869\u0003p8\u0000\u0869\u086a\u0005~\u0000\u0000\u086a"+
		"\u086b\u0003r9\u0000\u086b\u086d\u0001\u0000\u0000\u0000\u086c\u0860\u0001"+
		"\u0000\u0000\u0000\u086c\u0868\u0001\u0000\u0000\u0000\u086d\u086e\u0001"+
		"\u0000\u0000\u0000\u086e\u0870\u0005V\u0000\u0000\u086f\u0871\u0005Y\u0000"+
		"\u0000\u0870\u086f\u0001\u0000\u0000\u0000\u0870\u0871\u0001\u0000\u0000"+
		"\u0000\u0871\u0872\u0001\u0000\u0000\u0000\u0872\u0873\u0003\u0178\u00bc"+
		"\u0000\u0873\u0874\u0005e\u0000\u0000\u0874\u0875\u0003\u0178\u00bc\u0000"+
		"\u0875\u0876\u0005[\u0000\u0000\u0876\u0877\u0003\u0178\u00bc\u0000\u0877"+
		"\u0879\u0005\u0080\u0000\u0000\u0878\u087a\u0005Z\u0000\u0000\u0879\u0878"+
		"\u0001\u0000\u0000\u0000\u0879\u087a\u0001\u0000\u0000\u0000\u087a\u087b"+
		"\u0001\u0000\u0000\u0000\u087b\u087c\u0005Z\u0000\u0000\u087c\u017f\u0001"+
		"\u0000\u0000\u0000\u087d\u087e\u0005(\u0000\u0000\u087e\u088b\u0005U\u0000"+
		"\u0000\u087f\u0881\u0003n7\u0000\u0880\u0882\u0003j5\u0000\u0881\u0880"+
		"\u0001\u0000\u0000\u0000\u0881\u0882\u0001\u0000\u0000\u0000\u0882\u0883"+
		"\u0001\u0000\u0000\u0000\u0883\u0885\u0005\u0080\u0000\u0000\u0884\u0886"+
		"\u0003Z-\u0000\u0885\u0884\u0001\u0000\u0000\u0000\u0885\u0886\u0001\u0000"+
		"\u0000\u0000\u0886\u088c\u0001\u0000\u0000\u0000\u0887\u0888\u0003p8\u0000"+
		"\u0888\u0889\u0005~\u0000\u0000\u0889\u088a\u0003r9\u0000\u088a\u088c"+
		"\u0001\u0000\u0000\u0000\u088b\u087f\u0001\u0000\u0000\u0000\u088b\u0887"+
		"\u0001\u0000\u0000\u0000\u088c\u088d\u0001\u0000\u0000\u0000\u088d\u088f"+
		"\u0005V\u0000\u0000\u088e\u0890\u0005Y\u0000\u0000\u088f\u088e\u0001\u0000"+
		"\u0000\u0000\u088f\u0890\u0001\u0000\u0000\u0000\u0890\u0891\u0001\u0000"+
		"\u0000\u0000\u0891\u0892\u0005(\u0000\u0000\u0892\u089f\u0005U\u0000\u0000"+
		"\u0893\u0895\u0003n7\u0000\u0894\u0896\u0003j5\u0000\u0895\u0894\u0001"+
		"\u0000\u0000\u0000\u0895\u0896\u0001\u0000\u0000\u0000\u0896\u0897\u0001"+
		"\u0000\u0000\u0000\u0897\u0899\u0005\u0080\u0000\u0000\u0898\u089a\u0003"+
		"Z-\u0000\u0899\u0898\u0001\u0000\u0000\u0000\u0899\u089a\u0001\u0000\u0000"+
		"\u0000\u089a\u08a0\u0001\u0000\u0000\u0000\u089b\u089c\u0003p8\u0000\u089c"+
		"\u089d\u0005~\u0000\u0000\u089d\u089e\u0003r9\u0000\u089e\u08a0\u0001"+
		"\u0000\u0000\u0000\u089f\u0893\u0001\u0000\u0000\u0000\u089f\u089b\u0001"+
		"\u0000\u0000\u0000\u08a0\u08a1\u0001\u0000\u0000\u0000\u08a1\u08a3\u0005"+
		"V\u0000\u0000\u08a2\u08a4\u0005Y\u0000\u0000\u08a3\u08a2\u0001\u0000\u0000"+
		"\u0000\u08a3\u08a4\u0001\u0000\u0000\u0000\u08a4\u08a5\u0001\u0000\u0000"+
		"\u0000\u08a5\u08a6\u0005(\u0000\u0000\u08a6\u08b3\u0005U\u0000\u0000\u08a7"+
		"\u08a9\u0003n7\u0000\u08a8\u08aa\u0003j5\u0000\u08a9\u08a8\u0001\u0000"+
		"\u0000\u0000\u08a9\u08aa\u0001\u0000\u0000\u0000\u08aa\u08ab\u0001\u0000"+
		"\u0000\u0000\u08ab\u08ad\u0005\u0080\u0000\u0000\u08ac\u08ae\u0003Z-\u0000"+
		"\u08ad\u08ac\u0001\u0000\u0000\u0000\u08ad\u08ae\u0001\u0000\u0000\u0000"+
		"\u08ae\u08b4\u0001\u0000\u0000\u0000\u08af\u08b0\u0003p8\u0000\u08b0\u08b1"+
		"\u0005~\u0000\u0000\u08b1\u08b2\u0003r9\u0000\u08b2\u08b4\u0001\u0000"+
		"\u0000\u0000\u08b3\u08a7\u0001\u0000\u0000\u0000\u08b3\u08af\u0001\u0000"+
		"\u0000\u0000\u08b4\u08b5\u0001\u0000\u0000\u0000\u08b5\u08b7\u0005V\u0000"+
		"\u0000\u08b6\u08b8\u0005Y\u0000\u0000\u08b7\u08b6\u0001\u0000\u0000\u0000"+
		"\u08b7\u08b8\u0001\u0000\u0000\u0000\u08b8\u08b9\u0001\u0000\u0000\u0000"+
		"\u08b9\u08ba\u0003\u017a\u00bd\u0000\u08ba\u08bb\u0005e\u0000\u0000\u08bb"+
		"\u08bc\u0003\u017a\u00bd\u0000\u08bc\u08bd\u0005[\u0000\u0000\u08bd\u08be"+
		"\u0003\u017a\u00bd\u0000\u08be\u08c0\u0005\u0080\u0000\u0000\u08bf\u08c1"+
		"\u0005Z\u0000\u0000\u08c0\u08bf\u0001\u0000\u0000\u0000\u08c0\u08c1\u0001"+
		"\u0000\u0000\u0000\u08c1\u08c3\u0001\u0000\u0000\u0000\u08c2\u08c4\u0005"+
		"Z\u0000\u0000\u08c3\u08c2\u0001\u0000\u0000\u0000\u08c3\u08c4\u0001\u0000"+
		"\u0000\u0000\u08c4\u08c6\u0001\u0000\u0000\u0000\u08c5\u08c7\u0005Z\u0000"+
		"\u0000\u08c6\u08c5\u0001\u0000\u0000\u0000\u08c6\u08c7\u0001\u0000\u0000"+
		"\u0000\u08c7\u0181\u0001\u0000\u0000\u0000\u08c8\u08c9\u0003>\u001f\u0000"+
		"\u08c9\u08ca\u0005[\u0000\u0000\u08ca\u08cc\u0001\u0000\u0000\u0000\u08cb"+
		"\u08c8\u0001\u0000\u0000\u0000\u08cc\u08cf\u0001\u0000\u0000\u0000\u08cd"+
		"\u08cb\u0001\u0000\u0000\u0000\u08cd\u08ce\u0001\u0000\u0000\u0000\u08ce"+
		"\u08d0\u0001\u0000\u0000\u0000\u08cf\u08cd\u0001\u0000\u0000\u0000\u08d0"+
		"\u08d1\u0005\u0084\u0000\u0000\u08d1\u08d2\u0005W\u0000\u0000\u08d2\u08d3"+
		"\u0003Z-\u0000\u08d3\u08d8\u0005X\u0000\u0000\u08d4\u08d5\u0005[\u0000"+
		"\u0000\u08d5\u08d7\u0003>\u001f\u0000\u08d6\u08d4\u0001\u0000\u0000\u0000"+
		"\u08d7\u08da\u0001\u0000\u0000\u0000\u08d8\u08d6\u0001\u0000\u0000\u0000"+
		"\u08d8\u08d9\u0001\u0000\u0000\u0000\u08d9\u08ec\u0001\u0000\u0000\u0000"+
		"\u08da\u08d8\u0001\u0000\u0000\u0000\u08db\u08dc\u0003>\u001f\u0000\u08dc"+
		"\u08dd\u0005[\u0000\u0000\u08dd\u08df\u0001\u0000\u0000\u0000\u08de\u08db"+
		"\u0001\u0000\u0000\u0000\u08df\u08e2\u0001\u0000\u0000\u0000\u08e0\u08de"+
		"\u0001\u0000\u0000\u0000\u08e0\u08e1\u0001\u0000\u0000\u0000\u08e1\u08e3"+
		"\u0001\u0000\u0000\u0000\u08e2\u08e0\u0001\u0000\u0000\u0000\u08e3\u08e8"+
		"\u0003\u0178\u00bc\u0000\u08e4\u08e5\u0005[\u0000\u0000\u08e5\u08e7\u0003"+
		">\u001f\u0000\u08e6\u08e4\u0001\u0000\u0000\u0000\u08e7\u08ea\u0001\u0000"+
		"\u0000\u0000\u08e8\u08e6\u0001\u0000\u0000\u0000\u08e8\u08e9\u0001\u0000"+
		"\u0000\u0000\u08e9\u08ec\u0001\u0000\u0000\u0000\u08ea\u08e8\u0001\u0000"+
		"\u0000\u0000\u08eb\u08cd\u0001\u0000\u0000\u0000\u08eb\u08e0\u0001\u0000"+
		"\u0000\u0000\u08ec\u0183\u0001\u0000\u0000\u0000\u08ed\u08ee\u0005(\u0000"+
		"\u0000\u08ee\u08fb\u0005U\u0000\u0000\u08ef\u08f1\u0003n7\u0000\u08f0"+
		"\u08f2\u0003j5\u0000\u08f1\u08f0\u0001\u0000\u0000\u0000\u08f1\u08f2\u0001"+
		"\u0000\u0000\u0000\u08f2\u08f3\u0001\u0000\u0000\u0000\u08f3\u08f5\u0005"+
		"\u0080\u0000\u0000\u08f4\u08f6\u0003Z-\u0000\u08f5\u08f4\u0001\u0000\u0000"+
		"\u0000\u08f5\u08f6\u0001\u0000\u0000\u0000\u08f6\u08fc\u0001\u0000\u0000"+
		"\u0000\u08f7\u08f8\u0003p8\u0000\u08f8\u08f9\u0005~\u0000\u0000\u08f9"+
		"\u08fa\u0003r9\u0000\u08fa\u08fc\u0001\u0000\u0000\u0000\u08fb\u08ef\u0001"+
		"\u0000\u0000\u0000\u08fb\u08f7\u0001\u0000\u0000\u0000\u08fc\u08fd\u0001"+
		"\u0000\u0000\u0000\u08fd\u08ff\u0005V\u0000\u0000\u08fe\u0900\u0005Y\u0000"+
		"\u0000\u08ff\u08fe\u0001\u0000\u0000\u0000\u08ff\u0900\u0001\u0000\u0000"+
		"\u0000\u0900\u0901\u0001\u0000\u0000\u0000\u0901\u0906\u0005\u0084\u0000"+
		"\u0000\u0902\u0903\u0005W\u0000\u0000\u0903\u0904\u0003\\.\u0000\u0904"+
		"\u0905\u0005X\u0000\u0000\u0905\u0907\u0001\u0000\u0000\u0000\u0906\u0902"+
		"\u0001\u0000\u0000\u0000\u0907\u0908\u0001\u0000\u0000\u0000\u0908\u0906"+
		"\u0001\u0000\u0000\u0000\u0908\u0909\u0001\u0000\u0000\u0000\u0909\u090a"+
		"\u0001\u0000\u0000\u0000\u090a\u090b\u0005e\u0000\u0000\u090b\u090c\u0003"+
		"\u0182\u00c1\u0000\u090c\u090e\u0005\u0080\u0000\u0000\u090d\u090f\u0005"+
		"Z\u0000\u0000\u090e\u090d\u0001\u0000\u0000\u0000\u090e\u090f\u0001\u0000"+
		"\u0000\u0000\u090f\u0910\u0001\u0000\u0000\u0000\u0910\u0911\u0005(\u0000"+
		"\u0000\u0911\u091e\u0005U\u0000\u0000\u0912\u0914\u0003n7\u0000\u0913"+
		"\u0915\u0003j5\u0000\u0914\u0913\u0001\u0000\u0000\u0000\u0914\u0915\u0001"+
		"\u0000\u0000\u0000\u0915\u0916\u0001\u0000\u0000\u0000\u0916\u0918\u0005"+
		"\u0080\u0000\u0000\u0917\u0919\u0003Z-\u0000\u0918\u0917\u0001\u0000\u0000"+
		"\u0000\u0918\u0919\u0001\u0000\u0000\u0000\u0919\u091f\u0001\u0000\u0000"+
		"\u0000\u091a\u091b\u0003p8\u0000\u091b\u091c\u0005~\u0000\u0000\u091c"+
		"\u091d\u0003r9\u0000\u091d\u091f\u0001\u0000\u0000\u0000\u091e\u0912\u0001"+
		"\u0000\u0000\u0000\u091e\u091a\u0001\u0000\u0000\u0000\u091f\u0920\u0001"+
		"\u0000\u0000\u0000\u0920\u0922\u0005V\u0000\u0000\u0921\u0923\u0005Y\u0000"+
		"\u0000\u0922\u0921\u0001\u0000\u0000\u0000\u0922\u0923\u0001\u0000\u0000"+
		"\u0000\u0923\u0924\u0001\u0000\u0000\u0000\u0924\u0929\u0005\u0084\u0000"+
		"\u0000\u0925\u0926\u0005W\u0000\u0000\u0926\u0927\u0003\\.\u0000\u0927"+
		"\u0928\u0005X\u0000\u0000\u0928\u092a\u0001\u0000\u0000\u0000\u0929\u0925"+
		"\u0001\u0000\u0000\u0000\u092a\u092b\u0001\u0000\u0000\u0000\u092b\u0929"+
		"\u0001\u0000\u0000\u0000\u092b\u092c\u0001\u0000\u0000\u0000\u092c\u092d"+
		"\u0001\u0000\u0000\u0000\u092d\u092e\u0005e\u0000\u0000\u092e\u092f\u0003"+
		"\u0182\u00c1\u0000\u092f\u0931\u0005\u0080\u0000\u0000\u0930\u0932\u0005"+
		"Z\u0000\u0000\u0931\u0930\u0001\u0000\u0000\u0000\u0931\u0932\u0001\u0000"+
		"\u0000\u0000\u0932\u0185\u0001\u0000\u0000\u0000\u0933\u0934\u0005(\u0000"+
		"\u0000\u0934\u0941\u0005U\u0000\u0000\u0935\u0937\u0003n7\u0000\u0936"+
		"\u0938\u0003j5\u0000\u0937\u0936\u0001\u0000\u0000\u0000\u0937\u0938\u0001"+
		"\u0000\u0000\u0000\u0938\u0939\u0001\u0000\u0000\u0000\u0939\u093b\u0005"+
		"\u0080\u0000\u0000\u093a\u093c\u0003Z-\u0000\u093b\u093a\u0001\u0000\u0000"+
		"\u0000\u093b\u093c\u0001\u0000\u0000\u0000\u093c\u0942\u0001\u0000\u0000"+
		"\u0000\u093d\u093e\u0003p8\u0000\u093e\u093f\u0005~\u0000\u0000\u093f"+
		"\u0940\u0003r9\u0000\u0940\u0942\u0001\u0000\u0000\u0000\u0941\u0935\u0001"+
		"\u0000\u0000\u0000\u0941\u093d\u0001\u0000\u0000\u0000\u0942\u0943\u0001"+
		"\u0000\u0000\u0000\u0943\u0945\u0005V\u0000\u0000\u0944\u0946\u0005Y\u0000"+
		"\u0000\u0945\u0944\u0001\u0000\u0000\u0000\u0945\u0946\u0001\u0000\u0000"+
		"\u0000\u0946\u0951\u0001\u0000\u0000\u0000\u0947\u0948\u0005\u0084\u0000"+
		"\u0000\u0948\u0949\u0005W\u0000\u0000\u0949\u094a\u0003\\.\u0000\u094a"+
		"\u094b\u0005X\u0000\u0000\u094b\u094c\u0005e\u0000\u0000\u094c\u094d\u0003"+
		"\u0182\u00c1\u0000\u094d\u094e\u0005\u0080\u0000\u0000\u094e\u0950\u0001"+
		"\u0000\u0000\u0000\u094f\u0947\u0001\u0000\u0000\u0000\u0950\u0953\u0001"+
		"\u0000\u0000\u0000\u0951\u094f\u0001\u0000\u0000\u0000\u0951\u0952\u0001"+
		"\u0000\u0000\u0000\u0952\u0954\u0001\u0000\u0000\u0000\u0953\u0951\u0001"+
		"\u0000\u0000\u0000\u0954\u0955\u0005(\u0000\u0000\u0955\u0962\u0005U\u0000"+
		"\u0000\u0956\u0958\u0003n7\u0000\u0957\u0959\u0003j5\u0000\u0958\u0957"+
		"\u0001\u0000\u0000\u0000\u0958\u0959\u0001\u0000\u0000\u0000\u0959\u095a"+
		"\u0001\u0000\u0000\u0000\u095a\u095c\u0005\u0080\u0000\u0000\u095b\u095d"+
		"\u0003Z-\u0000\u095c\u095b\u0001\u0000\u0000\u0000\u095c\u095d\u0001\u0000"+
		"\u0000\u0000\u095d\u0963\u0001\u0000\u0000\u0000\u095e\u095f\u0003p8\u0000"+
		"\u095f\u0960\u0005~\u0000\u0000\u0960\u0961\u0003r9\u0000\u0961\u0963"+
		"\u0001\u0000\u0000\u0000\u0962\u0956\u0001\u0000\u0000\u0000\u0962\u095e"+
		"\u0001\u0000\u0000\u0000\u0963\u0964\u0001\u0000\u0000\u0000\u0964\u0966"+
		"\u0005V\u0000\u0000\u0965\u0967\u0005Y\u0000\u0000\u0966\u0965\u0001\u0000"+
		"\u0000\u0000\u0966\u0967\u0001\u0000\u0000\u0000\u0967\u0968\u0001\u0000"+
		"\u0000\u0000\u0968\u0969\u0005\u0084\u0000\u0000\u0969\u096a\u0005W\u0000"+
		"\u0000\u096a\u096b\u0003\\.\u0000\u096b\u096c\u0005X\u0000\u0000\u096c"+
		"\u096d\u0005W\u0000\u0000\u096d\u096e\u0003\\.\u0000\u096e\u096f\u0005"+
		"X\u0000\u0000\u096f\u0970\u0005e\u0000\u0000\u0970\u0971\u0003\u0182\u00c1"+
		"\u0000\u0971\u0973\u0005\u0080\u0000\u0000\u0972\u0974\u0005Z\u0000\u0000"+
		"\u0973\u0972\u0001\u0000\u0000\u0000\u0973\u0974\u0001\u0000\u0000\u0000"+
		"\u0974\u0976\u0001\u0000\u0000\u0000\u0975\u0977\u0005Z\u0000\u0000\u0976"+
		"\u0975\u0001\u0000\u0000\u0000\u0976\u0977\u0001\u0000\u0000\u0000\u0977"+
		"\u0187\u0001\u0000\u0000\u0000\u0978\u0979\u0005(\u0000\u0000\u0979\u0986"+
		"\u0005U\u0000\u0000\u097a\u097c";
	private static final String _serializedATNSegment1 =
		"\u0003n7\u0000\u097b\u097d\u0003j5\u0000\u097c\u097b\u0001\u0000\u0000"+
		"\u0000\u097c\u097d\u0001\u0000\u0000\u0000\u097d\u097e\u0001\u0000\u0000"+
		"\u0000\u097e\u0980\u0005\u0080\u0000\u0000\u097f\u0981\u0003Z-\u0000\u0980"+
		"\u097f\u0001\u0000\u0000\u0000\u0980\u0981\u0001\u0000\u0000\u0000\u0981"+
		"\u0987\u0001\u0000\u0000\u0000\u0982\u0983\u0003p8\u0000\u0983\u0984\u0005"+
		"~\u0000\u0000\u0984\u0985\u0003r9\u0000\u0985\u0987\u0001\u0000\u0000"+
		"\u0000\u0986\u097a\u0001\u0000\u0000\u0000\u0986\u0982\u0001\u0000\u0000"+
		"\u0000\u0987\u0988\u0001\u0000\u0000\u0000\u0988\u098a\u0005V\u0000\u0000"+
		"\u0989\u098b\u0005Y\u0000\u0000\u098a\u0989\u0001\u0000\u0000\u0000\u098a"+
		"\u098b\u0001\u0000\u0000\u0000\u098b\u098d\u0001\u0000\u0000\u0000\u098c"+
		"\u098e\u0003\u0184\u00c2\u0000\u098d\u098c\u0001\u0000\u0000\u0000\u098e"+
		"\u098f\u0001\u0000\u0000\u0000\u098f\u098d\u0001\u0000\u0000\u0000\u098f"+
		"\u0990\u0001\u0000\u0000\u0000\u0990\u0992\u0001\u0000\u0000\u0000\u0991"+
		"\u0993\u0005Z\u0000\u0000\u0992\u0991\u0001\u0000\u0000\u0000\u0992\u0993"+
		"\u0001\u0000\u0000\u0000\u0993\u0189\u0001\u0000\u0000\u0000\u0994\u0997"+
		"\u00051\u0000\u0000\u0995\u0996\u0005W\u0000\u0000\u0996\u0998\u0005X"+
		"\u0000\u0000\u0997\u0995\u0001\u0000\u0000\u0000\u0997\u0998\u0001\u0000"+
		"\u0000\u0000\u0998\u09c8\u0001\u0000\u0000\u0000\u0999\u099c\u0005\u001c"+
		"\u0000\u0000\u099a\u099b\u0005W\u0000\u0000\u099b\u099d\u0005X\u0000\u0000"+
		"\u099c\u099a\u0001\u0000\u0000\u0000\u099c\u099d\u0001\u0000\u0000\u0000"+
		"\u099d\u09c8\u0001\u0000\u0000\u0000\u099e\u09c8\u0005[\u0000\u0000\u099f"+
		"\u09c8\u0005\\\u0000\u0000\u09a0\u09c8\u0005]\u0000\u0000\u09a1\u09c8"+
		"\u0005^\u0000\u0000\u09a2\u09c8\u0005_\u0000\u0000\u09a3\u09c8\u0005`"+
		"\u0000\u0000\u09a4\u09c8\u0005a\u0000\u0000\u09a5\u09c8\u0005b\u0000\u0000"+
		"\u09a6\u09c8\u0005c\u0000\u0000\u09a7\u09c8\u0005d\u0000\u0000\u09a8\u09c8"+
		"\u0005e\u0000\u0000\u09a9\u09c8\u0005g\u0000\u0000\u09aa\u09c8\u0005f"+
		"\u0000\u0000\u09ab\u09c8\u0005u\u0000\u0000\u09ac\u09c8\u0005h\u0000\u0000"+
		"\u09ad\u09c8\u0005i\u0000\u0000\u09ae\u09c8\u0005j\u0000\u0000\u09af\u09c8"+
		"\u0005l\u0000\u0000\u09b0\u09c8\u0005m\u0000\u0000\u09b1\u09c8\u0005n"+
		"\u0000\u0000\u09b2\u09c8\u0005o\u0000\u0000\u09b3\u09b4\u0005f\u0000\u0000"+
		"\u09b4\u09c8\u0005f\u0000\u0000\u09b5\u09b6\u0005g\u0000\u0000\u09b6\u09c8"+
		"\u0005g\u0000\u0000\u09b7\u09c8\u0005q\u0000\u0000\u09b8\u09c8\u0005p"+
		"\u0000\u0000\u09b9\u09c8\u0005r\u0000\u0000\u09ba\u09c8\u0005s\u0000\u0000"+
		"\u09bb\u09c8\u0005t\u0000\u0000\u09bc\u09c8\u0005v\u0000\u0000\u09bd\u09c8"+
		"\u0005w\u0000\u0000\u09be\u09c8\u0005x\u0000\u0000\u09bf\u09c8\u0005y"+
		"\u0000\u0000\u09c0\u09c8\u0005z\u0000\u0000\u09c1\u09c8\u0005{\u0000\u0000"+
		"\u09c2\u09c8\u0005|\u0000\u0000\u09c3\u09c4\u0005U\u0000\u0000\u09c4\u09c8"+
		"\u0005V\u0000\u0000\u09c5\u09c6\u0005W\u0000\u0000\u09c6\u09c8\u0005X"+
		"\u0000\u0000\u09c7\u0994\u0001\u0000\u0000\u0000\u09c7\u0999\u0001\u0000"+
		"\u0000\u0000\u09c7\u099e\u0001\u0000\u0000\u0000\u09c7\u099f\u0001\u0000"+
		"\u0000\u0000\u09c7\u09a0\u0001\u0000\u0000\u0000\u09c7\u09a1\u0001\u0000"+
		"\u0000\u0000\u09c7\u09a2\u0001\u0000\u0000\u0000\u09c7\u09a3\u0001\u0000"+
		"\u0000\u0000\u09c7\u09a4\u0001\u0000\u0000\u0000\u09c7\u09a5\u0001\u0000"+
		"\u0000\u0000\u09c7\u09a6\u0001\u0000\u0000\u0000\u09c7\u09a7\u0001\u0000"+
		"\u0000\u0000\u09c7\u09a8\u0001\u0000\u0000\u0000\u09c7\u09a9\u0001\u0000"+
		"\u0000\u0000\u09c7\u09aa\u0001\u0000\u0000\u0000\u09c7\u09ab\u0001\u0000"+
		"\u0000\u0000\u09c7\u09ac\u0001\u0000\u0000\u0000\u09c7\u09ad\u0001\u0000"+
		"\u0000\u0000\u09c7\u09ae\u0001\u0000\u0000\u0000\u09c7\u09af\u0001\u0000"+
		"\u0000\u0000\u09c7\u09b0\u0001\u0000\u0000\u0000\u09c7\u09b1\u0001\u0000"+
		"\u0000\u0000\u09c7\u09b2\u0001\u0000\u0000\u0000\u09c7\u09b3\u0001\u0000"+
		"\u0000\u0000\u09c7\u09b5\u0001\u0000\u0000\u0000\u09c7\u09b7\u0001\u0000"+
		"\u0000\u0000\u09c7\u09b8\u0001\u0000\u0000\u0000\u09c7\u09b9\u0001\u0000"+
		"\u0000\u0000\u09c7\u09ba\u0001\u0000\u0000\u0000\u09c7\u09bb\u0001\u0000"+
		"\u0000\u0000\u09c7\u09bc\u0001\u0000\u0000\u0000\u09c7\u09bd\u0001\u0000"+
		"\u0000\u0000\u09c7\u09be\u0001\u0000\u0000\u0000\u09c7\u09bf\u0001\u0000"+
		"\u0000\u0000\u09c7\u09c0\u0001\u0000\u0000\u0000\u09c7\u09c1\u0001\u0000"+
		"\u0000\u0000\u09c7\u09c2\u0001\u0000\u0000\u0000\u09c7\u09c3\u0001\u0000"+
		"\u0000\u0000\u09c7\u09c5\u0001\u0000\u0000\u0000\u09c8\u018b\u0001\u0000"+
		"\u0000\u0000\u09c9\u09ca\u0007\u0016\u0000\u0000\u09ca\u018d\u0001\u0000"+
		"\u0000\u0000\u016e\u018f\u0196\u019f\u01a3\u01ac\u01af\u01b3\u01bb\u01c2"+
		"\u01c5\u01ca\u01cf\u01d5\u01dd\u01df\u01e8\u01ec\u01f0\u01f3\u01f7\u01fa"+
		"\u0201\u0205\u0208\u020b\u020e\u0214\u0218\u021c\u022a\u022e\u0234\u023b"+
		"\u0241\u0245\u0249\u024b\u0253\u0258\u0265\u026c\u0278\u0282\u0287\u028b"+
		"\u0292\u0295\u029d\u02a1\u02a4\u02ab\u02b2\u02b6\u02bb\u02bf\u02c2\u02c7"+
		"\u02d6\u02dd\u02e2\u02e9\u02f1\u02fa\u0301\u0308\u0310\u0318\u0320\u0328"+
		"\u0330\u0338\u0341\u0349\u0352\u035f\u0367\u0369\u036c\u0372\u0378\u037e"+
		"\u0385\u038e\u0396\u039a\u03a1\u03a3\u03b7\u03bb\u03c1\u03c6\u03ca\u03cd"+
		"\u03d4\u03db\u03df\u03e8\u03f3\u03fd\u0402\u0409\u040c\u0411\u0416\u042b"+
		"\u0430\u0433\u043e\u0444\u0449\u044c\u0451\u0454\u045b\u0464\u0469\u046c"+
		"\u0470\u0474\u0478\u047d\u0482\u0488\u048e\u0494\u049a\u04a0\u04a3\u04a9"+
		"\u04ad\u04b1\u04b4\u04bc\u04be\u04c4\u04c7\u04ca\u04cd\u04d1\u04d5\u04db"+
		"\u04e5\u04eb\u04f1\u04f6\u04fb\u04ff\u050c\u0512\u0516\u051c\u0521\u0530"+
		"\u0534\u0539\u053e\u0543\u0549\u054c\u0555\u0559\u055e\u0562\u0568\u056f"+
		"\u0580\u0582\u0589\u058e\u0595\u0599\u059d\u05a5\u05ad\u05b3\u05b7\u05b9"+
		"\u05bd\u05c2\u05c6\u05c9\u05cc\u05cf\u05d4\u05d8\u05db\u05df\u05e2\u05e4"+
		"\u05e9\u05f0\u05f6\u05fa\u0600\u0606\u0609\u060b\u0611\u0615\u061b\u0622"+
		"\u0626\u0628\u062c\u0632\u063e\u0642\u0644\u0648\u064d\u0650\u0657\u065b"+
		"\u0660\u0662\u0666\u0669\u066c\u0670\u0675\u067c\u0683\u0688\u068d\u0691"+
		"\u0696\u069a\u06a0\u06a2\u06a8\u06ad\u06b3\u06b7\u06b9\u06bc\u06c0\u06c4"+
		"\u06c6\u06c8\u06cb\u06d7\u06d9\u06dc\u06df\u06e2\u06eb\u06f2\u06f7\u06fa"+
		"\u06fd\u06ff\u0702\u0705\u0709\u070e\u071b\u0720\u0724\u0728\u072d\u0732"+
		"\u0736\u0739\u073d\u0748\u074c\u0753\u0758\u075c\u0762\u0766\u076a\u0773"+
		"\u0780\u0785\u078c\u0790\u0793\u0796\u0799\u079d\u07a2\u07a9\u07ad\u07b1"+
		"\u07b7\u07bc\u07c0\u07c6\u07cc\u07cf\u07d2\u07e2\u07ea\u07f3\u07f8\u07fb"+
		"\u07ff\u0803\u0808\u080e\u0813\u0817\u082a\u0842\u084a\u0850\u0854\u085a"+
		"\u0862\u0866\u086c\u0870\u0879\u0881\u0885\u088b\u088f\u0895\u0899\u089f"+
		"\u08a3\u08a9\u08ad\u08b3\u08b7\u08c0\u08c3\u08c6\u08cd\u08d8\u08e0\u08e8"+
		"\u08eb\u08f1\u08f5\u08fb\u08ff\u0908\u090e\u0914\u0918\u091e\u0922\u092b"+
		"\u0931\u0937\u093b\u0941\u0945\u0951\u0958\u095c\u0962\u0966\u0973\u0976"+
		"\u097c\u0980\u0986\u098a\u098f\u0992\u0997\u099c\u09c7";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/goku/Code/SII/Compil/ProjetC/src/TinyParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUB=1, ADD=2, MULT=3, DIV=4, LAE=5, RANGLE=6, EQEQ=7, EXCL_EQ=8, ASSIGNMENT=9, 
		DOT=10, COMMA=11, LPAREN=12, RPAREN=13, LSQUARE=14, RSQUARE=15, LCURL=16, 
		RCURL=17, COMPIL=18, START=19, INTCOMPIL=20, FLOATCOMPIL=21, STRINGCOMPIL=22, 
		IF=23, THEN=24, ELSE=25, DO=26, WHILE=27, SCANCOMPIL=28, PRINTCOMPIL=29, 
		WHITESPACE=30, PROGNAMES=31, IDENTIFIER=32, NL=33, INTEGER=34, FLOAT=35, 
		TEXT=36, DelimitedComment=37, LineComment=38, LANGLE=39, SEMICOLON=40;
	public static final int
		RULE_start = 0, RULE_varDec = 1, RULE_listeDec = 2, RULE_typeDec = 3, 
		RULE_descPgm = 4, RULE_operande = 5, RULE_aff = 6, RULE_arithOperation = 7, 
		RULE_opComparison = 8, RULE_comparison = 9, RULE_conditions = 10, RULE_els = 11, 
		RULE_loop = 12, RULE_scanInputs = 13, RULE_scan = 14, RULE_text = 15, 
		RULE_print = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "varDec", "listeDec", "typeDec", "descPgm", "operande", "aff", 
			"arithOperation", "opComparison", "comparison", "conditions", "els", 
			"loop", "scanInputs", "scan", "text", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'+'", "'*'", "'/'", null, "'>'", "'=='", "'!='", "'='", 
			"'.'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "'compil'", "'start'", 
			"'intCompil'", "'floatCompil'", "'StringCompil'", "'if'", "'then'", "'else'", 
			"'do'", "'while'", "'scanCompil'", "'printCompil'", "' '", null, null, 
			null, null, null, null, null, null, "'<'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUB", "ADD", "MULT", "DIV", "LAE", "RANGLE", "EQEQ", "EXCL_EQ", 
			"ASSIGNMENT", "DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", 
			"LCURL", "RCURL", "COMPIL", "START", "INTCOMPIL", "FLOATCOMPIL", "STRINGCOMPIL", 
			"IF", "THEN", "ELSE", "DO", "WHILE", "SCANCOMPIL", "PRINTCOMPIL", "WHITESPACE", 
			"PROGNAMES", "IDENTIFIER", "NL", "INTEGER", "FLOAT", "TEXT", "DelimitedComment", 
			"LineComment", "LANGLE", "SEMICOLON"
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
	public String getGrammarFileName() { return "TinyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode PROGNAMES() { return getToken(TinyParser.PROGNAMES, 0); }
		public TerminalNode LPAREN() { return getToken(TinyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TinyParser.RPAREN, 0); }
		public TerminalNode LCURL() { return getToken(TinyParser.LCURL, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public TerminalNode START() { return getToken(TinyParser.START, 0); }
		public DescPgmContext descPgm() {
			return getRuleContext(DescPgmContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(TinyParser.RCURL, 0); }
		public TerminalNode EOF() { return getToken(TinyParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PROGNAMES);
			setState(35);
			match(LPAREN);
			setState(36);
			match(RPAREN);
			setState(37);
			match(LCURL);
			setState(38);
			varDec();
			setState(39);
			match(START);
			setState(40);
			descPgm();
			setState(41);
			match(RCURL);
			setState(42);
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

	public static class VarDecContext extends ParserRuleContext {
		public List<TypeDecContext> typeDec() {
			return getRuleContexts(TypeDecContext.class);
		}
		public TypeDecContext typeDec(int i) {
			return getRuleContext(TypeDecContext.class,i);
		}
		public List<ListeDecContext> listeDec() {
			return getRuleContexts(ListeDecContext.class);
		}
		public ListeDecContext listeDec(int i) {
			return getRuleContext(ListeDecContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(TinyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TinyParser.SEMICOLON, i);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTCOMPIL) | (1L << FLOATCOMPIL) | (1L << STRINGCOMPIL))) != 0)) {
				{
				{
				setState(44);
				typeDec();
				setState(45);
				listeDec();
				setState(46);
				match(SEMICOLON);
				}
				}
				setState(52);
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

	public static class ListeDecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TinyParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(TinyParser.COMMA, 0); }
		public ListeDecContext listeDec() {
			return getRuleContext(ListeDecContext.class,0);
		}
		public ListeDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listeDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterListeDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitListeDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitListeDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListeDecContext listeDec() throws RecognitionException {
		ListeDecContext _localctx = new ListeDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listeDec);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(IDENTIFIER);
				setState(55);
				match(COMMA);
				setState(56);
				listeDec();
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

	public static class TypeDecContext extends ParserRuleContext {
		public TerminalNode INTCOMPIL() { return getToken(TinyParser.INTCOMPIL, 0); }
		public TerminalNode FLOATCOMPIL() { return getToken(TinyParser.FLOATCOMPIL, 0); }
		public TerminalNode STRINGCOMPIL() { return getToken(TinyParser.STRINGCOMPIL, 0); }
		public TypeDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterTypeDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitTypeDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitTypeDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDecContext typeDec() throws RecognitionException {
		TypeDecContext _localctx = new TypeDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTCOMPIL) | (1L << FLOATCOMPIL) | (1L << STRINGCOMPIL))) != 0)) ) {
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

	public static class DescPgmContext extends ParserRuleContext {
		public List<AffContext> aff() {
			return getRuleContexts(AffContext.class);
		}
		public AffContext aff(int i) {
			return getRuleContext(AffContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<ArithOperationContext> arithOperation() {
			return getRuleContexts(ArithOperationContext.class);
		}
		public ArithOperationContext arithOperation(int i) {
			return getRuleContext(ArithOperationContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<ScanContext> scan() {
			return getRuleContexts(ScanContext.class);
		}
		public ScanContext scan(int i) {
			return getRuleContext(ScanContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public DescPgmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descPgm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterDescPgm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitDescPgm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitDescPgm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescPgmContext descPgm() throws RecognitionException {
		DescPgmContext _localctx = new DescPgmContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_descPgm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IF) | (1L << DO) | (1L << SCANCOMPIL) | (1L << PRINTCOMPIL) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << FLOAT))) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(61);
					aff();
					}
					break;
				case 2:
					{
					setState(62);
					comparison();
					}
					break;
				case 3:
					{
					setState(63);
					arithOperation(0);
					}
					break;
				case 4:
					{
					setState(64);
					conditions();
					}
					break;
				case 5:
					{
					setState(65);
					loop();
					}
					break;
				case 6:
					{
					setState(66);
					scan();
					}
					break;
				case 7:
					{
					setState(67);
					print();
					}
					break;
				}
				}
				setState(72);
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

	public static class OperandeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TinyParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(TinyParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(TinyParser.FLOAT, 0); }
		public OperandeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operande; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterOperande(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitOperande(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitOperande(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandeContext operande() throws RecognitionException {
		OperandeContext _localctx = new OperandeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operande);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INTEGER) | (1L << FLOAT))) != 0)) ) {
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

	public static class AffContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TinyParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(TinyParser.ASSIGNMENT, 0); }
		public ArithOperationContext arithOperation() {
			return getRuleContext(ArithOperationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TinyParser.SEMICOLON, 0); }
		public OperandeContext operande() {
			return getRuleContext(OperandeContext.class,0);
		}
		public AffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitAff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitAff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffContext aff() throws RecognitionException {
		AffContext _localctx = new AffContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IDENTIFIER);
			setState(76);
			match(ASSIGNMENT);
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77);
				arithOperation(0);
				setState(78);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(80);
				operande();
				setState(81);
				match(SEMICOLON);
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

	public static class ArithOperationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TinyParser.LPAREN, 0); }
		public List<ArithOperationContext> arithOperation() {
			return getRuleContexts(ArithOperationContext.class);
		}
		public ArithOperationContext arithOperation(int i) {
			return getRuleContext(ArithOperationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TinyParser.RPAREN, 0); }
		public OperandeContext operande() {
			return getRuleContext(OperandeContext.class,0);
		}
		public TerminalNode DIV() { return getToken(TinyParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(TinyParser.MULT, 0); }
		public TerminalNode ADD() { return getToken(TinyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TinyParser.SUB, 0); }
		public ArithOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterArithOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitArithOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitArithOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithOperationContext arithOperation() throws RecognitionException {
		return arithOperation(0);
	}

	private ArithOperationContext arithOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithOperationContext _localctx = new ArithOperationContext(_ctx, _parentState);
		ArithOperationContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_arithOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(86);
				match(LPAREN);
				setState(87);
				arithOperation(0);
				setState(88);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
				{
				setState(90);
				operande();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ArithOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithOperation);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						match(DIV);
						setState(97);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(95);
							operande();
							}
							break;
						case 2:
							{
							setState(96);
							arithOperation(0);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new ArithOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithOperation);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(MULT);
						setState(103);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(101);
							operande();
							}
							break;
						case 2:
							{
							setState(102);
							arithOperation(0);
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new ArithOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithOperation);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(106);
						match(ADD);
						setState(109);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(107);
							operande();
							}
							break;
						case 2:
							{
							setState(108);
							arithOperation(0);
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new ArithOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithOperation);
						setState(111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(112);
						match(SUB);
						setState(115);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							setState(113);
							operande();
							}
							break;
						case 2:
							{
							setState(114);
							arithOperation(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class OpComparisonContext extends ParserRuleContext {
		public TerminalNode RANGLE() { return getToken(TinyParser.RANGLE, 0); }
		public TerminalNode LANGLE() { return getToken(TinyParser.LANGLE, 0); }
		public TerminalNode EQEQ() { return getToken(TinyParser.EQEQ, 0); }
		public TerminalNode EXCL_EQ() { return getToken(TinyParser.EXCL_EQ, 0); }
		public OpComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterOpComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitOpComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitOpComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpComparisonContext opComparison() throws RecognitionException {
		OpComparisonContext _localctx = new OpComparisonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RANGLE) | (1L << EQEQ) | (1L << EXCL_EQ) | (1L << LANGLE))) != 0)) ) {
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TinyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TinyParser.RPAREN, 0); }
		public List<OperandeContext> operande() {
			return getRuleContexts(OperandeContext.class);
		}
		public OperandeContext operande(int i) {
			return getRuleContext(OperandeContext.class,i);
		}
		public OpComparisonContext opComparison() {
			return getRuleContext(OpComparisonContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LPAREN);
			{
			setState(125);
			operande();
			setState(126);
			opComparison();
			setState(127);
			operande();
			}
			setState(129);
			match(RPAREN);
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

	public static class ConditionsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TinyParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TinyParser.THEN, 0); }
		public TerminalNode LCURL() { return getToken(TinyParser.LCURL, 0); }
		public DescPgmContext descPgm() {
			return getRuleContext(DescPgmContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(TinyParser.RCURL, 0); }
		public ElsContext els() {
			return getRuleContext(ElsContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IF);
			setState(132);
			comparison();
			setState(133);
			match(THEN);
			setState(134);
			match(LCURL);
			setState(135);
			descPgm();
			setState(136);
			match(RCURL);
			setState(137);
			els();
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

	public static class ElsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TinyParser.ELSE, 0); }
		public TerminalNode LCURL() { return getToken(TinyParser.LCURL, 0); }
		public DescPgmContext descPgm() {
			return getRuleContext(DescPgmContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(TinyParser.RCURL, 0); }
		public ElsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_els; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterEls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitEls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitEls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsContext els() throws RecognitionException {
		ElsContext _localctx = new ElsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_els);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ELSE);
				setState(140);
				match(LCURL);
				setState(141);
				descPgm();
				setState(142);
				match(RCURL);
				}
				break;
			case LPAREN:
			case RCURL:
			case IF:
			case DO:
			case SCANCOMPIL:
			case PRINTCOMPIL:
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TinyParser.DO, 0); }
		public TerminalNode LCURL() { return getToken(TinyParser.LCURL, 0); }
		public DescPgmContext descPgm() {
			return getRuleContext(DescPgmContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(TinyParser.RCURL, 0); }
		public TerminalNode WHILE() { return getToken(TinyParser.WHILE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(DO);
			setState(148);
			match(LCURL);
			setState(149);
			descPgm();
			setState(150);
			match(RCURL);
			setState(151);
			match(WHILE);
			setState(152);
			comparison();
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

	public static class ScanInputsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TinyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TinyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TinyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TinyParser.COMMA, i);
		}
		public ScanInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanInputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterScanInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitScanInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitScanInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanInputsContext scanInputs() throws RecognitionException {
		ScanInputsContext _localctx = new ScanInputsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scanInputs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(IDENTIFIER);
					setState(155);
					match(COMMA);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(161);
			match(IDENTIFIER);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCANCOMPIL() { return getToken(TinyParser.SCANCOMPIL, 0); }
		public TerminalNode LPAREN() { return getToken(TinyParser.LPAREN, 0); }
		public ScanInputsContext scanInputs() {
			return getRuleContext(ScanInputsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TinyParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TinyParser.SEMICOLON, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(SCANCOMPIL);
			setState(164);
			match(LPAREN);
			setState(165);
			scanInputs();
			setState(166);
			match(RPAREN);
			setState(167);
			match(SEMICOLON);
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TinyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TinyParser.IDENTIFIER, i);
		}
		public TerminalNode TEXT() { return getToken(TinyParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_text);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(169);
					match(IDENTIFIER);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(TEXT);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINTCOMPIL() { return getToken(TinyParser.PRINTCOMPIL, 0); }
		public TerminalNode LPAREN() { return getToken(TinyParser.LPAREN, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TinyParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TinyParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyParserListener ) ((TinyParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyParserVisitor ) return ((TinyParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(PRINTCOMPIL);
			setState(179);
			match(LPAREN);
			setState(180);
			text();
			setState(181);
			match(RPAREN);
			setState(182);
			match(SEMICOLON);
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
		case 7:
			return arithOperation_sempred((ArithOperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithOperation_sempred(ArithOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\63\n\3\f"+
		"\3\16\3\66\13\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bV\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\t\5\td\n\t\3"+
		"\t\3\t\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\t\3\t\3\t\3\t\5\tv"+
		"\n\t\7\tx\n\t\f\t\16\t{\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0094\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u009f\n\17\f\17\16"+
		"\17\u00a2\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\7\21\u00ad"+
		"\n\21\f\21\16\21\u00b0\13\21\3\21\5\21\u00b3\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\2\3\20\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2"+
		"\5\3\2\26\30\4\2\"\"$%\4\2\b\n))\2\u00c0\2$\3\2\2\2\4\64\3\2\2\2\6;\3"+
		"\2\2\2\b=\3\2\2\2\nH\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20]\3\2\2\2\22|\3"+
		"\2\2\2\24~\3\2\2\2\26\u0085\3\2\2\2\30\u0093\3\2\2\2\32\u0095\3\2\2\2"+
		"\34\u00a0\3\2\2\2\36\u00a5\3\2\2\2 \u00b2\3\2\2\2\"\u00b4\3\2\2\2$%\7"+
		"!\2\2%&\7\16\2\2&\'\7\17\2\2\'(\7\22\2\2()\5\4\3\2)*\7\25\2\2*+\5\n\6"+
		"\2+,\7\23\2\2,-\7\2\2\3-\3\3\2\2\2./\5\b\5\2/\60\5\6\4\2\60\61\7*\2\2"+
		"\61\63\3\2\2\2\62.\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\5\3\2\2\2\66\64\3\2\2\2\67<\7\"\2\289\7\"\2\29:\7\r\2\2:<\5\6\4\2;\67"+
		"\3\2\2\2;8\3\2\2\2<\7\3\2\2\2=>\t\2\2\2>\t\3\2\2\2?G\5\16\b\2@G\5\24\13"+
		"\2AG\5\20\t\2BG\5\26\f\2CG\5\32\16\2DG\5\36\20\2EG\5\"\22\2F?\3\2\2\2"+
		"F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JH\3\2\2\2KL\t\3\2\2L\r\3\2\2\2MN\7\""+
		"\2\2NU\7\13\2\2OP\5\20\t\2PQ\7*\2\2QV\3\2\2\2RS\5\f\7\2ST\7*\2\2TV\3\2"+
		"\2\2UO\3\2\2\2UR\3\2\2\2V\17\3\2\2\2WX\b\t\1\2XY\7\16\2\2YZ\5\20\t\2Z"+
		"[\7\17\2\2[^\3\2\2\2\\^\5\f\7\2]W\3\2\2\2]\\\3\2\2\2^y\3\2\2\2_`\f\7\2"+
		"\2`c\7\6\2\2ad\5\f\7\2bd\5\20\t\2ca\3\2\2\2cb\3\2\2\2dx\3\2\2\2ef\f\6"+
		"\2\2fi\7\5\2\2gj\5\f\7\2hj\5\20\t\2ig\3\2\2\2ih\3\2\2\2jx\3\2\2\2kl\f"+
		"\5\2\2lo\7\4\2\2mp\5\f\7\2np\5\20\t\2om\3\2\2\2on\3\2\2\2px\3\2\2\2qr"+
		"\f\4\2\2ru\7\3\2\2sv\5\f\7\2tv\5\20\t\2us\3\2\2\2ut\3\2\2\2vx\3\2\2\2"+
		"w_\3\2\2\2we\3\2\2\2wk\3\2\2\2wq\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z\21\3\2\2\2{y\3\2\2\2|}\t\4\2\2}\23\3\2\2\2~\177\7\16\2\2\177\u0080\5"+
		"\f\7\2\u0080\u0081\5\22\n\2\u0081\u0082\5\f\7\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\7\17\2\2\u0084\25\3\2\2\2\u0085\u0086\7\31\2\2\u0086\u0087\5\24"+
		"\13\2\u0087\u0088\7\32\2\2\u0088\u0089\7\22\2\2\u0089\u008a\5\n\6\2\u008a"+
		"\u008b\7\23\2\2\u008b\u008c\5\30\r\2\u008c\27\3\2\2\2\u008d\u008e\7\33"+
		"\2\2\u008e\u008f\7\22\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7\23\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\31\3\2\2\2\u0095\u0096\7\34\2\2\u0096\u0097\7\22\2\2\u0097"+
		"\u0098\5\n\6\2\u0098\u0099\7\23\2\2\u0099\u009a\7\35\2\2\u009a\u009b\5"+
		"\24\13\2\u009b\33\3\2\2\2\u009c\u009d\7\"\2\2\u009d\u009f\7\r\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\"\2\2\u00a4"+
		"\35\3\2\2\2\u00a5\u00a6\7\36\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\34"+
		"\17\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\7*\2\2\u00aa\37\3\2\2\2\u00ab\u00ad"+
		"\7\"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b3\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7&"+
		"\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b5"+
		"\7\37\2\2\u00b5\u00b6\7\16\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\17\2"+
		"\2\u00b8\u00b9\7*\2\2\u00b9#\3\2\2\2\22\64;FHU]ciouwy\u0093\u00a0\u00ae"+
		"\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/goku/Code/SII/Compil/Projet/src/main/antlr/TIny_language_Sii/TinyParser.g4 by ANTLR 4.9.1
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
		WHITESPACE=30, PROGNAMES=31, IDENTIFIER=32, LANGLE=33, SEMICOLON=34;
	public static final int
		RULE_start = 0, RULE_varDec = 1, RULE_listeDec = 2, RULE_typeDec = 3, 
		RULE_descPgm = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "varDec", "listeDec", "typeDec", "descPgm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'+'", "'*'", "'/'", null, "'>'", "'=='", "'!='", "'='", 
			"'.'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "'compil'", "'start'", 
			"'intCompil'", "'floatCompil'", "'StringCompil'", "'if'", "'then'", "'else'", 
			"'do'", "'while'", "'scanCompil'", "'printCompil'", "' '", null, null, 
			"'<'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUB", "ADD", "MULT", "DIV", "LAE", "RANGLE", "EQEQ", "EXCL_EQ", 
			"ASSIGNMENT", "DOT", "COMMA", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", 
			"LCURL", "RCURL", "COMPIL", "START", "INTCOMPIL", "FLOATCOMPIL", "STRINGCOMPIL", 
			"IF", "THEN", "ELSE", "DO", "WHILE", "SCANCOMPIL", "PRINTCOMPIL", "WHITESPACE", 
			"PROGNAMES", "IDENTIFIER", "LANGLE", "SEMICOLON"
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
		public TerminalNode COMPIL() { return getToken(TinyParser.COMPIL, 0); }
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
			setState(10);
			match(COMPIL);
			setState(11);
			match(PROGNAMES);
			setState(12);
			match(LPAREN);
			setState(13);
			match(RPAREN);
			setState(14);
			match(LCURL);
			setState(15);
			varDec();
			setState(16);
			match(START);
			setState(17);
			descPgm();
			setState(18);
			match(RCURL);
			setState(19);
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTCOMPIL) | (1L << FLOATCOMPIL) | (1L << STRINGCOMPIL))) != 0)) {
				{
				{
				setState(21);
				typeDec();
				setState(22);
				listeDec();
				setState(23);
				match(SEMICOLON);
				}
				}
				setState(29);
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(IDENTIFIER);
				setState(32);
				match(COMMA);
				setState(33);
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
			setState(36);
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
		public TerminalNode DOT() { return getToken(TinyParser.DOT, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(DOT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$+\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4\5\4%\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\26\30\2\'\2\f\3\2\2\2\4\35"+
		"\3\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n(\3\2\2\2\f\r\7\24\2\2\r\16\7!\2\2\16"+
		"\17\7\16\2\2\17\20\7\17\2\2\20\21\7\22\2\2\21\22\5\4\3\2\22\23\7\25\2"+
		"\2\23\24\5\n\6\2\24\25\7\23\2\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\5\b\5"+
		"\2\30\31\5\6\4\2\31\32\7$\2\2\32\34\3\2\2\2\33\27\3\2\2\2\34\37\3\2\2"+
		"\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37\35\3\2\2\2 %\7\"\2\2!\""+
		"\7\"\2\2\"#\7\r\2\2#%\5\6\4\2$ \3\2\2\2$!\3\2\2\2%\7\3\2\2\2&\'\t\2\2"+
		"\2\'\t\3\2\2\2()\7\f\2\2)\13\3\2\2\2\4\35$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
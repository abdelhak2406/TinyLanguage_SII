// Generated from /home/goku/Code/SII/Compil/ProjetC/src/TinyLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DelimitedComment", "LineComment", "SUB", "ADD", "MULT", "DIV", "LANGLE", 
			"RANGLE", "EQEQ", "EXCL_EQ", "ASSIGNMENT", "NL", "DOT", "COMMA", "LPAREN", 
			"RPAREN", "LSQUARE", "RSQUARE", "LCURL", "RCURL", "SEMICOLON", "COMPIL", 
			"START", "INTCOMPIL", "FLOATCOMPIL", "STRINGCOMPIL", "IF", "THEN", "ELSE", 
			"DO", "WHILE", "SCANCOMPIL", "PRINTCOMPIL", "WHITESPACE", "PROGNAMES", 
			"IDENTIFIER", "INTEGER", "FLOAT", "TEXT"
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


	public TinyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3e\n\3"+
		"\f\3\16\3h\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\5\r\u0083\n\r\5\r\u0085"+
		"\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\6$\u0100\n$\r"+
		"$\16$\u0101\3%\3%\7%\u0106\n%\f%\16%\u0109\13%\3&\5&\u010c\n&\3&\3&\7"+
		"&\u0110\n&\f&\16&\u0113\13&\3&\5&\u0116\n&\3\'\5\'\u0119\n\'\3\'\6\'\u011c"+
		"\n\'\r\'\16\'\u011d\3\'\5\'\u0121\n\'\3\'\3\'\3\'\7\'\u0126\n\'\f\'\16"+
		"\'\u0129\13\'\3\'\5\'\u012c\n\'\3(\3(\3X\2)\3\'\5(\7\3\t\4\13\5\r\6\17"+
		")\21\b\23\t\25\n\27\13\31#\33\f\35\r\37\16!\17#\20%\21\'\22)\23+*-\24"+
		"/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K$M%O&\3\2"+
		"\13\4\2\f\f\17\17\3\2C\\\5\2C\\aac|\4\2C\\c|\5\2\62;C\\c|\3\2//\3\2\63"+
		";\3\2\62;\3\2++\2\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3"+
		"Q\3\2\2\2\5`\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s"+
		"\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25z\3\2\2\2\27}\3\2\2\2\31\u0084\3\2"+
		"\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2\2\2"+
		"#\u0090\3\2\2\2%\u0092\3\2\2\2\'\u0094\3\2\2\2)\u0096\3\2\2\2+\u0098\3"+
		"\2\2\2-\u009a\3\2\2\2/\u00a1\3\2\2\2\61\u00a7\3\2\2\2\63\u00b1\3\2\2\2"+
		"\65\u00bd\3\2\2\2\67\u00ca\3\2\2\29\u00cd\3\2\2\2;\u00d2\3\2\2\2=\u00d7"+
		"\3\2\2\2?\u00da\3\2\2\2A\u00e0\3\2\2\2C\u00eb\3\2\2\2E\u00f7\3\2\2\2G"+
		"\u00fb\3\2\2\2I\u0103\3\2\2\2K\u010b\3\2\2\2M\u0118\3\2\2\2O\u012d\3\2"+
		"\2\2QR\7\61\2\2RS\7,\2\2SX\3\2\2\2TW\5\3\2\2UW\13\2\2\2VT\3\2\2\2VU\3"+
		"\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7,\2\2\\]"+
		"\7\61\2\2]^\3\2\2\2^_\b\2\2\2_\4\3\2\2\2`a\7\61\2\2ab\7\61\2\2bf\3\2\2"+
		"\2ce\n\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2"+
		"\2ij\b\3\2\2j\6\3\2\2\2kl\7/\2\2l\b\3\2\2\2mn\7-\2\2n\n\3\2\2\2op\7,\2"+
		"\2p\f\3\2\2\2qr\7\61\2\2r\16\3\2\2\2st\7>\2\2t\20\3\2\2\2uv\7@\2\2v\22"+
		"\3\2\2\2wx\7?\2\2xy\7?\2\2y\24\3\2\2\2z{\7#\2\2{|\7?\2\2|\26\3\2\2\2}"+
		"~\7?\2\2~\30\3\2\2\2\177\u0085\7\f\2\2\u0080\u0082\7\17\2\2\u0081\u0083"+
		"\7\f\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\177\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\r\2"+
		"\2\u0087\32\3\2\2\2\u0088\u0089\7\60\2\2\u0089\34\3\2\2\2\u008a\u008b"+
		"\7.\2\2\u008b\36\3\2\2\2\u008c\u008d\7*\2\2\u008d \3\2\2\2\u008e\u008f"+
		"\7+\2\2\u008f\"\3\2\2\2\u0090\u0091\7]\2\2\u0091$\3\2\2\2\u0092\u0093"+
		"\7_\2\2\u0093&\3\2\2\2\u0094\u0095\7}\2\2\u0095(\3\2\2\2\u0096\u0097\7"+
		"\177\2\2\u0097*\3\2\2\2\u0098\u0099\7=\2\2\u0099,\3\2\2\2\u009a\u009b"+
		"\7e\2\2\u009b\u009c\7q\2\2\u009c\u009d\7o\2\2\u009d\u009e\7r\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7n\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7v\2\2"+
		"\u00a6\60\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7"+
		"v\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae"+
		"\7r\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0\62\3\2\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7o\2\2"+
		"\u00b9\u00ba\7r\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\64\3\2"+
		"\2\2\u00bd\u00be\7U\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7i\2\2\u00c3\u00c4\7E\2\2\u00c4"+
		"\u00c5\7q\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7k\2\2"+
		"\u00c8\u00c9\7n\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7"+
		"h\2\2\u00cc8\3\2\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7p\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6<\3\2\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\u00d9\7q\2\2\u00d9>\3\2\2\2\u00da\u00db\7y\2\2\u00db\u00dc"+
		"\7j\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df"+
		"@\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7p\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7o\2\2"+
		"\u00e7\u00e8\7r\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7n\2\2\u00eaB\3\2\2"+
		"\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7E\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7o\2\2\u00f3\u00f4\7r\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7n\2\2"+
		"\u00f6D\3\2\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b"+
		"#\2\2\u00faF\3\2\2\2\u00fb\u00fc\5-\27\2\u00fc\u00fd\5E#\2\u00fd\u00ff"+
		"\t\3\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102H\3\2\2\2\u0103\u0107\t\5\2\2"+
		"\u0104\u0106\t\6\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108J\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010c\t\7\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0115\3\2"+
		"\2\2\u010d\u0111\t\b\2\2\u010e\u0110\t\t\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0116\7\62\2\2\u0115\u010d\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116L\3\2\2\2\u0117\u0119\t\7\2\2\u0118\u0117\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u0120\3\2\2\2\u011a\u011c\t\t\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u0121\7\62\2\2\u0120\u011b\3\2\2\2\u0120\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u012b\5\33\16\2\u0123\u0127\t\b\2\2\u0124"+
		"\u0126\t\t\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012c\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012c\7\62\2\2\u012b\u0123\3\2\2\2\u012b\u012a\3\2\2\2\u012cN\3\2\2\2"+
		"\u012d\u012e\n\n\2\2\u012eP\3\2\2\2\22\2VXf\u0082\u0084\u0101\u0107\u010b"+
		"\u0111\u0115\u0118\u011d\u0120\u0127\u012b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
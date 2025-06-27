package org.example.antlr4.generated.simplesql;// Generated from SimpleSql.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INSERT=12, INTO=13, VALUES=14, SELECT=15, FROM=16, 
		WHERE=17, UPDATE=18, SET=19, DELETE=20, ID=21, NUMBER=22, STRING=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "INSERT", "INTO", "VALUES", "SELECT", "FROM", "WHERE", 
			"UPDATE", "SET", "DELETE", "ID", "NUMBER", "STRING", "WS", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'*'", "'='", "'!='", "'>'", "'<'", 
			"'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INSERT", "INTO", "VALUES", "SELECT", "FROM", "WHERE", "UPDATE", "SET", 
			"DELETE", "ID", "NUMBER", "STRING", "WS"
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


	public SimpleSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleSql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0111\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\7\26\u00ba\n\26\f\26\16\26\u00bd\13\26\3"+
		"\27\6\27\u00c0\n\27\r\27\16\27\u00c1\3\27\3\27\6\27\u00c6\n\27\r\27\16"+
		"\27\u00c7\5\27\u00ca\n\27\3\30\3\30\3\30\3\30\7\30\u00d0\n\30\f\30\16"+
		"\30\u00d3\13\30\3\30\3\30\3\31\6\31\u00d8\n\31\r\31\16\31\u00d9\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\2\2"+
		"\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2;\2"+
		"=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2\3\2!\5"+
		"\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2))^^\5\2\13\f\17\17\"\"\4\2CCcc\4"+
		"\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLl"+
		"l\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2"+
		"UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00fd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2"+
		"\2\rq\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27}\3\2"+
		"\2\2\31\u0080\3\2\2\2\33\u0087\3\2\2\2\35\u008c\3\2\2\2\37\u0093\3\2\2"+
		"\2!\u009a\3\2\2\2#\u009f\3\2\2\2%\u00a5\3\2\2\2\'\u00ac\3\2\2\2)\u00b0"+
		"\3\2\2\2+\u00b7\3\2\2\2-\u00bf\3\2\2\2/\u00cb\3\2\2\2\61\u00d7\3\2\2\2"+
		"\63\u00dd\3\2\2\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e3\3\2\2\2;\u00e5"+
		"\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00eb\3\2\2\2C\u00ed\3\2\2\2E"+
		"\u00ef\3\2\2\2G\u00f1\3\2\2\2I\u00f3\3\2\2\2K\u00f5\3\2\2\2M\u00f7\3\2"+
		"\2\2O\u00f9\3\2\2\2Q\u00fb\3\2\2\2S\u00fd\3\2\2\2U\u00ff\3\2\2\2W\u0101"+
		"\3\2\2\2Y\u0103\3\2\2\2[\u0105\3\2\2\2]\u0107\3\2\2\2_\u0109\3\2\2\2a"+
		"\u010b\3\2\2\2c\u010d\3\2\2\2e\u010f\3\2\2\2gh\7=\2\2h\4\3\2\2\2ij\7*"+
		"\2\2j\6\3\2\2\2kl\7+\2\2l\b\3\2\2\2mn\7.\2\2n\n\3\2\2\2op\7,\2\2p\f\3"+
		"\2\2\2qr\7?\2\2r\16\3\2\2\2st\7#\2\2tu\7?\2\2u\20\3\2\2\2vw\7@\2\2w\22"+
		"\3\2\2\2xy\7>\2\2y\24\3\2\2\2z{\7@\2\2{|\7?\2\2|\26\3\2\2\2}~\7>\2\2~"+
		"\177\7?\2\2\177\30\3\2\2\2\u0080\u0081\5C\"\2\u0081\u0082\5M\'\2\u0082"+
		"\u0083\5W,\2\u0083\u0084\5;\36\2\u0084\u0085\5U+\2\u0085\u0086\5Y-\2\u0086"+
		"\32\3\2\2\2\u0087\u0088\5C\"\2\u0088\u0089\5M\'\2\u0089\u008a\5Y-\2\u008a"+
		"\u008b\5O(\2\u008b\34\3\2\2\2\u008c\u008d\5]/\2\u008d\u008e\5\63\32\2"+
		"\u008e\u008f\5I%\2\u008f\u0090\5[.\2\u0090\u0091\5;\36\2\u0091\u0092\5"+
		"W,\2\u0092\36\3\2\2\2\u0093\u0094\5W,\2\u0094\u0095\5;\36\2\u0095\u0096"+
		"\5I%\2\u0096\u0097\5;\36\2\u0097\u0098\5\67\34\2\u0098\u0099\5Y-\2\u0099"+
		" \3\2\2\2\u009a\u009b\5=\37\2\u009b\u009c\5U+\2\u009c\u009d\5O(\2\u009d"+
		"\u009e\5K&\2\u009e\"\3\2\2\2\u009f\u00a0\5_\60\2\u00a0\u00a1\5A!\2\u00a1"+
		"\u00a2\5;\36\2\u00a2\u00a3\5U+\2\u00a3\u00a4\5;\36\2\u00a4$\3\2\2\2\u00a5"+
		"\u00a6\5[.\2\u00a6\u00a7\5Q)\2\u00a7\u00a8\59\35\2\u00a8\u00a9\5\63\32"+
		"\2\u00a9\u00aa\5Y-\2\u00aa\u00ab\5;\36\2\u00ab&\3\2\2\2\u00ac\u00ad\5"+
		"W,\2\u00ad\u00ae\5;\36\2\u00ae\u00af\5Y-\2\u00af(\3\2\2\2\u00b0\u00b1"+
		"\59\35\2\u00b1\u00b2\5;\36\2\u00b2\u00b3\5I%\2\u00b3\u00b4\5;\36\2\u00b4"+
		"\u00b5\5Y-\2\u00b5\u00b6\5;\36\2\u00b6*\3\2\2\2\u00b7\u00bb\t\2\2\2\u00b8"+
		"\u00ba\t\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc,\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0"+
		"\t\4\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c9\3\2\2\2\u00c3\u00c5\7\60\2\2\u00c4\u00c6\t"+
		"\4\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca.\3\2\2\2\u00cb\u00d1\7)\2\2\u00cc\u00d0\n\5\2\2\u00cd\u00ce"+
		"\7^\2\2\u00ce\u00d0\13\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7)\2\2\u00d5\60\3\2\2\2\u00d6\u00d8"+
		"\t\6\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\31\2\2\u00dc\62\3\2\2"+
		"\2\u00dd\u00de\t\7\2\2\u00de\64\3\2\2\2\u00df\u00e0\t\b\2\2\u00e0\66\3"+
		"\2\2\2\u00e1\u00e2\t\t\2\2\u00e28\3\2\2\2\u00e3\u00e4\t\n\2\2\u00e4:\3"+
		"\2\2\2\u00e5\u00e6\t\13\2\2\u00e6<\3\2\2\2\u00e7\u00e8\t\f\2\2\u00e8>"+
		"\3\2\2\2\u00e9\u00ea\t\r\2\2\u00ea@\3\2\2\2\u00eb\u00ec\t\16\2\2\u00ec"+
		"B\3\2\2\2\u00ed\u00ee\t\17\2\2\u00eeD\3\2\2\2\u00ef\u00f0\t\20\2\2\u00f0"+
		"F\3\2\2\2\u00f1\u00f2\t\21\2\2\u00f2H\3\2\2\2\u00f3\u00f4\t\22\2\2\u00f4"+
		"J\3\2\2\2\u00f5\u00f6\t\23\2\2\u00f6L\3\2\2\2\u00f7\u00f8\t\24\2\2\u00f8"+
		"N\3\2\2\2\u00f9\u00fa\t\25\2\2\u00faP\3\2\2\2\u00fb\u00fc\t\26\2\2\u00fc"+
		"R\3\2\2\2\u00fd\u00fe\t\27\2\2\u00feT\3\2\2\2\u00ff\u0100\t\30\2\2\u0100"+
		"V\3\2\2\2\u0101\u0102\t\31\2\2\u0102X\3\2\2\2\u0103\u0104\t\32\2\2\u0104"+
		"Z\3\2\2\2\u0105\u0106\t\33\2\2\u0106\\\3\2\2\2\u0107\u0108\t\34\2\2\u0108"+
		"^\3\2\2\2\u0109\u010a\t\35\2\2\u010a`\3\2\2\2\u010b\u010c\t\36\2\2\u010c"+
		"b\3\2\2\2\u010d\u010e\t\37\2\2\u010ed\3\2\2\2\u010f\u0110\t \2\2\u0110"+
		"f\3\2\2\2\n\2\u00bb\u00c1\u00c7\u00c9\u00cf\u00d1\u00d9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
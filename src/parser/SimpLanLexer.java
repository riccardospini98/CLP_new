// Generated from SimpLan.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpLanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, INTEGER=22, ID=23, WS=24, LINECOMENTS=25, 
		BLOCKCOMENTS=26, ERR=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "DIGIT", "INTEGER", "CHAR", "ID", 
		"WS", "LINECOMENTS", "BLOCKCOMENTS", "ERR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'let'", "'in'", "'='", "'('", "','", "')'", "'int'", "'bool'", 
		"'-'", "'+'", "'*'", "'/'", "'=='", "'true'", "'false'", "'if'", "'then'", 
		"'{'", "'}'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "INTEGER", 
		"ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", "ERR"
	};
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


	   //there is a much better way to do this, check the ANTLR guide
	   public int lexicalErrors=0;


	public SimpLanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpLan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("Invalid char: "+ getText()); lexicalErrors++; 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\6\30\u0082\n\30\r\30\16\30\u0083\3\31\3\31\3\32\3\32\3"+
		"\32\7\32\u008b\n\32\f\32\16\32\u008e\13\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\7\34\u0098\n\34\f\34\16\34\u009b\13\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u00a8\n\35\f\35\16\35\u00ab"+
		"\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\2\2\37\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\2/\30\61\2\63\31\65\32\67\339\34;\35\3\2\b"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61"+
		"\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2"+
		"\5?\3\2\2\2\7C\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21"+
		"N\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2"+
		"\35_\3\2\2\2\37b\3\2\2\2!g\3\2\2\2#m\3\2\2\2%p\3\2\2\2\'u\3\2\2\2)w\3"+
		"\2\2\2+y\3\2\2\2-~\3\2\2\2/\u0081\3\2\2\2\61\u0085\3\2\2\2\63\u0087\3"+
		"\2\2\2\65\u008f\3\2\2\2\67\u0093\3\2\2\29\u009e\3\2\2\2;\u00b1\3\2\2\2"+
		"=>\7=\2\2>\4\3\2\2\2?@\7n\2\2@A\7g\2\2AB\7v\2\2B\6\3\2\2\2CD\7k\2\2DE"+
		"\7p\2\2E\b\3\2\2\2FG\7?\2\2G\n\3\2\2\2HI\7*\2\2I\f\3\2\2\2JK\7.\2\2K\16"+
		"\3\2\2\2LM\7+\2\2M\20\3\2\2\2NO\7k\2\2OP\7p\2\2PQ\7v\2\2Q\22\3\2\2\2R"+
		"S\7d\2\2ST\7q\2\2TU\7q\2\2UV\7n\2\2V\24\3\2\2\2WX\7/\2\2X\26\3\2\2\2Y"+
		"Z\7-\2\2Z\30\3\2\2\2[\\\7,\2\2\\\32\3\2\2\2]^\7\61\2\2^\34\3\2\2\2_`\7"+
		"?\2\2`a\7?\2\2a\36\3\2\2\2bc\7v\2\2cd\7t\2\2de\7w\2\2ef\7g\2\2f \3\2\2"+
		"\2gh\7h\2\2hi\7c\2\2ij\7n\2\2jk\7u\2\2kl\7g\2\2l\"\3\2\2\2mn\7k\2\2no"+
		"\7h\2\2o$\3\2\2\2pq\7v\2\2qr\7j\2\2rs\7g\2\2st\7p\2\2t&\3\2\2\2uv\7}\2"+
		"\2v(\3\2\2\2wx\7\177\2\2x*\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2"+
		"},\3\2\2\2~\177\4\62;\2\177.\3\2\2\2\u0080\u0082\5-\27\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\60\3\2\2\2\u0085\u0086\t\2\2\2\u0086\62\3\2\2\2\u0087\u008c\5\61\31\2"+
		"\u0088\u008b\5\61\31\2\u0089\u008b\5-\27\2\u008a\u0088\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\64\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\t\3\2\2\u0090\u0091\3\2\2"+
		"\2\u0091\u0092\b\33\2\2\u0092\66\3\2\2\2\u0093\u0094\7\61\2\2\u0094\u0095"+
		"\7\61\2\2\u0095\u0099\3\2\2\2\u0096\u0098\n\4\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\b\34\2\2\u009d8\3\2\2\2\u009e"+
		"\u009f\7\61\2\2\u009f\u00a0\7,\2\2\u00a0\u00a9\3\2\2\2\u00a1\u00a8\n\5"+
		"\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a8\n\6\2\2\u00a4\u00a5\7,\2\2\u00a5"+
		"\u00a8\n\7\2\2\u00a6\u00a8\59\35\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2"+
		"\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\7,\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\b\35\2\2\u00b0:\3\2\2\2\u00b1\u00b2\13\2\2\2\u00b2\u00b3\b\36\3"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\36\4\2\u00b5<\3\2\2\2\t\2\u0083\u008a"+
		"\u008c\u0099\u00a7\u00a9\5\b\2\2\3\36\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from SVM.g4 by ANTLR 4.6
package parser;

import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LOAD=4, STORE=5, STOREI=6, MOVE=7, ADD=8, ADDI=9, 
		SUB=10, SUBI=11, MUL=12, MULI=13, DIV=14, DIVI=15, PUSH=16, PUSHR=17, 
		POP=18, POPR=19, BRANCH=20, BRANCHEQ=21, BRANCHLESSEQ=22, JUMPSUB=23, 
		RETURNSUB=24, HALT=25, REG=26, LABEL=27, NUMBER=28, WHITESP=29, LINECOMENTS=30, 
		ERR=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LOAD", "STORE", "STOREI", "MOVE", "ADD", "ADDI", 
		"SUB", "SUBI", "MUL", "MULI", "DIV", "DIVI", "PUSH", "PUSHR", "POP", "POPR", 
		"BRANCH", "BRANCHEQ", "BRANCHLESSEQ", "JUMPSUB", "RETURNSUB", "HALT", 
		"REG", "LABEL", "NUMBER", "WHITESP", "LINECOMENTS", "ERR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'load'", "'store'", "'storei'", "'move'", 
		"'add'", "'addi'", "'sub'", "'subi'", "'mul'", "'muli'", "'div'", "'divi'", 
		"'push'", "'pushr'", "'pop'", "'popr'", "'b'", "'beq'", "'bleq'", "'jsub'", 
		"'rsub'", "'halt'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "LOAD", "STORE", "STOREI", "MOVE", "ADD", "ADDI", 
		"SUB", "SUBI", "MUL", "MULI", "DIV", "DIVI", "PUSH", "PUSHR", "POP", "POPR", 
		"BRANCH", "BRANCHEQ", "BRANCHLESSEQ", "JUMPSUB", "RETURNSUB", "HALT", 
		"REG", "LABEL", "NUMBER", "WHITESP", "LINECOMENTS", "ERR"
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


	public int lexicalErrors=0;


	public SVMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SVM.g4"; }

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
		case 30:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.err.println("Invalid char: "+ getText()); lexicalErrors++;  
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00bf\n\33\3\34\3\34\7\34\u00c3\n\34\f\34\16\34\u00c6"+
		"\13\34\3\35\3\35\5\35\u00ca\n\35\3\35\3\35\7\35\u00ce\n\35\f\35\16\35"+
		"\u00d1\13\35\5\35\u00d3\n\35\3\36\6\36\u00d6\n\36\r\36\16\36\u00d7\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\7\37\u00e0\n\37\f\37\16\37\u00e3\13\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!\3\2\6\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\u00f6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C"+
		"\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13L\3\2\2\2\rR\3\2\2\2\17Y\3\2\2\2\21^"+
		"\3\2\2\2\23b\3\2\2\2\25g\3\2\2\2\27k\3\2\2\2\31p\3\2\2\2\33t\3\2\2\2\35"+
		"y\3\2\2\2\37}\3\2\2\2!\u0082\3\2\2\2#\u0087\3\2\2\2%\u008d\3\2\2\2\'\u0091"+
		"\3\2\2\2)\u0096\3\2\2\2+\u0098\3\2\2\2-\u009c\3\2\2\2/\u00a1\3\2\2\2\61"+
		"\u00a6\3\2\2\2\63\u00ab\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00d2"+
		"\3\2\2\2;\u00d5\3\2\2\2=\u00db\3\2\2\2?\u00e6\3\2\2\2AB\7*\2\2B\4\3\2"+
		"\2\2CD\7+\2\2D\6\3\2\2\2EF\7<\2\2F\b\3\2\2\2GH\7n\2\2HI\7q\2\2IJ\7c\2"+
		"\2JK\7f\2\2K\n\3\2\2\2LM\7u\2\2MN\7v\2\2NO\7q\2\2OP\7t\2\2PQ\7g\2\2Q\f"+
		"\3\2\2\2RS\7u\2\2ST\7v\2\2TU\7q\2\2UV\7t\2\2VW\7g\2\2WX\7k\2\2X\16\3\2"+
		"\2\2YZ\7o\2\2Z[\7q\2\2[\\\7x\2\2\\]\7g\2\2]\20\3\2\2\2^_\7c\2\2_`\7f\2"+
		"\2`a\7f\2\2a\22\3\2\2\2bc\7c\2\2cd\7f\2\2de\7f\2\2ef\7k\2\2f\24\3\2\2"+
		"\2gh\7u\2\2hi\7w\2\2ij\7d\2\2j\26\3\2\2\2kl\7u\2\2lm\7w\2\2mn\7d\2\2n"+
		"o\7k\2\2o\30\3\2\2\2pq\7o\2\2qr\7w\2\2rs\7n\2\2s\32\3\2\2\2tu\7o\2\2u"+
		"v\7w\2\2vw\7n\2\2wx\7k\2\2x\34\3\2\2\2yz\7f\2\2z{\7k\2\2{|\7x\2\2|\36"+
		"\3\2\2\2}~\7f\2\2~\177\7k\2\2\177\u0080\7x\2\2\u0080\u0081\7k\2\2\u0081"+
		" \3\2\2\2\u0082\u0083\7r\2\2\u0083\u0084\7w\2\2\u0084\u0085\7u\2\2\u0085"+
		"\u0086\7j\2\2\u0086\"\3\2\2\2\u0087\u0088\7r\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7j\2\2\u008b\u008c\7t\2\2\u008c$\3\2\2\2\u008d"+
		"\u008e\7r\2\2\u008e\u008f\7q\2\2\u008f\u0090\7r\2\2\u0090&\3\2\2\2\u0091"+
		"\u0092\7r\2\2\u0092\u0093\7q\2\2\u0093\u0094\7r\2\2\u0094\u0095\7t\2\2"+
		"\u0095(\3\2\2\2\u0096\u0097\7d\2\2\u0097*\3\2\2\2\u0098\u0099\7d\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7s\2\2\u009b,\3\2\2\2\u009c\u009d\7d\2\2\u009d"+
		"\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7s\2\2\u00a0.\3\2\2\2\u00a1"+
		"\u00a2\7l\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7d\2\2"+
		"\u00a5\60\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7"+
		"w\2\2\u00a9\u00aa\7d\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7v\2\2\u00af\64\3\2\2\2\u00b0\u00b1"+
		"\7C\2\2\u00b1\u00bf\7\62\2\2\u00b2\u00b3\7T\2\2\u00b3\u00bf\7C\2\2\u00b4"+
		"\u00b5\7H\2\2\u00b5\u00bf\7R\2\2\u00b6\u00b7\7U\2\2\u00b7\u00bf\7R\2\2"+
		"\u00b8\u00b9\7C\2\2\u00b9\u00bf\7N\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bf"+
		"\7\63\2\2\u00bc\u00bd\7V\2\2\u00bd\u00bf\7\64\2\2\u00be\u00b0\3\2\2\2"+
		"\u00be\u00b2\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b8"+
		"\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\66\3\2\2\2\u00c0"+
		"\u00c4\t\2\2\2\u00c1\u00c3\t\3\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c58\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00d3\7\62\2\2\u00c8\u00ca\7/\2\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\4\63;\2\u00cc\u00ce\4\62"+
		";\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00c7\3\2"+
		"\2\2\u00d2\u00c9\3\2\2\2\u00d3:\3\2\2\2\u00d4\u00d6\t\4\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\b\36\2\2\u00da<\3\2\2\2\u00db\u00dc\7\61\2"+
		"\2\u00dc\u00dd\7\61\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e0\n\5\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\37\3\2\u00e5"+
		">\3\2\2\2\u00e6\u00e7\13\2\2\2\u00e7\u00e8\b \4\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00ea\b \2\2\u00ea@\3\2\2\2\n\2\u00be\u00c4\u00c9\u00cf\u00d2\u00d7"+
		"\u00e1\5\2\3\2\b\2\2\3 \2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
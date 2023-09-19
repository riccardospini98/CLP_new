// Generated from SVM.g4 by ANTLR 4.6
package parser;

import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVMParser extends Parser {
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
	public static final int
		RULE_assembly = 0, RULE_instruction = 1;
	public static final String[] ruleNames = {
		"assembly", "instruction"
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

	@Override
	public String getGrammarFileName() { return "SVM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SVMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AssemblyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public AssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembly; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyContext assembly() throws RecognitionException {
		AssemblyContext _localctx = new AssemblyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_assembly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOAD) | (1L << STORE) | (1L << STOREI) | (1L << MOVE) | (1L << ADD) | (1L << ADDI) | (1L << SUB) | (1L << SUBI) | (1L << MUL) | (1L << MULI) | (1L << DIV) | (1L << DIVI) | (1L << PUSH) | (1L << PUSHR) | (1L << POP) | (1L << POPR) | (1L << BRANCH) | (1L << BRANCHEQ) | (1L << BRANCHLESSEQ) | (1L << JUMPSUB) | (1L << RETURNSUB) | (1L << HALT) | (1L << LABEL))) != 0)) {
				{
				{
				setState(4);
				instruction();
				}
				}
				setState(9);
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

	public static class InstructionContext extends ParserRuleContext {
		public Token n;
		public Token l;
		public TerminalNode LOAD() { return getToken(SVMParser.LOAD, 0); }
		public List<TerminalNode> REG() { return getTokens(SVMParser.REG); }
		public TerminalNode REG(int i) {
			return getToken(SVMParser.REG, i);
		}
		public TerminalNode NUMBER() { return getToken(SVMParser.NUMBER, 0); }
		public TerminalNode STORE() { return getToken(SVMParser.STORE, 0); }
		public TerminalNode STOREI() { return getToken(SVMParser.STOREI, 0); }
		public TerminalNode MOVE() { return getToken(SVMParser.MOVE, 0); }
		public TerminalNode ADD() { return getToken(SVMParser.ADD, 0); }
		public TerminalNode ADDI() { return getToken(SVMParser.ADDI, 0); }
		public TerminalNode SUB() { return getToken(SVMParser.SUB, 0); }
		public TerminalNode SUBI() { return getToken(SVMParser.SUBI, 0); }
		public TerminalNode MUL() { return getToken(SVMParser.MUL, 0); }
		public TerminalNode MULI() { return getToken(SVMParser.MULI, 0); }
		public TerminalNode DIV() { return getToken(SVMParser.DIV, 0); }
		public TerminalNode DIVI() { return getToken(SVMParser.DIVI, 0); }
		public TerminalNode PUSH() { return getToken(SVMParser.PUSH, 0); }
		public TerminalNode PUSHR() { return getToken(SVMParser.PUSHR, 0); }
		public TerminalNode POP() { return getToken(SVMParser.POP, 0); }
		public TerminalNode POPR() { return getToken(SVMParser.POPR, 0); }
		public TerminalNode BRANCH() { return getToken(SVMParser.BRANCH, 0); }
		public TerminalNode LABEL() { return getToken(SVMParser.LABEL, 0); }
		public TerminalNode BRANCHEQ() { return getToken(SVMParser.BRANCHEQ, 0); }
		public TerminalNode BRANCHLESSEQ() { return getToken(SVMParser.BRANCHLESSEQ, 0); }
		public TerminalNode JUMPSUB() { return getToken(SVMParser.JUMPSUB, 0); }
		public TerminalNode RETURNSUB() { return getToken(SVMParser.RETURNSUB, 0); }
		public TerminalNode HALT() { return getToken(SVMParser.HALT, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SVMVisitor ) return ((SVMVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOAD:
				{
				setState(10);
				match(LOAD);
				setState(11);
				match(REG);
				setState(12);
				match(NUMBER);
				setState(13);
				match(T__0);
				setState(14);
				match(REG);
				setState(15);
				match(T__1);
				}
				break;
			case STORE:
				{
				setState(16);
				match(STORE);
				setState(17);
				match(REG);
				setState(18);
				match(NUMBER);
				setState(19);
				match(T__0);
				setState(20);
				match(REG);
				setState(21);
				match(T__1);
				}
				break;
			case STOREI:
				{
				setState(22);
				match(STOREI);
				setState(23);
				match(REG);
				setState(24);
				match(NUMBER);
				}
				break;
			case MOVE:
				{
				setState(25);
				match(MOVE);
				setState(26);
				match(REG);
				setState(27);
				match(REG);
				}
				break;
			case ADD:
				{
				setState(28);
				match(ADD);
				setState(29);
				match(REG);
				setState(30);
				match(REG);
				}
				break;
			case ADDI:
				{
				setState(31);
				match(ADDI);
				setState(32);
				match(REG);
				setState(33);
				match(NUMBER);
				}
				break;
			case SUB:
				{
				setState(34);
				match(SUB);
				setState(35);
				match(REG);
				setState(36);
				match(REG);
				}
				break;
			case SUBI:
				{
				setState(37);
				match(SUBI);
				setState(38);
				match(REG);
				setState(39);
				match(NUMBER);
				}
				break;
			case MUL:
				{
				setState(40);
				match(MUL);
				setState(41);
				match(REG);
				setState(42);
				match(REG);
				}
				break;
			case MULI:
				{
				setState(43);
				match(MULI);
				setState(44);
				match(REG);
				setState(45);
				match(NUMBER);
				}
				break;
			case DIV:
				{
				setState(46);
				match(DIV);
				setState(47);
				match(REG);
				setState(48);
				match(REG);
				}
				break;
			case DIVI:
				{
				setState(49);
				match(DIVI);
				setState(50);
				match(REG);
				setState(51);
				match(NUMBER);
				}
				break;
			case PUSH:
				{
				setState(52);
				match(PUSH);
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(53);
					((InstructionContext)_localctx).n = match(NUMBER);
					}
					break;
				case LABEL:
					{
					setState(54);
					((InstructionContext)_localctx).l = match(LABEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case PUSHR:
				{
				setState(57);
				match(PUSHR);
				setState(58);
				match(REG);
				}
				break;
			case POP:
				{
				setState(59);
				match(POP);
				}
				break;
			case POPR:
				{
				setState(60);
				match(POPR);
				setState(61);
				match(REG);
				}
				break;
			case BRANCH:
				{
				setState(62);
				match(BRANCH);
				setState(63);
				match(LABEL);
				}
				break;
			case BRANCHEQ:
				{
				setState(64);
				match(BRANCHEQ);
				setState(65);
				match(REG);
				setState(66);
				match(REG);
				setState(67);
				match(LABEL);
				}
				break;
			case BRANCHLESSEQ:
				{
				setState(68);
				match(BRANCHLESSEQ);
				setState(69);
				match(REG);
				setState(70);
				match(REG);
				setState(71);
				match(LABEL);
				}
				break;
			case JUMPSUB:
				{
				setState(72);
				match(JUMPSUB);
				setState(73);
				match(LABEL);
				}
				break;
			case RETURNSUB:
				{
				setState(74);
				match(RETURNSUB);
				setState(75);
				match(REG);
				}
				break;
			case LABEL:
				{
				setState(76);
				((InstructionContext)_localctx).l = match(LABEL);
				setState(77);
				match(T__2);
				}
				break;
			case HALT:
				{
				setState(78);
				match(HALT);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!T\4\2\t\2\4\3\t\3"+
		"\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R\n\3\3\3\2\2\4\2\4\2\2i\2\t\3\2\2\2"+
		"\4Q\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2"+
		"\2\n\3\3\2\2\2\13\t\3\2\2\2\f\r\7\6\2\2\r\16\7\34\2\2\16\17\7\36\2\2\17"+
		"\20\7\3\2\2\20\21\7\34\2\2\21R\7\4\2\2\22\23\7\7\2\2\23\24\7\34\2\2\24"+
		"\25\7\36\2\2\25\26\7\3\2\2\26\27\7\34\2\2\27R\7\4\2\2\30\31\7\b\2\2\31"+
		"\32\7\34\2\2\32R\7\36\2\2\33\34\7\t\2\2\34\35\7\34\2\2\35R\7\34\2\2\36"+
		"\37\7\n\2\2\37 \7\34\2\2 R\7\34\2\2!\"\7\13\2\2\"#\7\34\2\2#R\7\36\2\2"+
		"$%\7\f\2\2%&\7\34\2\2&R\7\34\2\2\'(\7\r\2\2()\7\34\2\2)R\7\36\2\2*+\7"+
		"\16\2\2+,\7\34\2\2,R\7\34\2\2-.\7\17\2\2./\7\34\2\2/R\7\36\2\2\60\61\7"+
		"\20\2\2\61\62\7\34\2\2\62R\7\34\2\2\63\64\7\21\2\2\64\65\7\34\2\2\65R"+
		"\7\36\2\2\669\7\22\2\2\67:\7\36\2\28:\7\35\2\29\67\3\2\2\298\3\2\2\2:"+
		"R\3\2\2\2;<\7\23\2\2<R\7\34\2\2=R\7\24\2\2>?\7\25\2\2?R\7\34\2\2@A\7\26"+
		"\2\2AR\7\35\2\2BC\7\27\2\2CD\7\34\2\2DE\7\34\2\2ER\7\35\2\2FG\7\30\2\2"+
		"GH\7\34\2\2HI\7\34\2\2IR\7\35\2\2JK\7\31\2\2KR\7\35\2\2LM\7\32\2\2MR\7"+
		"\34\2\2NO\7\35\2\2OR\7\5\2\2PR\7\33\2\2Q\f\3\2\2\2Q\22\3\2\2\2Q\30\3\2"+
		"\2\2Q\33\3\2\2\2Q\36\3\2\2\2Q!\3\2\2\2Q$\3\2\2\2Q\'\3\2\2\2Q*\3\2\2\2"+
		"Q-\3\2\2\2Q\60\3\2\2\2Q\63\3\2\2\2Q\66\3\2\2\2Q;\3\2\2\2Q=\3\2\2\2Q>\3"+
		"\2\2\2Q@\3\2\2\2QB\3\2\2\2QF\3\2\2\2QJ\3\2\2\2QL\3\2\2\2QN\3\2\2\2QP\3"+
		"\2\2\2R\5\3\2\2\2\5\t9Q";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
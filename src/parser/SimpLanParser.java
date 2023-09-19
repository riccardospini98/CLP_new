// Generated from SimpLan.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpLanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, INTEGER=22, ID=23, WS=24, LINECOMENTS=25, 
		BLOCKCOMENTS=26, ERR=27;
	public static final int
		RULE_prog = 0, RULE_let = 1, RULE_dec = 2, RULE_param = 3, RULE_type = 4, 
		RULE_exp = 5, RULE_term = 6, RULE_factor = 7, RULE_value = 8;
	public static final String[] ruleNames = {
		"prog", "let", "dec", "param", "type", "exp", "term", "factor", "value"
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

	@Override
	public String getGrammarFileName() { return "SimpLan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpLanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetInExpContext extends ProgContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LetInExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitLetInExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleExpContext extends ProgContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SingleExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitSingleExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__9:
			case T__14:
			case T__15:
			case T__16:
			case INTEGER:
			case ID:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				exp();
				setState(19);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new LetInExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				let();
				setState(22);
				exp();
				setState(23);
				match(T__0);
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

	public static class LetContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__1);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				dec();
				setState(29);
				match(T__0);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==T__8 );
			setState(35);
			match(T__2);
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

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunDecContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpLanParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public FunDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitFunDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdInitContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpLanParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdInitContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitIdInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				type();
				setState(38);
				match(ID);
				setState(39);
				match(T__3);
				setState(40);
				exp();
				}
				break;
			case 2:
				_localctx = new FunDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				type();
				setState(43);
				match(ID);
				setState(44);
				match(T__4);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7 || _la==T__8) {
					{
					setState(45);
					param();
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(46);
						match(T__5);
						setState(47);
						param();
						}
						}
						setState(52);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(55);
				match(T__6);
				setState(56);
				match(T__3);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(57);
					let();
					}
				}

				setState(60);
				exp();
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpLanParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class ExpContext extends ParserRuleContext {
		public TermContext left;
		public Token plus;
		public Token sub;
		public ExpContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(69);
				match(T__9);
				}
			}

			setState(72);
			((ExpContext)_localctx).left = term();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(73);
					((ExpContext)_localctx).plus = match(T__10);
					}
					break;
				case T__9:
					{
					setState(74);
					((ExpContext)_localctx).sub = match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77);
				((ExpContext)_localctx).right = exp();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext left;
		public Token mul;
		public Token div;
		public TermContext right;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((TermContext)_localctx).left = factor();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(81);
					((TermContext)_localctx).mul = match(T__11);
					}
					break;
				case T__12:
					{
					setState(82);
					((TermContext)_localctx).div = match(T__12);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85);
				((TermContext)_localctx).right = term();
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

	public static class FactorContext extends ParserRuleContext {
		public ValueContext left;
		public ValueContext right;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((FactorContext)_localctx).left = value();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(89);
				match(T__13);
				setState(90);
				((FactorContext)_localctx).right = value();
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseExpContext extends ValueContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BaseExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpContext extends ValueContext {
		public TerminalNode ID() { return getToken(SimpLanParser.ID, 0); }
		public VarExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntValContext extends ValueContext {
		public TerminalNode INTEGER() { return getToken(SimpLanParser.INTEGER, 0); }
		public IntValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ValueContext {
		public ExpContext cond;
		public ExpContext thenBranch;
		public ExpContext elseBranch;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValContext extends ValueContext {
		public BoolValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunExpContext extends ValueContext {
		public TerminalNode ID() { return getToken(SimpLanParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunExpContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanVisitor ) return ((SimpLanVisitor<? extends T>)visitor).visitFunExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__4);
				setState(96);
				exp();
				setState(97);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new IfExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__16);
				setState(100);
				((IfExpContext)_localctx).cond = exp();
				setState(101);
				match(T__17);
				setState(102);
				match(T__18);
				setState(103);
				((IfExpContext)_localctx).thenBranch = exp();
				setState(104);
				match(T__19);
				setState(105);
				match(T__20);
				setState(106);
				match(T__18);
				setState(107);
				((IfExpContext)_localctx).elseBranch = exp();
				setState(108);
				match(T__19);
				}
				break;
			case 5:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(ID);
				}
				break;
			case 6:
				_localctx = new FunExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(ID);
				setState(112);
				match(T__4);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(113);
					exp();
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(114);
						match(T__5);
						setState(115);
						exp();
						}
						}
						setState(120);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(123);
				match(T__6);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\6\3\"\n\3\r\3\16\3#"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4\16"+
		"\4\66\13\4\5\48\n\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\5\7I\n\7\3\7\3\7\3\7\5\7N\n\7\3\7\5\7Q\n\7\3\b\3\b\3\b\5"+
		"\bV\n\b\3\b\5\bY\n\b\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nw"+
		"\n\n\f\n\16\nz\13\n\5\n|\n\n\3\n\5\n\177\n\n\3\n\2\2\13\2\4\6\b\n\f\16"+
		"\20\22\2\4\3\2\n\13\3\2\21\22\u008a\2\33\3\2\2\2\4\35\3\2\2\2\6@\3\2\2"+
		"\2\bB\3\2\2\2\nE\3\2\2\2\fH\3\2\2\2\16R\3\2\2\2\20Z\3\2\2\2\22~\3\2\2"+
		"\2\24\25\5\f\7\2\25\26\7\3\2\2\26\34\3\2\2\2\27\30\5\4\3\2\30\31\5\f\7"+
		"\2\31\32\7\3\2\2\32\34\3\2\2\2\33\24\3\2\2\2\33\27\3\2\2\2\34\3\3\2\2"+
		"\2\35!\7\4\2\2\36\37\5\6\4\2\37 \7\3\2\2 \"\3\2\2\2!\36\3\2\2\2\"#\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\5\2\2&\5\3\2\2\2\'(\5\n\6\2()\7"+
		"\31\2\2)*\7\6\2\2*+\5\f\7\2+A\3\2\2\2,-\5\n\6\2-.\7\31\2\2.\67\7\7\2\2"+
		"/\64\5\b\5\2\60\61\7\b\2\2\61\63\5\b\5\2\62\60\3\2\2\2\63\66\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\67/\3\2\2\2\678\3"+
		"\2\2\289\3\2\2\29:\7\t\2\2:<\7\6\2\2;=\5\4\3\2<;\3\2\2\2<=\3\2\2\2=>\3"+
		"\2\2\2>?\5\f\7\2?A\3\2\2\2@\'\3\2\2\2@,\3\2\2\2A\7\3\2\2\2BC\5\n\6\2C"+
		"D\7\31\2\2D\t\3\2\2\2EF\t\2\2\2F\13\3\2\2\2GI\7\f\2\2HG\3\2\2\2HI\3\2"+
		"\2\2IJ\3\2\2\2JP\5\16\b\2KN\7\r\2\2LN\7\f\2\2MK\3\2\2\2ML\3\2\2\2NO\3"+
		"\2\2\2OQ\5\f\7\2PM\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RX\5\20\t\2SV\7\16\2\2"+
		"TV\7\17\2\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WY\5\16\b\2XU\3\2\2\2XY\3\2\2"+
		"\2Y\17\3\2\2\2Z]\5\22\n\2[\\\7\20\2\2\\^\5\22\n\2][\3\2\2\2]^\3\2\2\2"+
		"^\21\3\2\2\2_\177\7\30\2\2`\177\t\3\2\2ab\7\7\2\2bc\5\f\7\2cd\7\t\2\2"+
		"d\177\3\2\2\2ef\7\23\2\2fg\5\f\7\2gh\7\24\2\2hi\7\25\2\2ij\5\f\7\2jk\7"+
		"\26\2\2kl\7\27\2\2lm\7\25\2\2mn\5\f\7\2no\7\26\2\2o\177\3\2\2\2p\177\7"+
		"\31\2\2qr\7\31\2\2r{\7\7\2\2sx\5\f\7\2tu\7\b\2\2uw\5\f\7\2vt\3\2\2\2w"+
		"z\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2{|\3\2\2\2"+
		"|}\3\2\2\2}\177\7\t\2\2~_\3\2\2\2~`\3\2\2\2~a\3\2\2\2~e\3\2\2\2~p\3\2"+
		"\2\2~q\3\2\2\2\177\23\3\2\2\2\21\33#\64\67<@HMPUX]x{~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Functions.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, NUM=12;
	public static final int
		RULE_dec = 0, RULE_expr = 1, RULE_muldiv = 2, RULE_func = 3, RULE_ids = 4, 
		RULE_paren = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"dec", "expr", "muldiv", "func", "ids", "paren"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "'func'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUM"
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
	public String getGrammarFileName() { return "Functions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
	public static class DecVarContext extends DecContext {
		public TerminalNode ID() { return getToken(FunctionsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecVarContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitDecVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecFuncContext extends DecContext {
		public TerminalNode ID() { return getToken(FunctionsParser.ID, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecFuncContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitDecFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dec);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new DecVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(T__0);
				setState(13);
				match(ID);
				setState(14);
				match(T__1);
				setState(15);
				expr(0);
				}
				break;
			case T__2:
				_localctx = new DecFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__2);
				setState(17);
				match(ID);
				setState(18);
				match(T__3);
				setState(19);
				ids(0);
				setState(20);
				match(T__4);
				setState(21);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSubContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MuldivContext muldiv() {
			return getRuleContext(MuldivContext.class,0);
		}
		public ExprSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMuldivContext extends ExprContext {
		public MuldivContext muldiv() {
			return getRuleContext(MuldivContext.class,0);
		}
		public ExprMuldivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitExprMuldiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSomaContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MuldivContext muldiv() {
			return getRuleContext(MuldivContext.class,0);
		}
		public ExprSomaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitExprSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprMuldivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(26);
			muldiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(34);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprSomaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29);
						match(T__5);
						setState(30);
						muldiv(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32);
						match(T__6);
						setState(33);
						muldiv(0);
						}
						break;
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class MuldivContext extends ParserRuleContext {
		public MuldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muldiv; }
	 
		public MuldivContext() { }
		public void copyFrom(MuldivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MuldivDivContext extends MuldivContext {
		public MuldivContext muldiv() {
			return getRuleContext(MuldivContext.class,0);
		}
		public ParenContext paren() {
			return getRuleContext(ParenContext.class,0);
		}
		public MuldivDivContext(MuldivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitMuldivDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuldivMulContext extends MuldivContext {
		public MuldivContext muldiv() {
			return getRuleContext(MuldivContext.class,0);
		}
		public ParenContext paren() {
			return getRuleContext(ParenContext.class,0);
		}
		public MuldivMulContext(MuldivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitMuldivMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuldivParenContext extends MuldivContext {
		public ParenContext paren() {
			return getRuleContext(ParenContext.class,0);
		}
		public MuldivParenContext(MuldivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitMuldivParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuldivContext muldiv() throws RecognitionException {
		return muldiv(0);
	}

	private MuldivContext muldiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MuldivContext _localctx = new MuldivContext(_ctx, _parentState);
		MuldivContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_muldiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MuldivParenContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(40);
			paren();
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(48);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivMulContext(new MuldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_muldiv);
						setState(42);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(43);
						match(T__7);
						setState(44);
						paren();
						}
						break;
					case 2:
						{
						_localctx = new MuldivDivContext(new MuldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_muldiv);
						setState(45);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(46);
						match(T__8);
						setState(47);
						paren();
						}
						break;
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends FuncContext {
		public TerminalNode ID() { return getToken(FunctionsParser.ID, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public FunctionContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			setState(54);
			match(T__3);
			setState(55);
			ids(0);
			setState(56);
			match(T__4);
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

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunctionsParser.ID, 0); }
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		return ids(0);
	}

	private IdsContext ids(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdsContext _localctx = new IdsContext(_ctx, _parentState);
		IdsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_ids, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(59);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ids);
					setState(61);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(62);
					match(T__9);
					setState(63);
					ids(3);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ParenContext extends ParserRuleContext {
		public ParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren; }
	 
		public ParenContext() { }
		public void copyFrom(ParenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenIDContext extends ParenContext {
		public TerminalNode ID() { return getToken(FunctionsParser.ID, 0); }
		public ParenIDContext(ParenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitParenID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenParenContext extends ParenContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenParenContext(ParenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitParenParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenNumContext extends ParenContext {
		public TerminalNode NUM() { return getToken(FunctionsParser.NUM, 0); }
		public ParenNumContext(ParenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitParenNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenFuncContext extends ParenContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ParenFuncContext(ParenContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionsVisitor ) return ((FunctionsVisitor<? extends T>)visitor).visitParenFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenContext paren() throws RecognitionException {
		ParenContext _localctx = new ParenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paren);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ParenIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParenNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(NUM);
				}
				break;
			case 3:
				_localctx = new ParenFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				func();
				}
				break;
			case 4:
				_localctx = new ParenParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(T__3);
				setState(73);
				expr(0);
				setState(74);
				match(T__4);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 2:
			return muldiv_sempred((MuldivContext)_localctx, predIndex);
		case 4:
			return ids_sempred((IdsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean muldiv_sempred(MuldivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ids_sempred(IdsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3\f\3\16"+
		"\3(\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4\16\4\66\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6C\n\6\f\6\16\6F\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\7\2\5\4\6\n\b\2\4\6\b\n\f\2\2"+
		"\2S\2\31\3\2\2\2\4\33\3\2\2\2\6)\3\2\2\2\b\67\3\2\2\2\n<\3\2\2\2\fN\3"+
		"\2\2\2\16\17\7\3\2\2\17\20\7\r\2\2\20\21\7\4\2\2\21\32\5\4\3\2\22\23\7"+
		"\5\2\2\23\24\7\r\2\2\24\25\7\6\2\2\25\26\5\n\6\2\26\27\7\7\2\2\27\30\5"+
		"\4\3\2\30\32\3\2\2\2\31\16\3\2\2\2\31\22\3\2\2\2\32\3\3\2\2\2\33\34\b"+
		"\3\1\2\34\35\5\6\4\2\35&\3\2\2\2\36\37\f\5\2\2\37 \7\b\2\2 %\5\6\4\2!"+
		"\"\f\4\2\2\"#\7\t\2\2#%\5\6\4\2$\36\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)*\b\4\1\2*+\5\f\7\2+\64\3\2\2\2"+
		",-\f\5\2\2-.\7\n\2\2.\63\5\f\7\2/\60\f\4\2\2\60\61\7\13\2\2\61\63\5\f"+
		"\7\2\62,\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\7\3\2\2\2\66\64\3\2\2\2\678\7\r\2\289\7\6\2\29:\5\n\6\2:;\7\7\2\2"+
		";\t\3\2\2\2<=\b\6\1\2=>\7\r\2\2>D\3\2\2\2?@\f\4\2\2@A\7\f\2\2AC\5\n\6"+
		"\5B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\13\3\2\2\2FD\3\2\2\2GO\7\r"+
		"\2\2HO\7\16\2\2IO\5\b\5\2JK\7\6\2\2KL\5\4\3\2LM\7\7\2\2MO\3\2\2\2NG\3"+
		"\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2O\r\3\2\2\2\t\31$&\62\64DN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
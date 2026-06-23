// Generated from /home/markov/Desktop/projects/github/Project-Automata/StaticToDynamic/src/main/antlr4/StaticToDynamic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StaticToDynamicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NUMERIC_TYPE=27, STRING_TYPE=28, FLOAT=29, INTEGER=30, 
		STRING=31, ID=32, WS=33;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_structMember = 2, RULE_argList = 3, 
		RULE_forInit = 4, RULE_forUpdate = 5, RULE_block = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "structMember", "argList", "forInit", "forUpdate", 
			"block", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "'}'", "';'", "'='", "'['", "']'", "'for'", 
			"'('", "')'", "'.'", "','", "'++'", "'--'", "'+='", "'-='", "'*'", "'/'", 
			"'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", null, "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUMERIC_TYPE", "STRING_TYPE", "FLOAT", "INTEGER", 
			"STRING", "ID", "WS"
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
	public String getGrammarFileName() { return "StaticToDynamic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StaticToDynamicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StaticToDynamicParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << NUMERIC_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericDeclContext extends StatementContext {
		public TerminalNode NUMERIC_TYPE() { return getToken(StaticToDynamicParser.NUMERIC_TYPE, 0); }
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NumericDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterNumericDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitNumericDecl(this);
		}
	}
	public static class MemberAssignContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(StaticToDynamicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StaticToDynamicParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MemberAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterMemberAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitMemberAssign(this);
		}
	}
	public static class ForStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitForStmt(this);
		}
	}
	public static class AssignStmtContext extends StatementContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMERIC_TYPE() { return getToken(StaticToDynamicParser.NUMERIC_TYPE, 0); }
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitAssignStmt(this);
		}
	}
	public static class StructDefContext extends StatementContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterStructDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitStructDef(this);
		}
	}
	public static class StructDeclContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(StaticToDynamicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StaticToDynamicParser.ID, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public StructDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterStructDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitStructDecl(this);
		}
	}
	public static class StringDeclContext extends StatementContext {
		public TerminalNode STRING_TYPE() { return getToken(StaticToDynamicParser.STRING_TYPE, 0); }
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public TerminalNode STRING() { return getToken(StaticToDynamicParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(StaticToDynamicParser.INTEGER, 0); }
		public StringDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterStringDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitStringDecl(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new StructDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(T__0);
				setState(25);
				match(ID);
				setState(26);
				match(T__1);
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(27);
					structMember();
					}
					}
					setState(30); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERIC_TYPE );
				setState(32);
				match(T__2);
				setState(33);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new StructDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__0);
				setState(36);
				match(ID);
				setState(37);
				match(ID);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(38);
					match(T__4);
					setState(39);
					match(T__1);
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << FLOAT) | (1L << INTEGER) | (1L << ID))) != 0)) {
						{
						setState(40);
						argList();
						}
					}

					setState(43);
					match(T__2);
					}
				}

				setState(46);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new NumericDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(NUMERIC_TYPE);
				setState(48);
				match(ID);
				setState(49);
				match(T__4);
				setState(50);
				expr(0);
				setState(51);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new StringDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				match(STRING_TYPE);
				setState(54);
				match(ID);
				setState(55);
				match(T__5);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(56);
					match(INTEGER);
					}
				}

				setState(59);
				match(T__6);
				setState(60);
				match(T__4);
				setState(61);
				match(STRING);
				setState(62);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(T__7);
				setState(64);
				match(T__8);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERIC_TYPE || _la==ID) {
					{
					setState(65);
					forInit();
					}
				}

				setState(68);
				match(T__3);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << FLOAT) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(69);
					expr(0);
					}
				}

				setState(72);
				match(T__3);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(73);
					forUpdate();
					}
				}

				setState(76);
				match(T__9);
				setState(77);
				block();
				}
				break;
			case 6:
				_localctx = new MemberAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				match(ID);
				setState(79);
				match(T__10);
				setState(80);
				match(ID);
				setState(81);
				match(T__4);
				setState(82);
				expr(0);
				setState(83);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERIC_TYPE) {
					{
					setState(85);
					match(NUMERIC_TYPE);
					}
				}

				setState(88);
				match(ID);
				setState(89);
				match(T__4);
				setState(90);
				expr(0);
				setState(91);
				match(T__3);
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

	public static class StructMemberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_TYPE() { return getToken(StaticToDynamicParser.NUMERIC_TYPE, 0); }
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitStructMember(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(NUMERIC_TYPE);
			setState(96);
			match(ID);
			setState(97);
			match(T__3);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			expr(0);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(100);
				match(T__11);
				setState(101);
				expr(0);
				}
				}
				setState(106);
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

	public static class ForInitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMERIC_TYPE() { return getToken(StaticToDynamicParser.NUMERIC_TYPE, 0); }
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_TYPE) {
				{
				setState(107);
				match(NUMERIC_TYPE);
				}
			}

			setState(110);
			match(ID);
			setState(111);
			match(T__4);
			setState(112);
			expr(0);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	 
		public ForUpdateContext() { }
		public void copyFrom(ForUpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostIncContext extends ForUpdateContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public PostIncContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterPostInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitPostInc(this);
		}
	}
	public static class PlusEqContext extends ForUpdateContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PlusEqContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterPlusEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitPlusEq(this);
		}
	}
	public static class MinusEqContext extends ForUpdateContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinusEqContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterMinusEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitMinusEq(this);
		}
	}
	public static class UpdateAssignContext extends ForUpdateContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateAssignContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterUpdateAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitUpdateAssign(this);
		}
	}
	public static class PostDecContext extends ForUpdateContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public PostDecContext(ForUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterPostDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitPostDec(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forUpdate);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new PostIncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(ID);
				setState(115);
				match(T__12);
				}
				break;
			case 2:
				_localctx = new PostDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(ID);
				setState(117);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new PlusEqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(ID);
				setState(119);
				match(T__14);
				setState(120);
				expr(0);
				}
				break;
			case 4:
				_localctx = new MinusEqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(ID);
				setState(122);
				match(T__15);
				setState(123);
				expr(0);
				}
				break;
			case 5:
				_localctx = new UpdateAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(ID);
				setState(125);
				match(T__4);
				setState(126);
				expr(0);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__1);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << NUMERIC_TYPE) | (1L << STRING_TYPE) | (1L << ID))) != 0)) {
					{
					{
					setState(130);
					statement();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__2);
				}
				break;
			case T__0:
			case T__7:
			case NUMERIC_TYPE:
			case STRING_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitParens(this);
		}
	}
	public static class CompareContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitCompare(this);
		}
	}
	public static class FloatLitContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(StaticToDynamicParser.FLOAT, 0); }
		public FloatLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterFloatLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitFloatLit(this);
		}
	}
	public static class IntLitContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(StaticToDynamicParser.INTEGER, 0); }
		public IntLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitIntLit(this);
		}
	}
	public static class MemberRefContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public MemberRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterMemberRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitMemberRef(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitAddSub(this);
		}
	}
	public static class IdRefContext extends ExprContext {
		public TerminalNode ID() { return getToken(StaticToDynamicParser.ID, 0); }
		public IdRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterIdRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitIdRef(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaticToDynamicListener ) ((StaticToDynamicListener)listener).exitMulDiv(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141);
				match(T__8);
				setState(142);
				expr(0);
				setState(143);
				match(T__9);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(FLOAT);
				}
				break;
			case INTEGER:
				{
				_localctx = new IntLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(INTEGER);
				}
				break;
			case ID:
				{
				_localctx = new IdRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(151);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(154);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(157);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new MemberRefContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(160);
						match(T__10);
						setState(161);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2"+
		"\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3E\n\3"+
		"\3\3\3\3\5\3I\n\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3Y\n\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\7\5i\n\5\f\5\16\5l\13\5\3\6\5\6o\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\7\b\u0086\n"+
		"\b\f\b\16\b\u0089\13\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0097\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\5\3"+
		"\2\23\24\3\2\25\26\3\2\27\34\2\u00bf\2\25\3\2\2\2\4_\3\2\2\2\6a\3\2\2"+
		"\2\be\3\2\2\2\nn\3\2\2\2\f\u0081\3\2\2\2\16\u008c\3\2\2\2\20\u0096\3\2"+
		"\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\33\7\3"+
		"\2\2\33\34\7\"\2\2\34\36\7\4\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2"+
		"\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\5\2\2#$\7\6\2\2$`\3\2\2\2%&\7"+
		"\3\2\2&\'\7\"\2\2\'.\7\"\2\2()\7\7\2\2)+\7\4\2\2*,\5\b\5\2+*\3\2\2\2+"+
		",\3\2\2\2,-\3\2\2\2-/\7\5\2\2.(\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60`\7\6"+
		"\2\2\61\62\7\35\2\2\62\63\7\"\2\2\63\64\7\7\2\2\64\65\5\20\t\2\65\66\7"+
		"\6\2\2\66`\3\2\2\2\678\7\36\2\289\7\"\2\29;\7\b\2\2:<\7 \2\2;:\3\2\2\2"+
		";<\3\2\2\2<=\3\2\2\2=>\7\t\2\2>?\7\7\2\2?@\7!\2\2@`\7\6\2\2AB\7\n\2\2"+
		"BD\7\13\2\2CE\5\n\6\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FH\7\6\2\2GI\5\20\t"+
		"\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\7\6\2\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2"+
		"\2MN\3\2\2\2NO\7\f\2\2O`\5\16\b\2PQ\7\"\2\2QR\7\r\2\2RS\7\"\2\2ST\7\7"+
		"\2\2TU\5\20\t\2UV\7\6\2\2V`\3\2\2\2WY\7\35\2\2XW\3\2\2\2XY\3\2\2\2YZ\3"+
		"\2\2\2Z[\7\"\2\2[\\\7\7\2\2\\]\5\20\t\2]^\7\6\2\2^`\3\2\2\2_\32\3\2\2"+
		"\2_%\3\2\2\2_\61\3\2\2\2_\67\3\2\2\2_A\3\2\2\2_P\3\2\2\2_X\3\2\2\2`\5"+
		"\3\2\2\2ab\7\35\2\2bc\7\"\2\2cd\7\6\2\2d\7\3\2\2\2ej\5\20\t\2fg\7\16\2"+
		"\2gi\5\20\t\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2"+
		"\2\2mo\7\35\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\"\2\2qr\7\7\2\2rs\5"+
		"\20\t\2s\13\3\2\2\2tu\7\"\2\2u\u0082\7\17\2\2vw\7\"\2\2w\u0082\7\20\2"+
		"\2xy\7\"\2\2yz\7\21\2\2z\u0082\5\20\t\2{|\7\"\2\2|}\7\22\2\2}\u0082\5"+
		"\20\t\2~\177\7\"\2\2\177\u0080\7\7\2\2\u0080\u0082\5\20\t\2\u0081t\3\2"+
		"\2\2\u0081v\3\2\2\2\u0081x\3\2\2\2\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082"+
		"\r\3\2\2\2\u0083\u0087\7\4\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008d\7\5\2\2\u008b\u008d\5\4\3\2\u008c"+
		"\u0083\3\2\2\2\u008c\u008b\3\2\2\2\u008d\17\3\2\2\2\u008e\u008f\b\t\1"+
		"\2\u008f\u0090\7\13\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7\f\2\2\u0092"+
		"\u0097\3\2\2\2\u0093\u0097\7\37\2\2\u0094\u0097\7 \2\2\u0095\u0097\7\""+
		"\2\2\u0096\u008e\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u00a6\3\2\2\2\u0098\u0099\f\t\2\2\u0099\u009a\t\2"+
		"\2\2\u009a\u00a5\5\20\t\n\u009b\u009c\f\b\2\2\u009c\u009d\t\3\2\2\u009d"+
		"\u00a5\5\20\t\t\u009e\u009f\f\7\2\2\u009f\u00a0\t\4\2\2\u00a0\u00a5\5"+
		"\20\t\b\u00a1\u00a2\f\n\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a5\7\"\2\2\u00a4"+
		"\u0098\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\21\3\2\2\2\u00a8\u00a6\3\2\2\2\24\25 +.;DHLX_jn\u0081\u0087\u008c\u0096"+
		"\u00a4\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
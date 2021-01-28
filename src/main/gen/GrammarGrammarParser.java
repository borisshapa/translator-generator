// Generated from /home/borisshapa/Projects/translator-generator/src/main/antlr/GrammarParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NON_TERMINAL=1, ARROW=2, EPS=3, LBRACKET=4, RBRACKET=5, ASSIGN=6, OR=7, 
		TERMINAL=8;
	public static final int
		RULE_grammarRules = 0, RULE_grammarRule = 1, RULE_nonTerminalChild = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"grammarRules", "grammarRule", "nonTerminalChild"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'->'", "'\\eps'", "'{'", "'}'", "'='", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NON_TERMINAL", "ARROW", "EPS", "LBRACKET", "RBRACKET", "ASSIGN", 
			"OR", "TERMINAL"
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
	public String getGrammarFileName() { return "GrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GrammarRulesContext extends ParserRuleContext {
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public GrammarRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarParserListener ) ((GrammarGrammarParserListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarParserListener ) ((GrammarGrammarParserListener)listener).exitGrammarRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarParserVisitor ) return ((GrammarGrammarParserVisitor<? extends T>)visitor).visitGrammarRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRulesContext grammarRules() throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERMINAL) {
				{
				{
				setState(6);
				grammarRule();
				}
				}
				setState(11);
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

	public static class GrammarRuleContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarGrammarParser.NON_TERMINAL, 0); }
		public TerminalNode ARROW() { return getToken(GrammarGrammarParser.ARROW, 0); }
		public List<NonTerminalChildContext> nonTerminalChild() {
			return getRuleContexts(NonTerminalChildContext.class);
		}
		public NonTerminalChildContext nonTerminalChild(int i) {
			return getRuleContext(NonTerminalChildContext.class,i);
		}
		public TerminalNode OR() { return getToken(GrammarGrammarParser.OR, 0); }
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarParserListener ) ((GrammarGrammarParserListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarParserListener ) ((GrammarGrammarParserListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarParserVisitor ) return ((GrammarGrammarParserVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(NON_TERMINAL);
			setState(13);
			match(ARROW);
			setState(14);
			nonTerminalChild();
			{
			setState(15);
			match(OR);
			setState(16);
			nonTerminalChild();
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

	public static class NonTerminalChildContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarGrammarParser.NON_TERMINAL, 0); }
		public TerminalNode TERMINAL() { return getToken(GrammarGrammarParser.TERMINAL, 0); }
		public NonTerminalChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalChild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarParserListener ) ((GrammarGrammarParserListener)listener).enterNonTerminalChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarGrammarParserListener ) ((GrammarGrammarParserListener)listener).exitNonTerminalChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarGrammarParserVisitor ) return ((GrammarGrammarParserVisitor<? extends T>)visitor).visitNonTerminalChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalChildContext nonTerminalChild() throws RecognitionException {
		NonTerminalChildContext _localctx = new NonTerminalChildContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonTerminalChild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_la = _input.LA(1);
			if ( !(_la==NON_TERMINAL || _la==TERMINAL) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\2\2\5\2\4\6\2\3\4\2\3\3\n\n\2\24\2\13\3\2\2\2\4\16\3\2\2\2\6"+
		"\24\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2"+
		"\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17\7\3\2\2\17\20\7\4\2\2\20\21\5\6\4"+
		"\2\21\22\7\t\2\2\22\23\5\6\4\2\23\5\3\2\2\2\24\25\t\2\2\2\25\7\3\2\2\2"+
		"\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
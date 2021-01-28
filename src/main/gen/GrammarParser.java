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
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Node=1, LeftBracket=2, RightBracket=3, LeftBrace=4, RightBrace=5, LeftParen=6, 
		RightParen=7, Arrow=8, Eps=9, Tilda=10, Plus=11, Star=12, Whitespace=13, 
		Newline=14, Skip=15, String=16, StringWithoutNewlines=17;
	public static final int
		RULE_attribute = 0, RULE_terminal = 1, RULE_grammarInfo = 2, RULE_ruleChild = 3, 
		RULE_initAttributes = 4, RULE_initAttribute = 5, RULE_grammarRules = 6, 
		RULE_grammarRule = 7, RULE_fold = 8, RULE_skipRule = 9, RULE_regex = 10, 
		RULE_brackets = 11, RULE_parens = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"attribute", "terminal", "grammarInfo", "ruleChild", "initAttributes", 
			"initAttribute", "grammarRules", "grammarRule", "fold", "skipRule", "regex", 
			"brackets", "parens"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'->'", "'\\eps'", 
			"'~'", "'+'", "'*'", null, null, "'skip'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Node", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"LeftParen", "RightParen", "Arrow", "Eps", "Tilda", "Plus", "Star", "Whitespace", 
			"Newline", "Skip", "String", "StringWithoutNewlines"
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

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(GrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(GrammarParser.RightBrace, 0); }
		public TerminalNode StringWithoutNewlines() { return getToken(GrammarParser.StringWithoutNewlines, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LeftBrace);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringWithoutNewlines) {
				{
				setState(27);
				match(StringWithoutNewlines);
				}
			}

			setState(30);
			match(RightBrace);
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

	public static class TerminalContext extends ParserRuleContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Eps() { return getToken(GrammarParser.Eps, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_terminal);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
			case LeftParen:
			case Tilda:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				regex();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(String);
				}
				break;
			case Eps:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(Eps);
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

	public static class GrammarInfoContext extends ParserRuleContext {
		public InitAttributesContext initAttributes() {
			return getRuleContext(InitAttributesContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(GrammarParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(GrammarParser.Newline, i);
		}
		public GrammarRulesContext grammarRules() {
			return getRuleContext(GrammarRulesContext.class,0);
		}
		public GrammarInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGrammarInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGrammarInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitGrammarInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarInfoContext grammarInfo() throws RecognitionException {
		GrammarInfoContext _localctx = new GrammarInfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			initAttributes();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Newline) {
				{
				{
				setState(38);
				match(Newline);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Node || _la==LeftBracket) {
				{
				setState(44);
				grammarRules();
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

	public static class RuleChildContext extends ParserRuleContext {
		public TerminalNode Node() { return getToken(GrammarParser.Node, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RuleChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleChild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterRuleChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitRuleChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitRuleChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleChildContext ruleChild() throws RecognitionException {
		RuleChildContext _localctx = new RuleChildContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleChild);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Node:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(Node);
				}
				break;
			case LeftBracket:
			case LeftParen:
			case Eps:
			case Tilda:
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				terminal();
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

	public static class InitAttributesContext extends ParserRuleContext {
		public List<InitAttributeContext> initAttribute() {
			return getRuleContexts(InitAttributeContext.class);
		}
		public InitAttributeContext initAttribute(int i) {
			return getRuleContext(InitAttributeContext.class,i);
		}
		public InitAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterInitAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitInitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitInitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitAttributesContext initAttributes() throws RecognitionException {
		InitAttributesContext _localctx = new InitAttributesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(51);
					initAttribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InitAttributeContext extends ParserRuleContext {
		public RuleChildContext ruleChild() {
			return getRuleContext(RuleChildContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode Newline() { return getToken(GrammarParser.Newline, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public InitAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterInitAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitInitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitInitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitAttributeContext initAttribute() throws RecognitionException {
		InitAttributeContext _localctx = new InitAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			ruleChild();
			setState(57);
			attribute();
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==Newline) ) {
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
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGrammarRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitGrammarRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRulesContext grammarRules() throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_grammarRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				grammarRule();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Node || _la==LeftBracket );
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
		public TerminalNode Newline() { return getToken(GrammarParser.Newline, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public FoldContext fold() {
			return getRuleContext(FoldContext.class,0);
		}
		public SkipRuleContext skipRule() {
			return getRuleContext(SkipRuleContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_grammarRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Node:
				{
				setState(65);
				fold();
				}
				break;
			case LeftBracket:
				{
				setState(66);
				skipRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace) {
				{
				setState(69);
				attribute();
				}
			}

			setState(72);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==Newline) ) {
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

	public static class FoldContext extends ParserRuleContext {
		public TerminalNode Node() { return getToken(GrammarParser.Node, 0); }
		public TerminalNode Arrow() { return getToken(GrammarParser.Arrow, 0); }
		public List<RuleChildContext> ruleChild() {
			return getRuleContexts(RuleChildContext.class);
		}
		public RuleChildContext ruleChild(int i) {
			return getRuleContext(RuleChildContext.class,i);
		}
		public FoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoldContext fold() throws RecognitionException {
		FoldContext _localctx = new FoldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Node);
			setState(75);
			match(Arrow);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				ruleChild();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Node) | (1L << LeftBracket) | (1L << LeftParen) | (1L << Eps) | (1L << Tilda) | (1L << String))) != 0) );
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

	public static class SkipRuleContext extends ParserRuleContext {
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(GrammarParser.Arrow, 0); }
		public TerminalNode Skip() { return getToken(GrammarParser.Skip, 0); }
		public SkipRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSkipRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSkipRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitSkipRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipRuleContext skipRule() throws RecognitionException {
		SkipRuleContext _localctx = new SkipRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skipRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			brackets();
			setState(82);
			match(Arrow);
			setState(83);
			match(Skip);
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

	public static class RegexContext extends ParserRuleContext {
		public ParensContext parens() {
			return getRuleContext(ParensContext.class,0);
		}
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public TerminalNode Tilda() { return getToken(GrammarParser.Tilda, 0); }
		public TerminalNode Plus() { return getToken(GrammarParser.Plus, 0); }
		public TerminalNode Star() { return getToken(GrammarParser.Star, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tilda) {
				{
				setState(85);
				match(Tilda);
				}
			}

			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(88);
				parens();
				}
				break;
			case LeftBracket:
				{
				setState(89);
				brackets();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Star) {
				{
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Star) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class BracketsContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(GrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(GrammarParser.RightBracket, 0); }
		public TerminalNode StringWithoutNewlines() { return getToken(GrammarParser.StringWithoutNewlines, 0); }
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LeftBracket);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringWithoutNewlines) {
				{
				setState(96);
				match(StringWithoutNewlines);
				}
			}

			setState(99);
			match(RightBracket);
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

	public static class ParensContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(GrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(GrammarParser.RightParen, 0); }
		public TerminalNode StringWithoutNewlines() { return getToken(GrammarParser.StringWithoutNewlines, 0); }
		public ParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParensContext parens() throws RecognitionException {
		ParensContext _localctx = new ParensContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LeftParen);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringWithoutNewlines) {
				{
				setState(102);
				match(StringWithoutNewlines);
				}
			}

			setState(105);
			match(RightParen);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\2\3\2\3\3\3\3\3\3\5\3&\n"+
		"\3\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\5\4\60\n\4\3\5\3\5\5\5\64\n\5\3"+
		"\6\6\6\67\n\6\r\6\16\68\3\7\3\7\3\7\3\7\3\b\6\b@\n\b\r\b\16\bA\3\t\3\t"+
		"\5\tF\n\t\3\t\5\tI\n\t\3\t\3\t\3\n\3\n\3\n\6\nP\n\n\r\n\16\nQ\3\13\3\13"+
		"\3\13\3\13\3\f\5\fY\n\f\3\f\3\f\5\f]\n\f\3\f\5\f`\n\f\3\r\3\r\5\rd\n\r"+
		"\3\r\3\r\3\16\3\16\5\16j\n\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\4\3\3\20\20\3\2\r\16\2p\2\34\3\2\2\2\4%\3\2\2\2\6\'"+
		"\3\2\2\2\b\63\3\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16?\3\2\2\2\20E\3\2\2\2"+
		"\22L\3\2\2\2\24S\3\2\2\2\26X\3\2\2\2\30a\3\2\2\2\32g\3\2\2\2\34\36\7\6"+
		"\2\2\35\37\7\23\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\7\2\2"+
		"!\3\3\2\2\2\"&\5\26\f\2#&\7\22\2\2$&\7\13\2\2%\"\3\2\2\2%#\3\2\2\2%$\3"+
		"\2\2\2&\5\3\2\2\2\'+\5\n\6\2(*\7\20\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.\60\5\16\b\2/.\3\2\2\2/\60\3\2\2\2\60\7"+
		"\3\2\2\2\61\64\7\3\2\2\62\64\5\4\3\2\63\61\3\2\2\2\63\62\3\2\2\2\64\t"+
		"\3\2\2\2\65\67\5\f\7\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9\13\3\2\2\2:;\5\b\5\2;<\5\2\2\2<=\t\2\2\2=\r\3\2\2\2>@\5\20\t\2?>\3\2"+
		"\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\17\3\2\2\2CF\5\22\n\2DF\5\24\13\2"+
		"EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GI\5\2\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2"+
		"JK\t\2\2\2K\21\3\2\2\2LM\7\3\2\2MO\7\n\2\2NP\5\b\5\2ON\3\2\2\2PQ\3\2\2"+
		"\2QO\3\2\2\2QR\3\2\2\2R\23\3\2\2\2ST\5\30\r\2TU\7\n\2\2UV\7\21\2\2V\25"+
		"\3\2\2\2WY\7\f\2\2XW\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2Z]\5\32\16\2[]\5\30\r"+
		"\2\\Z\3\2\2\2\\[\3\2\2\2]_\3\2\2\2^`\t\3\2\2_^\3\2\2\2_`\3\2\2\2`\27\3"+
		"\2\2\2ac\7\4\2\2bd\7\23\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\5\2\2f\31"+
		"\3\2\2\2gi\7\b\2\2hj\7\23\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\t\2\2"+
		"l\33\3\2\2\2\21\36%+/\638AEHQX\\_ci";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
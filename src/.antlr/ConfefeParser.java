// Generated from /Users/david/Dropbox/projects/confefe/src/Confefe.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfefeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NIL=2, NULL=3, TRUE=4, FALSE=5, DECIMAL_DIGIT=6, STRING_LITERAL=7, 
		UNICODE_VALUE=8, BYTE_VALUE=9, OCTAL_BYTE_VALUE=10, HEX_BYTE_VALUE=11, 
		LITTLE_U_VALUE=12, BIG_U_VALUE=13, ESCAPED_CHAR=14, NEWLINE=15, UNICODE_CHAR=16, 
		BACKSLASH=17, DOT=18, COMMA=19, COLON=20, HYPHEN=21, LBRACE=22, RBRACE=23, 
		LBRACKET=24, RBRACKET=25, WS=26, LWS=27, NL=28, LINE_COMMENT=29, INDENT=30, 
		DEDENT=31, LHS=32;
	public static final int
		RULE_file = 0, RULE_topLevelMap = 1, RULE_unbracketedMap = 2, RULE_unbracketedKeyValuePair = 3, 
		RULE_bracketedMap = 4, RULE_commaDelimitedKeyValuePairs = 5, RULE_commaDelimitedKeyValuePair = 6, 
		RULE_topLevelList = 7, RULE_unbracketedList = 8, RULE_unbracketedListItem = 9, 
		RULE_bracketedList = 10, RULE_key = 11, RULE_map = 12, RULE_list = 13, 
		RULE_primitive = 14, RULE_simpleValue = 15, RULE_value = 16, RULE_nil = 17, 
		RULE_bool = 18, RULE_intLiteral = 19, RULE_decimalLiteral = 20;
	public static final String[] ruleNames = {
		"file", "topLevelMap", "unbracketedMap", "unbracketedKeyValuePair", "bracketedMap", 
		"commaDelimitedKeyValuePairs", "commaDelimitedKeyValuePair", "topLevelList", 
		"unbracketedList", "unbracketedListItem", "bracketedList", "key", "map", 
		"list", "primitive", "simpleValue", "value", "nil", "bool", "intLiteral", 
		"decimalLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'nil'", "'null'", "'true'", "'false'", null, null, null, 
		null, null, null, null, null, null, null, null, "'\\'", "'.'", "','", 
		"':'", "'-'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NIL", "NULL", "TRUE", "FALSE", "DECIMAL_DIGIT", "STRING_LITERAL", 
		"UNICODE_VALUE", "BYTE_VALUE", "OCTAL_BYTE_VALUE", "HEX_BYTE_VALUE", "LITTLE_U_VALUE", 
		"BIG_U_VALUE", "ESCAPED_CHAR", "NEWLINE", "UNICODE_CHAR", "BACKSLASH", 
		"DOT", "COMMA", "COLON", "HYPHEN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"WS", "LWS", "NL", "LINE_COMMENT", "INDENT", "DEDENT", "LHS"
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
	public String getGrammarFileName() { return "Confefe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConfefeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	 
		public FileContext() { }
		public void copyFrom(FileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FileTopLevelMapContext extends FileContext {
		public TopLevelMapContext topLevelMap() {
			return getRuleContext(TopLevelMapContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ConfefeParser.EOF, 0); }
		public FileTopLevelMapContext(FileContext ctx) { copyFrom(ctx); }
	}
	public static class FileTopLevelListContext extends FileContext {
		public TopLevelListContext topLevelList() {
			return getRuleContext(TopLevelListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ConfefeParser.EOF, 0); }
		public FileTopLevelListContext(FileContext ctx) { copyFrom(ctx); }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new FileTopLevelMapContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				topLevelMap();
				setState(43);
				match(EOF);
				}
				break;
			case 2:
				_localctx = new FileTopLevelListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				topLevelList();
				setState(46);
				match(EOF);
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

	public static class TopLevelMapContext extends ParserRuleContext {
		public UnbracketedMapContext unbracketedMap() {
			return getRuleContext(UnbracketedMapContext.class,0);
		}
		public BracketedMapContext bracketedMap() {
			return getRuleContext(BracketedMapContext.class,0);
		}
		public TopLevelMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelMap; }
	}

	public final TopLevelMapContext topLevelMap() throws RecognitionException {
		TopLevelMapContext _localctx = new TopLevelMapContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelMap);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NIL:
			case NULL:
			case TRUE:
			case FALSE:
			case DECIMAL_DIGIT:
			case STRING_LITERAL:
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				unbracketedMap();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				bracketedMap();
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

	public static class UnbracketedMapContext extends ParserRuleContext {
		public List<UnbracketedKeyValuePairContext> unbracketedKeyValuePair() {
			return getRuleContexts(UnbracketedKeyValuePairContext.class);
		}
		public UnbracketedKeyValuePairContext unbracketedKeyValuePair(int i) {
			return getRuleContext(UnbracketedKeyValuePairContext.class,i);
		}
		public UnbracketedMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbracketedMap; }
	}

	public final UnbracketedMapContext unbracketedMap() throws RecognitionException {
		UnbracketedMapContext _localctx = new UnbracketedMapContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unbracketedMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				unbracketedKeyValuePair();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NIL) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_DIGIT) | (1L << STRING_LITERAL) | (1L << HYPHEN))) != 0) );
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

	public static class UnbracketedKeyValuePairContext extends ParserRuleContext {
		public UnbracketedKeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbracketedKeyValuePair; }
	 
		public UnbracketedKeyValuePairContext() { }
		public void copyFrom(UnbracketedKeyValuePairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnbracketedKeyValuePairIndentedContext extends UnbracketedKeyValuePairContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ConfefeParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(ConfefeParser.INDENT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(ConfefeParser.DEDENT, 0); }
		public List<TerminalNode> LWS() { return getTokens(ConfefeParser.LWS); }
		public TerminalNode LWS(int i) {
			return getToken(ConfefeParser.LWS, i);
		}
		public UnbracketedKeyValuePairIndentedContext(UnbracketedKeyValuePairContext ctx) { copyFrom(ctx); }
	}
	public static class UnbracketedKeyValuePairInlineContext extends UnbracketedKeyValuePairContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ConfefeParser.COLON, 0); }
		public SimpleValueContext simpleValue() {
			return getRuleContext(SimpleValueContext.class,0);
		}
		public TerminalNode NL() { return getToken(ConfefeParser.NL, 0); }
		public List<TerminalNode> LWS() { return getTokens(ConfefeParser.LWS); }
		public TerminalNode LWS(int i) {
			return getToken(ConfefeParser.LWS, i);
		}
		public UnbracketedKeyValuePairInlineContext(UnbracketedKeyValuePairContext ctx) { copyFrom(ctx); }
	}

	public final UnbracketedKeyValuePairContext unbracketedKeyValuePair() throws RecognitionException {
		UnbracketedKeyValuePairContext _localctx = new UnbracketedKeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unbracketedKeyValuePair);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new UnbracketedKeyValuePairInlineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				key();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LWS) {
					{
					setState(60);
					match(LWS);
					}
				}

				setState(63);
				match(COLON);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(64);
					match(LWS);
					}
					break;
				}
				setState(67);
				simpleValue();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LWS) {
					{
					setState(68);
					match(LWS);
					}
				}

				setState(71);
				match(NL);
				}
				break;
			case 2:
				_localctx = new UnbracketedKeyValuePairIndentedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				key();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LWS) {
					{
					setState(74);
					match(LWS);
					}
				}

				setState(77);
				match(COLON);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LWS) {
					{
					setState(78);
					match(LWS);
					}
				}

				setState(81);
				match(INDENT);
				setState(82);
				value();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LWS) {
					{
					setState(83);
					match(LWS);
					}
				}

				setState(86);
				match(DEDENT);
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

	public static class BracketedMapContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ConfefeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConfefeParser.RBRACE, 0); }
		public List<TerminalNode> WS() { return getTokens(ConfefeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ConfefeParser.WS, i);
		}
		public CommaDelimitedKeyValuePairsContext commaDelimitedKeyValuePairs() {
			return getRuleContext(CommaDelimitedKeyValuePairsContext.class,0);
		}
		public BracketedMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedMap; }
	}

	public final BracketedMapContext bracketedMap() throws RecognitionException {
		BracketedMapContext _localctx = new BracketedMapContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bracketedMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LBRACE);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(91);
				match(WS);
				}
				break;
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NIL) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_DIGIT) | (1L << STRING_LITERAL) | (1L << HYPHEN))) != 0)) {
				{
				setState(94);
				commaDelimitedKeyValuePairs();
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(97);
				match(WS);
				}
			}

			setState(100);
			match(RBRACE);
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

	public static class CommaDelimitedKeyValuePairsContext extends ParserRuleContext {
		public List<CommaDelimitedKeyValuePairContext> commaDelimitedKeyValuePair() {
			return getRuleContexts(CommaDelimitedKeyValuePairContext.class);
		}
		public CommaDelimitedKeyValuePairContext commaDelimitedKeyValuePair(int i) {
			return getRuleContext(CommaDelimitedKeyValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConfefeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConfefeParser.COMMA, i);
		}
		public List<TerminalNode> WS() { return getTokens(ConfefeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ConfefeParser.WS, i);
		}
		public CommaDelimitedKeyValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaDelimitedKeyValuePairs; }
	}

	public final CommaDelimitedKeyValuePairsContext commaDelimitedKeyValuePairs() throws RecognitionException {
		CommaDelimitedKeyValuePairsContext _localctx = new CommaDelimitedKeyValuePairsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commaDelimitedKeyValuePairs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					commaDelimitedKeyValuePair();
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(103);
						match(WS);
						}
					}

					setState(106);
					match(COMMA);
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(107);
						match(WS);
						}
					}

					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(115);
			commaDelimitedKeyValuePair();
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(116);
				match(WS);
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(119);
				match(COMMA);
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

	public static class CommaDelimitedKeyValuePairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ConfefeParser.COLON, 0); }
		public SimpleValueContext simpleValue() {
			return getRuleContext(SimpleValueContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ConfefeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ConfefeParser.WS, i);
		}
		public CommaDelimitedKeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaDelimitedKeyValuePair; }
	}

	public final CommaDelimitedKeyValuePairContext commaDelimitedKeyValuePair() throws RecognitionException {
		CommaDelimitedKeyValuePairContext _localctx = new CommaDelimitedKeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commaDelimitedKeyValuePair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			key();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(123);
				match(WS);
				}
			}

			setState(126);
			match(COLON);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(127);
				match(WS);
				}
				break;
			}
			setState(130);
			simpleValue();
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

	public static class TopLevelListContext extends ParserRuleContext {
		public UnbracketedListContext unbracketedList() {
			return getRuleContext(UnbracketedListContext.class,0);
		}
		public BracketedListContext bracketedList() {
			return getRuleContext(BracketedListContext.class,0);
		}
		public TopLevelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelList; }
	}

	public final TopLevelListContext topLevelList() throws RecognitionException {
		TopLevelListContext _localctx = new TopLevelListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topLevelList);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				unbracketedList();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				bracketedList();
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

	public static class UnbracketedListContext extends ParserRuleContext {
		public List<UnbracketedListItemContext> unbracketedListItem() {
			return getRuleContexts(UnbracketedListItemContext.class);
		}
		public UnbracketedListItemContext unbracketedListItem(int i) {
			return getRuleContext(UnbracketedListItemContext.class,i);
		}
		public UnbracketedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbracketedList; }
	}

	public final UnbracketedListContext unbracketedList() throws RecognitionException {
		UnbracketedListContext _localctx = new UnbracketedListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unbracketedList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				unbracketedListItem();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HYPHEN );
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

	public static class UnbracketedListItemContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(ConfefeParser.HYPHEN, 0); }
		public SimpleValueContext simpleValue() {
			return getRuleContext(SimpleValueContext.class,0);
		}
		public TerminalNode NL() { return getToken(ConfefeParser.NL, 0); }
		public TerminalNode LWS() { return getToken(ConfefeParser.LWS, 0); }
		public TerminalNode LHS() { return getToken(ConfefeParser.LHS, 0); }
		public UnbracketedListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbracketedListItem; }
	}

	public final UnbracketedListItemContext unbracketedListItem() throws RecognitionException {
		UnbracketedListItemContext _localctx = new UnbracketedListItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unbracketedListItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(HYPHEN);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LWS) {
				{
				setState(142);
				match(LWS);
				}
			}

			setState(145);
			simpleValue();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LHS) {
				{
				setState(146);
				match(LHS);
				}
			}

			setState(149);
			match(NL);
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

	public static class BracketedListContext extends ParserRuleContext {
		public BracketedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedList; }
	}

	public final BracketedListContext bracketedList() throws RecognitionException {
		BracketedListContext _localctx = new BracketedListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bracketedList);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class KeyContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			primitive();
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

	public static class MapContext extends ParserRuleContext {
		public UnbracketedMapContext unbracketedMap() {
			return getRuleContext(UnbracketedMapContext.class,0);
		}
		public BracketedMapContext bracketedMap() {
			return getRuleContext(BracketedMapContext.class,0);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_map);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NIL:
			case NULL:
			case TRUE:
			case FALSE:
			case DECIMAL_DIGIT:
			case STRING_LITERAL:
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				unbracketedMap();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				bracketedMap();
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

	public static class ListContext extends ParserRuleContext {
		public UnbracketedListContext unbracketedList() {
			return getRuleContext(UnbracketedListContext.class,0);
		}
		public BracketedListContext bracketedList() {
			return getRuleContext(BracketedListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				unbracketedList();
				}
				break;
			case LWS:
			case DEDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				bracketedList();
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

	public static class PrimitiveContext extends ParserRuleContext {
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ConfefeParser.STRING_LITERAL, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitive);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				nil();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				intLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				decimalLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(STRING_LITERAL);
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

	public static class SimpleValueContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public BracketedMapContext bracketedMap() {
			return getRuleContext(BracketedMapContext.class,0);
		}
		public BracketedListContext bracketedList() {
			return getRuleContext(BracketedListContext.class,0);
		}
		public SimpleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleValue; }
	}

	public final SimpleValueContext simpleValue() throws RecognitionException {
		SimpleValueContext _localctx = new SimpleValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleValue);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NIL:
			case NULL:
			case TRUE:
			case FALSE:
			case DECIMAL_DIGIT:
			case STRING_LITERAL:
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				primitive();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				bracketedMap();
				}
				break;
			case COMMA:
			case RBRACE:
			case WS:
			case LWS:
			case NL:
			case LHS:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				bracketedList();
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

	public static class ValueContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				primitive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				map();
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

	public static class NilContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(ConfefeParser.NIL, 0); }
		public TerminalNode NULL() { return getToken(ConfefeParser.NULL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nil);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==NIL || _la==NULL) ) {
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ConfefeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ConfefeParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IntLiteralContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL_DIGIT() { return getTokens(ConfefeParser.DECIMAL_DIGIT); }
		public TerminalNode DECIMAL_DIGIT(int i) {
			return getToken(ConfefeParser.DECIMAL_DIGIT, i);
		}
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_intLiteral);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(184);
					match(T__0);
					}
				}

				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					match(DECIMAL_DIGIT);
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DECIMAL_DIGIT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(192);
					match(HYPHEN);
					}
				}

				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					match(DECIMAL_DIGIT);
					}
					}
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DECIMAL_DIGIT );
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

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ConfefeParser.DOT, 0); }
		public List<TerminalNode> DECIMAL_DIGIT() { return getTokens(ConfefeParser.DECIMAL_DIGIT); }
		public TerminalNode DECIMAL_DIGIT(int i) {
			return getToken(ConfefeParser.DECIMAL_DIGIT, i);
		}
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(DECIMAL_DIGIT);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DECIMAL_DIGIT );
			setState(207);
			match(DOT);
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				match(DECIMAL_DIGIT);
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DECIMAL_DIGIT );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63"+
		"\n\2\3\3\3\3\5\3\67\n\3\3\4\6\4:\n\4\r\4\16\4;\3\5\3\5\5\5@\n\5\3\5\3"+
		"\5\5\5D\n\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\5\5R\n\5"+
		"\3\5\3\5\3\5\5\5W\n\5\3\5\3\5\5\5[\n\5\3\6\3\6\5\6_\n\6\3\6\5\6b\n\6\3"+
		"\6\5\6e\n\6\3\6\3\6\3\7\3\7\5\7k\n\7\3\7\3\7\5\7o\n\7\7\7q\n\7\f\7\16"+
		"\7t\13\7\3\7\3\7\5\7x\n\7\3\7\5\7{\n\7\3\b\3\b\5\b\177\n\b\3\b\3\b\5\b"+
		"\u0083\n\b\3\b\3\b\3\t\3\t\5\t\u0089\n\t\3\n\6\n\u008c\n\n\r\n\16\n\u008d"+
		"\3\13\3\13\5\13\u0092\n\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\5\16\u00a0\n\16\3\17\3\17\5\17\u00a4\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ab\n\20\3\21\3\21\3\21\5\21\u00b0\n\21\3\22\3"+
		"\22\3\22\5\22\u00b5\n\22\3\23\3\23\3\24\3\24\3\25\5\25\u00bc\n\25\3\25"+
		"\6\25\u00bf\n\25\r\25\16\25\u00c0\3\25\5\25\u00c4\n\25\3\25\6\25\u00c7"+
		"\n\25\r\25\16\25\u00c8\5\25\u00cb\n\25\3\26\6\26\u00ce\n\26\r\26\16\26"+
		"\u00cf\3\26\3\26\6\26\u00d4\n\26\r\26\16\26\u00d5\3\26\2\2\27\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\3\2\4\5\3\2\6\7\2\u00eb\2\62"+
		"\3\2\2\2\4\66\3\2\2\2\69\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fr\3\2\2\2\16"+
		"|\3\2\2\2\20\u0088\3\2\2\2\22\u008b\3\2\2\2\24\u008f\3\2\2\2\26\u0099"+
		"\3\2\2\2\30\u009b\3\2\2\2\32\u009f\3\2\2\2\34\u00a3\3\2\2\2\36\u00aa\3"+
		"\2\2\2 \u00af\3\2\2\2\"\u00b4\3\2\2\2$\u00b6\3\2\2\2&\u00b8\3\2\2\2(\u00ca"+
		"\3\2\2\2*\u00cd\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\63\3\2\2\2/\60\5\20\t\2\60"+
		"\61\7\2\2\3\61\63\3\2\2\2\62,\3\2\2\2\62/\3\2\2\2\63\3\3\2\2\2\64\67\5"+
		"\6\4\2\65\67\5\n\6\2\66\64\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\28:\5\b\5"+
		"\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=?\5\30\r\2>@\7\35"+
		"\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AC\7\26\2\2BD\7\35\2\2CB\3\2\2\2CD\3"+
		"\2\2\2DE\3\2\2\2EG\5 \21\2FH\7\35\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ"+
		"\7\36\2\2J[\3\2\2\2KM\5\30\r\2LN\7\35\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2"+
		"\2OQ\7\26\2\2PR\7\35\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7 \2\2TV\5\""+
		"\22\2UW\7\35\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7!\2\2Y[\3\2\2\2Z=\3"+
		"\2\2\2ZK\3\2\2\2[\t\3\2\2\2\\^\7\30\2\2]_\7\34\2\2^]\3\2\2\2^_\3\2\2\2"+
		"_a\3\2\2\2`b\5\f\7\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\7\34\2\2dc\3\2\2"+
		"\2de\3\2\2\2ef\3\2\2\2fg\7\31\2\2g\13\3\2\2\2hj\5\16\b\2ik\7\34\2\2ji"+
		"\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\7\25\2\2mo\7\34\2\2nm\3\2\2\2no\3\2\2\2"+
		"oq\3\2\2\2ph\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2"+
		"uw\5\16\b\2vx\7\34\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\7\25\2\2zy\3\2"+
		"\2\2z{\3\2\2\2{\r\3\2\2\2|~\5\30\r\2}\177\7\34\2\2~}\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0082\7\26\2\2\u0081\u0083\7\34\2\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5 "+
		"\21\2\u0085\17\3\2\2\2\u0086\u0089\5\22\n\2\u0087\u0089\5\26\f\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\21\3\2\2\2\u008a\u008c\5\24\13"+
		"\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\23\3\2\2\2\u008f\u0091\7\27\2\2\u0090\u0092\7\35\2\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\5 "+
		"\21\2\u0094\u0096\7\"\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7\36\2\2\u0098\25\3\2\2\2\u0099\u009a\3\2\2"+
		"\2\u009a\27\3\2\2\2\u009b\u009c\5\36\20\2\u009c\31\3\2\2\2\u009d\u00a0"+
		"\5\6\4\2\u009e\u00a0\5\n\6\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\33\3\2\2\2\u00a1\u00a4\5\22\n\2\u00a2\u00a4\5\26\f\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00ab\5$\23\2\u00a6\u00ab"+
		"\5&\24\2\u00a7\u00ab\5(\25\2\u00a8\u00ab\5*\26\2\u00a9\u00ab\7\t\2\2\u00aa"+
		"\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\37\3\2\2\2\u00ac\u00b0\5\36\20\2\u00ad"+
		"\u00b0\5\n\6\2\u00ae\u00b0\5\26\f\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00ae\3\2\2\2\u00b0!\3\2\2\2\u00b1\u00b5\5\36\20\2\u00b2"+
		"\u00b5\5\34\17\2\u00b3\u00b5\5\32\16\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5#\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7"+
		"%\3\2\2\2\u00b8\u00b9\t\3\2\2\u00b9\'\3\2\2\2\u00ba\u00bc\7\3\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\7\b"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00cb\3\2\2\2\u00c2\u00c4\7\27\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\7\b\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00bb\3\2\2\2\u00ca\u00c3\3\2\2\2\u00cb"+
		")\3\2\2\2\u00cc\u00ce\7\b\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\7\24\2\2\u00d2\u00d4\7\b\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6+\3\2\2\2&\62\66;?CGMQV"+
		"Z^adjnrwz~\u0082\u0088\u008d\u0091\u0095\u009f\u00a3\u00aa\u00af\u00b4"+
		"\u00bb\u00c0\u00c3\u00c8\u00ca\u00cf\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
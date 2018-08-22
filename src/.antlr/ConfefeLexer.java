// Generated from /Users/david/Dropbox/projects/confefe/src/Confefe.g4 by ANTLR 4.7.1

  import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfefeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NIL=2, NULL=3, TRUE=4, FALSE=5, DECIMAL_DIGIT=6, STRING_LITERAL=7, 
		UNICODE_VALUE=8, BYTE_VALUE=9, OCTAL_BYTE_VALUE=10, HEX_BYTE_VALUE=11, 
		LITTLE_U_VALUE=12, BIG_U_VALUE=13, ESCAPED_CHAR=14, NEWLINE=15, UNICODE_CHAR=16, 
		BACKSLASH=17, DOT=18, COMMA=19, COLON=20, HYPHEN=21, LBRACE=22, RBRACE=23, 
		LBRACKET=24, RBRACKET=25, WS=26, LWS=27, NL=28, LINE_COMMENT=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "NIL", "NULL", "TRUE", "FALSE", "DECIMAL_DIGIT", "OCTAL_DIGIT", 
		"HEX_DIGIT", "STRING_LITERAL", "UNICODE_VALUE", "BYTE_VALUE", "OCTAL_BYTE_VALUE", 
		"HEX_BYTE_VALUE", "LITTLE_U_VALUE", "BIG_U_VALUE", "ESCAPED_CHAR", "NEWLINE", 
		"UNICODE_CHAR", "BACKSLASH", "DOT", "COMMA", "COLON", "HYPHEN", "LBRACE", 
		"RBRACE", "LBRACKET", "RBRACKET", "WS", "LWS", "NL", "LINE_COMMENT"
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
		"WS", "LWS", "NL", "LINE_COMMENT"
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


	  private final DenterHelper denter = new DenterHelper(NL, ConfefeParser.INDENT, ConfefeParser.DEDENT) {
	    @Override
	    public Token pullToken() {
	      return ConfefeLexer.super.nextToken();   // must be to super.nextToken, or we'll recurse forever!
	    }
	  };

	  @Override
	  public Token nextToken() {
	    return denter.nextToken();
	  }


	public ConfefeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Confefe.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00cb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\nb\n\n"+
		"\f\n\16\ne\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\5\fq\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0096\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\6\35\u00b0\n\35\r\35\16\35\u00b1\3\36\6"+
		"\36\u00b5\n\36\r\36\16\36\u00b6\3\37\5\37\u00ba\n\37\3\37\3\37\7\37\u00be"+
		"\n\37\f\37\16\37\u00c1\13\37\3 \3 \7 \u00c5\n \f \16 \u00c8\13 \3 \3 "+
		"\2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34"+
		";\35=\36?\37\3\2\n\3\2\62;\3\2\629\5\2\62;CHch\b\2cdhhppttvvxx\4\2$$)"+
		")\3\2\f\f\4\2\13\13\"\"\4\2\f\f\17\17\2\u00d7\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2"+
		"\7G\3\2\2\2\tL\3\2\2\2\13Q\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2"+
		"\23]\3\2\2\2\25l\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33w\3\2\2\2\35}\3\2\2"+
		"\2\37\u0085\3\2\2\2!\u0091\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'\u009b"+
		"\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61"+
		"\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00af"+
		"\3\2\2\2;\u00b4\3\2\2\2=\u00b9\3\2\2\2?\u00c2\3\2\2\2AB\7-\2\2B\4\3\2"+
		"\2\2CD\7p\2\2DE\7k\2\2EF\7n\2\2F\6\3\2\2\2GH\7p\2\2HI\7w\2\2IJ\7n\2\2"+
		"JK\7n\2\2K\b\3\2\2\2LM\7v\2\2MN\7t\2\2NO\7w\2\2OP\7g\2\2P\n\3\2\2\2QR"+
		"\7h\2\2RS\7c\2\2ST\7n\2\2TU\7u\2\2UV\7g\2\2V\f\3\2\2\2WX\t\2\2\2X\16\3"+
		"\2\2\2YZ\t\3\2\2Z\20\3\2\2\2[\\\t\4\2\2\\\22\3\2\2\2]c\7$\2\2^b\5\25\13"+
		"\2_b\5#\22\2`b\5\27\f\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7$\2\2g\24\3\2\2\2hm\5%\23\2im\5"+
		"\35\17\2jm\5\37\20\2km\5!\21\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2"+
		"m\26\3\2\2\2nq\5\31\r\2oq\5\33\16\2pn\3\2\2\2po\3\2\2\2q\30\3\2\2\2rs"+
		"\5\'\24\2st\5\17\b\2tu\5\17\b\2uv\5\17\b\2v\32\3\2\2\2wx\7^\2\2xy\7z\2"+
		"\2yz\3\2\2\2z{\5\21\t\2{|\5\21\t\2|\34\3\2\2\2}~\7^\2\2~\177\7w\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\5\21\t\2\u0081\u0082\5\21\t\2\u0082\u0083\5"+
		"\21\t\2\u0083\u0084\5\21\t\2\u0084\36\3\2\2\2\u0085\u0086\7^\2\2\u0086"+
		"\u0087\7W\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\21\t\2\u0089\u008a\5\21"+
		"\t\2\u008a\u008b\5\21\t\2\u008b\u008c\5\21\t\2\u008c\u008d\5\21\t\2\u008d"+
		"\u008e\5\21\t\2\u008e\u008f\5\21\t\2\u008f\u0090\5\21\t\2\u0090 \3\2\2"+
		"\2\u0091\u0095\5\'\24\2\u0092\u0096\t\5\2\2\u0093\u0096\5\'\24\2\u0094"+
		"\u0096\t\6\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\"\3\2\2\2\u0097\u0098\t\7\2\2\u0098$\3\2\2\2\u0099\u009a\n"+
		"\7\2\2\u009a&\3\2\2\2\u009b\u009c\7^\2\2\u009c(\3\2\2\2\u009d\u009e\7"+
		"\60\2\2\u009e*\3\2\2\2\u009f\u00a0\7.\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7"+
		"<\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7"+
		"}\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8\64\3\2\2\2\u00a9\u00aa"+
		"\7]\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7_\2\2\u00ac8\3\2\2\2\u00ad\u00b0"+
		"\5;\36\2\u00ae\u00b0\5=\37\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2:\3\2\2\2"+
		"\u00b3\u00b5\t\b\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7<\3\2\2\2\u00b8\u00ba\7\17\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf\7\f"+
		"\2\2\u00bc\u00be\t\b\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0>\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c2\u00c6\7%\2\2\u00c3\u00c5\n\t\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\b \2\2\u00ca@\3\2\2\2\16\2aclp\u0095\u00af"+
		"\u00b1\u00b6\u00b9\u00bf\u00c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
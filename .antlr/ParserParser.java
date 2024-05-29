// Generated from c:/sintaxis/Trabajo-Practico-Sys/Parser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, OBJETO_ABRE=2, OBJETO_CIERRA=3, OBJETO_SEPARA=4, ELEMENTO_SEPARA=5, 
		ARREGLO_ABRE=6, ARREGLO_CIERRA=7, CADENA_NAME=8, CADENA_VERSION=9, CADENA_DESCRIPTION=10, 
		CADENA_AUTHOR=11, CADENA_MAIN=12, CADENA_PRIVATE=13, CADENA_SCRIPTS=14, 
		CADENA_DEPENDENCIES=15, CADENA_ENGINES=16, CADENA_REPOSITORY=17, CADENA_KEYWORDS=18, 
		CADENA_CPU=19, CADENA_HOMEPAGE=20, CADENA_BUGS=21, CADENA_NODE=22, CADENA_NPM=23, 
		CADENA_YARN=24, VAL_NULL=25, VAL_BOLEANO=26, VAL_VERSION=27, VAL_URL_SEGURA=28, 
		VAL_URL_NO_SEGURA=29, VAL_RUTA=30, VCR=31, VC=32;
	public static final int
		RULE_inicio = 0, RULE_raiz = 1, RULE_contenido = 2, RULE_renglon = 3, 
		RULE_renglonX = 4, RULE_renglonString = 5, RULE_renglonVersion = 6, RULE_renglonRuta = 7, 
		RULE_arreglo = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "raiz", "contenido", "renglon", "renglonX", "renglonString", 
			"renglonVersion", "renglonRuta", "arreglo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "','", "':'", "'['", "']'", "'\"name\"'", "'\"version\"'", 
			"'\"description\"'", "'\"author\"'", "'\"main\"'", "'\"private\"'", "'\"scripts\"'", 
			"'\"dependencies\"'", "'\"engines\"'", "'\"repository\"'", "'\"keywords\"'", 
			"'\"cpu\"'", "'\"homepage\"'", "'\"bugs\"'", "'\"node\"'", "'\"npm\"'", 
			"'\"yarn\"'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "OBJETO_ABRE", "OBJETO_CIERRA", "OBJETO_SEPARA", "ELEMENTO_SEPARA", 
			"ARREGLO_ABRE", "ARREGLO_CIERRA", "CADENA_NAME", "CADENA_VERSION", "CADENA_DESCRIPTION", 
			"CADENA_AUTHOR", "CADENA_MAIN", "CADENA_PRIVATE", "CADENA_SCRIPTS", "CADENA_DEPENDENCIES", 
			"CADENA_ENGINES", "CADENA_REPOSITORY", "CADENA_KEYWORDS", "CADENA_CPU", 
			"CADENA_HOMEPAGE", "CADENA_BUGS", "CADENA_NODE", "CADENA_NPM", "CADENA_YARN", 
			"VAL_NULL", "VAL_BOLEANO", "VAL_VERSION", "VAL_URL_SEGURA", "VAL_URL_NO_SEGURA", 
			"VAL_RUTA", "VCR", "VC"
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public RaizContext raiz() {
			return getRuleContext(RaizContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParserParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			raiz();
			setState(19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RaizContext extends ParserRuleContext {
		public TerminalNode OBJETO_ABRE() { return getToken(ParserParser.OBJETO_ABRE, 0); }
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public TerminalNode OBJETO_CIERRA() { return getToken(ParserParser.OBJETO_CIERRA, 0); }
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_raiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(OBJETO_ABRE);
			setState(22);
			contenido();
			setState(23);
			match(OBJETO_CIERRA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContenidoContext extends ParserRuleContext {
		public RenglonContext renglon() {
			return getRuleContext(RenglonContext.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_contenido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			renglon();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RenglonContext extends ParserRuleContext {
		public RenglonXContext renglonX() {
			return getRuleContext(RenglonXContext.class,0);
		}
		public TerminalNode OBJETO_SEPARA() { return getToken(ParserParser.OBJETO_SEPARA, 0); }
		public RenglonContext renglon() {
			return getRuleContext(RenglonContext.class,0);
		}
		public RenglonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renglon; }
	}

	public final RenglonContext renglon() throws RecognitionException {
		RenglonContext _localctx = new RenglonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_renglon);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				renglonX();
				setState(28);
				match(OBJETO_SEPARA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				renglonX();
				setState(31);
				match(OBJETO_SEPARA);
				setState(32);
				renglon();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RenglonXContext extends ParserRuleContext {
		public RenglonStringContext renglonString() {
			return getRuleContext(RenglonStringContext.class,0);
		}
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VCR() { return getToken(ParserParser.VCR, 0); }
		public RenglonVersionContext renglonVersion() {
			return getRuleContext(RenglonVersionContext.class,0);
		}
		public TerminalNode VAL_VERSION() { return getToken(ParserParser.VAL_VERSION, 0); }
		public RenglonRutaContext renglonRuta() {
			return getRuleContext(RenglonRutaContext.class,0);
		}
		public TerminalNode VAL_RUTA() { return getToken(ParserParser.VAL_RUTA, 0); }
		public RenglonXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renglonX; }
	}

	public final RenglonXContext renglonX() throws RecognitionException {
		RenglonXContext _localctx = new RenglonXContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_renglonX);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELEMENTO_SEPARA:
			case CADENA_NAME:
			case CADENA_DESCRIPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				renglonString();
				setState(37);
				match(ELEMENTO_SEPARA);
				setState(38);
				match(VCR);
				}
				break;
			case CADENA_VERSION:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				renglonVersion();
				setState(41);
				match(ELEMENTO_SEPARA);
				setState(42);
				match(VAL_VERSION);
				}
				break;
			case CADENA_MAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				renglonRuta();
				setState(45);
				match(ELEMENTO_SEPARA);
				setState(46);
				match(VAL_RUTA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RenglonStringContext extends ParserRuleContext {
		public TerminalNode CADENA_NAME() { return getToken(ParserParser.CADENA_NAME, 0); }
		public TerminalNode CADENA_DESCRIPTION() { return getToken(ParserParser.CADENA_DESCRIPTION, 0); }
		public RenglonStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renglonString; }
	}

	public final RenglonStringContext renglonString() throws RecognitionException {
		RenglonStringContext _localctx = new RenglonStringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_renglonString);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(CADENA_NAME);
				}
				break;
			case CADENA_DESCRIPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(CADENA_DESCRIPTION);
				}
				break;
			case ELEMENTO_SEPARA:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class RenglonVersionContext extends ParserRuleContext {
		public TerminalNode CADENA_VERSION() { return getToken(ParserParser.CADENA_VERSION, 0); }
		public RenglonVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renglonVersion; }
	}

	public final RenglonVersionContext renglonVersion() throws RecognitionException {
		RenglonVersionContext _localctx = new RenglonVersionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_renglonVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CADENA_VERSION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RenglonRutaContext extends ParserRuleContext {
		public TerminalNode CADENA_MAIN() { return getToken(ParserParser.CADENA_MAIN, 0); }
		public RenglonRutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renglonRuta; }
	}

	public final RenglonRutaContext renglonRuta() throws RecognitionException {
		RenglonRutaContext _localctx = new RenglonRutaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_renglonRuta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(CADENA_MAIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode CADENA_NAME() { return getToken(ParserParser.CADENA_NAME, 0); }
		public TerminalNode VAL_VERSION() { return getToken(ParserParser.VAL_VERSION, 0); }
		public TerminalNode CADENA_DESCRIPTION() { return getToken(ParserParser.CADENA_DESCRIPTION, 0); }
		public TerminalNode CADENA_AUTHOR() { return getToken(ParserParser.CADENA_AUTHOR, 0); }
		public TerminalNode CADENA_MAIN() { return getToken(ParserParser.CADENA_MAIN, 0); }
		public TerminalNode CADENA_PRIVATE() { return getToken(ParserParser.CADENA_PRIVATE, 0); }
		public TerminalNode CADENA_SCRIPTS() { return getToken(ParserParser.CADENA_SCRIPTS, 0); }
		public TerminalNode CADENA_DEPENDENCIES() { return getToken(ParserParser.CADENA_DEPENDENCIES, 0); }
		public TerminalNode CADENA_ENGINES() { return getToken(ParserParser.CADENA_ENGINES, 0); }
		public TerminalNode CADENA_REPOSITORY() { return getToken(ParserParser.CADENA_REPOSITORY, 0); }
		public TerminalNode CADENA_KEYWORDS() { return getToken(ParserParser.CADENA_KEYWORDS, 0); }
		public TerminalNode CADENA_CPU() { return getToken(ParserParser.CADENA_CPU, 0); }
		public TerminalNode CADENA_HOMEPAGE() { return getToken(ParserParser.CADENA_HOMEPAGE, 0); }
		public TerminalNode CADENA_BUGS() { return getToken(ParserParser.CADENA_BUGS, 0); }
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138411264L) != 0)) ) {
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
		"\u0004\u0001 >\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003#\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00041\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"6\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0001\u0003\u0000\b\b\n\u0015\u001b\u001b9\u0000\u0012\u0001\u0000\u0000"+
		"\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000"+
		"\u0000\u0006\"\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n5\u0001"+
		"\u0000\u0000\u0000\f7\u0001\u0000\u0000\u0000\u000e9\u0001\u0000\u0000"+
		"\u0000\u0010;\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000"+
		"\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000"+
		"\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0003\u0006\u0003\u0000\u001a\u0005\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0003\b\u0004\u0000\u001c\u001d\u0005\u0004\u0000\u0000\u001d"+
		"#\u0001\u0000\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005"+
		"\u0004\u0000\u0000 !\u0003\u0006\u0003\u0000!#\u0001\u0000\u0000\u0000"+
		"\"\u001b\u0001\u0000\u0000\u0000\"\u001e\u0001\u0000\u0000\u0000#\u0007"+
		"\u0001\u0000\u0000\u0000$%\u0003\n\u0005\u0000%&\u0005\u0005\u0000\u0000"+
		"&\'\u0005\u001f\u0000\u0000\'1\u0001\u0000\u0000\u0000()\u0003\f\u0006"+
		"\u0000)*\u0005\u0005\u0000\u0000*+\u0005\u001b\u0000\u0000+1\u0001\u0000"+
		"\u0000\u0000,-\u0003\u000e\u0007\u0000-.\u0005\u0005\u0000\u0000./\u0005"+
		"\u001e\u0000\u0000/1\u0001\u0000\u0000\u00000$\u0001\u0000\u0000\u0000"+
		"0(\u0001\u0000\u0000\u00000,\u0001\u0000\u0000\u00001\t\u0001\u0000\u0000"+
		"\u000026\u0005\b\u0000\u000036\u0005\n\u0000\u000046\u0001\u0000\u0000"+
		"\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000"+
		"\u0000\u00006\u000b\u0001\u0000\u0000\u000078\u0005\t\u0000\u00008\r\u0001"+
		"\u0000\u0000\u00009:\u0005\f\u0000\u0000:\u000f\u0001\u0000\u0000\u0000"+
		";<\u0007\u0000\u0000\u0000<\u0011\u0001\u0000\u0000\u0000\u0003\"05";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
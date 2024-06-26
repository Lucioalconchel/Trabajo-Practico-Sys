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
		RULE_inicio = 0, RULE_raiz = 1, RULE_renglon = 2, RULE_contenido = 3, 
		RULE_string = 4, RULE_bool = 5, RULE_ruta = 6, RULE_version = 7, RULE_url = 8, 
		RULE_arreglo = 9, RULE_objeto = 10, RULE_vcr = 11, RULE_dependencia = 12, 
		RULE_cadena = 13, RULE_engines = 14, RULE_script = 15, RULE_repository = 16, 
		RULE_elementos = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "raiz", "renglon", "contenido", "string", "bool", "ruta", "version", 
			"url", "arreglo", "objeto", "vcr", "dependencia", "cadena", "engines", 
			"script", "repository", "elementos"
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
			setState(36);
			raiz();
			setState(37);
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
		public RenglonContext renglon() {
			return getRuleContext(RenglonContext.class,0);
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
			setState(39);
			match(OBJETO_ABRE);
			setState(40);
			renglon();
			setState(41);
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
	public static class RenglonContext extends ParserRuleContext {
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
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
		enterRule(_localctx, 4, RULE_renglon);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				contenido();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				contenido();
				setState(45);
				match(OBJETO_SEPARA);
				setState(46);
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
	public static class ContenidoContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contenido);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_NAME:
			case CADENA_DESCRIPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				string();
				}
				break;
			case CADENA_PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				bool();
				}
				break;
			case CADENA_MAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				ruta();
				}
				break;
			case CADENA_VERSION:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				version();
				}
				break;
			case CADENA_HOMEPAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				url();
				}
				break;
			case CADENA_KEYWORDS:
			case CADENA_CPU:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				arreglo();
				}
				break;
			case CADENA_AUTHOR:
			case CADENA_SCRIPTS:
			case CADENA_DEPENDENCIES:
			case CADENA_ENGINES:
			case CADENA_REPOSITORY:
			case CADENA_BUGS:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				objeto();
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode CADENA_NAME() { return getToken(ParserParser.CADENA_NAME, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VC() { return getToken(ParserParser.VC, 0); }
		public TerminalNode CADENA_DESCRIPTION() { return getToken(ParserParser.CADENA_DESCRIPTION, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(CADENA_NAME);
				setState(60);
				match(ELEMENTO_SEPARA);
				setState(61);
				match(VC);
				}
				break;
			case CADENA_DESCRIPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(CADENA_DESCRIPTION);
				setState(63);
				match(ELEMENTO_SEPARA);
				setState(64);
				match(VC);
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
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode CADENA_PRIVATE() { return getToken(ParserParser.CADENA_PRIVATE, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VAL_BOLEANO() { return getToken(ParserParser.VAL_BOLEANO, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(CADENA_PRIVATE);
			setState(68);
			match(ELEMENTO_SEPARA);
			setState(69);
			match(VAL_BOLEANO);
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
	public static class RutaContext extends ParserRuleContext {
		public TerminalNode CADENA_MAIN() { return getToken(ParserParser.CADENA_MAIN, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VAL_RUTA() { return getToken(ParserParser.VAL_RUTA, 0); }
		public RutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruta; }
	}

	public final RutaContext ruta() throws RecognitionException {
		RutaContext _localctx = new RutaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ruta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(CADENA_MAIN);
			setState(72);
			match(ELEMENTO_SEPARA);
			setState(73);
			match(VAL_RUTA);
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
	public static class VersionContext extends ParserRuleContext {
		public TerminalNode CADENA_VERSION() { return getToken(ParserParser.CADENA_VERSION, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VAL_VERSION() { return getToken(ParserParser.VAL_VERSION, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CADENA_VERSION);
			setState(76);
			match(ELEMENTO_SEPARA);
			setState(77);
			match(VAL_VERSION);
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
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode CADENA_HOMEPAGE() { return getToken(ParserParser.CADENA_HOMEPAGE, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VAL_URL_SEGURA() { return getToken(ParserParser.VAL_URL_SEGURA, 0); }
		public TerminalNode VAL_URL_NO_SEGURA() { return getToken(ParserParser.VAL_URL_NO_SEGURA, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_url);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(CADENA_HOMEPAGE);
				setState(80);
				match(ELEMENTO_SEPARA);
				setState(81);
				match(VAL_URL_SEGURA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(CADENA_HOMEPAGE);
				setState(83);
				match(ELEMENTO_SEPARA);
				setState(84);
				match(VAL_URL_NO_SEGURA);
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
	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode CADENA_CPU() { return getToken(ParserParser.CADENA_CPU, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode ARREGLO_ABRE() { return getToken(ParserParser.ARREGLO_ABRE, 0); }
		public VcrContext vcr() {
			return getRuleContext(VcrContext.class,0);
		}
		public TerminalNode ARREGLO_CIERRA() { return getToken(ParserParser.ARREGLO_CIERRA, 0); }
		public TerminalNode CADENA_KEYWORDS() { return getToken(ParserParser.CADENA_KEYWORDS, 0); }
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arreglo);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_CPU:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(CADENA_CPU);
				setState(88);
				match(ELEMENTO_SEPARA);
				setState(89);
				match(ARREGLO_ABRE);
				setState(90);
				vcr();
				setState(91);
				match(ARREGLO_CIERRA);
				}
				break;
			case CADENA_KEYWORDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(CADENA_KEYWORDS);
				setState(94);
				match(ELEMENTO_SEPARA);
				setState(95);
				match(ARREGLO_ABRE);
				setState(96);
				vcr();
				setState(97);
				match(ARREGLO_CIERRA);
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
	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode CADENA_ENGINES() { return getToken(ParserParser.CADENA_ENGINES, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode OBJETO_ABRE() { return getToken(ParserParser.OBJETO_ABRE, 0); }
		public EnginesContext engines() {
			return getRuleContext(EnginesContext.class,0);
		}
		public TerminalNode OBJETO_CIERRA() { return getToken(ParserParser.OBJETO_CIERRA, 0); }
		public TerminalNode CADENA_SCRIPTS() { return getToken(ParserParser.CADENA_SCRIPTS, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode CADENA_DEPENDENCIES() { return getToken(ParserParser.CADENA_DEPENDENCIES, 0); }
		public DependenciaContext dependencia() {
			return getRuleContext(DependenciaContext.class,0);
		}
		public TerminalNode CADENA_REPOSITORY() { return getToken(ParserParser.CADENA_REPOSITORY, 0); }
		public RepositoryContext repository() {
			return getRuleContext(RepositoryContext.class,0);
		}
		public TerminalNode CADENA_BUGS() { return getToken(ParserParser.CADENA_BUGS, 0); }
		public TerminalNode CADENA_AUTHOR() { return getToken(ParserParser.CADENA_AUTHOR, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objeto);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ENGINES:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(CADENA_ENGINES);
				setState(102);
				match(ELEMENTO_SEPARA);
				setState(103);
				match(OBJETO_ABRE);
				setState(104);
				engines();
				setState(105);
				match(OBJETO_CIERRA);
				}
				break;
			case CADENA_SCRIPTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(CADENA_SCRIPTS);
				setState(108);
				match(ELEMENTO_SEPARA);
				setState(109);
				match(OBJETO_ABRE);
				setState(110);
				script();
				setState(111);
				match(OBJETO_CIERRA);
				}
				break;
			case CADENA_DEPENDENCIES:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(CADENA_DEPENDENCIES);
				setState(114);
				match(ELEMENTO_SEPARA);
				setState(115);
				match(OBJETO_ABRE);
				setState(116);
				dependencia();
				setState(117);
				match(OBJETO_CIERRA);
				}
				break;
			case CADENA_REPOSITORY:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(CADENA_REPOSITORY);
				setState(120);
				match(ELEMENTO_SEPARA);
				setState(121);
				match(OBJETO_ABRE);
				setState(122);
				repository();
				setState(123);
				match(OBJETO_CIERRA);
				}
				break;
			case CADENA_BUGS:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(CADENA_BUGS);
				setState(126);
				match(ELEMENTO_SEPARA);
				setState(127);
				match(OBJETO_ABRE);
				setState(128);
				repository();
				setState(129);
				match(OBJETO_CIERRA);
				}
				break;
			case CADENA_AUTHOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				match(CADENA_AUTHOR);
				setState(132);
				match(ELEMENTO_SEPARA);
				setState(133);
				match(OBJETO_ABRE);
				setState(134);
				repository();
				setState(135);
				match(OBJETO_CIERRA);
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
	public static class VcrContext extends ParserRuleContext {
		public ElementosContext elementos() {
			return getRuleContext(ElementosContext.class,0);
		}
		public TerminalNode OBJETO_SEPARA() { return getToken(ParserParser.OBJETO_SEPARA, 0); }
		public VcrContext vcr() {
			return getRuleContext(VcrContext.class,0);
		}
		public VcrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vcr; }
	}

	public final VcrContext vcr() throws RecognitionException {
		VcrContext _localctx = new VcrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vcr);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				elementos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				elementos();
				setState(141);
				match(OBJETO_SEPARA);
				setState(142);
				vcr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class DependenciaContext extends ParserRuleContext {
		public TerminalNode VCR() { return getToken(ParserParser.VCR, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VAL_VERSION() { return getToken(ParserParser.VAL_VERSION, 0); }
		public TerminalNode OBJETO_SEPARA() { return getToken(ParserParser.OBJETO_SEPARA, 0); }
		public DependenciaContext dependencia() {
			return getRuleContext(DependenciaContext.class,0);
		}
		public DependenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencia; }
	}

	public final DependenciaContext dependencia() throws RecognitionException {
		DependenciaContext _localctx = new DependenciaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dependencia);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(VCR);
				setState(148);
				match(ELEMENTO_SEPARA);
				setState(149);
				match(VAL_VERSION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(VCR);
				setState(151);
				match(ELEMENTO_SEPARA);
				setState(152);
				match(VAL_VERSION);
				setState(153);
				match(OBJETO_SEPARA);
				setState(154);
				dependencia();
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
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode CADENA_NPM() { return getToken(ParserParser.CADENA_NPM, 0); }
		public TerminalNode CADENA_YARN() { return getToken(ParserParser.CADENA_YARN, 0); }
		public TerminalNode CADENA_NODE() { return getToken(ParserParser.CADENA_NODE, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnginesContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public TerminalNode VAL_VERSION() { return getToken(ParserParser.VAL_VERSION, 0); }
		public TerminalNode OBJETO_SEPARA() { return getToken(ParserParser.OBJETO_SEPARA, 0); }
		public EnginesContext engines() {
			return getRuleContext(EnginesContext.class,0);
		}
		public EnginesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engines; }
	}

	public final EnginesContext engines() throws RecognitionException {
		EnginesContext _localctx = new EnginesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_engines);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				cadena();
				setState(160);
				match(ELEMENTO_SEPARA);
				setState(161);
				match(VAL_VERSION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				cadena();
				setState(164);
				match(ELEMENTO_SEPARA);
				setState(165);
				match(VAL_VERSION);
				setState(166);
				match(OBJETO_SEPARA);
				setState(167);
				engines();
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
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode VCR() { return getToken(ParserParser.VCR, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public ElementosContext elementos() {
			return getRuleContext(ElementosContext.class,0);
		}
		public TerminalNode OBJETO_SEPARA() { return getToken(ParserParser.OBJETO_SEPARA, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_script);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(VCR);
				setState(172);
				match(ELEMENTO_SEPARA);
				setState(173);
				elementos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(VCR);
				setState(175);
				match(ELEMENTO_SEPARA);
				setState(176);
				elementos();
				setState(177);
				match(OBJETO_SEPARA);
				setState(178);
				script();
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
	public static class RepositoryContext extends ParserRuleContext {
		public TerminalNode VCR() { return getToken(ParserParser.VCR, 0); }
		public TerminalNode ELEMENTO_SEPARA() { return getToken(ParserParser.ELEMENTO_SEPARA, 0); }
		public ElementosContext elementos() {
			return getRuleContext(ElementosContext.class,0);
		}
		public TerminalNode OBJETO_SEPARA() { return getToken(ParserParser.OBJETO_SEPARA, 0); }
		public RepositoryContext repository() {
			return getRuleContext(RepositoryContext.class,0);
		}
		public RepositoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repository; }
	}

	public final RepositoryContext repository() throws RecognitionException {
		RepositoryContext _localctx = new RepositoryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repository);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(VCR);
				setState(183);
				match(ELEMENTO_SEPARA);
				setState(184);
				elementos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(VCR);
				setState(186);
				match(ELEMENTO_SEPARA);
				setState(187);
				elementos();
				setState(188);
				match(OBJETO_SEPARA);
				setState(189);
				repository();
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
	public static class ElementosContext extends ParserRuleContext {
		public TerminalNode VAL_RUTA() { return getToken(ParserParser.VAL_RUTA, 0); }
		public TerminalNode VC() { return getToken(ParserParser.VC, 0); }
		public TerminalNode VAL_URL_NO_SEGURA() { return getToken(ParserParser.VAL_URL_NO_SEGURA, 0); }
		public TerminalNode VAL_URL_SEGURA() { return getToken(ParserParser.VAL_URL_SEGURA, 0); }
		public TerminalNode VCR() { return getToken(ParserParser.VCR, 0); }
		public TerminalNode VAL_VERSION() { return getToken(ParserParser.VAL_VERSION, 0); }
		public TerminalNode VAL_NULL() { return getToken(ParserParser.VAL_NULL, 0); }
		public ElementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementos; }
	}

	public final ElementosContext elementos() throws RecognitionException {
		ElementosContext _localctx = new ElementosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8489271296L) != 0)) ) {
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
		"\u0004\u0001 \u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bV\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\td\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u008a\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0092\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009c"+
		"\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00aa\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b5"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c0\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0002\u0001\u0000\u0016\u0018\u0002\u0000\u0019\u0019\u001b \u00c6\u0000"+
		"$\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u00040\u0001"+
		"\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000"+
		"\u0000\nC\u0001\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000eK\u0001"+
		"\u0000\u0000\u0000\u0010U\u0001\u0000\u0000\u0000\u0012c\u0001\u0000\u0000"+
		"\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000"+
		"\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u009d\u0001\u0000\u0000"+
		"\u0000\u001c\u00a9\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000"+
		"\u0000 \u00bf\u0001\u0000\u0000\u0000\"\u00c1\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000"+
		"\u0000\u0000\'(\u0005\u0002\u0000\u0000()\u0003\u0004\u0002\u0000)*\u0005"+
		"\u0003\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+1\u0003\u0006\u0003"+
		"\u0000,-\u0003\u0006\u0003\u0000-.\u0005\u0004\u0000\u0000./\u0003\u0004"+
		"\u0002\u0000/1\u0001\u0000\u0000\u00000+\u0001\u0000\u0000\u00000,\u0001"+
		"\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u00002:\u0003\b\u0004\u0000"+
		"3:\u0003\n\u0005\u00004:\u0003\f\u0006\u00005:\u0003\u000e\u0007\u0000"+
		"6:\u0003\u0010\b\u00007:\u0003\u0012\t\u00008:\u0003\u0014\n\u000092\u0001"+
		"\u0000\u0000\u000093\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u0000"+
		"95\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005"+
		"\b\u0000\u0000<=\u0005\u0005\u0000\u0000=B\u0005 \u0000\u0000>?\u0005"+
		"\n\u0000\u0000?@\u0005\u0005\u0000\u0000@B\u0005 \u0000\u0000A;\u0001"+
		"\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000"+
		"CD\u0005\r\u0000\u0000DE\u0005\u0005\u0000\u0000EF\u0005\u001a\u0000\u0000"+
		"F\u000b\u0001\u0000\u0000\u0000GH\u0005\f\u0000\u0000HI\u0005\u0005\u0000"+
		"\u0000IJ\u0005\u001e\u0000\u0000J\r\u0001\u0000\u0000\u0000KL\u0005\t"+
		"\u0000\u0000LM\u0005\u0005\u0000\u0000MN\u0005\u001b\u0000\u0000N\u000f"+
		"\u0001\u0000\u0000\u0000OP\u0005\u0014\u0000\u0000PQ\u0005\u0005\u0000"+
		"\u0000QV\u0005\u001c\u0000\u0000RS\u0005\u0014\u0000\u0000ST\u0005\u0005"+
		"\u0000\u0000TV\u0005\u001d\u0000\u0000UO\u0001\u0000\u0000\u0000UR\u0001"+
		"\u0000\u0000\u0000V\u0011\u0001\u0000\u0000\u0000WX\u0005\u0013\u0000"+
		"\u0000XY\u0005\u0005\u0000\u0000YZ\u0005\u0006\u0000\u0000Z[\u0003\u0016"+
		"\u000b\u0000[\\\u0005\u0007\u0000\u0000\\d\u0001\u0000\u0000\u0000]^\u0005"+
		"\u0012\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0005\u0006\u0000\u0000"+
		"`a\u0003\u0016\u000b\u0000ab\u0005\u0007\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000cW\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000d\u0013\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0010\u0000\u0000fg\u0005\u0005\u0000\u0000"+
		"gh\u0005\u0002\u0000\u0000hi\u0003\u001c\u000e\u0000ij\u0005\u0003\u0000"+
		"\u0000j\u008a\u0001\u0000\u0000\u0000kl\u0005\u000e\u0000\u0000lm\u0005"+
		"\u0005\u0000\u0000mn\u0005\u0002\u0000\u0000no\u0003\u001e\u000f\u0000"+
		"op\u0005\u0003\u0000\u0000p\u008a\u0001\u0000\u0000\u0000qr\u0005\u000f"+
		"\u0000\u0000rs\u0005\u0005\u0000\u0000st\u0005\u0002\u0000\u0000tu\u0003"+
		"\u0018\f\u0000uv\u0005\u0003\u0000\u0000v\u008a\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0011\u0000\u0000xy\u0005\u0005\u0000\u0000yz\u0005\u0002\u0000"+
		"\u0000z{\u0003 \u0010\u0000{|\u0005\u0003\u0000\u0000|\u008a\u0001\u0000"+
		"\u0000\u0000}~\u0005\u0015\u0000\u0000~\u007f\u0005\u0005\u0000\u0000"+
		"\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0081\u0003 \u0010\u0000\u0081"+
		"\u0082\u0005\u0003\u0000\u0000\u0082\u008a\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\u000b\u0000\u0000\u0084\u0085\u0005\u0005\u0000\u0000\u0085"+
		"\u0086\u0005\u0002\u0000\u0000\u0086\u0087\u0003 \u0010\u0000\u0087\u0088"+
		"\u0005\u0003\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089e\u0001"+
		"\u0000\u0000\u0000\u0089k\u0001\u0000\u0000\u0000\u0089q\u0001\u0000\u0000"+
		"\u0000\u0089w\u0001\u0000\u0000\u0000\u0089}\u0001\u0000\u0000\u0000\u0089"+
		"\u0083\u0001\u0000\u0000\u0000\u008a\u0015\u0001\u0000\u0000\u0000\u008b"+
		"\u0092\u0003\"\u0011\u0000\u008c\u008d\u0003\"\u0011\u0000\u008d\u008e"+
		"\u0005\u0004\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008b"+
		"\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u001f\u0000\u0000\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u009c"+
		"\u0005\u001b\u0000\u0000\u0096\u0097\u0005\u001f\u0000\u0000\u0097\u0098"+
		"\u0005\u0005\u0000\u0000\u0098\u0099\u0005\u001b\u0000\u0000\u0099\u009a"+
		"\u0005\u0004\u0000\u0000\u009a\u009c\u0003\u0018\f\u0000\u009b\u0093\u0001"+
		"\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009c\u0019\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0007\u0000\u0000\u0000\u009e\u001b\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003\u001a\r\u0000\u00a0\u00a1\u0005\u0005"+
		"\u0000\u0000\u00a1\u00a2\u0005\u001b\u0000\u0000\u00a2\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0003\u001a\r\u0000\u00a4\u00a5\u0005\u0005\u0000"+
		"\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6\u00a7\u0005\u0004\u0000"+
		"\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000\u00a8\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a9\u009f\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000"+
		"\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0005\u0000\u0000\u00ad\u00b5\u0003\"\u0011\u0000"+
		"\u00ae\u00af\u0005\u001f\u0000\u0000\u00af\u00b0\u0005\u0005\u0000\u0000"+
		"\u00b0\u00b1\u0003\"\u0011\u0000\u00b1\u00b2\u0005\u0004\u0000\u0000\u00b2"+
		"\u00b3\u0003\u001e\u000f\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b5"+
		"\u001f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u001f\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0005\u0000\u0000\u00b8\u00c0\u0003\"\u0011\u0000\u00b9\u00ba"+
		"\u0005\u001f\u0000\u0000\u00ba\u00bb\u0005\u0005\u0000\u0000\u00bb\u00bc"+
		"\u0003\"\u0011\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be\u0003"+
		" \u0010\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00b6\u0001\u0000"+
		"\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000\u00c0!\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2#\u0001\u0000\u0000\u0000"+
		"\u000b09AUc\u0089\u0091\u009b\u00a9\u00b4\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
lexer grammar LexerNodeV2;

fragment MINUSCULA: [a-z];
fragment MAYUSCULA: [A-Z];
fragment NUMERO: [0-9];
fragment SEPARADORES: ('-' | '_' | '.' | '(' | ')');
fragment CARACTERES: (':' | '#' | '=' | '&' | '@' | '+' | '?');
fragment COMPARADORES: ('=' | '<' | '>' | '<=' | '>=' | '^');

WS: [ \r\n\t]+ -> skip;

OBJETO_ABRE: '{';
OBJETO_CIERRA: '}';
OBJETO_SEPARA: ',';
ELEMENTO_SEPARA: ':';
ARREGLO_ABRE: '[';
ARREGLO_CIERRA: ']';
CADENA_NAME: '"name"';
CADENA_VERSION: '"version"';
CADENA_DESCRIPTION: '"description"';
CADENA_AUTHOR: '"author"';
CADENA_MAIN: '"main"';
CADENA_PRIVATE: '"private"';
CADENA_SCRIPTS: '"scripts"';
CADENA_DEPENDENCIES: '"dependencies"';
CADENA_ENGINES: '"engines"';
CADENA_REPOSITORY: '"repository"';
CADENA_KEYWORDS: '"keywords"';
CADENA_CPU: '"cpu"';
CADENA_HOMEPAGE: '"homepage"';
CADENA_BUGS: '"bugs"';
CADENA_NODE: '"node"';
CADENA_NPM: '"npm"';
CADENA_YARN: '"yarn"';
VAL_NULL: 'null';

VAL_BOLEANO: ('true' | 'false');
VAL_VERSION:
	'"' ((COMPARADORES* NUMERO+) | NUMERO+) ('.' NUMERO+)* '"';
VAL_URL_SEGURA:
	'"https://' (
		MINUSCULA+
		| MAYUSCULA+
		| NUMERO+
		| SEPARADORES+
		| CARACTERES+
	) (
		(
			MINUSCULA+
			| MAYUSCULA+
			| NUMERO+
			| SEPARADORES+
			| CARACTERES+
		)
		| '/'
	)* '"';
VAL_URL_NO_SEGURA:
	'"http://' (
		MINUSCULA+
		| MAYUSCULA+
		| NUMERO+
		| SEPARADORES+
		| CARACTERES+
	) (
		(
			MINUSCULA+
			| MAYUSCULA+
			| NUMERO+
			| SEPARADORES+
			| CARACTERES+
		)
		| '/'
	)* '"';
VAL_RUTA: ('"/' | '"../' | '"./') (
		MINUSCULA
		| MAYUSCULA
		| NUMERO
		| SEPARADORES
		| '/'
		| '../'
	)* ('"' | '/"');
VCR: '"' MINUSCULA+ (MINUSCULA | NUMERO | SEPARADORES)* '"';
VC:
	'"' (
		MINUSCULA
		| MAYUSCULA
		| NUMERO
		| SEPARADORES
		| CARACTERES
		| COMPARADORES
		| '/'
		| ' '
	)* '"';
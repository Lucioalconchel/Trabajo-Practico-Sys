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
ARREGLO_ABRE: '[' -> skip;
ARREGLO_CIERRA: ']' -> skip;
CADENA_NAME: '"name"';
CADENA_VERSION: '"version"';
CADENA_DESCRIPTION: '"description"';
CADENA_AUTHOR: '"author"' -> skip;
CADENA_MAIN: '"main"' -> skip;
CADENA_PRIVATE: '"private"' -> skip;
CADENA_SCRIPTS: '"scripts"' -> skip;
CADENA_DEPENDENCIES: '"dependencies"' -> skip;
CADENA_ENGINES: '"engines"' -> skip;
CADENA_REPOSITORY: '"repository"' -> skip;
CADENA_KEYWORDS: '"keywords"' -> skip;
CADENA_CPU: '"cpu"' -> skip;
CADENA_HOMEPAGE: '"homepage"' -> skip;
CADENA_BUGS: '"bugs"' -> skip;
CADENA_NODE: '"node"' -> skip;
CADENA_NPM: '"npm"' -> skip;
CADENA_YARN: '"yarn"' -> skip;
VAL_NULL: 'null' -> skip;

VAL_BOLEANO: ('true' | 'false') -> skip;
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
	)* '"' -> skip;
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
	)* '"' -> skip;
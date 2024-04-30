lexer grammar LexerNode;

fragment MINUSCULA:     [a-z] ;
fragment MAYUSCULA:     [A-Z] ;
fragment NUMERO:        [0-9] ;
fragment SEPARADORES:   ('-' | '_'|'.'| '('| ')');
fragment CARACTERES:    (':' | '#' | '=' | '&' | '@' | '+' | '?');
fragment COMPARADORES:  ('=' | '<' | '>' | '<=' | '>=' | '^');

VAL_BOLEANO: ('true' | 'false');
// VAL_VERSION: COMPARADORES . (NUMERO . SEPARADORES)* {System.out.print(getText());}; //
VAL_VERSION: '"' . COMPARADORES . ('.' NUMERO+)* . '"' {System.out.print(getText());};
VAL_URL_SEGURA: '"https://' . (MINUSCULA | MAYUSCULA | NUMERO | SEPARADORES | CARACTERES)* . '"' {System.out.print(getText());} ;
VAL_URL_NO_SEGURA: '"http://' . (MINUSCULA | MAYUSCULA | NUMERO | SEPARADORES | CARACTERES)* . '"' {System.out.print(getText());} ;

WS: [ \r\n\t] -> skip;

OBJETO_ABRE:    '{' {System.out.print(" <OBJETO_ABRE> ");} ;
OBJETO_CIERRA:  '}' {System.out.print(" <OBJETO_CIERRA> ");} ;
OBJETO_SEPARA: ',' {System.out.print(" <OBJETO_SEPARA> ");} ;
ELEMENTO_SEPARA:  ':' {System.out.print(" <ELEMENTO_SEPARA> ");} ;
ARREGLO_ABRE:   '[' {System.out.print(" <ARREGLO_ABRE> ");} ;
ARREGLO_CIERRA: ']' {System.out.print(" <ARREGLO_CIERRA> ");} ;
CADENA_NAME:    '"name"' {System.out.print(" <CADENA_NAME> ");} ;
CADENA_VERSION: '"version"' {System.out.print(" <CADENA_VERSION> ");} ;  
CADENA_DESCRIPTION: '"description"' {System.out.print(" <CADENA_DESCRIPTION> ");} ;
CADENA_AUTHOR: '"author"' {System.out.print(" <CADENA_AUTHOR> ");} ;
CADENA_MAIN: '"main"' {System.out.print(" <CADENA_MAIN> ");} ;
CADENA_PRIVATE: '"private"' {System.out.print(" <CADENA_PRIVATE> ");} ;
CADENA_SCRIPTS: '"scripts"' {System.out.print(" <CADENA_SCRIPTS> ");} ;
CADENA_DEPENDENCIES: '"dependencies"' {System.out.print(" <CADENA_DEPENDENCIES> ");} ;
CADENA_ENGINES: '"engines"' {System.out.print(" <CADENA_ENGINES> ");} ;
CADENA_REPOSITORY: '"repository"' {System.out.print(" <CADENA_REPOSITORY> ");} ;
CADENA_KEYWORDS: '"keywords"' {System.out.print(" <CADENA_KEYWORDS> ");} ;
CADENA_CPU: '"cpu"' {System.out.print(" <CADENA_CPU> ");} ;
CADENA_HOMEPAGE: '"homepage"' {System.out.print(" <CADENA_HOMEPAGE> ");} ;
CADENA_BUGS: '"bugs"' {System.out.print(" <CADENA_BUGS> ");} ;
CADENA_NODE: '"node"' {System.out.print(" <CADENA_NODE> ");} ;
CADENA_NPM: '"npm"' {System.out.print(" <CADENA_NPM> ");} ;
CADENA_YARN: '"yarn"' {System.out.print(" <CADENA_YARN> ");} ;
VAL_NULL: 'null' {System.out.print(" <VAL_NULL> ");} ;

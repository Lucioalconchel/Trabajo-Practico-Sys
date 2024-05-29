grammar Parser;
import LexerNodeV2;

inicio: raiz EOF;

raiz: OBJETO_ABRE contenido OBJETO_CIERRA;

string:
	CADENA_NAME ELEMENTO_SEPARA VC
	| CADENA_DESCRIPTION ELEMENTO_SEPARA VC
	| OBJETO_SEPARA string;
bool:
	CADENA_PRIVATE ELEMENTO_SEPARA VAL_BOLEANO ELEMENTO_SEPARA;
ruta: CADENA_MAIN ELEMENTO_SEPARA VAL_RUTA;
version: VAL_VERSION ELEMENTO_SEPARA VAL_VERSION;
url:
	CADENA_HOMEPAGE ELEMENTO_SEPARA VAL_URL_SEGURA
	| CADENA_HOMEPAGE ELEMENTO_SEPARA VAL_URL_NO_SEGURA;

arreglo:
	CADENA_CPU ELEMENTO_SEPARA ARREGLO_ABRE vcr ARREGLO_CIERRA OBJETO_SEPARA
	| CADENA_KEYWORDS ELEMENTO_SEPARA ARREGLO_ABRE vcr ARREGLO_CIERRA OBJETO_SEPARA;
objeto:
	CADENA_ENGINES
	| CADENA_SCRIPTS
	| CADENA_DEPENDENCIES
	| CADENA_REPOSITORY
	| CADENA_BUGS
	| CADENA_AUTHOR;
vcr: VCR | VCR OBJETO_SEPARA vcr;
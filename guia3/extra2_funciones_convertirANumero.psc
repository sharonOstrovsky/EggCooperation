//2. Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//	decimales

Algoritmo extra2_funciones
	
	Definir num Como Caracter
	Definir numEntero Como Entero
	
//	Hacer
		Escribir "ingrese un numero de hasta 3 digitos"
		Leer num
//	Mientras Que ConvertirANumero(num)/1000>1
		
	numEntero = convertirCadenaANumero(num)
FinAlgoritmo

Funcion numEntero <- convertirCadenaANumero(num Por Referencia)
	Definir numEntero Como Entero
	numEntero = ConvertirANumero(num)
FinFuncion
	
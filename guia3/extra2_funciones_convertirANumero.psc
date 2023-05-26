//2. Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
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
	
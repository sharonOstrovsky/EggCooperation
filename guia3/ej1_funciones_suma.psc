//1. Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//	pediremos al usuario los dos números para pasárselos a la función. Después la función
//		calculará la suma y lo devolverá para imprimirlo en el algoritmo.
//

Algoritmo ej1_funciones
	
	Definir num1, num2 Como Entero
	Escribir "ingrese un numero"
	Leer num1
	Escribir "ingrese otro numero"
	Leer num2
	Escribir num1 " + " num2 " = "  sumaNum(num1,num2)
	
FinAlgoritmo

Funcion suma <- sumaNum(num1 Por Referencia, num2 Por Referencia)
	Definir suma Como Entero
	suma = num1 + num2
FinFuncion
	
//1. Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//	pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//		calcular� la suma y lo devolver� para imprimirlo en el algoritmo.
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
	
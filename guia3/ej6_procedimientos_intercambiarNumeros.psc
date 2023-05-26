//6. Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo ej6_funciones
	
	Definir num1, num2 Como Entero
	num1 = 2
	num2 = 5
	intercambiarNumeros(num1, num2)
	Escribir "num1 = " num1
	Escribir "num2 = " num2
	
FinAlgoritmo

SubProceso intercambiarNumeros(num1 Por Referencia, num2 Por Referencia)
	
	Definir aux Como Entero
	aux = num1
	num1 = num2
	num2 = aux
	
FinSubProceso
	
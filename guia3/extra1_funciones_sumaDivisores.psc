//1. Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo extra1_funciones
	
	Definir num Como Entero
	Escribir "ingrese un numero"
	Leer num
	
	Escribir "suma = " sumaDivisores(num)
FinAlgoritmo


Funcion suma <- sumaDivisores(num Por Referencia)
	Definir suma, i Como Entero
	suma = 0
	
	Para i = 1 Hasta num - 1 Hacer
		si num MOD i == 0 Entonces
			suma = suma + i
		FinSi
	FinPara
FinFuncion
	
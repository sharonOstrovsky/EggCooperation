//12. Escribir un programa que calcule la suma de los N primeros n�meros naturales. El valor de
//N se leer� por teclado.

Algoritmo extra12_buclePara
	
	Definir N, i, suma Como Entero
	suma = 0
	
	Escribir "ingrese un numero"
	Leer N
	
	
	Para i = 0 Hasta N Hacer
		suma = suma + i
	FinPara
	
	Escribir "la suma de los " N " primeros numeros naturales es " suma
FinAlgoritmo

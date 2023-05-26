//8. Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.

Algoritmo ej8_matrices
	Definir matriz Como Entero
	Dimension matriz[3,3]
	llenarMatriz(matriz)
	imprimirMatriz(matriz)
FinAlgoritmo


SubProceso llenarMatriz(matriz Por Referencia)
	Definir fil, col, num Como Entero
	para fil = 0 Hasta 2 Hacer
		para col = 0 Hasta 2 Hacer
			Leer num
			matriz[fil,col] = num
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz Por Referencia)
	Definir fil, col Como Entero
	para fil = 0 Hasta 2 Hacer
		para col = 0 Hasta 2 Hacer
			Escribir Sin Saltar matriz[fil,col]
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	
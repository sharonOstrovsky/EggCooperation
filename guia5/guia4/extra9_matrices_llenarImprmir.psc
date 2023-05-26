//9. Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo extra9_matrices
	Definir matriz, n, m Como Entero
	n = 4
	m = 4
	Dimension matriz[n,m]
	llenarMatriz(matriz, n, m)
	imprimirMatriz(matriz,n,m)
FinAlgoritmo

SubAlgoritmo llenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j  = 0 hasta m - 1 Hacer
			matriz[i,j] = azar(10)
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo imprimirMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j  = 0 hasta m - 1 Hacer
			Escribir Sin Saltar " " matriz[i,j] " " 
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo
	
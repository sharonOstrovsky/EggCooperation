//11. Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.

Algoritmo ej11_matrices
	Definir matriz, n como entero
	Escribir "ingrese la dimension de la matriz"
	Leer n
	Dimension matriz[n,n]
	llenarMatriz(matriz, n)
	imprimirMatriz(matriz, n)
FinAlgoritmo


SubProceso imprimirMatriz(matriz Por Referencia, n)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta n - 1 Hacer
			Escribir Sin Saltar " " matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso llenarMatriz(matriz Por Referencia, n)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta n - 1 Hacer
			si i == j Entonces
				matriz[i,j] = 0
			SiNo
				matriz[i,j] = Aleatorio(1,9)
			FinSi
		FinPara
	FinPara
FinSubProceso
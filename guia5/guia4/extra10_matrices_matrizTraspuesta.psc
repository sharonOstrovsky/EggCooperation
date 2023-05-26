//10. Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//con números aleatorios entre 1 y 100 y mostrar su traspuesta.

Algoritmo extra10_matrices_matrizTraspuesta
	Definir matriz, n, m Como Entero
	Escribir "ingrese la cantidad de filas"
	Leer n
	Escribir "ingrese la cantidad de columnas"
	Leer m
	Dimension matriz[n,m]
	llenarMatriz(matriz,n,m)
	Escribir "matriz:"
	imprimirMatriz(matriz, n, m)
	matrizTraspuesta(matriz,n,m)
FinAlgoritmo


SubAlgoritmo matrizTraspuesta(matriz Por Referencia, n, m)
	Definir tras , i, j Como Entero
	Dimension tras[m,n]
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			tras[j,i] = matriz[i,j]
		FinPara
	FinPara
	Escribir "traspuesta:"
	imprimirMatriz(tras, m, n)
FinSubAlgoritmo

SubAlgoritmo llenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j  = 0 hasta m - 1 Hacer
			matriz[i,j] = Aleatorio(1,100)
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
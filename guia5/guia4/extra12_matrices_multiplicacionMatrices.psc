//12. Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo extra12_matrices
	Definir matrizA, matrizB Como Entero
	Dimension matrizA[3,3], matrizB[3,3]
	llenarMatriz(matrizA,3,3)
	Escribir "matrizA"
	imprimirMatriz(matrizA,3,3)
	llenarMatriz(matrizB,3,3)
	Escribir "matrizB"
	imprimirMatriz(matrizB,3,3)
	multiplicacionMatricesCuadradas(matrizA,matrizB,3)
FinAlgoritmo

//  00 01 02    00 01 02    
//  10 11 12    10 11 12
//  20 21 22    20 21 22

SubAlgoritmo multiplicacionMatricesCuadradas(matrizA por Referencia, matrizB Por Referencia, n)
	Definir matrizC, i, j, k, suma Como Entero
	Dimension matrizC[n,n]
	Escribir "matrizC"

	Para i = 0 Hasta n - 1 Hacer //de i = 0 hasta i = n-1 = 3- 1= 2
		k = 0
		Mientras k <= 2 Hacer  //o<2
			suma = 0
			Para j = 0 Hasta  n - 1 Hacer  //de j = 0 hasta j = 2
				suma = suma + (matrizA[i,j] * matrizB[j,k]) //suma = 0 + m[0,0] * m[0,0]
			FinPara
			matrizC[i,k] = suma
			k = k + 1
		FinMientras
	FinPara
	
	imprimirMatriz(matrizC, 3,3)
FinSubAlgoritmo


SubAlgoritmo llenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j  = 0 hasta m - 1 Hacer
			matriz[i,j] = azar(9)
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

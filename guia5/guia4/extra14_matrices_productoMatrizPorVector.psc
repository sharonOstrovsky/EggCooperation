//14. Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado.

Algoritmo extra14_matrices_productoMatrizPorVector
	Definir matriz, vector Como Entero
	Dimension matriz[3,3]
	Dimension vector[3]
	llenarMatriz(matriz,3,3)
	Escribir "MATRIZ:"
	imprimirMatriz(matriz,3,3)
	llenarVector(vector,3)
	Escribir "VECTOR:"
	imprimirVector(vector,3)
	Escribir ""
	productoMatrizCuadradaVector(matriz, vector,3,3)
FinAlgoritmo

//  00 01 02    00 01 02    00 01 02
//  10 11 12                
//  20 21 22   
SubAlgoritmo productoMatrizCuadradaVector(matriz Por Referencia, vector Por Referencia, dimMatriz, dimVec)
	Definir matrizC, i, j, k, suma Como Entero
	Dimension matrizC[dimMatriz,dimMatriz]
	Escribir "Producto de matriz cuadrada y vector"
	
	Para i = 0 Hasta dimMatriz - 1 Hacer //de i = 0 hasta i = n-1 = 3- 1= 2
		k = 0
		Mientras k <= dimVec - 1 Hacer  //o<2
			suma = 0
			Para j = 0 Hasta  dimMatriz - 1 Hacer  //de j = 0 hasta j = 2
				suma = suma + (matriz[i,j] * vector[k]) //suma = 0 + m[0,0] * m[0,0]
			FinPara
			matrizC[i,k] = suma
			k = k + 1
		FinMientras
	FinPara
	
	imprimirMatriz(matrizC, 3,3)
FinSubAlgoritmo

SubAlgoritmo llenarVector(vector Por Referencia,n)
	Definir i Como Entero
	para i = 0 Hasta n-1 Hacer
		vector[i] = azar(9)
	FinPara
FinSubAlgoritmo

SubAlgoritmo imprimirVector(vector Por Referencia,n)
	Definir i Como Entero
	para i = 0 Hasta n-1 Hacer
		Escribir Sin Saltar " " vector[i] " "
	FinPara
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
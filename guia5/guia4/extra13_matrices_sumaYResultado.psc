//13. Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5
//...

Algoritmo extra13_matrices
	Definir matriz, fil Como Entero
	Escribir "ingrese la cantidad de filas"
	Leer fil
	Dimension matriz[fil,3]
	llenarMatriz(matriz, fil)
	Escribir ""
	imprimirMatriz(matriz,fil)
	
FinAlgoritmo

SubAlgoritmo llenarMatriz(matriz Por Referencia, n)
	Definir i, j, num Como Entero
	Escribir "ingrese la matriz"
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta 1 Hacer
			leer num
			matriz[i,j] = num
		FinPara
		matriz[i,2] = matriz[i,1] + matriz[i,0]
	FinPara
FinSubAlgoritmo

SubAlgoritmo imprimirMatriz(matriz Por Referencia, n)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Escribir Sin Saltar " " matriz[i,0] " + " matriz[i,1] " = " matriz[i,2]
		Escribir ""
	FinPara
FinSubAlgoritmo
	
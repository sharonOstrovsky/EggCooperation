//10. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla. 

Algoritmo ej10_matrices
	Definir matriz, n, m como entero
	Escribir "ingrese la dimension de la matriz"
	Escribir Sin Saltar "filas: "
	Leer n
	Escribir Sin Saltar "columnas: " 
	Leer m
	Dimension matriz[n,m]
	llenarMatriz(matriz, n, m)
	imprimirMatriz(matriz, n, m)
	sumaElementosMatriz(matriz, n, m)
	
FinAlgoritmo

SubProceso sumaElementosMatriz(matriz Por Referencia, fil, col)
	Definir suma, i, j Como Entero
	suma = 0
	Para i = 0 Hasta fil - 1 Hacer
		Para j = 0 Hasta col - 1 Hacer
			suma = suma + matriz[i,j]
		FinPara
	FinPara
	Escribir "suma de los elementos: " suma
FinSubProceso

SubProceso imprimirMatriz(matriz Por Referencia, fil, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fil - 1 Hacer
		Para j = 0 Hasta col - 1 Hacer
			Escribir Sin Saltar " " matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso llenarMatriz(matriz Por Referencia, fil, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fil - 1 Hacer
		Para j = 0 Hasta col - 1 Hacer
			matriz[i,j] = Aleatorio(1,9)
		FinPara
	FinPara
FinSubProceso

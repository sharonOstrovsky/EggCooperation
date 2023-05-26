//9. Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo ej9_matrices
	Definir matriz, num Como Entero
	Dimension matriz[5,5]
	llenarMatrizCuadrada(matriz, 5)
	Escribir "ingrese el numero entero a buscar"
	Leer num
//	imprimirMatriz(matriz)
//	Escribir "-------------------"
	busquedaLineal(matriz, 5, num)
FinAlgoritmo

//SubProceso imprimirMatriz(matriz Por Referencia)
//	Definir fil, col Como Entero
//	para fil = 0 Hasta 4 Hacer
//		para col = 0 Hasta 4 Hacer
//			Escribir Sin Saltar matriz[fil,col]
//		FinPara
//		Escribir ""
//	FinPara
//FinSubProceso


SubProceso busquedaLineal(matriz Por Referencia, n, num)
	Definir i, j Como Entero
	Definir encontrado Como Logico
	encontrado = Falso
	Para i = 0 Hasta n - 1 Hacer
		para j = 0 Hasta n - 1 Hacer
			si matriz[i,j] == num Entonces
				Escribir "posicion: " i, j
				encontrado = Verdadero
			FinSi
		FinPara
	FinPara
	si !encontrado Entonces
		Escribir "no se encontro el numero"
	FinSi
FinSubProceso

SubProceso llenarMatrizCuadrada(matriz Por Referencia, n)
	Definir fil, col Como Entero
	para fil = 0 Hasta n - 1 Hacer
		para col = 0 Hasta n - 1 Hacer
			matriz[fil,col] = Aleatorio(1,9)
		FinPara
	FinPara
FinSubProceso
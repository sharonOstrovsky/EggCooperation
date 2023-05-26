//· Crear una matriz 4X4 de números enteros que inicialmente esta vacía, realizar diversos subprogramas que nos permitan:
//	
//o RELLENAR MATRIZ: Forma aleatoria números de 7 a 68.
//	
//o MOSTRAR UNA FILA: Que sea elegida por el usuario.
//	
//o SUMA DE UNA COLUMNA: Que sea elegida por el usuario.
//	
//	o SUMAR DIAGONAL PRINCIPAL Y DIAGONAL INVERSA.


Algoritmo repaso4
	Definir matriz Como Entero
	Dimension matriz[4,4]
	rellenarMatriz(matriz,4,4)
	Escribir "imprimo matriz"
	imprimirMatriz(matriz,4,4)
	Escribir "mostrar fila"
	mostrarFila(matriz,4)
	Escribir "suma columna = " sumaColumna(matriz,4,4)
	Escribir "suma diagonales = " sumaDiagonales(matriz,4,4)
FinAlgoritmo

//00 01 02 03
//10 11 12 13
//20 21 22 23
//30 31 32 33
Funcion suma <- sumaDiagonales(matriz Por Referencia, n, m)
	Definir i, j, principal, inversa, suma Como Entero
	principal = 0
	inversa = 0
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			si i == j Entonces
				principal = principal + matriz[i,j]
			FinSi
		FinPara
		inversa = inversa + matriz[i, n - 1 - i]
	FinPara
//	Escribir "prin " principal
//	Escribir "sec " inversa
	suma = principal + inversa
FinFuncion

Funcion suma <- sumaColumna(matriz Por Referencia, n, m)
	Definir i, j, col, suma Como Entero
	suma = 0
	Escribir "ingrese la columna a sumar"
	Leer col
	Para i = 0 Hasta n - 1 Hacer
		suma = suma + matriz[i,col]
	FinPara
FinFuncion


SubAlgoritmo mostrarFila(matriz Por Referencia, n)
	Definir i, j, fila Como Entero
	Escribir "ingrese la fila que quiera ver"
	Leer fila
	Para i = 0 Hasta n - 1 Hacer
		Escribir Sin Saltar " " matriz[fila, i] " "
	FinPara
	Escribir ""
FinSubAlgoritmo

SubAlgoritmo rellenarMatriz(matriz Por Referencia, n , m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			matriz[i,j] = Aleatorio(7,68)
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo imprimirMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			Escribir Sin Saltar " " matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo
	
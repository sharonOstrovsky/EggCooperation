//11. Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.
//Por ejemplo, nuestro matriz final debería verse así:
//	111111111111111
//	100000000000001
//	100000000000001
//	100000000000001
//	111111111111111

Algoritmo extra11_matrices
	Definir matriz Como Entero
	Dimension matriz[5,15]
	llenarMatrizUnosYCeros(matriz,5,15)
	
FinAlgoritmo

SubAlgoritmo llenarMatrizUnosYCeros(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j  = 0 hasta m - 1 Hacer
			si i == 0 O i == 4 O j == 0 o j == 14 Entonces
				Escribir Sin Saltar "1"
			SiNo
				Escribir Sin Saltar "0"
			FinSi
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo
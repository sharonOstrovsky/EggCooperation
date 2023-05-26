//12. Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz. 

Algoritmo ej12_matrices
	Definir matriz, palabra Como Caracter
	Dimension matriz[3,3]
	Escribir "ingrese una palabra de nueve letras"
	Leer palabra
	llenarMatriz(matriz, 3, palabra)
	imprimirMatriz(matriz, 3)
	
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

SubProceso llenarMatriz(matriz Por Referencia, n, palabra)
	Definir i, fil, col Como Entero
	i=0
	Para fil = 0 Hasta n - 1 Hacer
		Para col = 0 Hasta n - 1 Hacer
			matriz[fil,col] = Subcadena(palabra,i,i)
			i = i + 1
		FinPara
	FinPara
FinSubProceso
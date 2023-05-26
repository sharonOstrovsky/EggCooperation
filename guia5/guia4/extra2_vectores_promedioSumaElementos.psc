//2. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo extra2_vectores
	Definir vec, N Como Entero
	Escribir "ingrese la dimension del vector"
	leer N
	Dimension vec[N]
	llenarVector(vec,N)
	Escribir "el promedio de la suma es: " promedioSumaElementos(vec, N)
	
FinAlgoritmo

Funcion promedio <- promedioSumaElementos(vec Por Referencia, n)
	Definir i, suma Como Entero
	Definir promedio Como Real
	suma = 0
	Para i = 0 Hasta n - 1 Hacer
		suma = suma + vec[i]
	FinPara
	promedio = suma / n
FinFuncion


SubProceso llenarVector(vector Por Referencia, n)
	Definir i, num Como Entero
	Escribir "ingrese los valores del vector"
	Para i = 0 Hasta n - 1 Hacer
		leer num
		vector[i] = num
	FinPara
FinSubProceso
	
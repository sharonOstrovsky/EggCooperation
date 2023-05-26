//7. Programe una función recursiva que calcule la suma de un arreglo de números enteros.

Algoritmo extra7_vectores
	Definir vector, i, n Como Entero
	Escribir "ingrese dimension del vector"
	Leer n
	Dimension vector[n]
	Para i = 0 Hasta n - 1 Hacer
		vector[i] = azar(10)
	FinPara
	Escribir ""
	Para i = 0 Hasta n - 1 Hacer
		Escribir Sin Saltar vector[i] " "
	FinPara
	Escribir ""
	Escribir sumaElementos(vector, n)
FinAlgoritmo

Funcion suma <- sumaElementos(vec Por Referencia, n)
	Definir suma Como Entero
	suma = 0
	si n == 0 Entonces
		suma = vec[0]
	SiNo
		suma = vec[n-1] + sumaElementos(vec, n - 1)
	FinSi
FinFuncion

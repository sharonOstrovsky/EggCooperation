//5. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
//más grande del vector.

Algoritmo ej5_vectores
	Definir vector, N Como Entero
	Escribir "ingrese la dimension del vector"
	Leer N
	Dimension vector[N]
	llenarVector(vector, N)
	Escribir "maximo elemento = " buscarMaxElemento(vector, N)
FinAlgoritmo


SubProceso llenarVector(vector Por Referencia, N)
	Definir i, num Como Entero
	para i = 0 Hasta N - 1 Hacer
		Escribir "ingrese el numero"
		Leer num
		vector[i] = num
	FinPara
FinSubProceso

Funcion max <- buscarMaxElemento(vector Por Referencia, N)
	Definir max, aux, i Como Entero
	max = vector[0]
	Para i = 0 Hasta N - 1 Hacer
		aux = vector[i]
		si aux >= max Entonces
			max = aux
		FinSi
	FinPara
FinFuncion
	
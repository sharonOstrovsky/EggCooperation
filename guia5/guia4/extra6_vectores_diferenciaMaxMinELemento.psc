//6. Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.

Algoritmo extra6_vectores
	
	Definir vec Como Entero
	Dimension vec[3]
	vec[0] = 39
	vec[1] = 10
	vec[2] = 23
	Escribir "diferencia = " difMaxMinElemento(vec, 3)
FinAlgoritmo

Funcion diferencia <- difMaxMinElemento(vec Por Referencia, n)
	Definir diferencia, max , min, i Como Entero
	max = vec[0]
	min = vec[0]
	para i = 0 Hasta n - 1 Hacer
		si vec[i] >= max Entonces
			max = vec[i]
		FinSi
		si vec[i] <= min Entonces
			min = vec[i]
		FinSi
	FinPara
	
	diferencia = max - min
	
FinFuncion

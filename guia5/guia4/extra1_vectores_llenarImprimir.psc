//1. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.

Algoritmo extra1_vectores
	Definir vec1, vec2, i Como Entero
	Dimension vec1[5]
	Dimension vec2[5]
	para i = 0 Hasta 4 Hacer
		vec1[i] = azar(10)
		vec2[i] = azar(10)
	FinPara
	Escribir "vector 1: "
	para i = 0 Hasta 4 Hacer
		Escribir Sin Saltar "" vec1[i] ""
	FinPara
	Escribir ""
	Escribir "vector 2: "
	para i = 0 Hasta 4 Hacer
		Escribir Sin Saltar "" vec2[i] ""
	FinPara
	Escribir ""
FinAlgoritmo

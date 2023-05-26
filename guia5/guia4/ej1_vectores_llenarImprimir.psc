//1. Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.

Algoritmo ej1_vectores
	Definir vector Como Entero
	Dimension vector[5]
	llenarVector(vector)
	imprimirVector(vector)
	
FinAlgoritmo


SubProceso llenarVector(vector Por Referencia)
	Definir i, num Como Entero
	para i = 0 Hasta 4 Hacer
		Escribir "ingrese el numero"
		Leer num
		vector[i] = num
	FinPara
FinSubProceso

SubProceso imprimirVector(vector Por Referencia)
	Definir i Como Entero
	Escribir Sin Saltar "Vector = [ "
	para i = 0 Hasta 4 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
	Escribir " ]"
	
FinSubProceso
	
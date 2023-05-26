//8. Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//		igual a (V[1]*V[2]*V[3]*V[4])

Algoritmo extra8_vectores
	
	Definir vector, i, n Como Entero
	Escribir "ingrese dimension del vector"
	Leer n
	Dimension vector[n]
	//creo el vector
	Para i = 0 Hasta n - 1 Hacer
		vector[i] = azar(10)
	FinPara
	Escribir ""
	//imprimo el vector
	Para i = 0 Hasta n - 1 Hacer
		Escribir Sin Saltar vector[i] " "
	FinPara
	Escribir ""
	
	Escribir "producto = " productoElementosVector(vector, n)
FinAlgoritmo


Funcion producto <- productoElementosVector(vec Por Referencia, n)
	Definir producto, i Como entero
	producto = 1
	Para i = 0 Hasta n - 1 Hacer
		producto = producto * vec[i]
	FinPara
	
FinFuncion

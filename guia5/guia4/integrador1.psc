//Realice un algoritmo que permita cargar un arreglo/vector con n�meros aleatorios entre 1 y un n�mero ingresado por el usuario.
//	Los n�meros aleatorios deben ser todos distintos.
//	Su algoritmo termina cuando el arreglo/vector est� lleno y debe mostrar el contenido del mismo.
//	Se deben cumplir los siguientes requisitos:
//  1. El usuario ingresa un n�mero, este sirve tanto para definir el tama�o del arreglo/vector 
//como para saber el l�mite de los n�meros aleatorios.
//	2. Debe realizar una funci�n/procedimiento, lo que considere m�s adecuado para verificar si el n�mero aleatorio ya fue cargado,
//es decir se encuentra en el arreglo/vector, en ese caso no debe ingresarse.
//	3. Debe realizar una funci�n/procedimiento, lo que considere m�s adecuado para mostrar el contenido del arreglo/vector 
//una vez cargado.


Algoritmo integrador1
	Definir vec, num, i, numAl Como Entero
	Escribir "ingrese un numero"
	Leer num
	Dimension vec[num]
	inicializarVector(vec,num)
	Para i = 0 Hasta num - 1 Hacer
		Hacer
			numAl = Aleatorio(1,num)
		Mientras Que estaNumCargado(vec,num,numAl)
		vec[i] = numAl
	FinPara
	imprimirVector(vec, num)
FinAlgoritmo

Funcion rta <- estaNumCargado(vector Por Referencia, n, numAl)
	Definir i Como Entero
	Definir rta Como Logico
	rta = Falso
	Para i = 0 Hasta n - 1 Hacer
		si vector[i] == numAl Entonces
			rta = Verdadero
		FinSi
	FinPara
FinFuncion

SubAlgoritmo imprimirVector(vector Por Referencia, n)
	Definir i Como Entero
	Escribir Sin Saltar "["
	Para i = 0 Hasta n - 1 Hacer
		Escribir Sin Saltar " " vector[i] " " 
	FinPara
	Escribir "]"
FinSubAlgoritmo

SubAlgoritmo inicializarVector(vec Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n - 1 Hacer
		vec[i] = 0
	FinPara
FinSubAlgoritmo
	
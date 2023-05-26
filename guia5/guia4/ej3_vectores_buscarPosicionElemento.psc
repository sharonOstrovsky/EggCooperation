//3. Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo ej3_vectores
	Definir rta Como Logico
	Definir vector, num Como Entero
	dimension vector[5]
	llenarVector(vector, 5)
	Escribir "ingrese el numero a buscar"
	Leer num
	si !estaNumEnVector(vector,5, num) Entonces
		Escribir "no se encuentra en el vector"
	FinSi
FinAlgoritmo

SubProceso llenarVector(vector Por Referencia, N)
	Definir i, num Como entero
	para i = 0 Hasta N-1 Hacer
		Escribir "ingrese el numero"
		Leer num
		vector[i] = num
	FinPara
FinSubProceso

Funcion rta <- estaNumEnVector(vector Por Referencia, N, num)
	Definir rta Como Logico
	Definir i Como Entero
	rta = Falso
	Para i = 0 Hasta N - 1 Hacer
		si vector[i] == num Entonces
			Escribir "posicion " i 
			rta = Verdadero
		FinSi
 	FinPara
FinFuncion
	
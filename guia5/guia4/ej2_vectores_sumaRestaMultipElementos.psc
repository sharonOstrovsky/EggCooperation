//2. Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.

Algoritmo ej2_vectores
	Definir vector Como Real
	Dimension vector[10]
	llenarVector(vector, 10)
	sumaElementosVector(vector, 10)
	restaElementosVector(vector, 10)
	multiplicacionElementosVector(vector, 10)
FinAlgoritmo

SubProceso llenarVector(vector Por Referencia, n)
	Definir i, num Como real
	para i = 0 Hasta n-1 Hacer
		Escribir "ingrese el numero"
		Leer num
		vector[i] = num
	FinPara
FinSubProceso

SubProceso sumaElementosVector(vector Por Referencia, n)
	Definir i Como Entero
	Definir suma Como Real
	suma = 0
	para i = 0 Hasta n-1 Hacer
		suma = suma + vector[i]
	FinPara
	Escribir "suma = " suma
FinSubProceso

SubProceso restaElementosVector(vector Por Referencia, n)
	Definir i Como Entero
	Definir resta Como Real
	resta = 0
	para i = 0 Hasta n-1 Hacer
		resta = resta - vector[i]
	FinPara
	Escribir "resta = " resta
FinSubProceso

SubProceso multiplicacionElementosVector(vector Por Referencia, n)
	Definir i Como Entero
	Definir multiplicacion Como Real
	multiplicacion = 1
	para i = 0 Hasta n-1 Hacer
		multiplicacion = multiplicacion * vector[i]
	FinPara
	Escribir "multiplicacion = " multiplicacion
FinSubProceso
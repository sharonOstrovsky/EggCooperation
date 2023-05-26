//7. Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//			función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo.
//				Nota: recordar el uso de las variables de tipo lógico.

Algoritmo ej7_vectores
	Definir vec1, vec2, n Como Entero
	n = 5
	Dimension vec1[n]
	Dimension vec2[n]
	llenarVector(vec1,n)
	llenarVector(vec2,n)
//	Escribir vec1[0]
//	Escribir vec2[0]
	si sonVectoresIguales(vec1, vec2, n) Entonces
		Escribir "son vectores iguales"
	SiNo
		Escribir "no son vectores iguales"
	FinSi
FinAlgoritmo

SubProceso llenarVector(vector Por Referencia, n)
	Definir i Como entero
	para i = 0 Hasta n-1 Hacer
		vector[i] = Aleatorio(-100,100)
	FinPara
FinSubProceso

Funcion rta <- sonVectoresIguales(vec1 Por Referencia, vec2 Por Referencia, n)
	Definir rta Como Logico
	Definir i Como Entero
	rta = verdadero
	para i = 0 Hasta n - 1 Hacer
		si vec1[i] <> vec2[i] Entonces
			rta = Falso
		FinSi
	FinPara
FinFuncion
	
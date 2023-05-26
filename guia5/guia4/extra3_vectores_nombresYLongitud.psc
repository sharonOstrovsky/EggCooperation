//3. Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo extra3_vectores
	Definir N, vec2 Como Entero
	Definir vec1 Como Caracter
	Escribir "ingrese la dimension de los vectores"
	leer N
	Dimension vec1[N]
	Dimension vec2[N]
	llenarVectorNombres(vec1, N)
	llenarVectorLongitudNombres(vec1, vec2, N)
	imprimirVectores(vec1, vec2, N)
FinAlgoritmo

SubProceso imprimirVectores(vec1 Por Referencia, vec2 Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Escribir sin saltar vec1[i] " "
		Escribir vec2[i]
	FinPara
FinSubProceso

SubProceso llenarVectorLongitudNombres(vec1 Por Referencia, vec2 Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n - 1 Hacer
		vec2[i] = Longitud(vec1[i])
	FinPara
FinSubProceso

SubProceso llenarVectorNombres(vec Por Referencia, n)
	Definir i Como Entero
	Definir nombre Como Caracter
	Escribir "ingrese los nombres "
	Para i = 0 Hasta n - 1 Hacer
		Leer nombre
		vec[i] = nombre
	FinPara
FinSubProceso
	
//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso. 

Algoritmo ej_1_extra
	Definir hombres, mujeres, porcentajeMujeres, porcentajeHombres Como Real
	Escribir "ingrese la cantidad total de ni�os"
	Leer hombres
	Escribir "ingrese la cantidad total de ni�as"
	Leer mujeres
	porcentajeMujeres <- mujeres * 100 / (hombres + mujeres) 
	porcentajeHombres <- hombres * 100 / (hombres + mujeres)
	Escribir  "porcentaje ni�os: " porcentajeHombres, " porcentaje ni�as: " porcentajeMujeres
FinAlgoritmo

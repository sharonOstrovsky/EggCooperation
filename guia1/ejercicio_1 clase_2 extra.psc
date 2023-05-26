//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de niños, y la cantidad total de niñas que hay en el curso. 

Algoritmo ej_1_extra
	Definir hombres, mujeres, porcentajeMujeres, porcentajeHombres Como Real
	Escribir "ingrese la cantidad total de niños"
	Leer hombres
	Escribir "ingrese la cantidad total de niñas"
	Leer mujeres
	porcentajeMujeres <- mujeres * 100 / (hombres + mujeres) 
	porcentajeHombres <- hombres * 100 / (hombres + mujeres)
	Escribir  "porcentaje niños: " porcentajeHombres, " porcentaje niñas: " porcentajeMujeres
FinAlgoritmo

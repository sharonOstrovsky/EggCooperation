//4. Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo extra4_vectores
	Definir vector Como Entero
	Dimension vector[100]
	llenarVector(vector, 100)
	categoriaEstudiates(vector, 100)
FinAlgoritmo

SubAlgoritmo categoriaEstudiates(vec Por Referencia, n)
	Definir i, deficientes, regulares, buenos, excelentes Como Entero
	deficientes = 0 //0-5
	regulares = 0 //6-10
	buenos = 0 //11-15
	excelentes = 0 //16-20
	Para i = 0 Hasta n - 1 Hacer
		si vec[i] >= 0 Y vec[i] <= 5 Entonces
			deficientes = deficientes + 1
		SiNo
			si vec[i] >= 6 Y vec[i] <= 10 Entonces
				regulares = regulares + 1
			SiNo
				si vec[i] >= 11 Y vec[i] <= 15 Entonces
					buenos = buenos + 1
				SiNo
					si vec[i] >= 16 Y vec[i] <= 20 Entonces
						excelentes = excelentes + 1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "Deficientes: " deficientes
	Escribir "Regulares: " regulares
	Escribir "Buenos: " buenos
	Escribir "Excelentes: " excelentes
	
FinSubAlgoritmo

SubAlgoritmo llenarVector(vec Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n - 1 Hacer
		vec[i] = Aleatorio(0,20)
	FinPara
FinSubAlgoritmo

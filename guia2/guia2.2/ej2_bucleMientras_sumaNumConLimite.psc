//2. Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n solicite
//n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial.

Algoritmo ej2_bucleMientras
	
	Definir limite, num, suma Como Entero
	Escribir "ingrese un valor limite positivo"
	Leer limite
	Escribir "ingrese un numero"
	Leer num
	
	suma = num
	Mientras suma <= limite Hacer
		Escribir "ingrese un numero"
		Leer num
		suma = suma + num
	FinMientras
	
FinAlgoritmo

//2. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

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

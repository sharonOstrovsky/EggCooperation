//3. Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,...,-1; realizar un programa que calcule el promedio de los
//	números ingresados. Suponemos que el usuario no insertará número negativos.


Algoritmo ej3_bucleMientras
	
	Definir num, i, suma Como Entero
	Definir promedio Como Real
	Escribir "ingrese un numero"
	Leer num
	i = 1
	suma = 0
	Mientras num <> -1 Hacer
		suma = num + suma
		promedio = suma / i
		//Escribir "suma " suma
		//Escribir "promedio " promedio
		Escribir "ingrese un numero"
		Leer num
		i = i +1
	FinMientras
	
	Escribir "el promedio es: " promedio
	
FinAlgoritmo

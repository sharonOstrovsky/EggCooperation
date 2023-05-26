//1. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota
//se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo ej1_bucleMientras
	
	Definir nota Como Entero
	Escribir "ingrese una nota"
	Leer nota
	
	Mientras nota > 10 O nota < 0 Hacer
		Escribir "ERROR: nota no valida"
		Escribir "ingrese una nota"
		Leer nota
	FinMientras
	
	Escribir "nota correcta"
	
FinAlgoritmo

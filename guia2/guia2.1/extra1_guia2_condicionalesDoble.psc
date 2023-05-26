//1. Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un
//	curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
//		igual a 70; y reprueba en caso contrario.

Algoritmo extra1_guia2_condicionalesDoble
	Definir nota1, nota2, nota3 Como Real
	Escribir "ingrese la primer nota"
	Leer nota1
	Escribir "ingrese la segunda nota"
	Leer nota2
	Escribir "ingrese la tercer nota"
	Leer nota3
	
	si (((nota1 + nota2 + nota3) / 3) >= 70) Entonces
		Escribir "APROBADO"
	SiNo
		Escribir "DESAPROBADO"
	FinSi
FinAlgoritmo

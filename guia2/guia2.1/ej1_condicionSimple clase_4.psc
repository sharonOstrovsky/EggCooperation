//1. Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
//	usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
//		mostrar un mensaje por pantalla indicándolo.

Proceso ej1_condicionSimple
	Definir  sueldoActual, sueldoMinimo Como Real
	Escribir "ingrese su sueldo actual"
	Leer sueldoActual
	Escribir "ingrese el sueldo minimo"
	Leer sueldoMinimo
	si sueldoActual > sueldoMinimo Entonces
		Escribir "Su sueldo es mayor al sueldo minimo"
	FinSi
	
FinProceso

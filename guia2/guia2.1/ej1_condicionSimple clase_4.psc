//1. Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir� al
//	usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
//		mostrar un mensaje por pantalla indic�ndolo.

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

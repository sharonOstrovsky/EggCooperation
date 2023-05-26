//4)Hacer un programa que ingrese por teclado un número total de segundos 
//y que luego pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor ingresado.

Proceso extra4_guia1
	Definir horas, minutos, segs, segunds Como Real
	Leer segs
	
	horas <-trunc(segs / 3600)
	minutos <-trunc((segs MOD 3600) / 60)
	segunds <- (trunc(segs MOD 3600)) MOD 60
	
	Escribir "HORAS: " horas, " MINUTOS: " minutos," SEGUNDOS: " segunds
	
FinProceso

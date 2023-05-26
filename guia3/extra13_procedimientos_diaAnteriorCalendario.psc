//13. Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
//		representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
//		asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
//			los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo extra13_procedimientos
	
	Definir dia, mes, anio Como Entero
	Escribir "ingrese una fecha"
	Leer dia
	Leer mes
	Leer anio
	
	diaAnterior(dia, mes, anio)
	
FinAlgoritmo

SubProceso diaAnterior(dia, mes, anio)
	//1,3,5,7,8,10,12: = 31
	//	4,6,9,11: = 30
	Segun mes Hacer
		1,2,4,6,8,9,11:
			si dia == 1 Y mes = 1 Entonces
				Escribir "dia anterior: 31/12/" anio - 1 
			SiNo
				si dia == 1 Y mes <> 1 Entonces
					Escribir "dia anterior: 31/" mes - 1 "/" anio
				SiNo
					Escribir "dia anterior: " dia - 1 "/" mes "/" anio
				FinSi
			FinSi
		5,7,10,12:
			si dia == 1 Entonces
				Escribir "dia anterior: 30/" mes - 1 "/" anio
			SiNo
				Escribir "dia anterior: " dia - 1 "/" mes "/" anio
			FinSi
		3: //febrero es bisciesto
			si dia == 1 Y ((anio MOD 4 == 0) Y (anio MOD 100 <> 0) O ((anio MOD 100 == 0) Y (anio MOD 400 == 0))) Entonces
				Escribir "dia anterior: 29/02/" anio 
			SiNo
				si dia == 1 Entonces
					Escribir "dia anterior: 28/02/" anio 
				SiNo
					Escribir "dia anterior: " dia - 1 "/" mes "/" anio
				FinSi
				
				 
			FinSi
	
	FinSegun
	
FinSubProceso
	
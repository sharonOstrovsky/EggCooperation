//8. Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 -13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.


Algoritmo ej8_procedimiento
	
	Definir dividendo, divisor Como Entero
	Escribir "ingrese el dividendo"
	Leer dividendo
	Escribir "ingrese el divisor"
	Leer divisor
	
	divisionRestasSucesivas(dividendo, divisor)
	
	
FinAlgoritmo

SubProceso divisionRestasSucesivas(dividendo Por Referencia, divisor Por Referencia)
	Definir cociente, resto, contador Como Entero
	contador = 0
//	resto = 0
	Mientras dividendo > divisor Hacer
		dividendo = dividendo - divisor
		contador = contador + 1
	FinMientras
	resto = dividendo
	cociente = contador
	Escribir "el resto es " resto 
	Escribir "el cociente es " cociente
FinSubProceso

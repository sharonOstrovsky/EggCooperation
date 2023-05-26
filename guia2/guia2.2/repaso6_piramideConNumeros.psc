//6) Desarrolle un programa que permita leer un número entero mayor a 3 que representa la cantidad de filas y 
//el programa imprima un triángulo con números de acuerdo al número de filas que se ingresa como dato. 
//El triángulo se forma con números, dejando espacios en blanco al inicio de cada fila tal y como se muestra en los ejemplos:
//(*) El programa:	
//	1. Debe validar el ingreso del número de filas. Dato mayor o igual a 3.
//	2.El triángulo tiene tantas filas como indica el dato de entrada, 
//     y la cantidad de números que se imprime en cada fila aumenta de dos en dos,
//en la primera fila hay un solo número, en la segunda fila hay 3 números, en la tercera fila hay 5 números y asi suscesivamente.
//	3. Los números que se imprimen en cada fila empieza en 1 y van hasta el 9, 
//      luego se imprime del cero, uno, dos y hasta el número que corresponda.
//EJEMPLOS 1 :
//	
//Filas : 1
//Filas : 0
//Filas : -2
//Filas : 7
//	
//	      1
//	     123
//	    12345
//	   1234567
//	  123456789
//	 12345678901
//	1234567890123

Algoritmo repaso6_piramideConNumeros
	
	Definir filas, i, j,k, num, contador Como Entero
	num = 1
	Hacer
		Escribir "ingrese la cantidad de filas"
		Leer filas
	Mientras Que filas < 3
	
	Para i = filas Hasta 1 Hacer
		Para j = 1 Hasta i Hacer
			Escribir Sin Saltar " "
		FinPara
		contador = 1
		Para k = 1 Hasta num Hacer
			Escribir Sin Saltar contador
			si contador == 9 Entonces
				contador = 0
			SiNo
				contador = contador + 1
			FinSi
		FinPara
		num = num + 2
		Escribir ""
	FinPara

	
FinAlgoritmo

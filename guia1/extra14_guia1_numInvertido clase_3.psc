//14)Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener el n�mero invertido. 
//Ejemplo, si se introduce 23 que muestre 32.

Proceso extra14_guia1_numInvertido
	Definir num, invertido Como Real
	Escribir "ingrese un numero de dos cifras"
	Leer  num
	invertido <- ((num MOD 10) * 10) + (trunc(num / 10))
	Escribir "el numero ingresado invertido es: " invertido
	
FinProceso

//Ingrese un número de tres cifras y muestra la unidad, decena y la centena.
//Por ejemplo, si el número ingresado por pantalla es 123 el programa debe mostrar:
//	CENTENA: 1
//	DECENA: 2
//	UNIDAD: 3

Algoritmo ejercicio_cooperativo
	Definir num Como Entero
	Escribir "ingrese un numero de tres cifras"
	Leer  num
	
	Escribir "CENTENA: " (num - (num MOD 100)) / 100
	Escribir "DECENA: " ((num - (num MOD 10)) / 10) MOD 10
	Escribir "UNIDAD: " num MOD 10
	
	
	
	//Escribir trunc(num / 10)    //12    = (num - (num MOD 10)) / 10
	//Escribir "DECENA: " (trunc(num / 10)) MOD 10
	//Escribir num MOD 10 // 3
	//Escribir (num MOD 100) //23
FinAlgoritmo

//2. Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A continuaci�n,
//se debe pedir al usuario que ingrese n�meros enteros situados entre el m�ximo y m�nimo.
//Cada vez que un n�mero se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminar� cuando se escriba un n�mero que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de n�meros ingresados dentro del
//intervalo.

Algoritmo extra2_bucleMientras
	
	Definir minimo, maximo, num, cant Como Entero
	
	Escribir "ingrese el minimo del intervalo"
	Leer minimo
	Escribir "ingrese el maximo del intervalo"
	Leer maximo
	
	Escribir "ingrese un numero entre " minimo " y " maximo
	Leer num
	cant = 0
	
	Mientras num < maximo Y num > minimo Hacer
		Escribir "ingrese un numero entre " minimo " y " maximo
		Leer num	
		cant = cant + 1
	FinMientras
	
	Escribir "la cantidad de numeros ingresados dentro del intervalo fue: " cant
	
FinAlgoritmo

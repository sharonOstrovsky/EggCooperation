//5. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo ej5_funciones
	
	Definir num Como Entero
	Escribir "ingrese un numero"
	Leer num
	
	si esPrimo(num) == Verdadero Entonces
		Escribir num " es PRIMO"
	SiNo
		Escribir num " NO es PRIMO"
	FinSi
	
FinAlgoritmo

Funcion resultado <- esPrimo (num Por Referencia)
	Definir resultado Como Logico
	Definir contador, j Como Entero
	
	contador = 0
	j = 1
	Mientras j <= num Hacer
		si num MOD j == 0 Entonces
			contador = contador + 1
		FinSi
		j = j + 1
	FinMientras
	
	si contador == 2 Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
	
FinFuncion

//9. Construir un programa que simule un men� de opciones para realizar las cuatro
//	operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//	num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: 'S' o 's'para la suma, 'R' o 'r' para la resta, 'M'
//	o 'm' para la multiplicaci�n y 'D' o 'd' para la divisi�n.

Algoritmo ej9_condicionMultiple
	Definir operacion Como Caracter
	Definir num1, num2 Como Entero
	Escribir "ingrese un numero"
	Leer num1
	Escribir "ingrese la primer letra de la operacin a realizar"
	Leer operacion
	Escribir "ingrese un numero"
	Leer num2
	
	Segun operacion Hacer
		's','S':
			Escribir num1 "+" num2 "=" num1 + num2
		'r', 'R':
			Escribir num1 "-" num2 "=" num1 - num2
		'm', 'M':
			Escribir num1 "x" num2 "=" num1 * num2
		'd', 'D':
			Escribir num1 "%" num2 "=" num1 / num2
		De Otro Modo:
			Escribir "la operacion no es correcta"
	FinSegun
	
FinAlgoritmo

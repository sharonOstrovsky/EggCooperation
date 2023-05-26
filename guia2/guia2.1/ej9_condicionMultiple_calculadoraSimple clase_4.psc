//9. Construir un programa que simule un menú de opciones para realizar las cuatro
//	operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//	numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: 'S' o 's'para la suma, 'R' o 'r' para la resta, 'M'
//	o 'm' para la multiplicación y 'D' o 'd' para la división.

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

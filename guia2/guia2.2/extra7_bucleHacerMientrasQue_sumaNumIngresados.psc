//7. Se debe realizar un programa que:
//	1�) Pida por teclado un n�mero (entero positivo).
//	2�) Pregunte al usuario si desea introducir o no otro n�mero.
//	3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
//	4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario

Algoritmo extra7_bucleHacerMientrasQue
	
	Definir num, suma Como Entero
	Definir rta Como Caracter

	suma = 0
	
	Hacer
		Escribir "ingrese un numero entero positivo"
		Leer num	
		suma = suma + num
		Escribir "�Desea ingresar otro numero?"
		Leer rta
	Mientras Que rta <> 'n' Y rta <> 'N'
	
	Escribir "la suma de los numeros introducidos por el usuario es: " suma
	
FinAlgoritmo

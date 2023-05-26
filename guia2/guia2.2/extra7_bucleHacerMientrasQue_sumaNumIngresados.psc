//7. Se debe realizar un programa que:
//	1º) Pida por teclado un número (entero positivo).
//	2º) Pregunte al usuario si desea introducir o no otro número.
//	3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
//	4º) Muestre por pantalla la suma de los números introducidos por el usuario

Algoritmo extra7_bucleHacerMientrasQue
	
	Definir num, suma Como Entero
	Definir rta Como Caracter

	suma = 0
	
	Hacer
		Escribir "ingrese un numero entero positivo"
		Leer num	
		suma = suma + num
		Escribir "¿Desea ingresar otro numero?"
		Leer rta
	Mientras Que rta <> 'n' Y rta <> 'N'
	
	Escribir "la suma de los numeros introducidos por el usuario es: " suma
	
FinAlgoritmo

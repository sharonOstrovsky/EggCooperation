//5. Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//		investigar la función trunc().
//

Algoritmo extra5_bucleMientras
	
	Definir num, digitos Como Real
	Escribir "ingrese un numero entero positivo"
	Leer num
	
	digitos = 0
//	aux = num
	Mientras num >= 1 Hacer
		num = num / 10
		digitos = digitos + 1
	FinMientras
	
	Escribir "cantidad de digitos: " digitos
	
FinAlgoritmo

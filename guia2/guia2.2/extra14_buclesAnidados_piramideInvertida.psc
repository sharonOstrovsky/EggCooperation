//14. Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deber� mostrar:
//	*****
//	****
//	***
//	**
//  *


Algoritmo extra14_buclesAnidados
	
	Definir altura, i, j Como Entero
	Escribir "ingrese un numero entero"
	Leer altura
	
	Para i = altura Hasta 1 Hacer
		Para j = 1 Hasta i Hacer
			Escribir Sin Saltar "*"
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo

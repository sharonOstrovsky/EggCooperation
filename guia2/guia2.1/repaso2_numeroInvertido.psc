//2)Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido. 
//Ejemplo, si se introduce 23 que muestre 32.

Algoritmo repaso2_numeroInvertido
	
	Definir num, invertido Como Entero
	Escribir "ingrese un numero de dos cifras"
	Leer num
	
	si (num / 10 > 1) Y (num / 100 < 1) Entonces
		invertido = ((num MOD 10) * 10) + ((num / 10) - (num MOD 10 / 10))
		Escribir invertido
	SiNo
		Escribir "el numero ingresado no es de dos cifras"
	FinSi
	
FinAlgoritmo
	

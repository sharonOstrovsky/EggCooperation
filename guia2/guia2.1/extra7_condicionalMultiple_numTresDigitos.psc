//7. Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo extra7_condicionalMultiple
	
	Definir num Como Entero
	Escribir "ingrese un numero"
	Leer num
	
	si ((num / 100) > 1) Y ((num / 1000) < 1) Entonces
		Escribir "el numero " num " tiene tres digitos"
	SiNo
		Escribir "el numero " num " no tiene tres digitos"
	FinSi
	
FinAlgoritmo

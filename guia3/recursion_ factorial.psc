Algoritmo factorial
	Escribir Factorial1(4)
FinAlgoritmo

Funcion f <- Factorial1(n)
	Definir  f Como Entero
	si n = 0 O n = 1 Entonces
		f = 1
	SiNo
		f = n * Factorial1(n-1)
	FinSi
FinFuncion
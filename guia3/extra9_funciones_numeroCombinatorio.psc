//9. El número de combinaciones de m elementos tomados de n es:
//	(
//	!
//	" ) = ( !!
//	"!(!%")!
//	)
//	
//	Diseñar una función que permita calcular el número combinatorio de (
//	?
//	?)
//	
//Nota: n debe ser mayor a 0 y menor que m.

Algoritmo extra9_funciones_numeroCombinatorio
	
	Definir m,n Como Entero
	m = 5
	n= 3
	
	si n > 0 Y n < m Entonces
		Escribir numeroCombinatorio(m,n)
	FinSi
	
	
FinAlgoritmo

Funcion numCombinatorio <- numeroCombinatorio(m, n)
	Definir numCombinatorio Como Real
	numCombinatorio = (Factorial(m)) / (Factorial(n) * Factorial((m - n)))
	
FinFuncion


Funcion f <- Factorial(n)
	Definir  f Como Entero
	si n = 0 O n = 1 Entonces
		f = 1
	SiNo
		f = n * Factorial(n-1)
	FinSi
FinFuncion
	
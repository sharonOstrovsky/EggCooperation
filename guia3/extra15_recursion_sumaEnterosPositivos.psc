//15. Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2.
//Chequear que si N es impar se muestre un mensaje de error.

Algoritmo extra15_recursion
	Definir n Como Entero
	n = 10
	Escribir sumaEnterosPositivos(n)
FinAlgoritmo

Funcion suma <- sumaEnterosPositivos(n)
	
	Definir suma Como Entero
	
	si n MOD 2 <> 0 Entonces
		Escribir "ERROR"
	SiNo
		si n = 2 Entonces
			suma = 2
		SiNo
			suma = n + sumaEnterosPositivos(n - 2)
		FinSi
	FinSi
	
	
	
	
FinSubProceso
	
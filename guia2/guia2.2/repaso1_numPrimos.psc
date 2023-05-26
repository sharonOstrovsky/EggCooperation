//1)Escribir un Pseudocódigo que encuentre y despliegue los números primos entre uno y cien.

Algoritmo repaso1_numPrimos
	
	Definir i , j, contador Como Entero
	
	para i = 1 Hasta 100 Hacer
		contador = 0
		j = 1
		Mientras j <= i Hacer
			si i MOD j == 0 Entonces
				contador = contador + 1
			FinSi
			j = j + 1
		FinMientras
		
		si contador == 2 Entonces
			Escribir i
		FinSi
	FinPara
	
FinAlgoritmo

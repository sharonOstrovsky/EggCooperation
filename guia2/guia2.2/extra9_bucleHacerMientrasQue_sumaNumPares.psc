//9. Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
//	de los siguientes valores: 2+4+6+8+10.

Algoritmo extra9_bucleHacerMientrasQue
	
	Definir n,contador, suma, i Como Entero
	Escribir "ingrese un numero"
	Leer n
	
	suma = 0
	contador = 1
	 i = 1
	Hacer
		i = i + 1
			si i MOD 2 == 0 Entonces
				suma = suma + i
				Escribir "i: " i
				Escribir "suma: " suma
				contador = contador + 1
			FinSi
	Mientras Que contador <= n
	
	Escribir "la suma es: " suma
	
FinAlgoritmo

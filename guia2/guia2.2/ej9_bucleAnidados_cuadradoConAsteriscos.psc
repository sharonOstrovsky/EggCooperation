//9. Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un
//cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
//		* * * *
//		*     *
//		*     *
//		* * * *
//	Nota: Recordar el uso del escribir sin saltar en PseInt.

Algoritmo ej9_bucleAnidados
	
	Definir lado, i, j Como Entero
	Escribir "ingrese un numero entero"
	Leer lado
	
	Para i = 1 Hasta lado Hacer
		para j = 1 Hasta lado Hacer
			si i > 1 Y i < lado Y j > 1 Y j < lado Entonces
				Escribir Sin Saltar "   "
			SiNo
				Escribir Sin Saltar " * "
			FinSi
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo

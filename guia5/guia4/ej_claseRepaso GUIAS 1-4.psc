//Escribir un programa que calcule los primeros 4 centros numericos.
//el primer centro numerico es el 6, el cual separa la lista(1 a 8) en los grupos:
//(1,2,3,4,5) y (7,8) cuyas sumas son ambas iguales a 15.
//el segundo centro numerico es el 35, el cual separa la lista (1 a 49) en los grupos
//(1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595
//un centro numerico es un numero que separa una lista de numeros enteros
//(comenzando en 1) en dos grupos de numeros, cuyas sumas son iguales

Algoritmo ej_claseRepaso
	Definir centro, sumaAnterior, sumaPosterior, i, j, num Como Entero
	centro = 0
	num = 1
	sumaAnterior = 0
	sumaPosterior = 0
	Mientras centro < 4
		Para i = 1 Hasta num - 1 Hacer
			sumaAnterior = sumaAnterior + i 
		FinPara
		si num + 1 <= sumaAnterior Entonces
			j = num + 1
			Hacer
				sumaPosterior = sumaPosterior + j
				si sumaAnterior == sumaPosterior Entonces
					Escribir "El centro numerico " num " separa la lista (1 y " num - 1 ") y (" num + 1 " y " j  ")"
					centro = centro + 1
				FinSi
				j = j + 1
			Mientras Que sumaPosterior <= sumaAnterior
		FinSi
		sumaAnterior = 0
		sumaPosterior = 0
		num = num + 1
		
	FinMientras
FinAlgoritmo




//OTRA OPCION
//Algoritmo sin_titulo
//	Definir i, j, sumaAnterior, sumaPosterior Como Entero
//	sumaAnterior = 0
//	sumaPosterior = 0
//	para i = 1 hasta 2000 Hacer
//		sumaAnterior = sumaAnterior + (i - 1)
//		Para j = i + 1 Hasta 2 * i Hacer
//			sumaPosterior = sumaPosterior + j
//			si sumaPosterior == sumaAnterior Entonces
//				Escribir "centro numerico en: " i
//			FinSi
//		FinPara
//		sumaPosterior = 0
//	FinPara
//FinAlgoritmo

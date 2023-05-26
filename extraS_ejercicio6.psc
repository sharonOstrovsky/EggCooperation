Algoritmo extraS_ejercicio6
	Definir filas, i, j, k, resto Como Entero
	Escribir "Ingrese la cantidad de filas de la pirámide"
	Leer filas
	Para i <- 1 Hasta filas
		Para j <- 1 hasta filas - i + 1
			Si j <= filas - i  Entonces
				Escribir Sin Saltar " "
			SiNo
				Para k <- 1 Hasta i * 2 - 1
					Si k mod 10 = 0 Entonces
						Escribir Sin Saltar "0"
					SiNo
						Escribir Sin Saltar k mod 10
					FinSi
				FinPara 
			FinSi
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo

//16. Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
//		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
//		estadísticas sobre el comportamiento de sus representantes en cada zona. Se desea hacer un
//	programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//		c) el total de ventas de todos los representantes.
//

//       norte   sur   este oeste centro total
//r1                                     totR1
//r2
//r3
//r4
//tot   totnort

Algoritmo extra16_matrices_Nescafe
	Definir matriz Como Entero
	Dimension matriz[6,7]
	inicializarMatriz(matriz,6,7)
	ingresoDatos(matriz,6,7)
	totalVentasZona(matriz,6,7)
	totalVentasVendedor(matriz,6,7)
//	imprimirMatriz(matriz,6,7)
	imprimirMatriz(matriz,6,7)
FinAlgoritmo

SubAlgoritmo totalVentasVendedor(matriz Por Referencia, n ,m)
	Definir i , j, total Como entero
	Para i = 1 Hasta n - 1 Hacer
		total = 0
		Para j = 1 Hasta m - 2 Hacer
			total = total + matriz[i,j]
		FinPara
		matriz[i, m - 1] = total
	FinPara
FinSubAlgoritmo

SubAlgoritmo totalVentasZona(matriz Por Referencia, n, m)
	Definir i , j, total Como entero
	Para i = 1 Hasta n - 1 Hacer
		total = 0
		Para j = 1 Hasta m - 2 Hacer
			total = total + matriz[j,i]
		FinPara
		matriz[n - 1, i] = total
	FinPara
FinSubAlgoritmo

SubAlgoritmo ingresoDatos(matriz por referencia, n , m)
	Definir i , j, num Como entero
	Para i = 1 Hasta n - 2 Hacer
		Escribir "Datos Representante " i
		Para j = 1 Hasta m - 2 Hacer
			Leer num
			Matriz[i,j] = num
		FinPara
	FinPara
FinSubAlgoritmo


SubAlgoritmo inicializarMatriz(matriz Por Referencia, n ,m)
	Definir i , j Como entero
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			si j = 0 Entonces
				matriz[i,j] = i
			SiNo
//				si j = 0 Entonces
//					Segun i Hacer
//						1:
//							Escribir "norte"
//						2:
//							Escribir "sur "
//						3:
//							Escribir "Este "
//						4:
//							Escribir "Oeste "
//						5:
//							Escribir "Centro "
//						6:
//							Escribir "Total "
//					FinSegun
//				SiNo
					matriz[i,j] = 0
			//	FinSi
			FinSi
		FinPara
	FinPara
FinSubAlgoritmo

//SubAlgoritmo imprimirMatriz(matriz Por Referencia, n ,m)
//	Definir i , j Como entero
//	Para i = 0 Hasta n - 1 Hacer
//		Para j = 0 Hasta m - 1 Hacer
//			si i = n-1 Entonces
//				Escribir Sin Saltar "  " matriz[i,j] " "
//			SiNo
//				Escribir Sin Saltar "  " matriz[i,j] "  "
//			FinSi
//		//	Escribir Sin Saltar "  " matriz[i,j] "  "
//		FinPara
//		Escribir ""
//	FinPara
//FinSubAlgoritmo

SubAlgoritmo imprimirMatriz(matriz Por Referencia, n, m)
	Definir i , j Como entero
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			Segun j Hacer
				0:
					segun i Hacer
						0:
							Escribir Sin Saltar "   "
						1:
							Escribir Sin Saltar "R1 "
						2:
							Escribir Sin Saltar "R2 "
						3:
							Escribir Sin Saltar "R3 "
						4:
							Escribir Sin Saltar "R4 "
						5:
							Escribir Sin Saltar "TOT"
					FinSegun
				1:
					si i = 0 Entonces
						Escribir Sin Saltar "NORTE "
					SiNo
						Escribir Sin Saltar "  " matriz[i,j] "  "
					FinSi
				2:
					si i = 0 Entonces
						Escribir Sin Saltar "SUR "
					SiNo
						si i = n-1 Entonces
							Escribir Sin Saltar " " matriz[i,j] " "
						SiNo
							Escribir Sin Saltar "  " matriz[i,j] "  "
						FinSi
						
					FinSi
				3:
					si i = 0 Entonces
						Escribir Sin Saltar "ESTE "
					SiNo
						Escribir Sin Saltar "  " matriz[i,j] "  "
					FinSi
				4:
					si i = 0 Entonces
						Escribir Sin Saltar "OESTE "
					SiNo
						si i = n-1 Entonces
							Escribir Sin Saltar " " matriz[i,j] " "
						SiNo
							Escribir Sin Saltar "  " matriz[i,j] "  "
						FinSi
					FinSi
				5:
					si i = 0 Entonces
						Escribir Sin Saltar "CENTRO "
					SiNo
						Escribir Sin Saltar "  " matriz[i,j] "  "
					FinSi
				6:
					si i = 0 Entonces
						Escribir Sin Saltar "TOTAL"
					SiNo
						si i = n-1 Entonces
							Escribir Sin Saltar " " matriz[i,j] " "
						SiNo
							Escribir Sin Saltar "  " matriz[i,j] "  "
						FinSi
					FinSi
			FinSegun
		FinPara
		Escribir ""
	FinPara
	
FinSubAlgoritmo
	
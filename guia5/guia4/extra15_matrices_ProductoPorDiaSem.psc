//15. Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.
//El informe final tendrá un formato como el que se muestra a continuación:
//
//	                          Lunes(0) Martes(1) Miércoles(2) Jueves(3) Viernes(4) Total producto(5)
//  Producto 1 (0)              00        01          02        03         04            05
//  Producto 2 (1)              10        11          12        13         14            15  
//	Producto 3 (2)              20        21          22        23         24            25   
//	Producto 4 (3)              30        31         32         33         34            35  
//	Producto 5 (4)              40        41          42        43        44             45 
//	Total semana (5)            50        51          52        53        54             55   
//	Producto más vendido (6)          



Algoritmo extra15_matrices
	Definir matriz Como Entero
	Dimension matriz[8,6]
	//inicializo matriz
	inicializarMatriz(matriz,8,6)
	//lleno matriz con numeros al azar solo la cant de productos vendidos en ese dia
	llenarMatriz(matriz,5,5)
	totalProducto(matriz,6,6)
	totalSemana(matriz,6,6)
	productoMasVendido(matriz,7,6)
	
	
	imprimirMatriz(matriz,8,6)
FinAlgoritmo


SubAlgoritmo productoMasVendido(matriz Por Referencia, n, m)
	Definir i, j, aux, pos Como Entero
	Para i = 0 Hasta n - 2 Hacer//i = 0 hasta  i = n-2=6-2= 4
		aux = 0
		Para j = 0 Hasta m - 2 Hacer// j= 0 hasta j =  m-2=6-2= 4
			si matriz[j,i] > aux Entonces
				aux = matriz[j,i]
				pos = j
			FinSi
		FinPara
		matriz[m , i] = pos + 1
	FinPara
FinSubAlgoritmo


SubAlgoritmo totalSemana(matriz Por Referencia, n,m)
	Definir i, j, total Como Entero
	Para i = 0 Hasta n - 1 Hacer//i = 0 hasta  i = n-2=6-2= 4
		total = 0
		Para j = 0 Hasta m - 2 Hacer// j= 0 hasta j =  m-2=6-2= 4
			total = total + matriz[j,i]
		FinPara
		matriz[m - 1 , i] = total
	FinPara
FinSubAlgoritmo

SubAlgoritmo totalProducto(matriz Por Referencia,n,m)
	Definir i, j, total Como Entero
	Para i = 0 Hasta n - 2 Hacer //i = 0 hasta  i = n-2=6-2= 4
		total = 0
		Para j = 0 Hasta m - 2 Hacer // j= 0 hasta j =  m-2=6-2= 4
			total = total + matriz[i,j]
		FinPara
		matriz[i, m - 1] = total
	FinPara
FinSubAlgoritmo


SubAlgoritmo inicializarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j  = 0 hasta m - 1 Hacer
			matriz[i,j] = 0
		FinPara
	FinPara
FinSubAlgoritmo


SubAlgoritmo llenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Para j  = 0 hasta m - 1 Hacer
			matriz[i,j] = Aleatorio(1,9)
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo imprimirMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	
	Escribir "            LUN  MAR  MIER  JUEV  VIER  TOTAL"
	Para i = 0 Hasta n Hacer
		Para j  = 0 hasta m - 1 Hacer
//			si i = 5 Entonces
//				Escribir Sin Saltar "  " matriz[i,j] " "
//			SiNo
//				Escribir Sin Saltar "  " matriz[i,j] "  " 
			//			FinSi
			Segun i Hacer
				0:
//					si j = 0 Entonces
//					//	Escribir "   "
//					FinSi
				1:
					si j = 0 Entonces
						Escribir Sin Saltar "producto 1:  " matriz[i-1,j] " "
					SiNo
						Escribir Sin Saltar "  " matriz[i-1,j] "   "
					FinSi
				2:
					si j = 0 Entonces
						Escribir Sin Saltar "producto 2:  " matriz[i-1,j] " "
					SiNo
						Escribir Sin Saltar "  " matriz[i-1,j] "   "
					FinSi
				3:
					si j = 0 Entonces
						Escribir Sin Saltar "producto 3:  " matriz[i-1,j] " "
					SiNo
						Escribir Sin Saltar "  " matriz[i-1,j] "   "
					FinSi
				4:
					si j = 0 Entonces
						Escribir Sin Saltar "producto 4:  " matriz[i-1,j] " "
					SiNo
						Escribir Sin Saltar "  " matriz[i-1,j] "   "
					FinSi
				5:
					si j = 0 Entonces
						Escribir Sin Saltar "producto 5:  " matriz[i-1,j] " "
					SiNo
						Escribir Sin Saltar "  " matriz[i-1,j] "   "
					FinSi
				6:
					si j = 0 Entonces
						Escribir Sin Saltar "total sem:  " matriz[i-1,j] " "
					SiNo
						Escribir Sin Saltar "  " matriz[i-1,j] "  "
					FinSi
				7:
					si j = 0 Entonces
						Escribir Sin Saltar "prod + vend: " matriz[i-1,j] " "
					SiNo
						Escribir Sin Saltar "  " matriz[i-1,j] "   "
					FinSi
				
			FinSegun
			
			
//			Segun j Hacer
//				0:
//					si i = 0 Entonces
//						Escribir "LUN  " 
//						Escribir Sin Saltar Matriz[i,j]
//					SINO	
//						Escribir Sin Saltar "  " matriz[i,j] "  "
//					FinSi
//				1:
//					si i = 0 Entonces
//						Escribir "MAR"
//						Escribir Sin Saltar matriz[i,j]
//					SiNo
//						Escribir Sin Saltar "  " matriz[i,j] "  "
//					FinSi
//				2:
//					si i = 0 Entonces
//						Escribir Sin Saltar "MIE  " matriz[i,j] " "
//					SiNo
//						Escribir Sin Saltar "  " matriz[i,j] "  "
//					FinSi
//				3:
//					si i = 0 Entonces
//						Escribir Sin Saltar "JUE  " matriz[i,j] " "
//					SiNo
//						Escribir Sin Saltar "  " matriz[i,j] "  "
//					FinSi
//				4:
//					si i = 0 Entonces
//						Escribir Sin Saltar "VIE  " matriz[i,j] " "
//					SiNo
//						Escribir Sin Saltar "  " matriz[i,j] "  "
//					FinSi
//				5:
//					si i = 0 Entonces
//						Escribir Sin Saltar "TOTAL PROD  " matriz[i,j] " "
//					SiNo
//						Escribir Sin Saltar " " matriz[i,j] "  "
//					FinSi
//					
//			FinSegun
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo

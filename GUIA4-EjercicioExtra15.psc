Algoritmo sin_titulo
//	Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//	realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.
//	El informe final tendrá un formato como el que se muestra a continuación
	Definir matriz, i, j Como Entero
	Dimension matriz(8,7)
	i=0
	j=0
	rellenarMatriz(matriz, i, j)
	impMatriz(matriz, i, j)
FinAlgoritmo

SubProceso 	rellenarMatriz(matriz, i, j)
	Definir may, suma, prod Como Entero
	may=0
	suma=0
	prod=0
	matriz(6,6)=0
	para j<- 1 Hasta 6 Hacer
			matriz(0,j)=j
		FinPara
	
	para i<-1 Hasta 7 Hacer
		matriz(i,0)=i
	FinPara
	
	para i <- 1 Hasta 5 Hacer
		para j <- 1 Hasta 5 Hacer
			matriz(i,j)=Aleatorio(1,7)
		FinPara
	FinPara
	
	para i <- 1 Hasta 5 Hacer
		para j<- 1 Hasta 5 Hacer
			suma=suma+matriz(i,j)
		FinPara
		matriz(i,6)=suma
		suma=0
	FinPara
	suma=0
	para j <- 1 Hasta 5 Hacer
		para i<- 1 Hasta 5 Hacer
			suma=suma+matriz(i,j)
		FinPara
		matriz(6,j)=suma
		suma=0
	FinPara
	
	para j<-1 hasta 6 Hacer
		para i <-1 Hasta 5 Hacer
			si matriz(i,j)>may Entonces
				may=matriz(i,j)
				prod=i
			FinSi
		FinPara
		matriz(7,j)=prod
		may=0
	FinPara
FinSubProceso

SubAlgoritmo impMatriz(matriz, i, j)
	para i <-0 Hasta 7 Hacer
		para j<-0 Hasta 6 Hacer
			si i=0 Entonces
				segun j Hacer
					0:
						Escribir "[" "          " "]" Sin Saltar
					1:
						Escribir "[" "lun" "]" Sin Saltar
					2:
						Escribir "[" "mar" "]" Sin Saltar
					3: 
						Escribir "[" "mie" "]" Sin Saltar
					4:
						Escribir "[" "jue" "]" Sin Saltar
					5:
						Escribir "[" "vie"  "]" Sin Saltar
					6:
						Escribir "[" "t pro" "]"
				FinSegun
			SiNo
				si j=0 Entonces
				segun i Hacer
					1:
						Escribir  "[" "producto 1" "]" Sin Saltar
					2:
						Escribir "[" "producto 2" "]" Sin Saltar
					3:
						Escribir "[" "producto 3" "]" Sin Saltar
					4:
						Escribir "[" "producto 4" "]" Sin Saltar
					5:
						Escribir "[" "producto 5" "]" Sin Saltar
					6:
						Escribir "[" "total  sem" "]" Sin Saltar
					7:
						Escribir "[" "pro. + ven" "]" Sin Saltar
				FinSegun
			sino 
				si i=7 Entonces
					si j<>6
					segun matriz(i,j) Hacer
						1:
							Escribir  "[" "p 1" "]" Sin Saltar
						2:
							Escribir "[" "p 2" "]" Sin Saltar
						3:
							Escribir "[" "p 3" "]" Sin Saltar
						4:
							Escribir "[" "p 4" "]" Sin Saltar
						5:
							Escribir "[" "p 5" "]" Sin Saltar
						
					FinSegun
				sino 
					segun matriz(i,j) Hacer
						1:
							Escribir  "[" "p 1" "]" 
						2:
							Escribir "[" "p 2" "]" 
						3:
							Escribir "[" "p 3" "]" 
						4:
							Escribir "[" "p 4" "]" 
						5:
							Escribir "[" "p 5" "]" 
							
					FinSegun
				FinSi
				
				SiNo
			
				si j=6 Entonces
					Escribir "[ " matriz(i,j) " ]"
				SiNo
					si i=6 Entonces
						Escribir "[" matriz(i,j) " ]" Sin Saltar
					SiNo
						Escribir "[ " matriz(i,j) " ]" Sin Saltar 
					FinSi
				FinSi
			FinSi
			
			FinSi
		FinSi
		FinPara
	FinPara
FinSubAlgoritmo

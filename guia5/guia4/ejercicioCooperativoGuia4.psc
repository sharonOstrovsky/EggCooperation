Algoritmo ejercicioCooperativoGuia4
	
	Definir tablero Como Cadena
	Dimension tablero[9,12]
	
	inicializarMatriz(tablero,9,12)
	
	agregarPalabra(tablero,"vector",0)
	agregarPalabra(tablero,"matrix",1)
	agregarPalabra(tablero,"programa",2)
	agregarPalabra(tablero,"subprograma",3)
	agregarPalabra(tablero,"subproceso",4)
	agregarPalabra(tablero,"variable",5)
	agregarPalabra(tablero,"entero",6)
	agregarPalabra(tablero,"para",7)
	agregarPalabra(tablero,"mientras",8)
	
	acomodarPalabras(tablero)
//	
	imprimirMatriz(tablero,9,12)
FinAlgoritmo

SubAlgoritmo acomodarPalabras(tablero Por Referencia)
	
	Definir i, aux, posicion, j Como Entero
	Definir matriz como cadena
	Dimension matriz[9,12]
	aux = 0
	Para i = 0 Hasta 8 Hacer
		para j = 0 Hasta 11 Hacer
			matriz[i,j] = tablero[i,j]
		FinPara
	FinPara
	
	Para i = 0 Hasta 8 Hacer
		posicion = buscarR(tablero,i)
		aux = 5 - posicion 

		si posicion <> 5 Entonces
			para j = aux Hasta 11 Hacer
				tablero[i,j] = matriz[i,j-aux]
			FinPara
			para j = 0 Hasta aux - 1 Hacer
				tablero[i,j] = "*"
			FinPara
		FinSi
//			tablero[i,5] = "r"

	FinPara
	


FinSubAlgoritmo

Funcion posicion <- buscarR(tablero Por Referencia, fila)
	Definir i, posicion Como Entero
	i = 0
	Definir encontrado Como Logico
	encontrado = Falso
	mientras !encontrado Hacer
		si tablero[fila,i] == "r" Entonces
			posicion = i
			encontrado = verdadero
		FinSi
		i = i + 1		
	FinMientras
FinFuncion


SubAlgoritmo agregarPalabra(tablero Por Referencia, palabra, fil)
	Definir i Como Entero
	Para i = 0 Hasta Longitud(palabra) - 1 Hacer
		tablero[fil,i] = Subcadena(palabra,i,i)
	FinPara
FinSubAlgoritmo

SubAlgoritmo imprimirMatriz(tablero, fil, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fil - 1 Hacer
		Para j = 0 Hasta col - 1 Hacer
			Escribir Sin Saltar " " tablero[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo

SubAlgoritmo inicializarMatriz(tablero Por Referencia , fil, col)
	Definir i, j Como Entero
	Para i = 0 Hasta fil - 1 Hacer
		Para j = 0 Hasta col - 1 Hacer
			tablero[i,j] = "*"
		FinPara
	FinPara
FinSubAlgoritmo
	
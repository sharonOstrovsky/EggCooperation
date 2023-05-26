Algoritmo sin_titulo
	Definir  m Como Entero
	Definir matriz, muestra como caracter
	m=0
	Escribir "introducir la muestra"
	leer muestra
    Mientras  chequearMuestra(muestra,m)<>verdadero Hacer
       Escribir "lamento comentarte que la muestra no es válida y se nos agota el tiempo!!, por favor introduce una muestra valida."
       leer muestra
   FinMientras
   Dimension matriz(m,m)
   Escribir  "MUESTRA"
   impMatriz(matriz,m,muestra)
   Escribir "GEN DETECTADO: " detectarGen(matriz,m)

FinAlgoritmo

Funcion log <- chequearMuestra(muestra, m Por referencia)
	Definir log Como Logico
	log= longitud(muestra)=9 o longitud(muestra)=16 o longitud(muestra)=1369
	si log=Verdadero Entonces
		si longitud(muestra)=9 Entonces
			m=3
		SiNo
			si longitud(muestra)=16 Entonces
				m=4
			SiNo
				m=37
			FinSi
		FinSi
	FinSi
	
FinFuncion

SubProceso    impMatriz(matriz,m,muestra)
	Definir i, j, r Como Entero
	r=0
	para i<-0 Hasta m-1 Hacer
		para j<-0 Hasta m-1
			matriz(i,j)=Subcadena(muestra,r,r)
			r=r+1
			si j=m-1 Entonces
				Escribir matriz(i,j)
			SiNo
				escribir matriz(i,j) ", " Sin Saltar
			FinSi
		FinPara
	FinPara
FinSubProceso

Funcion log <- detectarGen(matriz,m)
	Definir log Como Logico
	Definir i, j Como Entero
	i=m-1
	log=Verdadero
	si i=0 Entonces
		log=Verdadero
	SiNo
		log=log y matriz(i,i)=matriz(i-1,i-1)
	FinSi
	i=m-1
	j=0
	si i=0 y j=m-1 Entonces
		log=Verdadero
	SiNo
		log=log y matriz(i,j)=matriz(i-1,j+1)
	FinSi
FinFuncion
	
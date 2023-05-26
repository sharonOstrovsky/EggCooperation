//////////////////////////////////////////
		///ARREGLOS UNIDIMENSIONALES
//////////////////////////////////////////

//Este proceso llena un arreglo
SubProceso LLENAR_POR_TECLADO(Arreglo por referencia,DIM)
	definir i Como Entero
	definir num_leido Como Real
	Escribir "A continuación le pediré ",DIM," veces que ingrese un número que ira a un arreglo de dimension ",DIM
	Para i=0 hasta DIM-1
		Escribir "Ingrese un numero:"
		leer Arreglo[i]
	FinPara
FinSubProceso

///_______________________________

//Este proceso imprime un arreglo
Subproceso 	IMPRIMIR_ARREGLO(Arreglo,DIM)
	definir i Como Entero
	para i=0 hasta DIM-1
		Escribir sin saltar"[",Arreglo[i],"]"
	FinPara
	Escribir ""
FinSubProceso

///_______________________________

//Este proceso llena un arreglo con Aleatorio(L-,L+)
SubProceso LLENAR_POR_ALEATORIO(Arreglo por referencia,DIM,LIMITE_MENOR,LIMITE_MAYOR)
	definir i Como Entero
	Para i=0 hasta DIM-1
		Arreglo[i]=Aleatorio(LIMITE_MENOR,LIMITE_MAYOR)
	FinPara
FinSubProceso

///_______________________________

//Este proceso llena un arreglo con 0
SubProceso LLENAR_CON_0(Arreglo por referencia,DIM)
	definir i Como Entero
	Para i=0 hasta DIM-1
		Arreglo[i]=0
	FinPara
FinSubProceso

////////////////////////////////////////
			///MATRICES
////////////////////////////////////////

Subproceso LLENAR_MATRIZ_2D_TECLADO(matriz Por Referencia,filas,columnas)
	definir i,j Como Entero
	Escribir "Esta matriz tiene ",filas," filas y ",columnas," columnas, a continuacion le voy a pedir que ingrese valores para llenar esta matriz."
	para i=0 hasta filas-1
		para j=0 hasta columnas-1
			Escribir "ingrese un valor para la posicion: [",i,",",j,"]"
			leer matriz[i,j]
		FinPara
	FinPara
FinSubProceso

///_______________________________

subproceso IMPRIMIR_MATRIZ_2D(Matriz,filas,columnas)
	definir i,j Como Entero
	para i=0 hasta filas-1
		para j=0 hasta columnas-1
			Escribir sin saltar "[",Matriz[i,j],"]"
		FinPara
		escribir ""
	FinPara
FinSubProceso

///_______________________________

Subproceso LLENAR_MATRIZ_2D_ALEATORIO(matriz Por Referencia,filas,columnas,LIMITE_INFERIOR,LIMITE_SUPERIOR)
	definir i,j Como Entero
	para i=0 hasta filas-1
		para j=0 hasta columnas-1
			matriz[i,j]=Aleatorio(LIMITE_INFERIOR,LIMITE_SUPERIOR)
		FinPara
	FinPara
	ESCRIBIR "EXITO"
FinSubProceso

///_______________________________

Algoritmo libreria_de_arreglos
FinAlgoritmo

//El apocalipsis zonbie se ha desatado, pero aun hay esperanza. El dr. Galard ha conseguido aislar el gen Z analizando muestras 
//geneticas codificadas. Una muestra se corresponde con una secuencia de caracteres compuesta de cuatro posibles bases (A,B,C,D),
//por ejemplo "ACDDCADBCDABDBBA". Para poder detectar el gen Z, se representa la muestra como una matriz cuadrada [MxM] 
//y se busca en las dos diagonales principales que todas las bases sean iguales. 
//siguiendo el ejemplo de la muestra anterior la matriz resultante es:
//A C D D 
//C A D B
//C D A B
//D B B A
//Gelard aclara que para que la muestra sea valida el orden de la matriz (el valor de M) debe ser 3x3, 4x4 o 37x37 (segun la muestra)
//Por desgracia, de antemano no es posible saber el orden de la matriz y el mismo debe ser inferido de la muestra ingresada

//Tu mision: hacer un programa que permita ingresar una muestra completa, detectar si es valida, y de ser asi, que imprima la matriz
//y muestre un mensaje que indique si se ha detectado o no el gen Z
//hoy la humanidad depende de ti

//reglas de resolucion:
//a) es obligatorio el uso de al menos una variable N-dimensional
//b) subdivida el problema de tal forma de utilizar al menos dos subprogramas


Algoritmo integrador2_apocalipsisZombie
	Definir muestra, matriz Como Caracter
	Definir n Como Entero
	Escribir "ingrese la muestra"
	Leer muestra
	si esValido(muestra) Entonces
		Escribir "MUESTRA VALIDA"
		n = raiz(Longitud(muestra))
		Dimension matriz[n,n]
		imprimirMatriz(matriz, muestra, n)
		detectarGenZ(matriz,n)
	SiNo
		Escribir "MUESTRA NO VALIDA"
	FinSi

FinAlgoritmo

SubAlgoritmo detectarGenZ(matriz Por Referencia, n)
	Definir i, j Como Entero
	Definir principal, inversa Como Logico
	Definir auxPrin, auxInv Como Caracter
	principal = Verdadero
	inversa = Verdadero
	auxPrin = matriz[0,0]
	auxInv = matriz[0,n - 1]
	
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta n - 1 Hacer
			si i == j Entonces
				si matriz[i,j] <> auxPrin Entonces
					principal = Falso
				FinSi
			FinSi
			si matriz[i,n - 1 - i] <> auxInv Entonces
				inversa = Falso
			FinSi
		FinPara
	FinPara
	
	si principal Y inversa Entonces
		Escribir "GEN Z DETECTADO"
	SiNo
		Escribir "NO SE DETECTO EL GEN Z"
	FinSi

FinSubAlgoritmo


SubAlgoritmo imprimirMatriz(matriz Por Referencia, muestra, n)
	Definir i, j, k Como Entero
	k = 0
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta n - 1 Hacer
			matriz[i,j] = Subcadena(muestra,k,k)
			Escribir Sin Saltar " " matriz[i,j] " "
			k = k + 1
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo

Funcion rta <- esValido(muestra)
	Definir rta Como Logico
	rta = Falso
	si Longitud(muestra) == 9 o Longitud(muestra) == 16 o Longitud(muestra) == 1369 Entonces
		rta = Verdadero
	FinSi
FinFuncion


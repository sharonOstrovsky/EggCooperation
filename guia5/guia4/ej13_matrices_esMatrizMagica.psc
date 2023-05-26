//13. Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//	sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//	introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//	matriz que no debe superar orden igual a 10. 

Algoritmo ej13_matrices
	Definir matriz, n Como Entero
	Definir rta Como Logico
	Hacer
		Escribir "ingrese el tamaño de la matriz que no debe superar orden igual a 10"
		Leer n
	Mientras Que n > 10
	Dimension matriz[n,n]
	llenarMatriz(matriz, n)
	imprimirMatriz(matriz, n)
	rta = esMatrizMagica(matriz, n)
	Escribir ""
	si rta Entonces
		Escribir "la matriz es magica"
	SiNo
		Escribir "la matriz no es magica"
	FinSi
	
FinAlgoritmo


//hago un vector donde voy guardando todas las sumas?
//comparo las sumas que voy haciendo?
Funcion rta <- esMatrizMagica(matriz Por Referencia, n)
	Definir aux, i, j, k, l Como Entero
	Definir rta Como Logico
	Dimension aux[n * 2 + 2] //n filas + n columnas + 2 diagonales
	rta = Verdadero
	k = -1
	l = 0
	
	//inicializo el auxiliar en cero
	para i = 0 hasta n * 2 + 1 Hacer
		aux[i] = 0 
	FinPara
	
	para i = 0 hasta n - 1 Hacer
		k = k + 1
		para j = 0 Hasta n - 1 Hacer
			aux[k] = aux[k] + matriz[i,j]  //guardo la suma de las filas
			aux[k + n] = aux[k + n] + matriz[j,i] //guardo la suma de las columnas
		FinPara
	FinPara
	
	para i = 0 hasta n - 1 Hacer
		aux[n*2] = aux[n*2] + matriz[i,i]  //guardo la suma de diagonal principal
		aux[n*2+1] = aux[n*2+1] + matriz[i,n-1-i] //suma de diagonal secundaria
	FinPara
	
	//imprimo el vector aux de sumas
	Escribir "vector aux de sumas: "
	para i = 0 Hasta 7 Hacer
		Escribir Sin Saltar " " aux[i] " "   
	FinPara
	
	//me fijo que todas las sumas sean iguales
	Mientras rta == Verdadero Y l < (n*2+1) Hacer
		si aux[l] <> aux[l+1] Entonces
			rta = Falso
		FinSi
		l = l + 1
	FinMientras
	
FinFuncion

SubProceso llenarMatriz(matriz Por Referencia, n)
	Definir i, j, num Como Entero
	Escribir "ingrese la matriz"
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta n - 1 Hacer
			Leer num
			Mientras num > 9  O num < 1 Hacer
				Escribir "numero ingresado no valido"
				Leer num
			FinMientras
			matriz[i,j] = num
		FinPara
	FinPara
FinSubProceso


SubProceso imprimirMatriz(matriz Por Referencia, n)
	Definir i, j Como Entero
	Escribir "imprimo matriz: "
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta n - 1 Hacer
			Escribir Sin Saltar " " matriz[i,j] " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
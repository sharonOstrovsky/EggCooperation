//5. Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//	más cercano.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
//	H  o l a   m u n d o    c  r  u  e  l  !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//	Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con
//	desplazamiento sería:
//		h o l a    m u n % d o     c  r  u  e  l  !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//		Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10
//		estaba más cerca de la posición 8 que el espacio de la posición 4.



//NUNCA LO MUEVO PARA LA DERECHA !!!ESTA MAL!!!!!! CORREGIR




Algoritmo extra5_vectores
	
	Definir vector, caract Como Caracter
	Definir posicion Como Entero
	Dimension vector[20]
	ingresarFraseVector(vector)
	Escribir "ingrese un caracter cualquiera"
	Leer caract
	Escribir "ingrese una posicion"
	Leer posicion
	ingresarCaracterAFrase(vector,caract, posicion)
	
FinAlgoritmo


//Funcion posBlancoBuscada <- encontrarPosicionLibre(vector Por Referencia, n, posCaract)
//	Definir posBlancoBuscada, i Como Entero
//	Para i = 0 Hasta n - 2 Hacer
//		si  vector[posCaract + i] == " "  Entonces //vector[posCaract + i] == "" O
//			posBlancoBuscada = posCaract + i
//		SiNo
//			si vector[posCaract - i] == " " Entonces //vector[posCaract - i] == "" O 
//				posBLancoBuscada = posCaract - i
//			FinSi
//		FinSi
//	FinPara
//FinFuncion

Funcion posBlancoBuscada <- encontrarPosicionLibre(vector Por Referencia, n, posCaract)
	Definir posBlancoBuscada, i Como Entero
	Definir encontrado Como Logico
	encontrado = Falso
	i = 0
	Mientras !encontrado  O i > 19 Hacer
		si vector[posCaract - i] == "" O vector[posCaract - i] == " " Entonces
			encontrado = Verdadero
			posBlancoBuscada = posCaract - i
		SiNo
			si vector[posCaract + i] == "" O vector[posCaract + i] == " " Entonces
				encontrado = Verdadero
				posBlancoBuscada = posCaract + i
			FinSi
		FinSi
		i = i + 1
	FinMientras
FinFuncion


SubAlgoritmo ingresarFraseVector(vector Por Referencia)
	Definir frase Como Caracter
	Definir i Como Entero
	Escribir "ingrese una frase"
	Leer frase
	Para i = 0 Hasta 19 Hacer  //longitud(frase) - 1
		vector[i] = Subcadena(frase, i,i)
	FinPara
FinSubAlgoritmo

SubAlgoritmo ingresarCaracterAFrase(vector Por Referencia, caract, posicion)
	Definir aux Como Caracter
	Definir i, posBLancoBuscada Como Entero
	Dimension aux[20]
//	copiarVector(vector. aux, 20)
	imprimirVector(vector)
	si vector[posicion] == " " O vector[posicion] == "" Entonces
		vector[posicion] = caract
		imprimirVector(vector)
	SiNo
		Escribir "la posicion estaba ocupada"
		posBLancoBuscada = encontrarPosicionLibre(vector, 20, posicion)
		para i = 0 Hasta posicion - 1 Hacer
			aux[i] = vector[i]
		FinPara
		aux[posicion] = caract
		para i = posicion + 1 Hasta 19 Hacer
			aux[i] = vector[i-1]
		FinPara
		imprimirVector(aux)
	FinSi
	
FinSubAlgoritmo

SubAlgoritmo copiarVector(vector Por Referencia, aux Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n - 1 Hacer
		aux[i] = vector[i]
	FinPara
FinSubAlgoritmo

SubProceso imprimirVector(vector Por Referencia)
	Definir i Como Entero
	Escribir Sin Saltar "Vector = [ "
	para i = 0 Hasta 19 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
	Escribir " ]"
	
FinSubProceso
//6. Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
//desarrollar un programa que:
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la función Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
//	posición dentro del arreglo, y el programa debe intentar ingresar el carácter en la
//	posición indicada, si es que hay lugar (es decir la posición está vacía o es un espacio
//	en blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado,
//	de lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.

Algoritmo ej6_vectores
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

SubProceso ingresarFraseVector(vector Por Referencia)
	Definir frase Como Caracter
	Definir i Como Entero
	Escribir "ingrese una frase"
	Leer frase
	Para i = 0 Hasta 19 Hacer  //longitud(frase) - 1
		vector[i] = Subcadena(frase, i,i)
	FinPara
FinSubProceso

SubAlgoritmo ingresarCaracterAFrase(vector Por Referencia, caract, posicion)
	imprimirVector(vector)
	si vector[posicion] == " " O vector[posicion] == "" Entonces
		vector[posicion] = caract
		imprimirVector(vector)
	SiNo
		Escribir "la posicion estaba ocupada"
	FinSi
	
FinSubAlgoritmo


SubProceso imprimirVector(vector Por Referencia)
	Definir i Como Entero
	Escribir Sin Saltar "Vector = [ "
	para i = 0 Hasta 19 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
	Escribir " ]"
	
FinSubProceso
//11. Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//		letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//		Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.


Algoritmo extra11_procedimientos
	Definir letra Como Caracter
	Definir num Como Entero
	letra = 'P'
	compararLetras(letra)
	letra = 'A'
	compararLetras(letra)
	
FinAlgoritmo

SubProceso compararLetras(letra)
	
	si letra > 'M' Y letra < 'T' Entonces
		Escribir "esta entre M y T"
	SiNo
		Escribir "no esta entre M y T"
	FinSi
	
FinSubProceso


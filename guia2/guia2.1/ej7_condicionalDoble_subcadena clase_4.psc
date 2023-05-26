//7. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//	es una 'A'. Si la primera letra es una 'A', se deberá de imprimir un mensaje por pantalla
//	que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota:
//		investigar la función Subcadena de PseInt.

Proceso ej7_condicionalDoble
	
	Definir frase, carac Como Caracter
	Escribir "ingrese una frase o palabra"
	Leer frase
	carac = subcadena(frase,0,0)
	Escribir carac
	si carac == 'A' Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
		
	FinSi
FinProceso

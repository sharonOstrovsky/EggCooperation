//4. Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
//	usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje por
//	pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
//Nota: investigar la función Longitud() de PseInt.

Proceso ej4_condicional_Doble
	
	Definir frase Como Caracter
	Escribir "ingrese una frase o palabra de 6 caracteres"
	Leer frase
	si Longitud(frase) == 6 Entonces
		Escribir "CORRECTO"
	sino 
		Escribir "INCORRECTO" 
	FinSi
	
FinProceso

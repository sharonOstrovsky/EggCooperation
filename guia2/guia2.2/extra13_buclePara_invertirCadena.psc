//13. Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
//		deberemos mostrar a l o H.

Algoritmo extra13_buclePara
	
	Definir tam, i Como Entero
	Definir frase Como Caracter
	
	Escribir "ingrese una frase"
	Leer frase
	
	tam = Longitud(frase)
	
	Para i = tam Hasta 0 Hacer
		Escribir Sin Saltar Subcadena(frase,i,i)
		Escribir Sin Saltar " "
	FinPara
	
FinAlgoritmo

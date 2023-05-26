//4)Cuenta la cantidad de vocales en forma independiente que se encuentren dentro de un texto introducido por el usuario

Algoritmo repaso4_cantVocales
	
	Definir frase, carac Como Caracter
	Definir tam, i, contador Como Entero
	Escribir "ingrese una frese"
	Leer frase
	tam = Longitud(frase)
	contador = 0
	Para i = 0 Hasta tam Hacer
		carac = Subcadena(frase,i,i)
		si carac == 'a' O carac == 'e' O carac == 'i' O carac == 'o' O carac == 'u' Entonces
			contador = contador + 1
		FinSi
	FinPara
	
	Escribir "cantidad de vocales: " contador
	
FinAlgoritmo

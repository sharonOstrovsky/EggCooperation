//4. Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. S�lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber�
//		mostrar un mensaje indic�ndonos que hemos agotado esos 3 intentos. Si acertamos la
//			clave se deber� mostrar un mensaje que indique que se ha ingresado al sistema
//			correctamente.

Algoritmo ej4_bucleHacerMientrasQue
	
	Definir clave Como Caracter
	Definir  i Como Entero
	
	i=0
	
	Hacer
		Escribir "ingrese la clave"
		Leer clave
		si clave == 'eureka' Entonces
			Escribir "ha ingresado correctamente al sistema"
			i = 3
		SiNo
			//Escribir "vuelva a intentarlo"
			i = i + 1
			si i == 3 Entonces
				Escribir "se han agotado los tres intentos"
			FinSi
		FinSi

	Mientras Que i < 3
	
FinAlgoritmo

//10. Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a
//continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
//	1o) El programa elige al azar un número n entre 1 y 10.
//	2o) El usuario ingresa un número x.
//	3o) Si x no es el número exacto, el programa indica si n es más grande o más pequeño que
//			el número ingresado.
//	4o) Repetimos desde 2) hasta que x sea igual a n.
//	El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué
//		hacer y qué pasó hasta que adivine el número.
//	NOTA: Para generar un número aleatorio entre 1 y 10 se puede utilizar la función
//			Aleatorio(limite_inferior, limite_superior) de PseInt.
//
//

//OPCION 1

//Algoritmo extra10_bucleHacerMientrasQue
//	
//	Definir numAzar, numIngresado Como Entero
//	
//	numAzar = Aleatorio(1,10)
//	
//	Hacer
//		Escribir "ingrese un numero"
//		Leer numIngresado
//		si numIngresado <> numAzar Entonces
//			si numIngresado < numAzar Entonces
//				Escribir "el numero es mas grande que " numIngresado
//			SiNo
//				Escribir "el numero es mas chico que " numIngresado
//			FinSi
//		FinSi
//	Mientras Que numAzar <> numIngresado	
//	
//	Escribir "CORRECTO"
//	
//FinAlgoritmo


//----------------------------------------


//OPCION 2

Algoritmo extra10_bucleHacerMientrasQue
	
	Definir numAzar, numIngresado Como Entero
	
	numAzar = Aleatorio(1,10)
	
	Hacer
		Escribir "ingrese un numero"
		Leer numIngresado
			si numIngresado < numAzar Entonces
				Escribir "el numero es mas grande que " numIngresado
			SiNo
				si numIngresado > numAzar Entonces
					Escribir "el numero es mas chico que " numIngresado
				FinSi
			FinSi
	Mientras Que numAzar <> numIngresado	
	
	Escribir "CORRECTO"
	
FinAlgoritmo

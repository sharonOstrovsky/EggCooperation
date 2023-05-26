//Necesitamos crear un sistema para una m�quina de reciclaje de botellas autom�tica. Dicha
//	m�quina nos pagar� dinero por la cantidad de pl�stico reciclado. Tenemos que ingresar nuestro
//	usuario y contrase�a para que se nos cargue el saldo por sistema a nuestra cuenta.

//	? Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//		verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es correcta
//		haremos que una variable llamada Login sea verdadera.
//	? Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un bucle
//		Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.
//	? Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al men� de
//		opciones: "Ingresar botellas", "Consultar saldo" y "Salir"
//	? Ingresar Botellas: Primero preguntaremos cu�ntas botellas se va a ingresar al sistema. Una vez
//		que tenemos el n�mero vamos a usar un bucle para, a fin de ir ingresando cada botella. En
//		cada ciclo del bucle se debe generar un n�mero aleatorio entre 100 y 3000 gr, que va a ser el
//		peso de las botellas a reciclar (simulando que el usuario est� ingresando botellas en la
//		m�quina). Una vez generado, seg�n el peso del material, usaremos un condicional m�ltiple
//		para asignarle un valor monetario:
//	? Si es menos de 500 gr, corresponden $50
//  ? Si es entre 501 gr y 1500 gr, corresponden $125
//	? Si es m�s de 1501 gr, corresponden $200
//	? Hecho esto, el programa debe informar al usuario por pantalla el valor que se le ofrece. Si el
//		usuario acepta, lo acreditamos a su saldo, sino se debe devolver el material (s�lo mostrar en
//		pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
//	? Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
//	? Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al men� principal.

Algoritmo ej_cooperativo
	
	Definir usuario, clave, eleccion, respuesta Como Caracter
	Definir login Como Logico
	Definir intentos, cantBotellas, i, pesoBotella, valorBotella, saldo Como Entero
	
	saldo = 0
	
	Escribir "ingrese su usuario"
	Leer usuario
	si usuario == 'Albus_D' Entonces
		intentos = 1
		Mientras intentos <= 3 Hacer
			Escribir "ingrese la contrase�a"
			Leer clave
			si clave == 'caramelosDeLimon' Entonces
				login = Verdadero
				intentos = 4
			SiNo
				intentos = intentos + 1
			FinSi
		FinMientras
		
		
		Hacer
			Escribir "MENU"
			Escribir "A: INGRESAR BOTELLAS"
			Escribir "B: CONSULTAR SALDO"
			Escribir "C: SALIR"
			Leer eleccion
			
			
			Segun eleccion Hacer
				'A','a','INGRESAR BOTELLAS','ingresar botellas':
					Escribir "cuantas botellas va a ingresar al sistema?"
					leer cantBotellas
					Para i = 1 Hasta cantBotellas Hacer
						pesoBotella = Aleatorio(100,3000)
						si pesoBotella <= 500 Entonces
							valorBotella = 50
						SiNo
							si pesoBotella >= 501 Y pesoBotella <= 1500 Entonces
								valorBotella = 125
							SiNo
								si pesoBotella >= 1501 Entonces
									valorBotella = 200
								FinSi
							FinSi
						FinSi
						Escribir "Valor de la botella: " valorBotella
						Escribir "ACEPTAR  SI o NO "
						Leer respuesta
						si respuesta == 'SI' Entonces
							saldo = saldo + valorBotella
							Escribir "saldo " saldo
						SiNo
							Escribir "Devolviendo material"
						FinSi
					FinPara
					
				'B','b','CONSULTAR SALDO','consultar saldo':
					Escribir "El saldo es: " saldo
					
				'C','c', 'SALIR','salir':
					login = Falso
					
					
			FinSegun
			
		Mientras Que login == Verdadero
		
		
	FinSi
	
	
	
FinAlgoritmo

//12)Pide al usuario dos números y muestra la "distancia" entre ellos 
//(el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

Proceso extra12_guia1_distanciaEntreDosNumeros
	Definir num1, num2, distancia Como Entero
	Escribir "ingrese un numero"
	Leer num1
	Escribir "ingrese otro numero"
	Leer num2
	distancia <- abs (num1 - num2)
	Escribir "la distancia entre los numeros ingresados es: " distancia
	
FinProceso

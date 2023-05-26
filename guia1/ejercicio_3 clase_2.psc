//A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado se
//debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
//Ayuda: 1 pulgada equivale a 2.54 centímetros.

Algoritmo ejercicio_3
	Definir metros Como Entero
	Escribir "ingrese una cantidad de metros"
	Leer metros
	Escribir metros " metros = " metros * 100 " centimetros = " metros * 1000 " milimetros = " (metros * 100) / 2.54 " pulgadas"
	
FinAlgoritmo

//2. Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//	10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//	mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//	debe cobrar al cliente e imprimirlo por pantalla. 

Algoritmo extra2_condicionalDoble
	Definir mes Como Caracter
	Definir importe Como Real
	Escribir "ingrese el mes que realizo la compra"
	Leer mes
	Escribir "ingrese el importe de la compra"
	Leer importe
	
	si (mes == 'septiembre' O mes == 'octubre' O mes == 'noviembre') Entonces
		Escribir "el monto total que se debe cobrar al cliente es: " importe - (importe * 0.1)
	SiNo
		Escribir "el monto total que se debe cobrar al cliente es: " importe
	FinSi
	
FinAlgoritmo

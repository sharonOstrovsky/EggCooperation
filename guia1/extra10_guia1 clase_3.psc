//10)Una tienda ofrece un descuento del 15% sobre el total de la compra 
//y un cliente desea saber cuanto deberá pagar finalmente por su compra.

Proceso extra10_guia1
	Definir compra, montoFinal Como Real
	Escribir "ingrese el monto de la compra total"
	Leer compra
	montoFinal <- compra - (compra * 0.15)
	Escribir "El cliente debera pagar por su compra: " montoFinal "pesos"
	
FinProceso

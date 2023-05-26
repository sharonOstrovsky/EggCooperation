//10. Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
//cada venta.


Algoritmo ej10_buclesAnidados
	
	Definir sueldoTotal, sueldoBase, comision, cantVentas, precioVenta Como Real
	Definir n, i Como Entero
	
	Escribir "ingrese la cantidad de vendedores contratados"	
	Leer n
	
//	Escribir "ingrese el sueldo base del vendedor"
//	Leer sueldoBase
//	Escribir "ingrese cuantas ventas realizo el vendedor"
//	Leer cantVentas
//	Escribir "ingrese cuanto se cobro por cada venta realizada"
//	Leer precioVenta
	
	Para i = 1 Hasta n Hacer
		
		Escribir "VENDEDOR " i
		
		Escribir ""
		
		Escribir "ingrese el sueldo base del vendedor"
		Leer sueldoBase
		Escribir "ingrese cuantas ventas realizo el vendedor"
		Leer cantVentas
		Escribir "ingrese cuanto se cobro por cada venta realizada"
		Leer precioVenta
		
		comision = (cantVentas * precioVenta) * 0.1
		sueldoTotal = sueldoBase + comision
		
		Escribir ""
		Escribir "vendedor: " n " comision: " comision " sueldo total: " sueldoTotal
		
		Escribir ""
	FinPara
	
	
FinAlgoritmo

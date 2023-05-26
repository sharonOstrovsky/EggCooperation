//10. Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
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

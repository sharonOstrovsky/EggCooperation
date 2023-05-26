//9)Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, 
//el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes 
//y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

Proceso extra9_guia1
	Definir sueldoBase, comisiones, sueldoTotal Como Real
	Definir cantVentas Como Entero
	cantVentas<- 3
	Escribir "ingrese su sueldo base"
	Leer sueldoBase
	
	comisiones<- cantVentas * (sueldoBase * 0.1)
	sueldoTotal<- sueldoBase + comisiones
	
	Escribir "El vendedor obtendra por concepto de comisiones: " comisiones " y recibira un total de " sueldoTotal " ese mes"
	
	
	
	
FinProceso

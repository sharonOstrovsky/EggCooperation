//12. Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo

//	a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//		realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//		empleado.
// b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//		hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//		esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//		como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//		del valor de venta total.
//	c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//		hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//		horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//		hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un
//empleado.

Algoritmo extra12_condicionalesAnidados
	
	Definir contrato Como Caracter
	Definir sueldo Como Real
	//por comision:
	Definir montoVentas Como Real
	//salario fijo + comision:
	Definir valorHora, horasTrabajadas Como Real // + montoVentas
	//salario fijo:
	Definir horasExtra Como Entero	// + valorHora + horasTrabajadas
	
	
	
	Escribir "ingrese A para la modalidad salario por comision"
	Escribir "ingrese B para la condicion de salario fijo + comision"
	Escribir "ingrese C para la modalidad de salario fijo"
	Leer contrato
	
	Segun contrato Hacer
		'A':
			Escribir "ingrese el monto total de las ventas realizadas por semana"
			Leer montoVentas
			sueldo = montoVentas * 0.4
			Escribir "el sueldo es: " sueldo
		'B':
			Escribir "ingrese el valor por hora"
			Leer valorHora
			Escribir "ingrese la cantidad de horas trabajadas semanalmente"
			Leer horasTrabajadas
			Escribir "ingrese el monto total de las ventas realizadas por semana"
			Leer montoVentas
			si horasTrabajadas <= 40 Entonces
				sueldo = (valorHora * horasTrabajadas) +  (montoVentas * 0.25)
				Escribir "El sueldo es: " sueldo
			SiNo
				Escribir "paso la cantidad de horas permitidas por semana"
			FinSi
		'C':
			Escribir "ingrese el valor por hora"
			Leer valorHora
			Escribir "ingrese la cantidad de horas trabajadas semanalmente"
			Leer horasTrabajadas
			si horasTrabajadas <= 50 Entonces
				sueldo = valorHora * horasTrabajadas
				Escribir "el sueldo es: " sueldo
			SiNo
				horasExtra = horasTrabajadas - 50
				sueldo = (valorHora * 50) + (horasExtra * (valorHora * 0.5))
				Escribir "el sueldo es: " sueldo
			FinSi
			
	FinSegun
	
FinAlgoritmo

//6)Realice un programa que calcule la nómina salarial neto, 
//de unos obreros cuyo trabajo se paga en horas. 
//El cálculo se realiza de la siguiente forma:
//	
//	- Las primeras 35 horas a una tarifa fija.
//	
//	- Las horas extras se pagan a 1.5 más de la tarifa fija.
//	
//	- Los impuestos a deducir de los trabajadores varian, 
//     segun el sueldo mensual si el sueldo es menos a $20,000.00 el sueldo es libre de impuesto 
//     y si es al contrario se cobrará un 20% de impuesto.


Algoritmo repaso6_salario
	
	Definir sueldo, sueldoFinal, horasTrabajadas, tarifaFija Como Real
	
	Escribir "ingrese las horas trabajadas"
	Leer horasTrabajadas
	Escribir "ingrese la tarifa fija"
	Leer tarifaFija
	
	si horasTrabajadas <= 35 Entonces
		sueldo = horasTrabajadas * tarifaFija
		si sueldo <= 20000 Entonces
			sueldoFinal = sueldo
			Escribir sueldoFinal
		SiNo
			sueldoFinal = sueldo - (sueldo * 0.2)
			Escribir sueldoFinal
		FinSi
	SiNo
		sueldo = (35 * tarifaFija) + ((horasTrabajadas - 35) * (tarifaFija * 1.5))
		si sueldo <= 20000 Entonces
			sueldoFinal = sueldo
			Escribir sueldoFinal
		SiNo
			sueldoFinal = sueldo - (sueldo * 0.2)
			Escribir sueldoFinal
		FinSi
	FinSi
	
FinAlgoritmo

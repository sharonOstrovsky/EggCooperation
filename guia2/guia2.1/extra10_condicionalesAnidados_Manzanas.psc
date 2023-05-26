//10. Una verduler�a ofrece las manzanas con descuento seg�n la siguiente tabla:
//	No DE KILOS COMPRADOS     % DESCUENTO
//	0 - 2                       0%
//	2.01 - 5                    10%
//	5.01 - 10                   15%
//	10.01 en adelante           20% 
//	Determinar cu�nto pagar� una persona que compre manzanas en esa verduler�a

Algoritmo extra10_condicionalesAnidados
	
	Definir kilosManzana, precioManzana, totalPagar Como Real
	//Escribir "ingrese el numero de kilos de manzana comprados"
	//Leer kilosManzana
	//precioManzana = 1
	
	si kilosManzana >= 0 Y kilosManzana <= 2 Entonces
		totalPagar = kilosManzana * precioManzana
	//	Escribir totalPagar
	SiNo
		si kilosManzana >= 2.01 Y kilosManzana <= 5 Entonces
			totalPagar = (kilosManzana * precioManzana) - ((kilosManzana * precioManzana) * 0.1)
	//		Escribir totalPagar
		SiNo
			si kilosManzana >= 5.01 Y kilosManzana <= 10 Entonces
				totalPagar = (kilosManzana * precioManzana) - ((kilosManzana * precioManzana) * 0.15)
	//			Escribir totalPagar
			SiNo
				si kilosManzana > 10.01 Entonces
					totalPagar = (kilosManzana * precioManzana) - ((kilosManzana * precioManzana) * 0.2)
	//				Escribir totalPagar
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo

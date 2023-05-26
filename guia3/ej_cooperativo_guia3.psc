//El menú debe quedar de la siguiente manera:
//1 - Calcular muro de ladrillo
//2 - Calcular viga de hormigón
//3 - Calcular columnas de hormigón
//4 - Calcular contrapisos
//5 - Calcular techo
//6 - Calcular pisos
//7 - Calcular pintura
//8 - Calcular iluminación
//9 - Salir

Algoritmo ej_cooperativo_guia3
	
	menu()
	
FinAlgoritmo

SubProceso menu()
	Definir numMenu Como Entero
	Definir continuar Como Logico
	continuar = Verdadero
	
	Hacer
		Escribir "MENU:"
		Escribir "1 - Calcular muro de ladrillo"
		Escribir "2 - Calcular viga de hormigón"
		Escribir "3 - Calcular columnas de hormigón"
		Escribir "4 - Calcular contrapisos"
		Escribir "5 - Calcular techo"
		Escribir "6 - Calcular pisos"
		Escribir "7 - Calcular pintura"
		Escribir "8 - Calcular iluminación"
		Escribir "9 - Salir"
		
		Leer numMenu
		
		Segun numMenu hacer
			1:
				calcularMuro()
			2:
				calcularViga()
			3:
				calcularColumna()
			4:
				calcularContrapisos()
			5:
				calcularTecho()
			6:
				calcularPisos()
			7: 
				calcularPintura()
			8:
				calcularIluminacion()
			9:
				continuar = Falso
		FinSegun
	Mientras Que continuar == Verdadero
	
FinSubProceso

Funcion superficie <- calcularSuperficie(largo, ancho)
	Definir superficie Como Real
	superficie = largo * ancho
FinFuncion

Funcion volumen <- calcularVolumen(largo, ancho, altura)
	Definir volumen Como Real
	volumen = altura * ancho * largo
FinFuncion

SubProceso calcularMuro()
	Definir espesor, largo, alto, superficie Como Real
	Escribir "indique si el muro es de 20 o 30 cm de espesor"
	Leer espesor
	Escribir "indique el largo del muro"
	Leer largo
	Escribir "indique el alto del muro"
	Leer alto
	
	superficie = calcularSuperficie(largo, espesor)
	Escribir "La superficie del muro es: " superficie
//Si el muro es de 30cm necesitaremos por metro cuadrado: 15.2 kg de cemento, 0.115 m3
//		de arena y 120 ladrillos.
//	Si el muro es de 20cm necesitaremos por metro cuadrado: 10.9 kg de cemento, 0.09 m3 de
	//			arena y 90 ladrillos.
	Escribir "Materiales: "
	si espesor == 30 Entonces
		Escribir "Cemento: " 15.2 * superficie "kg"
		Escribir "Arena: " 0.115 * superficie "m3"
		Escribir "Ladrillos: " 120 * superficie
	SiNo
		si espesor == 20 Entonces
			Escribir "Cemento: " 10.9 * superficie "kg"
			Escribir "Arena: " 0.09 * superficie "m3"
			Escribir "Ladrillos: " 90 * superficie
		FinSi
	FinSi
	
	
	Escribir ""
FinSubProceso

SubProceso calcularViga()
	Definir largo Como Real
	Escribir "indique el largo de la viga"
	Leer largo
//Por metro lineal de viga se necesitarán: 9 kg de cemento,
//	0.02 m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
	Escribir "Materiales:"
	Escribir "Cemento: " 9 * largo "kg"
	Escribir "Arena: " 0.02 * largo "m3"
	Escribir "Piedra: " 0.02 * largo "m2"
	Escribir "Hierro del 8: " 4 * largo "m"
	Escribir "Hierro del 4: " 3 * largo "m"
	
	Escribir ""
	
FinSubProceso


SubProceso calcularColumna()
	Definir largo Como Real
	Escribir "indique el largo de la columna"
	Leer largo
//Por metro lineal de columna se necesitarán: 7.5 kg
//	de cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro
	//	del 4.
	Escribir "Materiales:"
	Escribir "Cemento: " 7.5 * largo "kg"
	Escribir "Arena: " 0.016 * largo "m3"
	Escribir "Piedra: " 0.016 * largo "m2"
	Escribir "Hierro del 10: " 6 * largo "m"
	Escribir "Hierro del 4: " 3 * largo "m"
	
	Escribir ""
FinSubProceso


SubProceso calcularContrapisos()
	Definir espesor, largo, ancho, volumen Como Real
	Escribir "indique el espesor"
	Leer espesor
	Escribir "indique el largo"
	Leer largo
	Escribir "indique el ancho"
	Leer ancho
	
	volumen = calcularVolumen(largo, ancho, espesor)
//Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3
	//	de piedra.
	Escribir "Materiales: "
	Escribir "Cemento: " 105 * volumen "kg"
	Escribir "Arena: " 0.45 * volumen "m3"
	Escribir "Piedra: " 0.9 * volumen "m3"
	
	Escribir ""
FinSubProceso



SubProceso calcularTecho()
	Definir espesor, largo, ancho, superficie Como Real
	Escribir "indique el espesor del techo"
	Leer espesor
	Escribir "indique el largo del techo"
	Leer largo
	Escribir "indique el ancho del techo"
	Leer ancho
	
	superficie = calcularSuperficie(largo, ancho)  // superficie = calcularSuperficie(largo, espesor)
//Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3
	//de piedra, 7 m de hierro del 8 y 4 m de hierro del 6
	Escribir "Materiales: "
	Escribir "Cemento: " 33 * superficie "kg"
	Escribir "Arena: " 0.072 * superficie "m3"
	Escribir "Piedra: " 0.072 * superficie "m3"
	Escribir "Hierro del 8: " 7 * superficie "m"
	Escribir "Hierro del 6: " 4 * superficie "m"
	
	Escribir ""
	
FinSubProceso



SubProceso calcularPisos()
	Definir ancho, largo, superficie Como Real
	Escribir "indique el largo del piso"
	Leer largo
	Escribir "indique el ancho del piso"
	Leer ancho
	superficie = calcularSuperficie(largo, ancho)
//	se debe	calcular la superficie y añadirle un 10% extra por recortes
	Escribir "Se necesitan " superficie + (superficie * 0.1) "m2"  // superficie * 1.1
	
	Escribir ""
FinSubProceso


SubProceso calcularPintura()
	//Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en
	//cuenta que rinde 6 m2 por litro de pintura.
	Definir superficieMuro Como Real
	Escribir "indique la superficie del muro"
	Leer superficieMuro
	
	Escribir "Se necesitan " superficie / 6 " litros de pintura"
	
	Escribir ""
FinSubProceso

SubProceso calcularIluminacion()
	//Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente
//forma: superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural
//	(ventanas y puertas de vidrio). Mostrar resultado
	Definir superficieHabitacion Como Real
	Escribir "indique la superficie de la habitacion"
	Leer superficieHabitacion
	Escribir "La cantidad minima de superficie de iluminacion natural (ventanas y puertas de vidrio) es: " superficieHabitacion * 0.2
	
	Escribir ""
FinSubProceso

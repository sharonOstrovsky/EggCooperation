//8. Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//		entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//			Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//			llantas que compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo extra8_condicionalesAnidados
	
	Definir cantLlantas Como Entero
	Escribir "ingrese la cantidad de llantas que compra"
	Leer cantLlantas
	
	si cantLlantas < 5 Entonces
		Escribir "cada llanta vale $3000 y el monto total a pagar es: $" cantLlantas * 3000
	SiNo
		si cantLlantas > 10 Entonces
			Escribir "cada llanta vale $2000 y el monto total a pagar es: $" cantLlantas * 2000
		SiNo
			Escribir "cada llanta vale $2500 y el monto total a pagar es: $" cantLlantas * 2500
		FinSi
	FinSi
	
FinAlgoritmo

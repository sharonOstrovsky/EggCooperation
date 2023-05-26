//5)Escribir un algoritmo que lea 3 números los cuales significan una fecha (día, mes, año). 
//Comprobar que sea válida la fecha, si no es valido que imprima un mensaje de error, 
//y si es válida imprimir el mes con su nombre.

Algoritmo repaso5_calendario
	
	Definir dia, mes, anio Como Entero
	Escribir "ingrese el dia"
	Leer dia
	Escribir "ingrese el mes"
	Leer mes
	Escribir "ingrese el año"
	Leer anio
	
	segun mes Hacer
		
		1,3,5,7,8,10,12:
			si dia <= 31 Entonces
				si mes == 1 Entonces
					Escribir "ENERO"
				SiNo
					si mes == 3 Entonces
						Escribir "MARZO"
					SiNo
						si mes == 5 Entonces
							Escribir "MAYO"
						SiNo
							si mes == 7 Entonces
								Escribir "JULIO"
							SiNo
								si mes == 8 Entonces
									Escribir "AGOSTO"
								SiNo
									si mes == 10 Entonces
										Escribir "OCTUBRE"
									SiNo
										si mes == 12 Entonces
											Escribir "DICIEMBRE"
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
						
					FinSi
				FinSi
			SiNo
				Escribir "ERROR: fecha no valida"
			FinSi

		2: 
			si ((dia <= 28) O (((anio MOD 4 == 0) Y (anio MOD 100 <> 0) O ((anio MOD 100 == 0) Y (anio MOD 400 == 0))) Y (dia == 29))) Entonces
				Escribir "FEBRERO"
			SiNo
				Escribir "ERROR: fecha no valida"			
			FinSi
			
		4,6,9,11:
			si dia <= 30 Entonces
				si mes == 4 Entonces
					Escribir "MARZO"
				SiNo
					si mes == 6 Entonces
						Escribir "JUNIO"
					SiNo
						si mes == 9 Entonces
							Escribir "SEPTIEMBRE"
						SiNo
							si mes == 11 Entonces
								Escribir "NOVIEMBRE"
							FinSi
						FinSi
					FinSi
				FinSi
			SiNo
				Escribir "ERROR: fecha no valida"
			FinSi
			
	FinSegun
	
FinAlgoritmo

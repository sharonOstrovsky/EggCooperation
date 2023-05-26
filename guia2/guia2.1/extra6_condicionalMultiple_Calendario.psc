//6. Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
//		válida se debe imprimir la fecha cambiando el número que representa el mes por su
//	nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006". 


Algoritmo extra6_condicionalMultiple
	
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
					Escribir dia " de enero de " anio
				SiNo
					si mes == 3 Entonces
						Escribir dia " de marzo de " anio
					SiNo
						si mes == 5 Entonces
							Escribir dia " de mayo de " anio
						SiNo
							si mes == 7 Entonces
								Escribir dia " de julio de " anio
							SiNo
								si mes == 8 Entonces
									Escribir dia " de agosto de " anio
								SiNo
									si mes == 10 Entonces
										Escribir dia " de octubre de " anio
									SiNo
										si mes == 12 Entonces
											Escribir dia " de diciembre de " anio
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
				
					FinSi
				FinSi
			SiNo
				Escribir "ERROR"
			FinSi
			//mayo = 5
			//julio = 7
			//agosto = 8
			//octubre = 10
			//diciembre = 12
		2: 
			//año bisiesto 
//			si (((anio MOD 4 == 0) Y (anio MOD 100 <> 0) O (anio MOD 400 == 0)) Y (dia == 29)) Entonces
//				Escribir dia " de febrero de " anio
//			SiNo
//				Escribir "ERROR"	
//			FinSi
			
			si ((dia <= 28) O (((anio MOD 4 == 0) Y (anio MOD 100 <> 0) O ((anio MOD 100 == 0) Y (anio MOD 400 == 0))) Y (dia == 29))) Entonces
				Escribir dia " de febrero de " anio
			SiNo
				Escribir "ERROR"			
			FinSi
			
		4,6,9,11:
			si dia <= 30 Entonces
				si mes == 4 Entonces
					Escribir dia " de marzo de " anio
				SiNo
					si mes == 6 Entonces
						Escribir dia " de junio de " anio
					SiNo
						si mes == 9 Entonces
							Escribir dia " de septiembre de " anio
						SiNo
							si mes == 11 Entonces
								Escribir dia " de noviembre de " anio
							FinSi
						FinSi
					FinSi
				FinSi
			SiNo
				Escribir "ERROR"
			FinSi
				
			//junio = 6
			//septiembre = 9
			//nombriembre = 11
	FinSegun
	
FinAlgoritmo

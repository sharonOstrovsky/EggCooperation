//3)Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa.


Algoritmo repaso3_capicua
	
	Definir num, primera, ultima Como Real
	Escribir "ingrese un numero de tres cifras"
	Leer num
	// (123 / 100 = 1.23)  -  ((num MOD 100 = 23 ) / 100 = 0.23)
	si (num / 100 > 1) Y (num / 1000 < 1) Entonces
		primera = (num / 100) - ((num MOD 100) / 100) 
		ultima = num MOD 10
	//	Escribir primera
	//	Escribir ultima
		si primera == ultima Entonces
			Escribir "el numero es capicua"
		SiNo
			Escribir "el numero NO es capicua"
		FinSi
	SiNo
		Escribir "el numero no es de tres cifras"
	FinSi
	
FinAlgoritmo

Funcion retorno <- esCapicua ( num Por Valor)
	Definir retorno Como Logico
	Definir num2, espejo Como Entero
	
	num2 = num
	espejo = 0
	
	Mientras num2 <> 0 Hacer
		espejo = (espejo * 10) + num2%10
		num2 = trunc(num2/10)
	FinMientras
	
	retorno = num == espejo
Fin Funcion


Algoritmo ejercicio_18
	Definir num Como Entero
	
	Escribir "Ingresar un número: "Sin Saltar
	leer num
	
	Si esCapicua(num) Entonces
		Escribir "Es capicúa."	
	SiNo
		Escribir "No es capicúa."
	FinSi
	//	
	//	Si esCapicua(12345) Entonces
	//		Escribir "Es capicúa."
	//	SiNo
	//		Escribir "No es capicúa."
	//	FinSi
	//	
	//	Si esCapicua(1234554321) Entonces
	//		Escribir "Es capicúa."
	//	SiNo
	//		Escribir "No es capicúa."
	//	FinSi
	//	
	//	Si esCapicua(1235321) Entonces
	//		Escribir "Es capicúa."
	//	SiNo
	//		Escribir "No es capicúa."
	//	FinSi
	
	
FinAlgoritmo

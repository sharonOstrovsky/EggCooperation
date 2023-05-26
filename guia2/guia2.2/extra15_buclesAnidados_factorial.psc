//15. La función factorial se aplica a números enteros positivos. El factorial de un número entero
//positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
//	n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
//	Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
//hasta el 5. El programa deberá mostrar la siguiente salida:
//	!1 = 1
//	!2 = 1*2 = 2
//	...
//	!5 = 1*2*3*4*5 = 120

Algoritmo extra15_buclesAnidados
	
	Definir i, j,n , factorial Como Entero
	Definir todos, string Como Caracter
	
	Escribir "ingrese un numero "
	Leer n
	
	factorial = 1
	todos = ""
	Para j = 1 Hasta n Hacer
		Para i = 1 Hasta j Hacer
			factorial = factorial * i
			string = ConvertirATexto(i)
			todos = todos + " * " + string
			si(i==1) Entonces
				todos = "1"
			FinSi
		FinPara
		Escribir "!" j " = " todos " = " factorial
		factorial = 1
		todos = ""
	FinPara
	
FinAlgoritmo




//Proceso factorial 
//	Definir i,n, resultado Como Entero
//	Definir caden, todos Como Caracter
//	Escribir 'Defina el numero del facotorial'
//	leer n
//	resultado= 1
//	todos = ""
//	Para i=1 Hasta n Hacer
//		resultado = resultado * i
//		caden = ConvertirATexto(i) 
//		todos = todos +'*'+ caden
//		si(i==1) Entonces
//			todos = '1'
//		FinSi
//		Escribir '!',i, '=', todos ,'=' ,resultado 
//	FinPara
//	
//FinProceso


//5. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.


Algoritmo ej5_bucleHacerMientrasQue
	
	Definir num, maximo, minimo, suma, aux, i Como Entero
	Definir promedio Como Real

	Escribir "ingrese un numero entero. finaliza ingresando 0(cero)"
	Leer num
	minimo = num
	maximo = num
	i = 1
	suma = 0
	
	Hacer
		suma = num + suma
		promedio = suma / i 
		i = i + 1
		aux = num

		si aux <= minimo Entonces
		minimo = aux
		SiNo
			si aux >= maximo Entonces
				maximo = aux
			FinSi
			
		FinSi
		
		Escribir "ingrese un numero entero. finaliza ingresando 0(cero)"
		Leer num
		
	Mientras Que num <> 0
	
	Escribir "maximo: " maximo
	Escribir "minimo: " minimo
	Escribir "promedio: " promedio
	
FinAlgoritmo

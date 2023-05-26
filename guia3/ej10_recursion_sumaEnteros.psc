//10. Escribir una función recursiva que devuelva la suma de los primeros N enteros


Algoritmo ej10_recursion
	
	Definir num,  suma Como Entero
	Escribir "ingrese un numero entero"
	Leer num
	
	suma = sumaEnteros(num)
	
	Escribir "la suma de los primeros " num " enteros es " suma
	
FinAlgoritmo

Funcion suma <- sumaEnteros(num)
	Definir suma Como Entero
	si num = 1 Entonces
		suma = 1
	SiNo
		suma = num + sumaEnteros(num - 1)
	FinSi
FinFuncion


	
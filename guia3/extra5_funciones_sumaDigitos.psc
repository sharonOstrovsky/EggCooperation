//5. Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//		resto de una división entre 10. Recordar el uso de la función Mod y Trunc.


Algoritmo extra5_funciones
	
	Definir num Como Entero
	
	num = 25
	Escribir sumaDigitos(num)
	num = 1234
	Escribir sumaDigitos(num)
	
FinAlgoritmo

Funcion suma <- sumaDigitos(num Por Valor)
	
	Definir suma Como Entero
	suma = 0
	
	Mientras num <> 0 Hacer
		suma = suma + (num MOD 10)
		num = trunc(num/10)
	FinMientras
	
FinFuncion
	
//5. Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//		resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.


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
	
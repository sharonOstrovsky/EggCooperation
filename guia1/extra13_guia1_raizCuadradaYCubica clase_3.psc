//13)Realizar un algoritmos que lea un n�mero y que muestre su ra�z cuadrada y su ra�z c�bica.
//PSeInt no tiene ninguna funci�n predefinida que permita calcular la ra�z c�bica, �C�mo se puede calcular?

Proceso extra13_guia1_raizCuadradaYCubica
	Definir num, raizCuadrada, raizCubica Como Real
	Escribir "ingrese un numero"
	Leer num
	raizCuadrada <- raiz(num)
	raizCubica <- num ^ (1 / 3)
	
	Escribir "la raiz cuadrada es: " raizCuadrada " y la raiz cubica es: " raizCubica
	
FinProceso

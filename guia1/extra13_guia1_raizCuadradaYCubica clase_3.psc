//13)Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
//PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se puede calcular?

Proceso extra13_guia1_raizCuadradaYCubica
	Definir num, raizCuadrada, raizCubica Como Real
	Escribir "ingrese un numero"
	Leer num
	raizCuadrada <- raiz(num)
	raizCubica <- num ^ (1 / 3)
	
	Escribir "la raiz cuadrada es: " raizCuadrada " y la raiz cubica es: " raizCubica
	
FinProceso

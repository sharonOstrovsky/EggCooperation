//1.Implementar una funci�n que permita obtener un n�mero entero aleatorio comprendido entre dos l�mites que introduciremos por teclado.
//El n�mero obtenido se debe mostrar por pantalla.

Algoritmo repaso1
	
	Definir min,max Como Entero
	Escribir "ingrese el limite inferior "
	Leer min
	Escribir "ingrese el limite superior"
	Leer max
	Escribir "el numero obtenido aleatorio es: " obtenerNumAleatorio(min,max)
	
FinAlgoritmo

Funcion numAleatorio <- obtenerNumAleatorio(min,max)
	Definir numAleatorio Como Entero
	numAleatorio = Aleatorio(min, max)
FinFuncion
	
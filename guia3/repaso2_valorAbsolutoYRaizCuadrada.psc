//2. Implementar una funci�n que permita obtener el valor absoluto de un n�mero y otra que obtenga la ra�z cuadrada. 
//Para ello utilice las funciones abs() y rc() de PseInt.

Algoritmo repaso2_valorAbsolutoYRaizCuadrada
	
	Definir num Como Entero
	num = 144
	Escribir calcularRaizCuadrada(num)
	Escribir calcularValorAbsoluto(num)
	
FinAlgoritmo

Funcion valorAbsoluto <- calcularValorAbsoluto(num)
	Definir valorAbsoluto Como Entero
	valorAbsoluto = abs(num)
FinFuncion

Funcion raizcuadrada <- calcularRaizCuadrada(num)
	Definir raizcuadrada Como Real
	raizcuadrada = rc(num)
FinFuncion
	
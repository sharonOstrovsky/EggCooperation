//2. Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
//		mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
//

Algoritmo ej2_funcion
	
	Definir num Como Entero
	Definir resultado Como Logico
	Escribir "ingrese un numero"
	Leer num
	
	resultado = parImpar(num)
	
	si resultado == Verdadero Entonces
		Escribir "el numero " num " es PAR"
	SiNo
		Escribir "el numero " num " es IMPAR"
	FinSi
	
FinAlgoritmo

Funcion resultado <- parImpar(num por referencia)
	
	Definir resultado Como Logico
	si	num MOD 2 == 0 Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
	
FinFuncion
	
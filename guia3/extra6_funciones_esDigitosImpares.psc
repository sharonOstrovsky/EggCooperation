//6. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//	Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//	realizar el ejercicio.


Algoritmo extra6_funciones
	
	Definir num Como Entero
	Escribir "ingrese un numero"
	Leer num
	
	si esDigitosImpares(num) Entonces
		Escribir "VERDADERO"
	SiNo
		Escribir "FALSO"
	FinSi
FinAlgoritmo

Funcion respuesta <- esDigitosImpares(num)
	Definir respuesta Como Logico
	respuesta = Verdadero
	Mientras num <> 0 Y respuesta == Verdadero Hacer
		si (num MOD 10) MOD 2 <> 0 Entonces
			respuesta = Verdadero
		SiNo
			respuesta = Falso
		FinSi
		num = trunc(num / 10)
	FinMientras
FinFuncion
	
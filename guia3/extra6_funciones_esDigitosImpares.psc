//6. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//	Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
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
	
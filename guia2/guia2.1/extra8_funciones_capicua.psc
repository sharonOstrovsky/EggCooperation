//8. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//	transformar el numero a cadena para realizar el ejercicio.

Algoritmo extra8_funciones_capicua
	
	Definir num Como Entero
	Definir resultado Como Logico
	
	Escribir "ingrese un numero"
	Leer num
	
	resultado = esCapicua(num)
	
	Escribir "el numero es capicua? " resultado 
	
FinAlgoritmo

Funcion resultado <- esCapicua(num Por Referencia)
	Definir resultado Como Logico
	Definir contador, invertido, i Como Entero
	Definir aux, cuentaUltimo, ultimo, cuentaPrimero Como Real
	
	contador = 0
	cuentaUltimo = 1
	cuentaPrimero = 0.1
	invertido = 0
	aux = num
	
	Mientras aux > 1 Hacer
		aux = aux / 10
		//		Escribir aux
		contador = contador + 1
		cuentaPrimero = cuentaPrimero * 10
	FinMientras
//	Escribir contador
//1234321
	aux = num
	para i = 1 Hasta contador  Hacer
		ultimo = trunc(( (num MOD (cuentaUltimo * 10)) - (num MOD cuentaUltimo) ) /cuentaUltimo)
		cuentaUltimo = cuentaUltimo * 10
//		Escribir "ultimo " ultimo
		
		invertido = invertido + (ultimo * cuentaPrimero)
//		Escribir "invertido " invertido
		cuentaPrimero = cuentaPrimero / 10
	FinPara
	
	Escribir "invertido " invertido
	
	si invertido == num Entonces
		resultado = Verdadero
	sino
		resultado = Falso
	FinSi

FinFuncion
	
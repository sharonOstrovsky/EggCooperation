//3. Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//	múltiplo del segundo, sino es múltiplo que devuelva falso.

Algoritmo ej3_funciones
	
	Definir num1, num2 Como Entero
	Definir resultado Como Logico
	Escribir "ingrese un numero"
	Leer num1
	Escribir "ingrese otro numero"
	Leer num2
	
	resultado = EsMultiplo(num1, num2)
	
	si resultado == Verdadero Entonces
		Escribir num1 " es multiplo de " num2
	SiNo
		Escribir num1 " no es multiplo de " num2
	FinSi
	
FinAlgoritmo

Funcion resultado <- EsMultiplo (num1 Por Referencia, num2 Por Referencia)
	
	Definir resultado Como Logico
	
	si num2 MOD num1 == 0 Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
	
FinFuncion

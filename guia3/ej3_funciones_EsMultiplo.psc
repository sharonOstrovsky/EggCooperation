//3. Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//	m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.

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

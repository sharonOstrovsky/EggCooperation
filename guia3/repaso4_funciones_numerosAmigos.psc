//4. Dos números son amigos si cada uno de ellos es igual a la suma de los divisores del otro.
//Por ejemplo 220 y 284 son amigos ya que: 
//Suma de divisores de 284= 1 + 2 + 4 + 71 + 142 = 220 
//Suma de divisores de 220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 
//Diseñe un algoritmo que a través del uso de una función determine si dos números ingresados por el usuario son amigos o no


Algoritmo repaso4_funciones_numerosAmigos
	
	Definir num1, num2 Como Entero
	Escribir "ingrese un numero"
	Leer num1
	Escribir "ingrese otro numero"
	Leer num2
	
	si esNumerosAmigos(num1,num2) Entonces
		Escribir "los numeros " num1 " Y "  num2 " son amigos"
	SiNo
		Escribir "los numeros " num1 " Y "  num2 " NO son amigos"
	FinSi
	
FinAlgoritmo

Funcion amigos <- esNumerosAmigos(num1,num2)
	Definir amigos Como Logico
	si sumaDivisores(num1) == num2 Y sumaDivisores(num2) == num1 Entonces
		amigos = Verdadero
	SiNo
		amigos = Falso
	FinSi
FinFuncion

Funcion suma <- sumaDivisores(num)
	Definir suma, i Como Entero
	suma = 0
	
	Para i = 1 Hasta num - 1 Hacer
		si num MOD i == 0 Entonces
			suma = suma + i
		FinSi
	FinPara
FinFuncion
//3. Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
//	impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares" siempre
//	y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el siguiente
//	mensaje "Los n�meros no son pares, o uno de ellos no es par".

Algoritmo extra3_condicionalDoble
	Definir  num1, num2 Como Entero
	Escribir "ingrese un numero"
	Leer num1
	Escribir "ingrese otro numero"
	Leer num2
	
	si (num1 MOD 2 == 0 Y num2 MOD 2 == 0) Entonces
		Escribir "Ambos numero son pares"
	SiNo
		si (num1 MOD 2 == 0 O num2 MOD 2 == 0) Entonces
			Escribir "uno de ellos no es par"
		SiNo
			Escribir "los numeros no son pares"
		FinSi
	FinSi
	
FinAlgoritmo

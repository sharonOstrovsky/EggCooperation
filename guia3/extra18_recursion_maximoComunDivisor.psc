//18. Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros positivos. Si
//M >= N una función recursiva para MCD es:
//		MCD = M, si N =0
//			MCD = MCD (N, M mod N), si N <> 0
//El programa le debe permitir al usuario ingresar los valores para M y N. Una función recursiva
//	es entonces llamada para calcular el MCD. El programa debe imprimir el valor para el MCD. 

Algoritmo extra18_recursion_maximoComunDivisor
	Definir N , M Como Entero
	N= 6
	M = 9
	si M >= N Entonces
		Escribir calculoMCD(M, N)
	FinSi
	
FinAlgoritmo

Funcion MCD <- calculoMCD(M,N)
	Definir MCD Como Entero
	si N = 0 Entonces
		MCD = M
	SiNo
		MCD = calculoMCD(N,M mod N)
	FinSi
	
FinFuncion
	
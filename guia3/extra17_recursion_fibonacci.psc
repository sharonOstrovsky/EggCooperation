//17. Realice nuevamente un programa que calcule la función de Fibonacci, pero esta vez de
//manera recursiva.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
Algoritmo extra17_recursion_fibonacci
	
	Definir n,fibonacci,i Como Entero
	n = 12
	
//	Escribir calculoFibonacci(n)
	
	Para i = 0 Hasta n Hacer
		Escribir calculoFibonacci(i)
	FinPara
	
FinAlgoritmo

//(0+1=1 / 1+1=2 / 1+2=3 / 2+3=5 / 3+5=8 / 5+8=13...)
Funcion fibonacci <- calculoFibonacci (n)
	
	Definir fibonacci Como Entero
	
	si n == 1 O n == 2 Entonces
		fibonacci = 1
	SiNo
		si n == 0 Entonces
			fibonacci = 0 
		SiNo
			fibonacci = calculoFibonacci(n-1)+calculoFibonacci(n-2)
		FinSi

	FinSi


FinFuncion
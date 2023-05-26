//8. Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
//ingresará diez números

Algoritmo extra8_bucleHacerMientrasQue
	
	Definir num, par, impar, total Como Entero
//	Escribir "ingrese un numero"
	total = 0
	par = 0
	impar = 0
	
	Hacer
		Escribir "ingrese un numero"
		Leer num	
		si num MOD 2 == 0 Entonces
			par = par +1
			total = total + 1
		SiNo
			impar = impar + 1
			total = total + 1
		FinSi
	Mientras Que total < 10
	
	Escribir par * 100 / total "% pares"
	Escribir impar * 100 / total "% impares"
	
FinAlgoritmo

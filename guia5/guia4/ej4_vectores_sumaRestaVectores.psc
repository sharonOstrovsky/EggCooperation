//4. Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.


Algoritmo ej4_vectores
	Definir vectorA, vectorB,vectorC, N Como Entero
	Escribir "ingrese la longitud para todos los vectores"
	Leer N
	Dimension vectorA[N]
	Dimension vectorB[N]
	Dimension vectorC[N]
	menu(vectorA, vectorB, vectorC, N)
FinAlgoritmo

SubProceso menu(vectorA Por Referencia, vectorB Por Referencia, vectorC Por Referencia, N)
	Definir continuar Como Logico
	Definir letra, Mostrarletra Como Caracter
	Definir i Como Entero
	continuar = Verdadero
	Hacer
		Escribir "A. Llenar Vector A de manera aleatoria"
		Escribir "B. Llenar Vector B de manera aleatoria"
		Escribir "C. Llenar Vector C con la suma de los vectores A y B"
		Escribir "D. Llenar Vector C con la resta de los vectores B y A"
		Escribir "E. Mostrar"
		Escribir "F. Salir"
		Leer letra
		Segun Mayusculas(letra) Hacer
			'A':
				Para i = 0 Hasta N - 1 Hacer
					vectorA[i] = Aleatorio(-100,100)
				FinPara
			'B':
				Para i = 0 Hasta N - 1 Hacer
					vectorB[i] = Aleatorio(-100,100)
				FinPara
			'C':
				Para i = 0 Hasta N - 1 Hacer
					vectorC[i] = vectorA[i] + vectorB[i]
				FinPara
			'D':
				Para i = 0 Hasta N - 1 Hacer
					vectorC[i] = vectorB[i] - vectorA[i]
				FinPara
			'E':
				Escribir "¿Que vector desea mostrar? A, B o C"
				Leer Mostrarletra
				si Mayusculas(Mostrarletra) == 'A' Entonces
					imprimirVector(vectorA, N)
					Escribir ""
				SiNo
					si Mayusculas(Mostrarletra) == 'B' Entonces
						imprimirVector(vectorB, N)
						Escribir ""
					SiNo
						si Mayusculas(Mostrarletra) == 'C' Entonces
							imprimirVector(vectorC, N)
							Escribir ""
						FinSi
					FinSi
				FinSi
			'F':
				continuar = Falso
				
				
		FinSegun
	Mientras Que continuar
	
FinSubProceso


SubProceso imprimirVector(vector Por Referencia, N)
	Definir i Como Entero
	Escribir Sin Saltar "Vector = [ "
	para i = 0 Hasta N - 1 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
	Escribir " ]"
	
FinSubProceso
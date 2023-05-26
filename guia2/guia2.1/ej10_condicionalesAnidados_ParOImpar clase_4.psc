//10. Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
//Nota: investigar la función mod de PSeInt

Algoritmo ej10_condicionalesAnidados
	
	Definir num Como Entero
	Escribir "ingrese un numero entero"
	Leer num
	si num == 0 Entonces
		Escribir "El numero " num " no es par ni impar"
	sino
		si num MOD 2 == 0 Entonces
			Escribir "el numero " num " es PAR"
		SiNo
			Escribir "el numero " num " es IMPAR"
		FinSi
	FinSi
	
FinAlgoritmo

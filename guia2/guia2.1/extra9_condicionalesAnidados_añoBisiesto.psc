//9. Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//	bisiesto. Nota: recuerde la función mod de PseInt

Algoritmo extra9_condicionalesAnidados
	
	Definir anio Como Entero
	Escribir "ingrese un año"
	Leer anio
	
	si (((anio MOD 4 == 0) Y (anio MOD 100 <> 0)) O ((anio MOD 100 == 0) Y (anio MOD 400 == 0))) Entonces
		Escribir "El año " anio " es bisiesto"
	SiNo
		Escribir "El año " anio " no es bisiesto"
	FinSi
	
FinAlgoritmo

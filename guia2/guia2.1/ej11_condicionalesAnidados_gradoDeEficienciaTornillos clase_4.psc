//11. Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
//	tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
//	de prueba:
//		? Producir menos de 200 tornillos defectuosos.
//		? Producir m�s de 10000 tornillos sin defectos.
// El grado de eficiencia se determina de la siguiente manera:
//		? Si no cumple ninguna de las condiciones, grado 5.
//			? Si s�lo cumple la primera condici�n, grado 6.
//				? Si s�lo cumple la segunda condici�n, grado 7.
//					? Si cumple las dos condiciones, grado 8
//Nota: para trabajar este ejercicio de manera prolija, ir probando o cada inciso que pide el
//ejercicio. No hacer todos al mismo tiempo y despu�s probar.

Algoritmo ej11_condicionalesAnidados
	Definir tornillosDefectuosos, tornillosSinDefectos Como Entero
	Escribir "ingrese la cantidad de tornillos defectuosos"
	Leer tornillosDefectuosos
	Escribir "ingrese la cantidad de tornillos sin defectos"
	Leer tornillosSinDefectos
	
	si (tornillosDefectuosos >= 200 Y tornillosSinDefectos <= 10000) Entonces
		Escribir "El grado de eficiencia es: GRADO 5"
	SiNo
		si (tornillosDefectuosos <= 200 Y tornillosSinDefectos <= 10000) Entonces
			Escribir "El grado de eficiencia es: GRADO 6"
		SiNo
			si (tornillosDefectuosos >= 200 Y tornillosSinDefectos >= 10000) Entonces
				Escribir "El grado de eficiencia es: GRADO 7"
			SiNo
				Escribir "El grado de eficiencia es: GRADO 8"
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo

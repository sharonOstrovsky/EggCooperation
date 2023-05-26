//3. Realizar un programa que pida un número y determine si ese número es par o impar.
//	Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
//		número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
//			la función mod de PseInt.

Proceso ej3_condicionalDoble
	Definir num Como Entero
	Escribir "ingrese un numero"
	Leer num
	si num MOD 2 == 0 Entonces
		Escribir "el numero es PAR"
	SiNo
		Escribir "el numero es IMPAR"
	FinSi
	
FinProceso

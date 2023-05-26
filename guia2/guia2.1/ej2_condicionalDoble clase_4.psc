//2. Realiza un programa que sólo permita introducir los caracteres 'S' y 'N'. Si el usuario
//	ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que
//	diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".

Proceso ej2_condicionalDoble
	Definir carac Como Caracter
	Escribir "ingrese el caracter S o N" 
	Leer carac
	si carac == 'S' O carac == 'N' Entonces
		Escribir "CORRECTO"	
	sino 
		Escribir "INCORRECTO"
	FinSi
	
FinProceso

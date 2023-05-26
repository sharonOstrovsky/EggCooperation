//6. Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
//		entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
//			ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
//				variable de tipo lógico.

Proceso ej6_condicionalDoble
	Definir nota1,nota2,nota3 Como Real
	Definir aux Como Logico
	Escribir "ingrese la primer nota"
	Leer nota1
	Escribir "ingrese la segunda nota"
	Leer nota2
	Escribir "ingrese la tercer nota"
	Leer nota3
	si (1<=nota1 Y nota1<=10) Y (nota2>=1 Y nota2<=10) Y (nota3>=1 Y nota3<=10) Entonces
		aux <- Verdadero
	sino 
		aux <- Falso
		
	FinSi
	Escribir "las tres notas son " aux
FinProceso

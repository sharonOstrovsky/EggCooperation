//7. Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.


Algoritmo ej7_procedimientos
	Definir dias,i Como Entero
	Definir temperaturaMedia Como Real
	
	Escribir "ingrese la cantidad de dias"
	Leer dias
	
	Para i = 1 Hasta dias Hacer
		calculoTemperaturaMedia(temperaturaMedia)
		Escribir i " Temperatura Media: " temperaturaMedia
	FinPara
	
FinAlgoritmo

SubProceso calculoTemperaturaMedia(temperaturaMedia Por Referencia)
	Definir maxima, minima Como Real
	Escribir "ingrese la temperatura maxima"
	Leer maxima
	Escribir "ingrese la temperatura minima"
	Leer minima
	temperaturaMedia = (maxima + minima) / 2

FinSubProceso

//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l fue el
//porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla. 

Algoritmo ejercicio_5
	Definir precioInicio, precioFin Como Real
	Escribir "ingrese el precio del producto al inicio del a�o"
	Leer precioInicio
	Escribir "ingrese el precio del producto al finalizar el a�o"
	Leer precioFin
	Escribir "El porcentaje de aumento que tuvo ese producto en el a�o es " ((precioFin - precioInicio) / precioInicio ) * 100 "%"
	
FinAlgoritmo

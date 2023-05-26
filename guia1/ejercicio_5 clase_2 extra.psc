//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla. 

Algoritmo ejercicio_5
	Definir precioInicio, precioFin Como Real
	Escribir "ingrese el precio del producto al inicio del año"
	Leer precioInicio
	Escribir "ingrese el precio del producto al finalizar el año"
	Leer precioFin
	Escribir "El porcentaje de aumento que tuvo ese producto en el año es " ((precioFin - precioInicio) / precioInicio ) * 100 "%"
	
FinAlgoritmo

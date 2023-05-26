//·PARTE 1: Crea un programa que pida una frase al usuario y diga cuantas palabras contiene. 
//(Ayudita! los espacios podrían funcionar como advertencia para los cortes de palabras)
//	
//·PARTE 2: Crea un programa que pida al usuario su nombre y apellido y los muestre escritos de la forma correcta 
//(Primera letra en mayúsculas, y el resto en minúscula. 
//Siempre debemos pensar que el usuario puede ingresar los datos de una forma distinta a la que yo deseaba que lo hiciera)


Algoritmo repaso1y2
	//PARTE 1
	Definir frase Como Caracter
	Escribir "ingrese una frase"
	Leer frase
	Escribir "cantidad de palabras = " cantPalabras(frase)
	//---------------
	//PARTE 2
	Definir nombre, apellido Como Caracter
	Escribir "ingrese nombre"
	Leer nombre
	Escribir "ingrese apellido"
	Leer apellido
	mostrarNombreCorrecto(nombre,apellido)
FinAlgoritmo

Funcion palabras <- cantPalabras(frase)
	Definir i, palabras Como Entero
	palabras = 1
	Para i = 0 Hasta Longitud(frase) - 1 Hacer
		si Subcadena(frase,i,i) == " " Entonces
			palabras = palabras + 1
		FinSi
	FinPara
FinFuncion

SubAlgoritmo mostrarNombreCorrecto(nombre, apellido)
	Escribir Mayusculas(Subcadena(nombre,0,0)) Subcadena(nombre,1,Longitud(nombre)-1) " " Mayusculas(Subcadena(apellido,0,0)) Subcadena(apellido,1,Longitud(apellido)-1)
	
FinSubAlgoritmo

	
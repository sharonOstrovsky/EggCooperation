//4. Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//	función Subcadena().

Algoritmo ej4_funciones
	
	Definir frase, letra Como Caracter
	Escribir "ingrese una frase"
	Leer frase
	Escribir "ingrese la letra a buscar"
	Leer letra
	
	Escribir "cant veces: " buscarLetra(frase, letra)
	
	
FinAlgoritmo

Funcion contador <- buscarLetra (frase Por Referencia, letra Por Referencia)
	Definir contador, tam, i Como Entero
	contador = 0
	tam = Longitud(frase)
	Para i = 0 Hasta tam Hacer
		si Subcadena(frase,i,i) == letra Entonces
			contador = contador + 1
		FinSi
	FinPara
	
FinFuncion

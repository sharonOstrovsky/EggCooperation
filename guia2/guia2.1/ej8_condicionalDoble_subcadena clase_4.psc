//8. Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
//primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
//"INCORRECTO"

Algoritmo ej8_condicionalDoble_subcadena
	Definir frase, primera, ultima Como Caracter
	Definir longitudFrase Como Entero
	Escribir "ingrese una frase o palabra"
	Leer frase
	primera = subcadena(frase,0,0)
	//Escribir primera
	longitudFrase = Longitud(frase)
	ultima = Subcadena(frase, longitudFrase - 1, longitudFrase -1) 
	//Escribir ultima
	si primera == ultima Entonces
		Escribir "CORRECTO"
	sino 
		Escribir "INCORRECTO"
	FinSi
FinAlgoritmo

//10. Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.


Algoritmo extra10_procedimientos
	
	Definir textos Como Caracter
	
	textos = "hola, tu"
	
	convertirEspaciado(textos)
	
FinAlgoritmo

SubProceso convertirEspaciado(textos)
	
	Definir tam, i Como Entero
	tam = Longitud(textos)
	Para i = 0 Hasta tam Hacer
		Escribir Sin Saltar concatenar(Subcadena(textos,i,i)," ")
	FinPara
	
	
	
FinSubProceso
	
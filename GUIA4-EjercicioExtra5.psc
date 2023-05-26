Algoritmo sin_titulo
//	. Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//	un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//	posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//	o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//		en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//		más cercano.
	Definir vector, frase, caract Como Caracter
	Definir posicion Como Entero
	Dimension vector(20)
	Escribir "ingresar frase de hasta 20 caracteres"
	leer frase
	convertir(vector, frase)
	Escribir "introducir un caracter"
	leer caract
	Escribir "en que posicion lo queres incorporar?"
	leer posicion
	agregado(vector,caract,posicion)
FinAlgoritmo

SubProceso convertir(vector, frase)
	Definir i Como Entero
	para i<-0 Hasta 19 Hacer
		vector(i)=Subcadena(frase,i,i)
	FinPara
FinSubProceso

SubProceso agregado(vector,caract,posicion)
	Definir i, izq, der Como Entero
	der=posicion
	izq=posicion
	si vector(posicion)<"z" y vector(posicion)>"a" Entonces
		hacer 
			izq=izq-1
			der=der+1
		Mientras Que vector(izq)<>" " y vector(der)<>" " 
		si vector(izq)=" " Entonces
			para i <-0 Hasta izq-1 Hacer
				Escribir "[" vector(i) "]" Sin Saltar
			FinPara
			Escribir "[" caract "]" Sin Saltar
			para i <-izq Hasta 18 Hacer
				Escribir "[" vector(i) "]" Sin Saltar
			FinPara
		FinSi
		si vector(der)=" " Entonces
			para i <-0 Hasta posicion-1 Hacer
				Escribir "[" vector(i) "]" Sin Saltar
			FinPara
			Escribir "[" caract "]" Sin Saltar
			para i <-posicion Hasta 18 Hacer
				Escribir "[" vector(i) "]" Sin Saltar
			FinPara
		FinSi
		
	SiNo
		Escribir "el vector queda asi:"
		vector(posicion)=caract
		para i <-0 Hasta 19 Hacer
			Escribir "[" vector(i) "]" Sin Saltar
		FinPara
	FinSi
FinSubProceso



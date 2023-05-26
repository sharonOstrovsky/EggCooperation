//9. Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	a e i o u
//	@ # $ % *
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//	correspondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//		La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//		NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.


Algoritmo ej9_procedimientos
	Definir frase Como Caracter
	Escribir "ingrese una frase terminada en un punto"
	Leer frase
	codificarFrase(frase)
	Escribir frase
FinAlgoritmo


//OPCION1
SubProceso codificarFrase (frase Por Referencia)
	
	Definir tam,i Como Entero
	Definir aux,caract Como Caracter
	tam = Longitud(frase)
	
	para i = 0 Hasta tam Hacer
		caract = Subcadena(frase, i,i)
		Segun caract Hacer
			'a':
				aux = Concatenar(Subcadena(frase,0,i-1),'@')
				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
			'e':
				aux = Concatenar(Subcadena(frase,0,i-1),'#')
				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
			'i':
				aux = Concatenar(Subcadena(frase,0,i-1),'$')
				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
			'o':
				aux = Concatenar(Subcadena(frase,0,i-1),'%')
				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
			'u':
				aux = Concatenar(Subcadena(frase,0,i-1),'*')
				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
		FinSegun
	FinPara
	
FinSubProceso



//OPCION2

//SubProceso codificarFrase (frase Por Referencia)
//	
//	Definir i, tam Como Entero
//	Definir aux,caract Como Caracter
//	tam = Longitud(frase)
//	i=0
//	Hacer
//		caract = Subcadena(frase, i,i)
//		
//		Segun caract Hacer
//			'a':
//				aux = Concatenar(Subcadena(frase,0,i-1),'@')
//				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
//			'e':
//				aux = Concatenar(Subcadena(frase,0,i-1),'#')
//				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
//			'i':
//				aux = Concatenar(Subcadena(frase,0,i-1),'$')
//				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
//			'o':
//				aux = Concatenar(Subcadena(frase,0,i-1),'%')
//				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
//			'u':
//				aux = Concatenar(Subcadena(frase,0,i-1),'*')
//				frase = Concatenar(aux, Subcadena(frase, i+1, tam))
//		FinSegun
//		i= i+1
//
//	Mientras Que caract <> '.'
//	
//	
//FinSubProceso





//OTRA FORMA
//Algoritmo Ejercicio9conSegun
//	Definir frase Como Caracter
//	Escribir "ingrese una frase"
//	Leer frase
//	cambiarFrase(frase)
//FinAlgoritmo
//
//SubProceso cambiarFrase(frase)
//	Definir i Como Entero
//	
//	Definir x Como Caracter
//	
//	
//	Para i = 0 Hasta Longitud(frase) Hacer
//		x = Subcadena (frase,i,i)
//		Segun  x hacer
//			"a" :
//				x = "@"
//				
//			"e":
//				x = "#"
//				
//			"i":
//				x = "$"
//				
//			"o":
//				x = "%"
//				
//			"u":
//				x = "*"
//		FinSegun
//		
//		Escribir Sin Saltar x 
//	FinPara
//FinSubProceso

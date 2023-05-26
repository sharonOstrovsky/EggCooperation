Funcion Solufrase <- delete(frase, letra)
	definir elemento Como Caracter
	Para i= 0 hasta longitud(frase)-1 Hacer
		elemento = Subcadena(frase,i,i)
		si elemento == letra Entonces
			elemento = ' '
		FinSi
		Solufrase = Concatenar(Solufrase, elemento)
	FinPara
FinFuncion



Funcion solu <- borrarInvertidas(frase)
	Definir vocalA,vocalE,vocalI,vocalO,vocalU,i como entero
	Definir bool Como logico
	Para i= 0 hasta longitud(frase)-1 Hacer
		segun Subcadena(frase,i,i)
			'a':
				vocalA = vocalA+1
			'e': 
				vocalE = vocalE +1
			'i':
				vocalI = vocalI+1
			'o': 
				vocalO = vocalO+1
			'u':
				vocalU= vocalU+1
			 
		FinSegun
	FinPara
	si (vocalA > 1) Entonces
		solu = delete(frase,'a')
	FinSi
	si vocalE >1 entonces 
		solu = delete(frase,'e')	
	FinSi
	si vocalI>1 entonces 
		solu = delete(frase,'i')		
	FinSi
	si vocalO >1 Entonces
		solu = delete(frase,'o')	
	FinSi
	si vocalU > 1 Entonces
		solu = delete(frase,'u')	
			
	FinSi
	
	
FinFuncion



Proceso G3EE13
	Definir frase, solu Como Caracter
	Escribir 'Ingrese una frase'
	Leer frase
	solu = borrarInvertidas(frase)
	Escribir 'Tu frase es: ', solu
	
FinProceso

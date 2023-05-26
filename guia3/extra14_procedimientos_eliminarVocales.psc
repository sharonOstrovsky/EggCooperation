//14. Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//repetidas. Al final el procedimiento mostrará la frase final.

Algoritmo extra14_procedimientos
	
	Definir frase Como Caracter
	frase = "hola como estas"
	eliminarVocales(frase)

FinAlgoritmo

SubProceso eliminarVocales(frase)
	Definir i, j, tam, vocalA, vocalE, vocalI, vocalO, vocalU Como Entero
	
	tam = Longitud(frase)
	vocalA = 0
	vocalE = 0
	vocalI = 0
	vocalO = 0
	vocalU = 0
	
	Para i = 0 Hasta tam Hacer
		Segun Minusculas(subcadena(frase,i,i)) Hacer
			'a':
				vocalA = vocalA + 1
			'e':
				vocalE = vocalE + 1
			'i':
				vocalI = vocalI + 1
			'o':
				vocalO = vocalO + 1
			'u':
				vocalU = vocalU + 1
		FinSegun
	FinPara
	
	para j = 0 Hasta tam Hacer
		si vocalA > 1 Y Minusculas(Subcadena(frase,j,j)) == 'a' Entonces
			frase = concatenar(Subcadena(frase,0,j-1),Subcadena(frase,j+1,tam))
		SiNo
			si vocalE > 1 Y Minusculas(Subcadena(frase,j,j)) == 'e' Entonces
				frase = concatenar(Subcadena(frase,0,j-1),Subcadena(frase,j+1,tam))
			sino
				si vocalI > 1 Y Minusculas(Subcadena(frase,j,j)) == 'i' Entonces
					frase = concatenar(Subcadena(frase,0,j-1),Subcadena(frase,j+1,tam))
				SiNo
					si vocalO > 1 Y Minusculas(Subcadena(frase,j,j)) == 'o' Entonces
						frase = concatenar(Subcadena(frase,0,j-1),Subcadena(frase,j+1,tam))
					SiNo
						si vocalU > 1 Y Minusculas(Subcadena(frase,j,j)) == 'u' Entonces
							frase = concatenar(Subcadena(frase,0,j-1),Subcadena(frase,j+1,tam))
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara

	Escribir frase
FinSubProceso

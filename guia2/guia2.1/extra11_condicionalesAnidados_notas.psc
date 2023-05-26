//11. El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.

Algoritmo extra11_condicionalesAnidados
	
	Definir nota1, nota2, nota3, nota4, notaMenor, promedio Como Real
	Escribir "ingrese una nota"
	Leer nota1
	Escribir "ingrese una nota"
	Leer nota2
	Escribir "ingrese una nota"
	Leer nota3
	Escribir "ingrese una nota"
	Leer nota4
	
	
	si (nota1 < nota2 Y nota1 < nota3 Y nota1 < nota4) Entonces
		notaMenor = nota1
		promedio = (nota2 + nota3 + nota4) / 3
		Escribir "la nota eliminada es " notaMenor " y el promedio de los TP es " promedio
	SiNo
		si (nota2 < nota1 Y nota2 < nota3 Y nota2 < nota4) Entonces
			notaMenor = nota2
			promedio = (nota1 + nota3 + nota4) / 3
			Escribir "la nota eliminada es " notaMenor " y el promedio de los TP es " promedio
		SiNo
			si (nota3 < nota1 Y nota3 < nota2 Y nota3 < nota4) Entonces
				notaMenor = nota3
				promedio = (nota1 + nota2 + nota4) / 3
				Escribir "la nota eliminada es " notaMenor " y el promedio de los TP es " promedio
			SiNo
				si (nota4 < nota1 Y nota4 < nota2 Y nota4 < nota3) Entonces
					notaMenor = nota4
					promedio = (nota1 + nota2 + nota3) / 3
					Escribir "la nota eliminada es " notaMenor " y el promedio de los TP es " promedio
				FinSi
			FinSi
		FinSi
		
	FinSi

	
FinAlgoritmo

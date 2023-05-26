//· Queremos realizar una encuesta a 6 personas, en esta encuesta:
//	
//	o Indicaremos el sexo 1= masculino, 2=femenino
//	
//	o sí trabaja 1=si trabaja 2=no trabaja
//		
//	o Su sueldo (que estará entre 600 y 2000, valor entero, siempre y cuando trabaje sino es 0)
//			
//	o Calcule y muestre:
//			
//		a) Porcentaje de hombres / porcentaje de mujeres
//			
//		b) Porcentaje de hombres que trabajan / porcentaje de mujeres que trabajan
//			
//		c) Sueldo promedio de los hombres que trabajan / sueldo promedio de las mujeres q trabajan


//6x4


Algoritmo repaso3_encuesta
	Definir matriz Como Entero
	Dimension matriz[6,4]
	encuesta(matriz,6,4)
	imprimirMatriz(matriz,6,4)
	calculoPorcentaje(matriz, 6,4)
	porcentajeTrabajan(matriz,6,4)
	sueldoPromedio(matriz,6,4)
FinAlgoritmo

SubAlgoritmo sueldoPromedio(matriz Por Referencia, n, m)
	Definir i, sueldoMujer, sueldoHombre, cantMujer, cantHombre Como Entero
	sueldoMujer = 0
	sueldoHombre = 0
	cantMujer = 0
	cantHombre = 0
	Para i = 0 Hasta n - 1 Hacer
		si matriz[i,1] == 1 Y matriz[i,2] == 1 Entonces
			cantHombre = cantHombre + 1
			sueldoHombre = sueldoHombre + matriz[i,3]
		SiNo
			si matriz[i,1] == 2  Y matriz[i,2] == 1 Entonces
				cantMujer = cantMujer + 1
				sueldoMujer = sueldoMujer + matriz[i,3]
			FinSi
		FinSi
	FinPara
	
	si cantHombre <> 0 Entonces
		Escribir "Sueldo Promedio de hombres = $" sueldoHombre / cantHombre 
	SiNo
		Escribir "Sueldo Promedio de hombres = $0"
	FinSi
	
	si cantMujer <> 0 Entonces
		Escribir "Sueldo Promedio de mujeres = $" sueldoMujer / cantMujer
	SiNo
		Escribir "Sueldo Promedio de mujeres = $0"
	FinSi
	
FinSubAlgoritmo

SubAlgoritmo porcentajeTrabajan(matriz Por Referencia, n, m)
	Definir i, trabMujer, trabHombre, cantMujer, cantHombre Como Entero
	trabMujer = 0
	trabHombre = 0
	cantMujer = 0
	cantHombre = 0

	
	Para i = 0 Hasta n - 1 Hacer
		si matriz[i,1] == 1  Y matriz[i,2] == 1 Entonces
			cantHombre = cantHombre + 1
			trabHombre = trabHombre + 1
		SiNo
			si matriz[i,1] == 1  Y matriz[i,2] == 2 Entonces
				cantHombre = cantHombre + 1
			SiNo
				si matriz[i,1] == 2  Y matriz[i,2] == 1 Entonces
					cantMujer = cantMujer + 1
					trabMujer = trabMujer + 1
				SiNo
					si matriz[i,1] == 2  Y matriz[i,2] == 2 Entonces
						cantMujer = cantMujer + 1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	si cantHombre <> 0 Entonces
		Escribir "Porcentaje de hombres que trabajan = " trabHombre / cantHombre * 100 "%"
	SiNo
		Escribir "Porcentaje de hombres que trabajan = 0%"
	FinSi
	
	si cantMujer <> 0 Entonces
		Escribir "Porcentaje de mujeres que trabajan = " trabMujer / cantMujer * 100 "%"
	SiNo
		Escribir "Porcentaje de mujeres que trabajan = 0%"
	FinSi
	
	
FinSubAlgoritmo

SubAlgoritmo calculoPorcentaje(matriz Por Referencia, n, m)
	Definir i, j, porMujer, porHombre, cantMujer, cantHombre Como Entero
	porMujer = 0
	porHombre = 0
	cantMujer = 0
	cantHombre = 0
	Para i = 0 Hasta n - 1 Hacer
		si matriz[i,1] == 1 Entonces
			cantHombre = cantHombre + 1
		SiNo
			si matriz[i,1] == 2 Entonces
				cantMujer = cantmujer + 1
			FinSi
		FinSi
	FinPara
	
	porHombre = cantHombre / (cantHombre + cantmujer) * 100
	porMujer = cantmujer / (cantHombre + cantmujer) * 100

	Escribir "porcentaje de hombres = " porHombre "%"
	Escribir "porcentaje de mujeres = " porMujer "%"
FinSubAlgoritmo

SubAlgoritmo encuesta(matriz Por Referencia, n ,m)
	Definir i, j, personas, num Como Entero
	personas = 0
	inicializoMatriz(matriz, n, m)
	i=0
	Hacer
		Escribir "PERSONA " i + 1
		Escribir "sexo: "
		Escribir "1= masculino, 2=femenino"
		Leer num
		matriz[i,1] = num
		Escribir "¿trabaja?"
		Escribir "1=si trabaja 2=no trabaja"
		Leer num
		matriz[i,2] = num
		Escribir "¿sueldo?"
		Escribir "si no trabaja ingrese cero"
		Leer num
		matriz[i,3] = num
		i=i+1
		personas= personas + 1
	Mientras Que personas < 6
FinSubAlgoritmo


SubAlgoritmo inicializoMatriz(matriz Por Referencia, n ,m)
	Definir i , j Como Entero
	para i = 0 Hasta n -1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			matriz[i,j] = 0
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo imprimirMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Escribir "imprimo matriz: "
	Para i = 0 Hasta n - 1 Hacer
		Para j = 0 Hasta m - 1 Hacer
			si j = 0 Entonces
				Escribir Sin Saltar "P" i + 1
			SiNo
				Escribir Sin Saltar " " matriz[i,j] " "
			FinSi
			
		FinPara

		Escribir ""
	FinPara
FinSubAlgoritmo

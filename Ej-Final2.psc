Algoritmo sin_titulo
	Definir anteriores, posteriores, i, j, c, a Como Entero
	i=1
	c=0
	Hacer
		posteriores=0
		anteriores=0
		para a<-0 Hasta i-1 Hacer
			anteriores=anteriores+a
		FinPara
		j=i+1 
	Mientras  anteriores>=posteriores Hacer
			posteriores=posteriores+j
				si posteriores=anteriores Entonces
					c=c+1
					Escribir "el numero centro es " i " entre (1 y " i-1 ") y (" i+1 " y " j ")"
				FinSi
			j=j+1
		FinMientras
		i=i+1
	Mientras Que c<5
FinAlgoritmo

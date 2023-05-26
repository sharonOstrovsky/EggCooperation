Funcion bool <- check(vector Por Referencia, num, dim)
	definir i Como Entero
	bool = Verdadero
	para i<-0 hasta dim -1 Hacer
		si vector[i] == num 
			bool = Falso
		FinSi
	FinPara
FinFuncion


SubProceso llenarVector(vec Por Referencia, dim)
	//dim numero pasado por usuario 
	Definir i,num Como Entero
	para i<- 0 hasta dim-1
		//llama a la otra funcion
		random = Aleatorio(0,dim)
		si check(vec,random,dim) Entonces
			vec[i] = random
		FinSi
	FinPara
FinSubProceso

SubProceso  mostrarVector (vector Por Referencia,dim) 
	definir i Como Entero
	para i <-0 Hasta dim-1 Hacer
		Escribir Sin Saltar vector[i]
	FinPara
FinSubProceso


Proceso EXAMEN
	Definir num, vector Como Entero
	Escribir 'Ingrese un numero' 
	//num es dimension y limite de alatorio
	Leer num 
	Dimension vector(num)
	llenarVector(vector, num)
	mostrarVector(vector,num)
	
FinProceso

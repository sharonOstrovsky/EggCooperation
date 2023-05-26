//8. Crea un programa que pida el nombre al usuario y lo escriba alternando mayúsculas y minúsculas

Algoritmo repaso8_alterarMayusculasMinusculas
	Definir nombre Como Caracter
	Escribir "ingrese su nombre"
	Leer nombre
	alterarMayusculasMinusculas(nombre)
	
	Escribir nombre
FinAlgoritmo

SubProceso alterarMayusculasMinusculas(nombre Por Referencia)
	Definir i, tam Como Entero
	Definir aux Como Caracter
	tam = Longitud(nombre)
	para i = 0 Hasta Longitud(nombre) Hacer
		si i MOD 2 == 0 Entonces
			aux = Concatenar(Subcadena(nombre, 0,i-1), Mayusculas(subcadena(nombre, i, i)))
			nombre= Concatenar(aux, Subcadena(nombre, i + 1, tam))
		SiNo
			aux = Concatenar(Subcadena(nombre, 0,i-1), Minusculas(subcadena(nombre, i, i)))
			nombre= Concatenar(aux, Subcadena(nombre, i + 1, tam))
		FinSi
	FinPara
	
FinSubProceso
	
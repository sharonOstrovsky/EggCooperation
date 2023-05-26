//3. Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//		Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
//			solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.



Algoritmo extra3_funciones
	
	Definir usuario, clave Como Caracter
	Definir resultado Como Logico
	Definir contador Como Entero
	
	contador = 0
	
	Hacer
		Escribir "ingrese un usuario"
		Leer usuario
		Escribir "ingrese la clave"
		Leer clave
		resultado = login(usuario, clave)
		contador = contador + 1
	Mientras Que contador < 3 Y resultado == Falso
	
FinAlgoritmo

Funcion resultado <- login(usuario Por Referencia, clave Por Referencia)
	Definir resultado Como Logico
	si usuario == 'usuario1' Y clave == 'asdasd' Entonces
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
FinFuncion
	
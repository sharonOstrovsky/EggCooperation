//6. Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no
//le debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a
//4567. El programa finaliza cuando ingresa los datos correctos.


Algoritmo extra6_bucleHacerMientrasQue
	
	Definir codigoUsuario, clave Como Entero
	
	Hacer
		Escribir "ingrese su codigo de usuario"
		Leer codigoUsuario
		Escribir "ingrese su contrase�a numerica"
		Leer clave
	Mientras Que ((codigoUsuario <> 1024) O (clave <> 4567))
	
	
	
FinAlgoritmo

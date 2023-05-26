//7)Crea una aplicación que nos pida un día de la semana 
//y que nos diga si es un dia laboral o no

Algoritmo repaso7_diaLaboral
	
	Definir dia Como Caracter
	Escribir "ingrese un dia de la semana"
	Leer dia
	
	Segun dia hacer
		'lunes', 'Lunes':
			Escribir "es un dia laboral"
		'martes', 'Martes':
			Escribir "es un dia laboral"
		'miercoles', 'Miercoles':
			Escribir "es un dia laboral"
		'jueves', 'Jueves':
			Escribir "es un dia laboral"
		'viernes', 'Viernes':
			Escribir "es un dia laboral"
		'sabado', 'Sabado':
			Escribir "No es un dia laboral"
		'domingo', 'Domingo':
			Escribir "No es un dia laboral"
		De Otro Modo:
			Escribir "no ha ingresado un dia valido"
	FinSegun
	
FinAlgoritmo

//4. Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//	El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//	de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
//	debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//	festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.

Algoritmo extra4_funciones
	
	Definir nombre, dia, turno, feriado Como Caracter
	Definir horas, jornalDiario Como Real
	
	Escribir "ingrese su nombre"
	Leer nombre
	Escribir "ingrese el dia de la semana"
	Leer dia
	Escribir "¿fue festivo ese dia de la semana? si o no"
	Leer feriado
	Escribir "ingrese el turno: diurno o nocturno"
	Leer turno
	Escribir "ingrese la cantidad de horas trabajadas"
	Leer horas
	
	jornalDiario = calculoJornalDiario(turno, horas,feriado)
	
	Escribir "jornal diario de " nombre, " del dia " dia, ": " jornalDiario

FinAlgoritmo

Funcion jornalDiario <- calculoJornalDiario(turno Por Referencia, horas Por Referencia, feriado Por Referencia)
	
	Definir jornalDiario Como Real
	
	si feriado == 'no' Y turno == 'diurno' Entonces
		jornalDiario = 90 * horas
	SiNo
		si feriado == 'si' Y turno == 'diurno' Entonces
			jornalDiario = 99 * horas //90 + 10%
		SiNo
			si feriado == 'no' Y turno == 'nocturno' Entonces
				jornalDiario = 125 * horas
			SiNo
				si feriado == 'si' Y turno == 'nocturno' Entonces
					jornalDiario = 143.75 * horas //125 + 15%
				FinSi
			FinSi
		FinSi
	FinSi
FinFuncion
	
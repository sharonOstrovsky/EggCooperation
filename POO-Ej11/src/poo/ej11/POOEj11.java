/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo.ej11;

import java.util.Date;
import java.util.Scanner;


public class POOEj11 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el dia");
        int dia = input.nextInt();
        System.out.println("ingrese el mes");
        int mes = input.nextInt();
        System.out.println("ingrese el año");
        int anio = input.nextInt();
        
        Date fecha = new Date(anio - 1900,mes-1,dia);
        System.out.println(fecha.toString());
        
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());
        
        System.out.print("hay ");
        System.out.print(fechaActual.getYear() - fecha.getYear()) ;
        System.out.println(" años de diferencia");
        
    }
    
}

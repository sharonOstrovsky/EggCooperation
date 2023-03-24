
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicio {
    
    public Persona crearPersona(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona();
        
        
        System.out.println("ingrese su nombre");
        p.setNombre(input.nextLine());
        System.out.println("ingrese su fecha de nacimiento");
        System.out.println("dia");
        int dia = input.nextInt();
        System.out.println("mes");
        int mes = input.nextInt();
        System.out.println("año");
        int anio = input.nextInt();
        Date fecha = new Date(anio - 1900, mes-1, dia);
        p.setFechaNacimiento(fecha);
        
        return p;
    }
    
    //calcularEdad() a partir de la fecha de nacimiento ingresada.
    
    
    public int calcularEdad(Persona p){

        Date fechaActual = new Date();
        
        return fechaActual.getYear() - p.getFechaNacimiento().getYear() ;
        
   
    }
    
    /*
    menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
    */
    public  boolean menorQue(Persona p, int edad){
        int edadPersona = calcularEdad(p);
        
        return edadPersona < edad;
    }
    
    //Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
    
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }
            
}

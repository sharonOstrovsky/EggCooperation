/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*/
/*
1(extras). Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/
package relaciones.ej1;

import Entidades.Perro;
import Entidades.Persona;
import Servicio.ServicioPerro;
import Servicio.ServicioPersona;
import java.util.ArrayList;


public class RelacionesEj1 {

    
    public static void main(String[] args) {
        
        ServicioPerro servPerro = new ServicioPerro();
        ServicioPersona servPersona = new ServicioPersona();
        
        ArrayList<Persona> personas= new ArrayList<>();
        ArrayList<Perro> perros= new ArrayList<>();
        ArrayList<Perro> perrosAdoptados= new ArrayList<>();
        Perro perro;
        Persona persona;
        
        for (int i = 0; i < 1; i++) {
            
            persona = servPersona.crearPersona();
            personas.add(persona);
   
        }
        for (int i = 0; i < 1; i++) {
            
            perro = servPerro.crearPerro();
            perros.add(perro);
        }
        
        for (Persona aux : personas) {
            servPersona.adopcionPerro(aux, perros,perrosAdoptados);
            perrosAdoptados.add(aux.getPerro());
        }
        System.out.println("perros");
        System.out.println(perros.toString());
        System.out.println("adoptados");
        System.out.println(perrosAdoptados.toString());
        System.out.println(personas.toString());
        
        System.out.println("\nEstamos muy contentos de informar que todos perros fueron adoptados y estan felices con sus nuevas familias");
        for (Persona aux : personas){
            System.out.println(aux.getPerro().getNombre() + " con "+aux.getNombre());
        }
        
    }
    
}

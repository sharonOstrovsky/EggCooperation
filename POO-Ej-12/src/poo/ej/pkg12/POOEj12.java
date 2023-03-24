
package poo.ej.pkg12;

import Entidades.Persona;
import Servicio.PersonaServicio;


public class POOEj12 {


    public static void main(String[] args) {
        PersonaServicio  ps = new PersonaServicio(); 
        Persona p = ps.crearPersona();
        System.out.println("edad persona: "+ ps.calcularEdad(p));
        
        System.out.println("La persona tiene menor edad que la persona por parametro:  "+ ps.menorQue(p, 26));
        
        ps.mostrarPersona(p);
    }
    
}

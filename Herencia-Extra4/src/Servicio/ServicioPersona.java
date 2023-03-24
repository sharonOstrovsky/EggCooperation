
package Servicio;

import Entidad.Persona;
import Enumeraciones.EstadoCivil;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class ServicioPersona {
    
    Scanner input = new Scanner(System.in);
    
    //• Cambio del estado civil de una persona.
    public void cambioEstadoCivil(Persona persona){
        
        System.out.println("Ingrese el nuevo estado civil");
        String estado = input.next();
        
        for (EstadoCivil aux : EstadoCivil.values()) {
            
            if( estado.equalsIgnoreCase(aux.name()) ){
                persona.setEstadoCivil(aux);
            }
            
        }
        
        
    }
    
    
    public void mostrarPersonas(ArrayList<Persona> personas ){
        
        for (Persona persona : personas) {
            System.out.println(  toUpperCase(persona.getClass().getSimpleName())   );
            System.out.println(persona);
            System.out.println("");
        }
        
    }
    
}

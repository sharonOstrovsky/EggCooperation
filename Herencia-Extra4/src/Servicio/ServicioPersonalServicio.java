
package Servicio;

import Entidad.PersonalServicio;
import Enumeraciones.Seccion;
import java.util.Scanner;


public class ServicioPersonalServicio extends ServicioEmpleado{
    
    Scanner input = new Scanner(System.in);
    //• Traslado de sección de un empleado del personal de servicio.
    public void trasladoSeccion(PersonalServicio servicio){
        
        System.out.println("Ingrese la nueva seccion");
        String seccion = input.next();
        for (Seccion aux : Seccion.values()) {
            if( seccion.equalsIgnoreCase(aux.name()) ){
                servicio.setSeccion(aux);
            }
        }
    }
    
}



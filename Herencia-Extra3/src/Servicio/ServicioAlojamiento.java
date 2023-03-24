
package Servicio;

import Entidad.Alojamiento;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class ServicioAlojamiento {
    
    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos){
        
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println("");
            System.out.println( toUpperCase(alojamiento.getClass().getSimpleName()) + ": " + alojamiento.getNombre() );
            System.out.println(alojamiento);
        }
        
    }
    
 
  
    
 
    
}


package Servicio;

import Entidad.Camping;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class ServicioCamping {
    
    public void mostrarCampingConRestaurante(ArrayList<Camping> campings){
        
        for (Camping camping : campings) {
            
            if( camping.isRestautante() ){
                System.out.println(  toUpperCase(camping.getClass().getSimpleName() ) + ": " + camping.getNombre());
                System.out.println(camping);
                System.out.println("");
            }
            
        }
        
    }
    
}

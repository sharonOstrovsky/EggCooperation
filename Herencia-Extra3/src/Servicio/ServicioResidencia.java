
package Servicio;

import Entidad.Residencia;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class ServicioResidencia {
    
    public void mostrarResidenciaConDescuento(ArrayList<Residencia> residencias){
    
        for (Residencia residencia : residencias) {
            if(residencia.isDescuentosGremios()){
                System.out.println( toUpperCase( residencia.getClass().getSimpleName() ) + ": " + residencia.getNombre() );
                System.out.println(residencia);
                System.out.println("");
            }
            
        }
    
}
    
}


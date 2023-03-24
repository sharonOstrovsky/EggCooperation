
package Utilidades;

import Entidad.Mascota2;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Mascota2> ordenarPorNombreDesc = new  Comparator<Mascota2>() {
        @Override
        public int compare(Mascota2 t, Mascota2 t1) {
            
            return t1.getNombre().compareTo(t.getNombre());
            
        }
    };
    
    public static Comparator<Mascota2> ordenarPorEdadDesc = new  Comparator<Mascota2>() {
        @Override
        public int compare(Mascota2 t, Mascota2 t1) {
            
            return t1.getEdad().compareTo(t.getEdad());
            
        }
    };
}

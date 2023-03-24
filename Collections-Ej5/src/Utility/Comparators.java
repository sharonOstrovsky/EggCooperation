
package Utility;

import Entity.Pais;
import java.util.Comparator;


public class Comparators {
    
    //mostrar el conjunto ordenado alfabéticamente
    public static Comparator<Pais> comparaNombre = new Comparator<Pais>(){
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
        
    };
 
}


package Utilidades;

import Entidades.Alumno;
import java.util.Comparator;


public class Comparators {
    
    
    public static Comparator<Alumno> comparaVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno t, Alumno t1) {
            return Integer.compare(t1.getCantVotos(),t.getCantVotos());
        }
        
    };

    
}

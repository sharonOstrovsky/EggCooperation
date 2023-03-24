
package Utilidades;

import Entidad.Hotel;
import java.util.Comparator;


public class Comparators {
   
    public static Comparator<Hotel> comparaPrecio = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t, Hotel t1) {
            return Double.compare(t1.getPrecioHabitacion(), t.getPrecioHabitacion());
           
        }
        
    };
    
  
}

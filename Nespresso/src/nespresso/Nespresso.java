
package nespresso;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;


public class Nespresso {

    
    public static void main(String[] args) {
        
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c = cs.crearCafetera();
        
    }
    
}

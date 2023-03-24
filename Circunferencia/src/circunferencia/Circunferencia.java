
package circunferencia;

import Servicio.CircunferenciaServicio;
import Entidades.Circunferenciaa;


public class Circunferencia {

 
    public static void main(String[] args) {
        
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferenciaa c = cs.CrearCircunferencia();
        cs.Area(c);
        cs.Perimetro(c);
    }
    
}

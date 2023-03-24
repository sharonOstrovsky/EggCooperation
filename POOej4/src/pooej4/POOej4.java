
package pooej4;

import Entidades.Rectangulo;
import Servicio.RectanguloServicio;


public class POOej4 {

    
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r = rs.crearRectangulo();
        int sup = rs.Superficie(r);
        int peri = rs.Perimetro(r);
        System.out.println("Superficie = "+sup);
        System.out.println("Perimetro = "+peri);
        
        rs.DibujarRectangulo(r);
    }
    
}

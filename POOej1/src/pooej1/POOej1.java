
package pooej1;

import Entidades.Libro;
import Servicio.LibroServicio;


public class POOej1 {

   
    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.cargarLibro();
        ls.mostrarLibro(l1);
        
    }
    
}

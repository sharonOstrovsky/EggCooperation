
package Servicio;

import Entidades.Pelicula;
import java.util.Scanner;


public class ServicioPelicula {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        
        Pelicula pelicula = new Pelicula();
        
        System.out.print("Ingrese el titulo de la pelicula: ");
        pelicula.setTitulo(input.next());
        System.out.print("Ingrese el director de la pelicula: ");
        pelicula.setDirector(input.next());
        System.out.print("Ingrese la duracion de la pelicula: ");
        pelicula.setDuracion(input.nextDouble());
        System.out.print("Ingrese la edad minima para ver la pelicula: ");
        pelicula.setEdadMinima(input.nextInt());
        
        return pelicula;
    }
}

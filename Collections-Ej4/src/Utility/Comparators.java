
package Utility;

import Entity.Pelicula;
import java.util.Comparator;


public class Comparators {
    
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) 
    public static Comparator<Pelicula> comparaDuracionMayorAMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t1.getDuracion(), t.getDuracion());
        }
        
    };
    
    //• Ordenar las películas de acuerdo a su duración (de menor a mayor)
    public static Comparator<Pelicula> comparaDuracionMenorAMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t.getDuracion(), t1.getDuracion());
        }
        
    };
    
    //• Ordenar las películas por título, alfabéticamente 
    public static Comparator<Pelicula> comparaTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
        
    };
    
    //• Ordenar las películas por director, alfabéticamente
    public static Comparator<Pelicula> comparaDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
        
    };
    

}

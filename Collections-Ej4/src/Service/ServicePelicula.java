
package Service;

import Entity.Pelicula;
import Utility.Comparators;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicePelicula {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        
        Pelicula pelicula = new Pelicula();
 //       double duracion;
        
        System.out.print("Ingrese el titulo de la pelicula: ");
        pelicula.setTitulo(input.next());
        System.out.print("Ingrese el nombre del director: ");
        pelicula.setDirector(input.next());
        System.out.print("Ingrese la duracion en horas: ");
        pelicula.setDuracion(input.nextDouble());
        
        return pelicula;
    }
    
    public ArrayList<Pelicula> crearListaPeliculas(){
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        String option = "s";
        do{
            Pelicula pelicula = crearPelicula();
            peliculas.add(pelicula);
            do{
                System.out.println("Desea ingresar otra pelicula? (s/n)");
                option = input.next();
                System.out.println("");
            }while( ! (option.equalsIgnoreCase("s") || option.equalsIgnoreCase("n" ) ) );
        }while( option.equalsIgnoreCase("s") );
        
        return peliculas;

    }
    
    //• Mostrar en pantalla todas las películas.
    public void mostrarLista(ArrayList<Pelicula> peliculas){
        System.out.println("TITULO\tDIRECTOR\tDURACION");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }

    }
    
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliculasPorDuracion(ArrayList<Pelicula> peliculas){
        System.out.println("TITULO\tDIRECTOR\tDURACION");
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getDuracion() >= 1){
                System.out.println(pelicula.toString());
            }
           
        }
    }
    
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void ordenarDuracionMayorAMenor(ArrayList<Pelicula> peliculas){
        peliculas.sort(Comparators.comparaDuracionMayorAMenor);
        mostrarLista(peliculas);
    }
    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenarDuracionMenorAMayor(ArrayList<Pelicula> peliculas){
        peliculas.sort(Comparators.comparaDuracionMenorAMayor);
        mostrarLista(peliculas);
    }
    
    // • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarTitulo(ArrayList<Pelicula> peliculas){
        peliculas.sort(Comparators.comparaTitulo);
        mostrarLista(peliculas);
    }
    
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarDirector(ArrayList<Pelicula> peliculas){
        peliculas.sort(Comparators.comparaDirector);
        mostrarLista(peliculas);
    }


}

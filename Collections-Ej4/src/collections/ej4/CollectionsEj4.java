/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
package collections.ej4;

import Entity.Pelicula;
import Service.ServicePelicula;
import java.util.ArrayList;


public class CollectionsEj4 {


    public static void main(String[] args) {
        
       ServicePelicula servicioPelicula = new ServicePelicula();
       //ingreso las peliculas y las guardo en la lista
       ArrayList<Pelicula> peliculas = servicioPelicula.crearListaPeliculas();
       
       //• Mostrar en pantalla todas las películas.
        System.out.println("\nTodas las peliculas: ");
        servicioPelicula.mostrarLista(peliculas);
       
       //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        System.out.println("\nDuracion mayor a 1 hora: ");
         servicioPelicula.mostrarPeliculasPorDuracion(peliculas);
       
        //• Ordenar las películas de acuerdo a su duración (de mayor a menor)
        System.out.println("\nOrdenadas por Duracion Mayor a Menor: ");
        servicioPelicula.ordenarDuracionMayorAMenor(peliculas);
        
       //• Ordenar las películas de acuerdo a su duración (de menor a mayor)
        System.out.println("\nOrdenadas por Duracion Menor a Mayor: ");
        servicioPelicula.ordenarDuracionMenorAMayor(peliculas);
      
        //• Ordenar las películas por título
        System.out.println("\nOrdenadas por titulo: ");
        servicioPelicula.ordenarTitulo(peliculas);
       
       //• Ordenar las películas por director
        System.out.println("\nOrdenadas por Director: ");
       servicioPelicula.ordenarDirector(peliculas);
              
    }
    
}

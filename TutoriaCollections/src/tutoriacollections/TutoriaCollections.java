
package tutoriacollections;

import Entidad.Jugador;
import Servicio.ServicioJugador;
import java.util.ArrayList;


public class TutoriaCollections {

   
    public static void main(String[] args) {
        ServicioJugador servJugador = new ServicioJugador();
        ArrayList<Jugador> jugadores = servJugador.crearListaJugadores();
        servJugador.mostrarLista(jugadores);
        
        //eliminar un jugador de la lista
        servJugador.eliminarJugador(jugadores);
        servJugador.mostrarLista(jugadores);
        
        //Ordenar
        System.out.println("\nOrdenamos por Nacionalidad: ");
        servJugador.ordenarNacionalidad(jugadores);
        
        System.out.println("\nOrdenamos por Edad: ");
        servJugador.ordenarEdad(jugadores);
        
        System.out.println("\nOrdenamos por Altura: ");
        servJugador.ordenarAltura(jugadores);
        
    }
    
}

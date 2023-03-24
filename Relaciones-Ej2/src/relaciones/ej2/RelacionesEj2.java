/*
2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja.
Las clases a hacer del juego son las siguientes:
Clase Revolver de agua
Clase Jugador
Clase Juego
*/
package relaciones.ej2;

import Entidades.Juego;
import Entidades.Jugador;
import Servicio.ServicioJuego;
import java.util.ArrayList;


public class RelacionesEj2 {

    
    public static void main(String[] args) {
        int i = 0;
        
        ServicioJuego servJuego = new ServicioJuego();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        Juego juego = servJuego.crearJuego(jugadores);
        
//        for (int i = 0; i < juego.getJugadores().size(); i++) {
//            if(!servJuego.ronda(juego, i)){
//                
//            }
//        }
        boolean continuar  = true;
        while(continuar && i<juego.getJugadores().size()){
            continuar = servJuego.ronda(juego, i);
            i++;
            
        }
//        while(servJuego.ronda(juego, i) && i<juego.getJugadores().size()){
//            i++;
//        }
        
        System.out.println(juego.getJugadores().toString());


//        do{
//            
//           i++;
//            
//        }while( servJuego.ronda(juego, i) && i<juego.getJugadores().size()) ;
        
        
        
        
    }
    
}

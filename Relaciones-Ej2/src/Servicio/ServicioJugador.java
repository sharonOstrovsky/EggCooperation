/*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
*/
package Servicio;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.Scanner;


public class ServicioJugador {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Jugador crearJugador(){
        Jugador jugador = new Jugador();
        
//        System.out.print("Ingrese el nombre del jugador: ");
//        jugador.setNombre(input.next());
        
        jugador.setMojado(false); //empieza sin estar mojado
        
        return jugador;
    }
    
    public boolean disparo(RevolverDeAgua r, Jugador jugador, int cantJugadores){
        
        ServicioRevolver servRevolver = new ServicioRevolver();
        System.out.println("EL JUGADOR APUNTA \nAPRIETA EL GATILLO\n");
        if(servRevolver.mojar(r)){
            jugador.setMojado(true); //se moja el jugador
            return true;
        }else{
            servRevolver.siguienteChorro(r, cantJugadores);
            return false;
        }
        
        
    }
}

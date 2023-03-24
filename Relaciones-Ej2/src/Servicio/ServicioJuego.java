/*
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
*/
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioJuego {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ServicioJugador servJugador = new ServicioJugador();
    ServicioRevolver servRevolver = new ServicioRevolver();
    
    //recibe los jugadores y el revolver para guardarlos en los atributos del juego.
    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r){
       
        Juego juego = new Juego();
        
        juego.setJugadores(jugadores);
        juego.setRevolver(r);
        
        return juego;
        
    }
    
    public void ingresarJuagadores(ArrayList<Jugador> jugadores, int cantJugadores){
        for (int i = 0; i < cantJugadores; i++) {
            Jugador jugador = servJugador.crearJugador();
            jugador.setId(i);
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            jugador.setNombre(input.next()+i);
            jugadores.add(jugador);
        }
    }
    
    public Juego crearJuego(ArrayList<Jugador> jugadores){
        System.out.println("Ingrese cantidad de jugadores");
        int cantJuagadores = input.nextInt();
        if(cantJuagadores > 6 ){
            cantJuagadores = 6;
        }
        
        ingresarJuagadores(jugadores, cantJuagadores);
        
        RevolverDeAgua r = servRevolver.crearRevolver();
        servRevolver.llenarRevolver(r, cantJuagadores);
        
        Juego juego = llenarJuego(jugadores, r);
        
        return juego;
    }
    
    public boolean ronda(Juego juego, int idJuggador){
        boolean continuar = true;

        
        for (int i = 0; i <juego.getJugadores().size();i++ ) {
            
            if(servJugador.disparo(juego.getRevolver(), juego.getJugadores().get(idJuggador), juego.getJugadores().size())){
                continuar = false;
                System.out.println("Jugador " + idJuggador + "  MOJADO");
                juego.getJugadores().get(idJuggador).setMojado(true);
                i = juego.getJugadores().size();
            }
            idJuggador++;
            
        }
        
        return continuar;           
        

    }


}

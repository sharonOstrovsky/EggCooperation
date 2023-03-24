
package Servicio;

import Entidad.Jugador;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class ServicioJugador {
    
    private final Scanner scanner;
    
    public ServicioJugador(){
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }
    
    /*
    Creamos una lista de jugadores, los cuales se ingresan en el
    metodo crearJugador(), y preguntamos si queremos seguir ingresando
    mas jugadores.
    */
    public ArrayList<Jugador> crearListaJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        String opcion = "s";
        do{
            Jugador jugador = crearJugador();
            jugadores.add(jugador);
            do{
                System.out.println("Desea ingresar otro jugador?  (s/n)");
                opcion = scanner.next();
                System.out.println("");
            }while(! (opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n") ));
        }while(opcion.equalsIgnoreCase("s"));
        return jugadores;
    }
    
    /*
    pedimos al usuario que ingrese cada uno de los parametros que seran
    guardados en el objeto 'jugador'
    */
    public Jugador crearJugador(){
        
        Jugador jugador = new Jugador();
        
        System.out.print("Ingrese el nombre del jugador: ");
        jugador.setNobmre(scanner.next());
        System.out.print("Ingrese la edad de " + jugador.getNobmre() + ": ");
        jugador.setEdad(scanner.nextInt());
        System.out.print("Ingrese la altura de " + jugador.getNobmre() + ": ");
        jugador.setAltura(scanner.nextDouble());
        System.out.print("Ingrese el peso de " + jugador.getNobmre() + ": ");
        jugador.setPeso(scanner.nextDouble());
        System.out.print("Ingrese la nacionalidad de " + jugador.getNobmre() + ": ");
        jugador.setNacionalidad(scanner.next());
        
        return jugador;
    }
    
    /*
    Muestra los objetos jugadores en la lista
    */
    public void mostrarLista(ArrayList<Jugador> jugadores){
        System.out.println("NOMBRE\tEDAD\tALTURA\tPESO\tNACIONALIDAD");
        for (Jugador aux : jugadores) {
            System.out.println(aux.toString());
        }
    }
    
    /*
    Pide al usuario que ingrese el nombre de un jugador, si esta
    en la lista lo elimina y sino envia un mensaje. 
    */
    public void eliminarJugador(ArrayList<Jugador> jugadores){
        System.out.print("\nIngrese el nombre del jugador a eliminar: ");
        String eliminar = scanner.next();
        boolean encontro = false;
        Iterator<Jugador> itJugadores = jugadores.iterator();
        while(itJugadores.hasNext() ){
            if(itJugadores.next().getNobmre().equalsIgnoreCase(eliminar)){
                itJugadores.remove();
                encontro = true;
            }
        }
        if(!encontro){
            System.out.println("El jugador no se encuentra en la lista\n");
        }
    }
    
    /*
    Ordena la lista alfabeticamente segun nacionalidad.
    */
    public void ordenarNacionalidad(ArrayList<Jugador> jugadores){
        jugadores.sort(Comparadores.comparaNacionalidad);
        mostrarLista(jugadores);
    }
    
    /*
    Ordena la lista de menor edad a mayor edad
    */
    public void ordenarEdad(ArrayList<Jugador> jugadores){
        jugadores.sort(Comparadores.comparaEdad);
        mostrarLista(jugadores);
    }
    
    /*
    Ordena la lista de mas alto a mas bajo
    */
    public void ordenarAltura(ArrayList<Jugador> jugadores){
        jugadores.sort(Comparadores.comparaAltura);
        mostrarLista(jugadores);
    }
            
}

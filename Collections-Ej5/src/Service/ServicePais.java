
package Service;

import Entity.Pais;
import Utility.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class ServicePais {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Pais crearPais(){
        
        Pais pais = new Pais();
        
        System.out.print("Ingrese el pais: ");
        pais.setNombre(input.next());
        
        return pais;
    }
    
    public HashSet<Pais> crearListaPaises(){
        
        HashSet<Pais> paises = new HashSet();
        String option = "s";
        do{
            Pais pais = crearPais();
            paises.add(pais);
            do{
                System.out.println("");
                System.out.print("Desea ingresar otro pais? (s/n)");
                option = input.next();
                System.out.println("");
            }while( ! (option.equalsIgnoreCase("s") || option.equalsIgnoreCase("n" ) ) );
        }while( option.equalsIgnoreCase("s") );
        
        mostrarListaHashSet(paises);
        
        return paises;

    }
    
    public void mostrarListaHashSet(HashSet<Pais> paises){
        System.out.println("PAIS:");
        for (Pais pais : paises) {
            System.out.println(pais.toString());
        }
    }
    
    public void mostrarListaArray(ArrayList<Pais> paises){
        System.out.println("PAIS:");
        for (Pais pais : paises) {
            System.out.println(pais.toString());
        }
    }
    
    public void ordenarLista(HashSet<Pais> paises){
        
        ArrayList<Pais> paisesLista = new ArrayList(paises);
        //Collections.sort(paisesLista);
        paisesLista.sort(Comparators.comparaNombre);
        mostrarListaArray(paisesLista);
    }
    
    public void eliminarPais(HashSet<Pais> paises){
        System.out.print("\nIngrese el paise que desea eliminar: ");
        String eliminar = input.next();
        boolean encontro = false;
        Iterator<Pais> itPaises = paises.iterator();
        while(itPaises.hasNext()){
            if(itPaises.next().getNombre().equalsIgnoreCase(eliminar)){
                itPaises.remove();
                encontro = true;
            }
        }
        if(!encontro){
            System.out.println("\nEl Pais no se encuentra en la lista\n");
        }
    }
    
    /*
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
    */
}

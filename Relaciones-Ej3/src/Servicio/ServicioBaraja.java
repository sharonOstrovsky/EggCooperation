
package Servicio;

import Entidades.Baraja;
import Entidades.Carta;
import Enumeraciones.Palo;
import Utilidades.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class ServicioBaraja {
    
    
    
    public Baraja crearBaraja(){
        
        ServicioCarta servCarta = new ServicioCarta();
        Baraja baraja = new Baraja();
        TreeSet<Carta> cartasBasto = new TreeSet<>(Comparators.comparaNumero);
        TreeSet<Carta> cartasEspada = new TreeSet<>(Comparators.comparaNumero);
        TreeSet<Carta> cartasOro = new TreeSet<>(Comparators.comparaNumero);
        TreeSet<Carta> cartasCopa = new TreeSet<>(Comparators.comparaNumero);
        


  
        Carta carta;
        

        //System.out.println(cartas.size());
        //cartasBasto.size()!=10 && cartasEspada.size()!=10 && cartasCopa.size()!=10 && cartasOro.size()!=10
        while( cartasBasto.size()!=10 || cartasEspada.size()!=10 || cartasCopa.size()!=10 || cartasOro.size()!=10 ){
            
            carta = servCarta.crearCarta();
             
            if(carta.getPalo().equals(Palo.BASTO)){
                cartasBasto.add(carta);

            }else{
                if(carta.getPalo().equals(Palo.ESPADA)){
                    cartasEspada.add(carta);

                }else{
                    if(carta.getPalo().equals(Palo.COPA)){
                        cartasCopa.add(carta);
    
                    }else{
                        if(carta.getPalo().equals(Palo.ORO)){
                            cartasOro.add(carta);
   
                        }
                    }
                }
            
            }
            
  
         //   System.out.println(cartas.size());
        }
        
//        System.out.println(cartasBasto.size());
//        System.out.println(cartasOro.size());
//        System.out.println(cartasEspada.size());
//        System.out.println(cartasCopa.size());
        baraja.setCartasBasto(cartasBasto);
        baraja.setCartasCopa(cartasCopa);
        baraja.setCartasEspada(cartasEspada);
        baraja.setCartasOro(cartasOro);
        
        ArrayList<Carta> cartaLista = new ArrayList<>();
        
        for (Carta aux : cartasEspada) {
            cartaLista.add(aux);
        }
        for (Carta aux : cartasBasto) {
            cartaLista.add(aux);
        }
        for (Carta aux : cartasOro) {
            cartaLista.add(aux);
        }
        for (Carta aux : cartasCopa) {
            cartaLista.add(aux);
        }
        
        baraja.setCartas(cartaLista);

        return baraja;
        
//        while(cartas2.size()<4){
//            carta = servCarta.crearCarta();
//            cartas2.add(carta);
// 
//            System.out.println(cartas2.size());
//        }
//        
//       cartas.addAll(cartas2);
        
        

    }
    
    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(Baraja baraja){
        
       Collections.shuffle(baraja.getCartas());
  
    }
    
    //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta(Baraja baraja){
         
        if(baraja.getCartas().isEmpty()){
            System.out.println("NO HAY MAS CARTAS");
        }else{
            System.out.println("CARTA: " + baraja.getCartas().get(0));
            System.out.println(baraja.getCartas().get(0));
            ArrayList<Carta> cartasMonton = new ArrayList<>();
            cartasMonton.add(baraja.getCartas().get(0));
            baraja.setCartasMonton(cartasMonton);
            baraja.getCartas().remove(0);
        }
        
    }
    
    
    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(Baraja baraja){
        
        System.out.println("CARTAS DISPONIBLES: " + baraja.getCartas().size());
    }
    
    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public void darCartas(Baraja baraja){
        
        Scanner input = new Scanner(System.in);
        System.out.print("\ncuantas cartar desea repartir?");
        int cant = input.nextInt();
        System.out.println();
        
        if(baraja.getCartas().size() < cant){
            System.out.println("NO HAY CARTAS SUFICIENTES");
        }else{
            for (int i = 0; i < cant; i++) {
                System.out.println("CARTA: " + baraja.getCartas().get(0));
                ArrayList<Carta> cartasMonton = new ArrayList<>();
                cartasMonton.add(baraja.getCartas().get(0));
                baraja.setCartasMonton(cartasMonton);
                baraja.getCartas().remove(0);
            }
        }
    }
    
    //• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(Baraja baraja){
        for (Carta aux : baraja.getCartas()) {
            System.out.println(aux);
        }
    }
    

//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton(Baraja baraja){
        for (Carta aux : baraja.getCartasMonton()) {
            System.out.println(aux);
        }
    }
    
 
    
    
    
    /*
     Iterator<Carta> itCarta = baraja.getCartas().iterator();
        while(itCarta.hasNext()){
            if(itCarta.next().equals("hola")){
                itCarta.remove();
            }
        }
    */
}


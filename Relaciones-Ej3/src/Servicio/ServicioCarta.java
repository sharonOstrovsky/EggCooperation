
package Servicio;

import Entidades.Carta;
import Enumeraciones.Palo;


public class ServicioCarta {
    
    public Carta crearCarta(){
        Carta carta = new Carta();
        int paloAleatorio = Aleatorio(0,3);
        int numAleatorio;
        int i = 0;
        for (Palo aux : Palo.values()) {
            if(i == paloAleatorio){
                carta.setPalo(aux);
            }
            i++;
        }
        
        do{
            numAleatorio = Aleatorio(1,12);
        }while(numAleatorio == 8 || numAleatorio == 9);
        carta.setNumero(numAleatorio);
        
      //  System.out.println(carta.toString());
        
        return carta;
    }
    
    
    public static int Aleatorio(int min, int max) {
        
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
    }
    
    
}

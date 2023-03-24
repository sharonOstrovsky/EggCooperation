/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp3;

import Entidades.Mascota3;
import enumeraciones.RazaGatuna;
import enumeraciones.RazaPerruna;

/**
 *
 * @author sharo
 */
public class MascotAPP3 {

    
    public static void main(String[] args) {
      
       //genericos
       Mascota3 m1 = new Mascota3<RazaPerruna>("Fer", "Chiquito", "¨Perro");
       m1.setRaza(RazaPerruna.BEAGLE);
        System.out.println(m1.toString());
        
        Mascota3 m2 = new Mascota3<RazaGatuna>("Pepa", "Lola", "Gato");
        m2.setRaza(RazaGatuna.NARANJOSO);
        System.out.println(m2.toString());
        
        String razaInput = "BEAGLE";
        
        //recorrer enumeraciones
        for (RazaPerruna aux : RazaPerruna.values()) {
           System.out.println(aux);
      
        }
        
        for (RazaPerruna aux : RazaPerruna.values()) {
           if(aux.toString().equals(razaInput)){
               System.out.println("Raza input es igual al enum " + aux);
           }
      
        }
    }
    
}

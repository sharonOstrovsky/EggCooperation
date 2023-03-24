/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author sharo
 */
public class Probando {

    
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");
        
        
        Stream<String> valoresDos = nombres.stream()
                .map((x) ->"Hola, " + x.toUpperCase())
                .filter((x)->x.startsWith("P"));

        valoresDos.forEach((x) -> System.out.println(x));
        
        
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        
        var stNumeros = Arrays.stream(numeros);
        
        var resultado = stNumeros
                .map(x->x*2)
                .filter(x->x%2==0)
                .reduce(0,(x,y) ->x+y);
        System.out.println("Mi suma de pares es: " + resultado);
        
    }
    
}

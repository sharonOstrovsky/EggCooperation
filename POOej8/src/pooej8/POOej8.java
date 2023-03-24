
package pooej8;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;


public class POOej8 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        CadenaServicio cs = new CadenaServicio();
        Cadena c = cs.crearCadena();
        
        System.out.println("cant vocales = "+cs.mostrarVocales(c));
        cs.invertirFrase(c);
        
        System.out.println("ingrese el caracter a buscar");
        String letra = input.next();
        System.out.println("El caracter "+letra+" esta repetido "+cs.vecesRepetido(c, letra)+" veces");
        
        System.out.println("ingrese una nueva frase");
        String frase = input.next();
        cs.compararLongitud(c, frase);
        
        cs.unirFrases(c, frase);
        
        cs.reemplazar(c);
        
        System.out.println(cs.contiene("o", c));
    }
    
}

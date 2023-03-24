/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
*/
package extra5;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author sharo
 */
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la clase de socio:");
        String claseSocio = leer.nextLine();
        System.out.println("ingrese costo del tto");
        float tto = leer.nextFloat();
        switch(toUpperCase(claseSocio)){
            case "A":
                System.out.println("tto = $ " + tto*0.5);
                break;
            case "B":
                System.out.println("tto = $ " + (tto*0.65));
                break;
            case "C":
                System.out.println("tto = $ " + tto);
                break;
        
    }
    }
    
}

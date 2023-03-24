/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
*/
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros que desea convertir");
        int euros = leer.nextInt();
        System.out.println("ingrese la moneda a la que desea convertir los euros");
        Scanner leers = new Scanner(System.in);
        String moneda = leers.nextLine();
        convertirEuros(euros,moneda);
    }
    
    public static void convertirEuros(int cant, String moneda){
        switch(moneda){
            case "dolar":
                System.out.println(cant + " euros = " + cant*1.28611 + " dolares");
                break;
            case "libra":
                System.out.println(cant + " euros = " + cant*0.86 + " libras");
                break;
            case "yenes":
                System.out.println(cant + " euros = " + cant*129.852 + " yenes");
                break;
                
        }
    }
    
}

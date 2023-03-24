/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese un numero entero");
       int num = leer.nextInt();
       System.out.println("doble: " + num*2);
       System.out.println("triple: " + num*3);
       System.out.println("raiz: " + Math.sqrt(num));
    }
    
}

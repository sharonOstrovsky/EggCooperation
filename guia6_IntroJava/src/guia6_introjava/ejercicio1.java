/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/

package guia6_introjava;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1+num2;
        System.out.println("la suma de los numeros es: " + suma);
    }
    
}

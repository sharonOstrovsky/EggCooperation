/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero limite");
        int limite = leer.nextInt();
        int suma = 0;
        do{
           System.out.println("ingrese un numero");
           int num = leer.nextInt();
           suma += num; 
        }while (suma < limite);
    }
    
}

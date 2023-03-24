/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/
package ejercicio15;

/**
 *
 * @author sharo
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vec = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vec[i] = i;
        }
        for(int i = 99; i >= 0; i--){
            System.out.print(" " + vec[i] + " ");
        }
    }
    
}

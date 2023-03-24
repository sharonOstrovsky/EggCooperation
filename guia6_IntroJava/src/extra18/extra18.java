/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
*/
package extra18;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 5;
        int[] vec = new int[N];
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el vector");
        for(int i = 0; i < N; i++){
            vec[i] = leer.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            suma += vec[i];
        }
         
        System.out.println("suma = " + suma);
        
    }
    
}

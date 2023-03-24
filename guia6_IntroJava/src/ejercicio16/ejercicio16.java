/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
*/
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantrep = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        
        for(int i = 0; i < n - 1; i++ ){
            vec[i] = Aleatorio(0,10);
        }
        
        for(int i = 0; i < n - 1; i++ ){
            System.out.print(" " + vec[i] + " ");
        }
        System.out.println(" ");
        
        System.out.println("ingrese el numero a buscar en el vector");
        int buscado = leer.nextInt();
        
        for(int i = 0; i < n - 1; i++ ){
            if(vec[i] == buscado ){
                System.out.println("posicion: " + i);
                cantrep++;
            }
        }
        if (cantrep > 1){
            System.out.println("el numero esta repetido " + cantrep + " veces");
        }else{
            if(cantrep == 1){
                System.out.println("el numero no esta repetido");
            }else{
                System.out.println("el numero no se encuntra");
            }
            
        }
        
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
}

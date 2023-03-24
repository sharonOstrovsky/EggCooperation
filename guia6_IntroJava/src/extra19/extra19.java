/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/
package extra19;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 5;
        int[] vec1 = new int[N];
        int[] vec2 = new int[N];
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el vector 1");
        for(int i = 0; i < N; i++){
            vec1[i] = leer.nextInt();
        }
        
         System.out.println("ingrese el vector 2");
        for(int i = 0; i < N; i++){
            vec2[i] = leer.nextInt();
        }
        
 //       for(int i = 0; i < N; i++){
 //           if(vec1[i] != vec2[i]){
 //               System.out.println("son diferentes");
 //               break;
 //           }
 //       }
        
        int i = 0;
        while(i < N && vec1[i] == vec2[i] ){
            
            if(vec1[i] != vec2[i]){
                System.out.println("son diferentes");
                break;
            }
            i++;
        }
        if(i == N){
            System.out.println("son iguales");
            
        }
        
    }
    
}

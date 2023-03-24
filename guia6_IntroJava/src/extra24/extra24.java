/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
24. Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci.
*/
package extra24;

/**
 *
 * @author sharo
 */
public class extra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 12;
        int[] fibonacci = new int[n];
        for(int i = 0; i < n; i++){
            fibonacci[i] = CalculoFibonacci(i);
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(" " + fibonacci[i] + " ");
        }
        
    }
    
    public static int CalculoFibonacci(int n){
        int fibonacci;
        if(n<=1){
            return fibonacci = 1;
        }else{
            return fibonacci = CalculoFibonacci(n-1) + CalculoFibonacci(n-2);
        }
    }
    

    
       public static int CalculoFibonacci2(int n){
        int fibonacci;
        if(n == 1 | n == 2){
            return fibonacci = 1;
        }else if(n == 0){
            return fibonacci = 0;
        }else{
            return fibonacci = CalculoFibonacci(n-1) + CalculoFibonacci(n-2);
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
package extra20;

/**
 *
 * @author sharo
 */
public class extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 5;
        int[] vec = new int[N];
        llenarVectorAleatorio(vec, N);
        imprimirVector(vec,N);
    }
    
    public static void imprimirVector(int[] vec, int n){
        System.out.print("vec = [ ");
        for(int i = 0; i < n; i++){
            System.out.print(" " + vec[i] + " ");      
        }
        System.out.println(" ]");
   
    }
    public static void llenarVectorAleatorio(int[] vec, int N){
        for(int i = 0; i < N; i++){
            vec[i] = Aleatorio(1,10);   
        }
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

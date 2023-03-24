/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
22. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
*/
package extra22;

/**
 *
 * @author sharo
 */
public class extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 3;
        int M = 3;
        int[][] matriz = new int[N][M];
        llenarMatriz(matriz, N, M);
        System.out.println("MATRIZ");
        imprimirMatriz(matriz, N, M);
        System.out.println("suma = " + sumaElementosMatriz(matriz,N,M));
    }
    
    public static int sumaElementosMatriz(int[][] matriz, int n, int m){
        int suma = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
    public static void imprimirMatriz(int[][] matriz, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void llenarMatriz(int[][] matriz, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = Aleatorio(1,10);
            }
        }
    }
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

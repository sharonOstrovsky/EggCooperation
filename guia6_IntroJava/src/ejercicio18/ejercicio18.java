/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
*/
package ejercicio18;

/**
 *
 * @author sharo
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        llenar_matriz(matriz,4,4);
        System.out.println("matriz:");
        imprimir_matriz(matriz,4,4);
        
        System.out.println();
        
        matriz_traspuesta(matriz,4,4);
        
 /*       
       // IMPRIMIR DIRECTO UNA TRASPUESTA
        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 4; j++){
                System.out.print(" " + matriz[j][i] + " ");
            }
            System.out.println();
        }
*/
    }
    
    public static void matriz_traspuesta(int[][] matriz, int n, int m){
        int[][] tras = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                tras[j][i] = matriz[i][j];
            }
        }
        System.out.println("traspuesta:");
        imprimir_matriz(tras, n, m);
    }
    
    public static void imprimir_matriz(int[][] matriz,int n,int m){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
        
        
    public static void llenar_matriz(int[][] matriz,int n,int m){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = Aleatorio(0,9);
            }
        }
    }
    
     public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
package ejercicio19;

/**
 *
 * @author sharo
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int [][] matriz = new int [n][m];
        int[][] tras = new int[n][m];
        boolean rta;
        
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        
        matriz_traspuesta(matriz,tras,3,3);
        
        System.out.println("matriz:");
        imprimir_matriz(matriz,3,3);
        System.out.println();
        System.out.println("traspuesta:");
        imprimir_matriz(tras,3,3);
        System.out.println();
        
        rta = es_matriz_anti_simetrica(matriz,tras,3);
        System.out.println(rta);
        
    }
    
    public static boolean es_matriz_anti_simetrica(int[][] matriz, int[][] tras, int n){
        boolean antiSimetrica = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] != -tras[i][j]){
                    antiSimetrica = false;
                }
            }
        }
        
        return antiSimetrica;
        
    }
    
    public static void imprimir_matriz(int[][] matriz,int n,int m){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void matriz_traspuesta(int[][] matriz,int[][] tras, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                tras[j][i] = matriz[i][j];
            }
        }
           
    }
    
}

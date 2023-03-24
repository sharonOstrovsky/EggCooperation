/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.

*/
package ejercicio21;

/**
 *
 * @author sharo
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int[][] aux = new int[3][3];
        llenarMatrizP(matrizP);
        llenarMatrizM(matrizM);
        
        System.out.println("matrizM:");
        imprimir_matriz(matrizM,10,10);
        System.out.println();
        System.out.println("matrizP:");
        imprimir_matriz(matrizP,3,3);
        
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                copiarMatriz(matrizM, aux, i, j);
                if(compararMatrices(aux, matrizP)){
                    System.out.println();
                    System.out.println("posicion fila: " + i);
                    System.out.println("posicion columna: " + j);
                }
            }
        }
        
    }
    
    
    public static void copiarMatriz(int[][] matriz, int[][] aux, int fil, int col){
        int k = 0;
        int l = 0;
        for(int i = fil; i < fil + 3; i++){
            for(int j = col; j < col + 3; j++){
                aux[k][l] = matriz[i][j];
                l++;
                if(l == 3){
                    l = 0;
                }
            }
            k++;
            if(k == 3){
                k = 0;
            }
        }
    }
    
    public static boolean compararMatrices(int[][] matrizM, int[][] matrizP){
        boolean rta = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matrizM[i][j] != matrizP[i][j]){
                    rta = false;
                }
            }
        }
        return rta;
    }
    
    public static void imprimir_matriz(int[][] matriz,int n,int m){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    public static void llenarMatrizP(int[][] matriz){
        matriz[0][0] = 36;
        matriz[0][1] = 5;
        matriz[0][2] = 67;
        matriz[1][0] = 89;
        matriz[1][1] = 90;
        matriz[1][2] = 75;
        matriz[2][0] = 14;
        matriz[2][1] = 22;
        matriz[2][2] = 26;        
    }
    
    
    public static void llenarMatrizM(int[][] matriz){
        for(int i = 0; i < 10;i++){
            for(int j = 0; j < 10; j++){
                matriz[i][j] = Aleatorio(0,9);
            }
        }
        
        matriz[7][7] = 36;
        matriz[7][8] = 5;
        matriz[7][9] = 67;
        matriz[8][7] = 89;
        matriz[8][8] = 90;
        matriz[8][9] = 75;
        matriz[9][7] = 14;
        matriz[9][8] = 22;
        matriz[9][9] = 26;
    
    }
    
    
     public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

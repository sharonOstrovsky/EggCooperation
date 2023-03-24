/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author sharo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
     
        llenarMatrizP(matrizP);
        llenarMatrizM(matrizM);
        System.out.println("matrizM:");
        imprimir_matriz(matrizM,10,10);
        System.out.println();
        System.out.println("matrizP:");
        imprimir_matriz(matrizP,3,3);
        
        for(int i = 0; i < 8; i++){
            for(int j =0; j < 8; j++){
                if(matrizP[0][0] == matrizM[i][j]){
                    boolean check = true;
                    for(int k = 0; k < 3; k++){
                        for(int l = 0; l < 3; l++){
                            check = matrizP[k][l] == matrizM[i+k][j+1];
                            j++;
                            if(l == 2){
                                j -= 3; 
                            }
                        }
                        i++;
                        if(k == 2){
                            i -= 3;
                        }
                    }
                    if(check = true){
                        System.out.println("posicion i: " + i + " j: " + j);
                        break;
                    }else{
                        continue;
                    }
                }
                
                
            }
        }
        
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
        
        matriz[4][4] = 36;
        matriz[4][5] = 5;
        matriz[4][6] = 67;
        matriz[5][4] = 89;
        matriz[5][5] = 90;
        matriz[5][6] = 75;
        matriz[6][4] = 14;
        matriz[6][5] = 22;
        matriz[6][6] = 26;
    
    }
    
    
     public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

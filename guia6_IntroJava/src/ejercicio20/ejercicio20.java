/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

*/
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        llenar_matriz(matriz,3,3);
        System.out.println();
        System.out.println("matriz:");
        imprimir_matriz(matriz,3,3);
        System.out.println();
        
              
        if(esMatrizMagica(matriz,3)){
            System.out.println("la matriz es magica");
        }else{
            System.out.println("la matriz NO es magica");
        }
        
    }
    
    public static boolean esMatrizMagica(int[][] matriz, int n){
        int tamVec = 8; //n * 2 + 2;  //n filas + n columnas + 2 diagonales
        int[] aux = new int[tamVec];
        boolean rta = true;
        int cont = -1;
        int l = 0;
        
        //inicializo el vector auxiliar en cero
        for(int i = 0; i < tamVec; i++){
            aux[i] = 0;
        }
        
        for(int i = 0; i < n; i++){
            cont++;
            for(int j = 0; j < n; j++){
                aux[cont] += matriz[i][j];//guardo la suma de las filas
                aux[cont + n] += matriz[j][i];//guardo la suma de las columnas
                
            }
        }
        
        for(int i = 0; i < n; i++){
            aux[n*2] += matriz[i][i];//guardo suma de diagonal principal
            aux[n*2+1] += matriz[i][n-i-1];//guardp suma de diagonal secundaria
            
        }
        System.out.println("vector contador:");
        for(int i = 0; i < tamVec; i++){
            System.out.print(" " + aux[i] + " ");        
    }
        
        //me fijo que todas las sumas sean iguales
        while (rta == true && l < tamVec - 1){
            if(aux[l] != aux[l+1]){
                rta = false;
            }
            l++;
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
    
    
    public static void llenar_matriz(int[][] matriz,int n,int m){
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese la matriz:");
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                num = leer.nextInt();
                while(num > 9 || num < 1){
                    System.out.println("numero no valido");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
                
            }
        }
    }
    
}

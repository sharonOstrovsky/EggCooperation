/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        int[] cont = new int[6];
        
     //lleno el vector   
        for(int i = 0; i < n; i++ ){
            vec[i] = Aleatorio(0,100000);
        }
        //inicializo vector contador
        for(int i = 0; i < 6; i++){
            cont[i]=0;
        }
        
     //imprimo vector   
        for(int i = 0; i < n; i++ ){
            System.out.print(" " + vec[i] + " ");
        }
        System.out.println(" ");
        
        for(int i = 0; i < n; i++){
            System.out.println("cant: " + cantDigitos(vec[i]));
            if(cantDigitos(vec[i]) == 1){
                cont[0]++;
            }else if(cantDigitos(vec[i]) == 2){
                cont[1]++;
            }else if(cantDigitos(vec[i]) == 3){
                cont[2]++;
            }else if(cantDigitos(vec[i]) == 4){
                cont[3]++;
            }else if(cantDigitos(vec[i]) == 5){
                cont[4]++;
            }

        }
        
        for(int i = 1; i < 6; i++){
            System.out.println("cantidad de numeros con " + i + " digitos: " + cont[i-1]);
        }
        
    }
     public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
     
     public static int cantDigitos(int num){
         int digitos = 0;
         while(num >= 1){
             num /= 10;
             digitos++;
         }
         return digitos;
    }
}


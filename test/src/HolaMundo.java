
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sharo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       String [][] sopa = new String[20][20];
       String palabra;
       int num;
               
       for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese una palabra");
            palabra = input.nextLine().toUpperCase();
            completarSopa(palabra, sopa);
        }
       
             for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                if(sopa[j][k] == null){
                  num = Aleatorio(1,9);
                sopa[j][k]= Integer.toString(num);
                }
                
        }
            
            
       }
       
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
               
               System.out.print("["+sopa[i][j]+"]");
                
            }
            System.out.println("");
            
        }
    }
    public static void completarSopa(String p, String[][] sopa) {
        boolean check = true;
        int i;
        int num;
        do{
        i = Aleatorio(1,19);
        for (int j = 0; j < 20; j++) {
            if(sopa[i][j] != null){
                
                check= false;
            }
            
         }
        }while(!check);
        
        if(check){
            for (int j = 1; j < p.length()+1; j++) {
                sopa[i][j] = p.substring(j-1, j);
                
            }
        }
        
  //      for (int j = 0; j < 20; j++) {
  //          for (int k = 0; k < 20; k++) {
  //              if(sopa[j][k] == null){
  //                num = Aleatorio(1,9);
    //              sopa[j][k]= Integer.toString(num);
  //              }
                
      //      }
            
            
   //     }
        
    }
    
    public static int Aleatorio(int min, int max) {
           int range = (max - min) + 1;
           return (int)(Math.random() * range) + min;
	}
    
}

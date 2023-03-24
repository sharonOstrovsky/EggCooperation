/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
*/
package extra14;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de familia");
        int fam = leer.nextInt();
        int edad = 0;
        int total = 0;
        
        for(int i = 0; i < fam; i++){
            System.out.println("ingrese la cantidad de hijos de la familia");
            int hijos = leer.nextInt();
            total += hijos;
            for(int j = 0; j<hijos;j++){
                edad += Aleatorio(1,50); 
            }
        }
        
        System.out.println("media de edad de hijos: " + edad/total);
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

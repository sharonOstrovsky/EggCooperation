/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package extra6;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura;
        float sumaTotal = 0;
        float sumaBajos = 0;
        int cantTotal =0;
        int cantBajos = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas:");
        int N = leer.nextInt();
        for(int i = 0; i < N; i++){
           Scanner leer1 = new Scanner(System.in);
            altura = leer1.nextDouble();
            cantTotal++;
            sumaTotal += altura;
            if(altura < 1.60){
                cantBajos++;
                sumaBajos += altura;
            
        }
            
        }
        
        System.out.println("promedio total = " + sumaTotal / cantTotal);
        System.out.println("promedio bajos = " + sumaBajos / cantBajos);
    }
    
}

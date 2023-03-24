/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
13. Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
package extra13;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese la altura de la escalera");
        Scanner leer = new Scanner(System.in);
        int altura = leer.nextInt();
        for(int i = 1; i < altura+1; i++){
            for(int j = 1; j < i+1; j++){
                System.out.print(j);  
            }
            System.out.println();
        }
    }
    
}

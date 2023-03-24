/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
*/
package extra11;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            System.out.println("cantidad de digitos: " + cantDigitos(num));
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

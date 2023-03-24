/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
package extra8;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int contador = 0;
        int par = 0;
        int impar = 0;
       do{
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        num = leer.nextInt(); 
        contador++;
        if(num % 2 == 0){
            par++;
        }else{
            impar++;
        }
       }while (!(num % 5 == 0));
       
       System.out.println("cantidad total ingresada: " + contador);
       System.out.println("pares: " + par);
       System.out.println("impares: " + impar);
        
    }
    
}

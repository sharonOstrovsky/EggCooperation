/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
package extra16;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        String seguir;
        int edad;
        
        do{
            System.out.println("ingrese su nombre");
            nombre = leer.nextLine();
            System.out.println("ingrese sus edad");
            edad = leer.nextInt();
            
            
            System.out.println("su nombre es " + nombre + " y tiene " + edad + " años");
            if (edad < 18){
                System.out.println("usted es menor de edad");
            }else{
                System.out.println("usted es mayor de edad");
            }
            
            System.out.println("desea continuar?");
            seguir = leer.nextLine();
            seguir = leer.nextLine();
    
        }while(!seguir.equals("No"));
    }
    
}

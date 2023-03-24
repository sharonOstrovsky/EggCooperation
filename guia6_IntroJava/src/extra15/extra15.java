/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
*/
package extra15;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese otro numero");
        int num2 = leer.nextInt();
        do{
            System.out.println("1.sumar");
            System.out.println("2.restar");
            System.out.println("3.multiplicar");
            System.out.println("4.dividir");
            System.out.println("salir");
            int op = leer.nextInt();
            switch(op){
               case 1:
                    System.out.println("suma = " + sumar(num1,num2));
                    break;
               case 2:
                   System.out.println("resta = " + restar(num1,num2));
                   break;
               case 3:
                   System.out.println("multiplicacion = " + multiplicar(num1,num2));
                   break;
               case 4:
                   System.out.println("dividir = " + dividir(num1,num2));
                   break;
               case 5:
                   continuar = false;
                   break;
            }
            
        }while(continuar);
    }
    
    public static int sumar(int num1, int num2){
        return num1+num2;
    }
    
    public static int restar(int num1, int num2){
        return num1-num2;
    }
    
    public static int multiplicar(int num1, int num2){
        return num1*num2;
    }
    
    public static int dividir(int num1, int num2){
        return num1/num2;
    }
}

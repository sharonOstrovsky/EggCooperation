/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
        int num2 = leer.nextInt();
        boolean continuar = true;
        while(continuar){
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion: ");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    int suma = num1+num2;
                    System.out.println("Suma: " + suma);
                    break;
                case 2:
                    int resta = num1-num2;
                    System.out.println("Resta: " + resta);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("Multiplicacion: " + mult);
                    break;
                case 4:
                    float div = num1 / num2;
                    System.out.println("Division: " + div);
                    break;
                case 5:
                    Scanner leerr = new Scanner (System.in);
                    System.out.println("¿esta seguro que desea salir? s/n");
                    String salida = leerr.nextLine();
                    if (salida.equalsIgnoreCase("s")){
                        continuar = false;
                        break;
                    }else{
                        break;
                    }
                    
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
*/
package extra7;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int total = n;
        int num;
        int max;
        int min;
        float suma = 0;
        double promedio;
        
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        max = num;
        min = num;
        suma += num;
        n--;
        while(n>0){
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            n--;
            if(num < min){
                min = num;
                suma += num;
            }else if(num > max){
                max = num;
                suma += num;
            }else{
                suma += num;
            }

        }
        promedio = suma/total;
        System.out.println("Valor minimo = " + min + "\nValor maximo = " + max + "\nPromedio = " + promedio);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/
package extra10;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = Aleatorio(0,10);
        int num2 = Aleatorio(0,10);
        int rta;
        System.out.println(num1*num2);
        do{
            System.out.println("ingrese un numero");
            Scanner leer = new Scanner(System.in);
            rta = leer.nextInt();
            if (rta == num1*num2){
                System.out.println("CORRECTO");
            }else{
                System.out.println("INCORRECTO. vuelva a intentarlo");
            }
            
        }while(num1 * num2 != rta);
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

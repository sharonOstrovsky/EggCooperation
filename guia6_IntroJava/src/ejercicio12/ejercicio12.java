/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int correctas = 0;
        int incorrectas = 0;
        String cadena;
        System.out.println("Ingrese una frase");
        
        do{
            Scanner leer = new Scanner(System.in);
            cadena = leer.nextLine();
            System.out.println(cadena.substring(cadena.length() - 1, cadena.length()));
            System.out.println(cadena.length());
            if(cadena.length() <= 5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(cadena.length() - 1, cadena.length()).equalsIgnoreCase("O")){
                correctas++;
            }else{
                incorrectas++;
            }
            
        }while(!cadena.equals("&&&&&"));
        
        System.out.println("cant correctas: " + correctas);
        System.out.println("cant incorrectas: " + incorrectas);
    }
    
}

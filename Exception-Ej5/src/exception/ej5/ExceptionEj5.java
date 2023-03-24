/*
5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
*/
package exception.ej5;

import java.util.Scanner;


public class ExceptionEj5 {


    public static void main(String[] args) {
        int cont = 0;
        try{
            
            Scanner input = new Scanner(System.in);
            int aleatorio = (int) (Math.random()*5 + 1);
            boolean encontrado = false;
            int num;
//            int cont = 0;
            
            do{
                System.out.println("ingrese un numero");
                cont++;
                num = input.nextInt();
               // cont++;
                if(num == aleatorio){
                    encontrado = true;
                    System.out.println("Usted ha adivinado!");
                    
                }else{
                    if(num < aleatorio){
                        System.out.println("es un numero mas grande");
                    }else{
                        System.out.println("es un numero mas chico");
                    }
                }
                
            }while(!encontrado);

        }catch(ArithmeticException e){
            System.out.println("no es un numero valido");
            System.out.println(e.getMessage());
            
            
        }finally{
//            System.out.println("Usted ha adivinado!");
            System.out.println("cantidad de intentos: " + cont);
        }
        
    }
    
}

/*
5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package poo.extra5;

import java.util.Scanner;


public class POOExtra5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto = meses[(int)(Math.random()*10)];
        String mesIngresado;
        boolean encontrado = false;
        
        System.out.println("mesSecreto = "+ mesSecreto);
        System.out.println("Adivine el mes secreto. Introducza el nombre del mes en minusculas");
        mesIngresado = input.next();
        while(!mesIngresado.equals(mesSecreto) ){
            for (int i = 0; i < 12; i++) {
                if(mesIngresado.equals(meses[i])){
                    encontrado = true;
                }
            }
            
            if(!encontrado){
                System.out.println("Ha ingresado un mes no valido");
            }
            
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mesIngresado = input.next();
        }
        if(mesIngresado.equals(mesSecreto)){
            System.out.println("¡Ha acertado!");
        }
        
    }
    
}

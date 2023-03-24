/*
Ejercicio1
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

*/
package poo.repaso1;

import Entidades.Fraccion;
import Servicio.FraccionServicio;
import java.util.Scanner;


public class POORepaso1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean operacion = true;
        
        FraccionServicio fs = new FraccionServicio();
        Fraccion f = fs.crearFraccion();
        
        while(operacion){
            System.out.println("MENU OPERACIONES");
            System.out.println("1. Suma de fracciones");
            System.out.println("2. Resta de fracciones");
            System.out.println("3. Multiplicacion de fracciones");
            System.out.println("4. Division de fracciones");
            System.out.println("5. Salir");
            
            switch(input.nextInt()){
                case 1:
                    fs.sumar(f);
                    break;
                case 2:
                    fs.restar(f);
                    break;
                case 3:
                    fs.multiplicar(f);
                    break;
                case 4:
                    fs.dividir(f);
                    break;
                case 5:
                    operacion = false;
                    break;
                    
            }
        }
        
        
    }
    
}

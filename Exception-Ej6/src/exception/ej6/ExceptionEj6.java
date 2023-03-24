/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ExceptionEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(validarIngresoNumeroEntero());
       // validarIngresoNumeroEntero();
        //System.out.println(validarIngresoNumeroFloat());
    }
    
    public static int validarIngresoNumeroEntero(){
       // Scanner scanner = new Scanner(System.in).useDelimiter("\n\n");
        int num = -1;
        do{
            Scanner scanner = new Scanner(System.in).useDelimiter("");
            
            try{
                System.out.println("ingreasar un numero");
                num = scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println(e.getMessage() + ": solo se puede ingresar numeros enteros, intente nuevamente");
                scanner.next();
            }catch(Exception e){
               System.out.println(e.getMessage() + ": Error del sistema, intente nuevamente");
                scanner.next();
            }

        }while(num<=0);
        return num;
    }
    
    public static float validarIngresoNumeroFloat(){
        float num = -1;
        do{
            Scanner scanner = new Scanner(System.in).useDelimiter("");
            try{
                num = scanner.nextFloat();
            }catch(InputMismatchException e){
                System.out.println(e.getMessage() + ": solo se puede ingresar numeros enteros, intente nuevamente");
            }catch(Exception e){
                System.out.println(e.getMessage() + ": Error del sistema, intente nuevamente");
            }

        }while(num<=0);
        return num;
    }
    
}

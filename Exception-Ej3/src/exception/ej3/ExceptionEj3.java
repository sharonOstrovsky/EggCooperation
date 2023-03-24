/*
3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
*/
package exception.ej3;

import Entidad.DivisionNumero;
import Servicio.DivisionNumeroServicio;
import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionEj3 {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       
        
        try{
            DivisionNumeroServicio servicio = new DivisionNumeroServicio();
            DivisionNumero division = new DivisionNumero();
            
            System.out.println("ingrese un numero");
            String cadenaNum1 = input.next();
            System.out.println("ingrese otro numero");
            String cadenaNum2 = input.next();
            
            division = servicio.crearDivision(cadenaNum2, cadenaNum2);
            double resultado = servicio.dividir(division);
            System.out.println(resultado);
           
        }catch(ArithmeticException | InputMismatchException | NumberFormatException e){
            //System.out.println("no se pueden dividir");
            
            System.out.println(e.getMessage());
        }
    }
    
}

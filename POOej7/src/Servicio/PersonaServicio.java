
package Servicio;

import Entidades.Persona;

import java.util.Scanner;


public class PersonaServicio {
    
    
    /*
    le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
    */
    public Persona crearPersona(){
        Scanner input = new Scanner(System.in);
        String sexo;
        Persona p = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(input.next());
        System.out.println("Ingrese la edad de la persona");
        p.setEdad(input.nextInt());

        do{
            System.out.println("Ingrese el sexo de la persona");
            sexo = input.next();
        } while(!(sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")));
        p.setSexo(sexo);
     
        System.out.println("Ingrese el peso de la persona");
        p.setPeso(input.nextFloat());
        System.out.println("Ingrese la altura de la persona");
        p.setAltura(input.nextFloat());
        
        return p;
    }
    
    /*
    calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    public int calcularIMC(Persona p){
        float IMC = p.getPeso()/(p.getAltura() * p.getAltura());
        if(IMC < 20){
            return -1;
        }else if(IMC >= 20 && IMC <= 25){
            return 0;
        }else{
            return 1;
        }
    }
    
    /*
    indica si la persona es mayor de edad. La función devuelve
un booleano.
    */
    public boolean esMayorDeEdad(Persona p){
        return p.getEdad() > 17;
               
    }
    
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }
   
 
}

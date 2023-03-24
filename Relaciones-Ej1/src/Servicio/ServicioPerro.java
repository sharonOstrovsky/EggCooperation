
package Servicio;

import Entidades.Perro;
import Enumeraciones.RazaPerro;
import java.util.Scanner;


public class ServicioPerro {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        
        Perro perro = new Perro();
        
        System.out.print("Ingrese el nombre del Perro: ");
        perro.setNombre(input.next());
        
        System.out.print("Ingrese la edad del Perro: ");
        perro.setEdad(input.nextInt());
        
        System.out.print("Ingrese el tamaño del Perro: ");
        perro.setTam(input.nextDouble());
        
        System.out.print("Ingrese la raza del Perro: ");
        String raza = input.next();
        
        for (RazaPerro aux : RazaPerro.values()) {
            if(aux.toString().equalsIgnoreCase(raza)){
                perro.setRaza(aux);
            }
        }
        
        return perro;
        
    }
    
}

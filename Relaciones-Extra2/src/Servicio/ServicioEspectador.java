
package Servicio;

import Entidades.Espectador;
import java.util.Scanner;


public class ServicioEspectador {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Espectador crearEspectador(){
        
        Espectador espectador = new Espectador();
        
        System.out.print("Ingrese el nombre del espectador: ");
        espectador.setNombre(input.next());
        System.out.print("Ingrese la edad del espectador: ");
        espectador.setEdad(input.nextInt());
        System.out.print("Ingrese el dinero disponible del espectador: ");
        espectador.setDineroDisponible(input.nextDouble());
        
        return espectador;
    }
}

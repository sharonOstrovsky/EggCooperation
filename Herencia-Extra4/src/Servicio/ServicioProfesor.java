
package Servicio;

import Entidad.Profesor;
import Enumeraciones.Departamento;
import java.util.Scanner;


public class ServicioProfesor extends ServicioEmpleado{
    
    Scanner input = new Scanner(System.in);
    
    //• Cambio de departamento de un profesor.
    public void cambioDepartamento(Profesor profesor){
        
        System.out.println("Ingrese el nuevo departamento");
        String departamento = input.next();
        
        for (Departamento aux : Departamento.values()){
            
            if(departamento.equalsIgnoreCase(aux.name())){
                profesor.setDepartamento(aux);
            }
        }
        
    }
    
}


package Servicio;

import Entidad.Empleado;
import java.util.Scanner;


public class ServicioEmpleado extends ServicioPersona{
    
    Scanner input = new Scanner(System.in);
    
    //• Reasignación de despacho a un empleado.
    public void reasignacionDespacho(Empleado empleado){
        System.out.print("Ingrese el nuevo numero de despacho: ");
        empleado.setNumDespacho(input.nextInt());
    }
    
}

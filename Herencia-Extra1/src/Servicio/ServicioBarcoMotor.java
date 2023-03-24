
package Servicio;

import Entidad.BarcoMotor;


public class ServicioBarcoMotor extends ServicioBarco{
    
    
    public void mostrarBarcoMotor(BarcoMotor barco){
        
        System.out.println("BARCO A MOTOR:");
        System.out.println("Matricula: " + barco.getMatricula());
        System.out.println("Eslora: " + barco.getEslora() + " metros");
        System.out.println("Año de fabricacion: " + barco.getAnioFabricacion());
        System.out.println("Potencia: " + barco.getPotencia());
    }
    
    public double calculoModulo(BarcoMotor barco){
        
        return (barco.getEslora()*10) + barco.getPotencia();
    }
}

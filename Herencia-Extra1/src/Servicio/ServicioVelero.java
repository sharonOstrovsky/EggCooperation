
package Servicio;

import Entidad.Velero;


public class ServicioVelero extends ServicioBarco{
    
    
    public void mostrarVelero(Velero velero){
        
        System.out.println("VELERO");
        System.out.println("Matricula: " + velero.getMatricula());
        System.out.println("Eslora: " + velero.getEslora() + " metros");
        System.out.println("Año de fabricacion: " + velero.getAnioFabricacion());
        System.out.println("Numero de Mastiles: " + velero.getNumMastiles());
    }
    
    public double calculoModulo(Velero velero){
        return (velero.getEslora() * 10) + velero.getNumMastiles();
    }
}

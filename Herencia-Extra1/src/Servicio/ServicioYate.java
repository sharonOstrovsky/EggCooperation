
package Servicio;

import Entidad.Yate;


public class ServicioYate extends ServicioBarco{
    
    public void mostrarYate(Yate yate){
        
        System.out.println("YATE:");
        System.out.println("Matricula: " + yate.getMatricula());
        System.out.println("Eslora: " + yate.getEslora() + " metros");
        System.out.println("Año de fabricacion: " + yate.getAnioFabricacion());
        System.out.println("Potencia: " + yate.getPotencia());
        System.out.println("Numero de camarotes: " + yate.getNumCamarotes());
    }
    
    
    public double calculoModulo(Yate yate){
        
        return (yate.getEslora() * 10 ) + yate.getPotencia() + yate.getNumCamarotes();
    }
}

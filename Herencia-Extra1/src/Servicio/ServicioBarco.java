
package Servicio;

import Entidad.Barco;


public class ServicioBarco {
    
    
    public void mostrarBarco(Barco barco){
        
        System.out.println("BARCO:");
        System.out.println("Matricula: " + barco.getMatricula());
        System.out.println("Eslora: " + barco.getEslora() + " metros");
        System.out.println("Año de fabricacion: " + barco.getAnioFabricacion());
    }
    
    public double calculoModulo(Barco barco){
        return barco.getEslora() * 10;
    }
      
    }

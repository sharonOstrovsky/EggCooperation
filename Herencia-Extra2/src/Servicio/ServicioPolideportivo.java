
package Servicio;

import Entidad.Polideportivo;


public class ServicioPolideportivo extends ServicioEdificio{
    
    public boolean isTechado(Polideportivo pol){
        
        return pol.getTipoInstalacion().equalsIgnoreCase("Techado");
        
    }
    
}

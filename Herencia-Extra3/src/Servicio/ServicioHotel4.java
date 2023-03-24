
package Servicio;

import Entidad.Hotel4;


public class ServicioHotel4 extends ServicioHotel{
    
    public boolean comprobarGimasio(Hotel4 hotel){
        
        if(hotel.getGimasio() == 'A'  || hotel.getGimasio() == 'B'){
            return true;
        }else{
            return false;
        }
        
    }
    
    public int valorAgregadoPorRestaurante(Hotel4 hotel){
        
        int valor = 0;

        if( hotel.getCapacidadRestaurante() < 30 ){
            valor = 10;
        }else{
            if( hotel.getCapacidadRestaurante() >= 30 && hotel.getCapacidadRestaurante() <= 50 ){
                valor = 30;
            }else{
                if( hotel.getCapacidadRestaurante() > 50 ){
                    valor = 50;
                }
            }
        }
        
        return valor;
        
    }
    
    public int valorAgregadoPorGimnasio(Hotel4 hotel){
        
        int valor = 0;
        
        if( hotel.getGimasio() == 'A' ){
            valor = 50;
        }else{
            if( hotel.getGimasio() == 'B' ){
                valor = 30;
            }
        }
        
        return valor;
            
    }


    public void precioHabitacion(Hotel4 hotel){
        
        hotel.setPrecioHabitacion(50 + ( hotel.getNumCamas() + valorAgregadoPorRestaurante(hotel) + valorAgregadoPorGimnasio(hotel) ));
       // return 50 + ( hotel.getNumCamas() + valorAgregadoPorRestaurante(hotel) + valorAgregadoPorGimnasio(hotel) );
       
    }
    
}

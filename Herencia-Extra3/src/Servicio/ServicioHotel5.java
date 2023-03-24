
package Servicio;

import Entidad.Hotel5;


public class ServicioHotel5 extends ServicioHotel4{
    
    public boolean HayLimosinasDisponibles(Hotel5 hotel){
        if( hotel.getCantLimosinas() > 0 ){
            return true;
        }else{
            return false;
        }
    }
    
    public int valorAgregadoPorLimosina(Hotel5 hotel){
        
        return hotel.getCantLimosinas() * 15;
        
    }
    

    public void precioHabitacion(Hotel5 hotel){
        
        hotel.setPrecioHabitacion( 50 + hotel.getNumCamas() + valorAgregadoPorRestaurante(hotel) + valorAgregadoPorGimnasio(hotel) + valorAgregadoPorLimosina(hotel) );
        //return 50 + hotel.getNumCamas() + valorAgregadoPorRestaurante(hotel) + valorAgregadoPorGimnasio(hotel) + valorAgregadoPorLimosina(hotel);
       
    }
    
}

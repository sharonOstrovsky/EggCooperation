
package Servicio;

import Entidad.Hotel;
import Utilidades.Comparators;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class ServicioHotel extends ServicioAlojamiento{
    
    public void ordenarPorPrecio(ArrayList<Hotel> hoteles){
        
        hoteles.sort(Comparators.comparaPrecio);
    }
    
    public void mostrarHoteles(ArrayList<Hotel> hoteles){
        
        for (Hotel hotel : hoteles) {
            System.out.println("");
            System.out.println( toUpperCase(hotel.getClass().getSimpleName()) + ": " + hotel.getNombre() );
            System.out.println(hotel);
        }
        
    }
    
    
    
}

/*
3. Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
*/
package herencia.extra3;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import Servicio.ServicioAlojamiento;
import Servicio.ServicioCamping;
import Servicio.ServicioHotel;
import Servicio.ServicioHotel4;
import Servicio.ServicioHotel5;
import Servicio.ServicioResidencia;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.transform.Source;


public class HerenciaExtra3 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ServicioAlojamiento servAlojamiento = new ServicioAlojamiento();
        ServicioHotel servHotel = new ServicioHotel();
        ServicioHotel4 servHotel4 = new ServicioHotel4();
        ServicioHotel5 servHotel5 = new ServicioHotel5();
        ServicioCamping servCamping = new ServicioCamping();
        ServicioResidencia servResidencia = new ServicioResidencia();
        
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        ArrayList<Hotel> hoteles = new ArrayList<>();
        ArrayList<Camping> campings = new ArrayList<>();
        ArrayList<Residencia> residencias = new ArrayList<>();
        
        Hotel4 hotel4 = new Hotel4('B', "Resto hotel 4", 35, 10, 25, 3, 0 , "hotel 4 estrellas", "que te importa 1900", "bs as", "yono"); 
        servHotel4.precioHabitacion(hotel4);
        alojamientos.add(hotel4);
        
        Hotel5 hotel5 = new Hotel5(2,5,10,'A', "Resto hotel 5", 50, 10, 40, 5, 0 , "hotel 5 estrellas", "que te importa 2000", "bs as", "yo"); 
        servHotel5.precioHabitacion(hotel5); 
        alojamientos.add(hotel5);
        
        Camping camping1 = new Camping( 10, 3, false, true, 500, "camping prueba 1", "gss", "ds", "juan Carlos"  );
        alojamientos.add(camping1);
        
        Camping camping2 = new Camping( 10, 3, true, true, 500, "camping prueba 2", "gss", "ds", "pepe "  );
        alojamientos.add(camping2);
        
        Residencia residencia1 = new Residencia( 7, false, true, true, 900, "Residencia 1 prueba", "gs", "hsd", "jose" );
        alojamientos.add(residencia1);
        
        Residencia residencia2 = new Residencia( 7, true, true, true, 900, "Residencia 2 prueba", "gs", "hsd", "Beto" );
        alojamientos.add(residencia2);
        
        for (Alojamiento alojamiento : alojamientos) {
            
            if(alojamiento.getClass().getSimpleName().equalsIgnoreCase("Hotel4") ||alojamiento.getClass().getSimpleName().equalsIgnoreCase("Hotel5") ){
                hoteles.add((Hotel) alojamiento);
            }
            
            if( alojamiento.getClass().getSimpleName().equalsIgnoreCase("Camping") ){
                campings.add((Camping) alojamiento);
            }
            
            if( alojamiento.getClass().getSimpleName().equalsIgnoreCase("Residencia") ){
                residencias.add((Residencia) alojamiento);
            }
            
        }
        
        boolean continuar = true;
        while(continuar){
            //compañía de promociones turísticas
            System.out.println("");
            System.out.println("BIENVENIDO A LA COMPAÑIA DE PROMOCIONES TURISTICAS");
            System.out.println("Elija el criterio con el que quiere comenzar");
            System.out.println("1. Todos los Alojamientos");
            System.out.println("2. Todos los Hoteles de mas caro a mas barato");
            System.out.println("3. Todos los campings con restaurante");
            System.out.println("4. Todas las residencias que tienen descuento");
            System.out.println("5. Salir");
            
            switch(input.nextInt()){
                
                case 1:
                    //mostrar todos los alojamientos:
                    System.out.println("");
                    System.out.println("-----ALOJAMIENTOS-----");
                    servAlojamiento.mostrarAlojamientos(alojamientos);
                    System.out.println("");
                    System.out.println("-----FIN ALOJAMIENTOS-----");
                    break;
                case 2:
                    //mostrar todos los hoteles de mas caro a mas barato
                    System.out.println("");
                    System.out.println("-----HOTELES DE MAS CARO A MAS BARATO-----");
                    System.out.println("");
                    servHotel.ordenarPorPrecio(hoteles);
                    servHotel.mostrarHoteles(hoteles);
                    System.out.println("");
                    System.out.println("-----FIN HOTELES-----");
                    break;
                case 3:
                    //• todos los campings con restaurante
                    System.out.println("");
                    System.out.println("-----CAMPINGS CON RESTAURANTE-----");
                    System.out.println("");
                    servCamping.mostrarCampingConRestaurante(campings);
                    System.out.println("");
                    System.out.println("-----FIN CAMPINGS CON RESTAURANTE-----");
                    break;
                case 4:
                    //• todos las residencias que tienen descuento.
                    System.out.println("");
                    System.out.println("-----RESIDENCIAS CON DESCUENTO-----");
                    System.out.println("");
                    servResidencia.mostrarResidenciaConDescuento(residencias);
                    System.out.println("");
                    System.out.println("-----FIN RESIDENCIAS CON DESCUENTO-----");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("GRACIAS POR ELEGIR NUESTRA COMPAÑIA");
                    System.out.println("Esperamos que hayas encontrado lo que buscabas");
                    continuar = false;
                    
            }
            
        }
        
        
        
        
        
        
        
        
    }
    
}

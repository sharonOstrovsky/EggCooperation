/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package collections.ej6;

import Service.ServiceTienda;
import java.util.HashMap;
import javax.xml.transform.Source;


public class CollectionsEj6 {

    public static void main(String[] args) {
  
        ServiceTienda servicioTienda = new ServiceTienda();
        HashMap<String, Double> tienda = servicioTienda.crearTienda();
        
        servicioTienda.menu();
       

//        servicioTienda.introducirElemento(tienda);
//        servicioTienda.introducirElemento(tienda);
//        servicioTienda.introducirElemento(tienda);
//        
//        System.out.println("");
//        servicioTienda.mostrarHashMap(tienda);
//        
//        servicioTienda.modificarPrecio(tienda);
//        
//        System.out.println("");
//        servicioTienda.mostrarHashMap(tienda);
//        
//        System.out.println("");
//        servicioTienda.eliminarProducto(tienda);
//        servicioTienda.mostrarHashMap(tienda);
    }
    
}

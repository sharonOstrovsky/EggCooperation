
package Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/*
introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio 
*/

//El HashMap tendrá de llave el nombre del producto y de valor el precio.

public class ServiceTienda {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public HashMap<String, Double> crearTienda(){
        
        HashMap<String, Double> tienda = new HashMap();
        
        return tienda;
    }
    
    public void mostrarHashMap(HashMap<String, Double> tienda){
        for(Map.Entry<String, Double> entry : tienda.entrySet()){
            System.out.println("Producto = " + entry.getKey() + ", precio = " + entry.getValue());
        }
    }
    
    public void introducirElemento(HashMap<String, Double> tienda){
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = input.next();
        System.out.print("Ingrese el precio del producto: ");
        Double precio = input.nextDouble();
        
        tienda.put(nombre, precio);
    }
    
    public void modificarPrecio(HashMap<String, Double> tienda){
        
        Iterator<Map.Entry<String, Double>> itTienda = tienda.entrySet().iterator();
        System.out.print("Que producto desea modificar? ");
        String producto = input.next();
        
        while(itTienda.hasNext()){
            
            Map.Entry<String, Double> entryTienda = itTienda.next();
            
            if( entryTienda.getKey().equalsIgnoreCase(producto) ){
                System.out.print("Ingrese el nuevo precio : ");
                Double precio = input.nextDouble();
                tienda.replace(producto, precio);
            }
        }
    }
    
    public void eliminarProducto(HashMap<String, Double> tienda){

        System.out.print("Que producto desea eliminar? ");
        String producto = input.next();
        
        if(tienda.containsKey(producto)){
            tienda.remove(producto);
        }

    }
    
    public void eliminarproducto2(HashMap<String, Double> tienda){
        Iterator<Map.Entry<String, Double>> itTienda2 = tienda.entrySet().iterator();
        System.out.print("Que producto desea eliminar? ");
        String producto = input.next();
        
        while(itTienda2.hasNext()){
            
            Map.Entry<String, Double> entryTienda2 = itTienda2.next();
            
            if( entryTienda2.getKey().equalsIgnoreCase(producto) ){
                itTienda2.remove();
            }
        }
    }
    
    public void menu(){
        
        HashMap<String, Double> tienda = crearTienda();
        boolean continuar = true;
        
        do{
            
            System.out.println("\nMENU\n");
            System.out.println("1. Introducir un elemento");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar tienda");
            System.out.println("5. Salir");
            
            int option = input.nextInt();
            
            switch(option){
                case 1:
                    introducirElemento(tienda);
                    break;
                case 2:
                    modificarPrecio(tienda);
                    break;
                case 3:
                    //eliminarproducto2(tienda);
                    eliminarProducto(tienda);
                    break;
                case 4:
                    mostrarHashMap(tienda);
                    break;
                case 5:
                    continuar = false;
            }
            
        }while(continuar);
        
    }
}


package Servicio;

import Entidades.Cafetera;


public class CafeteraServicio {
    
    public Cafetera crearCafetera(){
        Cafetera c = new Cafetera();
        c.setCapacidadMaxima(5000);
        return c;
    }
    
   //hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(Cafetera c){
        
        
        c.setCantidadActual(c.getCapacidadMaxima());
        
      
        
    }
    
    //se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
    public void servirTaza(int tamanio, Cafetera c){
        if (c.getCantidadActual() < tamanio){
            System.out.println("La taza se lleno solo "+c.getCantidadActual());
            c.setCantidadActual(0);
        }else{
            System.out.println("Se lleno la taza");
            float cant = c.getCantidadActual() - tamanio;
            c.setCantidadActual(cant);
        }
        
    }
    
    //pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
        
    }
    
    //se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    public  void agregarCafe(Cafetera c, int cant){
        if(c.getCapacidadMaxima() > (c.getCantidadActual()+cant)){
            c.setCantidadActual(c.getCantidadActual()+cant);
        }
        
    }
}

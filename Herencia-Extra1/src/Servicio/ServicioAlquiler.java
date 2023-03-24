
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import java.util.Date;
import java.util.Scanner;


public class ServicioAlquiler {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(Barco barco){
        
        Alquiler alquiler = new Alquiler();
        
        System.out.println("---------FORMULARIO---------");
        System.out.println("");
        System.out.print("Nombre del cliente: ");
        alquiler.setNombre(input.next());
        System.out.print("Documento: ");
        alquiler.setDocumento(input.nextInt());
        System.out.println("Fecha de inicio del alquiler (DD/MM/AAAA): ");
        System.out.print("Dia: ");
        int dia = input.nextInt();
        System.out.print("Mes:");
        int mes = input.nextInt();
        System.out.print("Año: ");
        int anio = input.nextInt();
        Date fechaAlquiler = new Date(anio-1900,mes-1,dia);
        alquiler.setFechaAlquiler(fechaAlquiler);
        System.out.println("Fecha de devolucion (DD/MM/AAAA): ");
        System.out.print("Dia: ");
        dia = input.nextInt();
        System.out.print("Mes:");
        mes = input.nextInt();
        System.out.print("Año: ");
        anio = input.nextInt();
        Date fechaDevolucion = new Date(anio-1900,mes-1,dia);
        alquiler.setFechaDevolucion(fechaDevolucion);
        //pongo posicion de amarre aleatoria
        int posicion = (int) (Math.random() * 10) + 1;
        alquiler.setPosicionAmarre(posicion);
        alquiler.setBarco(barco);
        System.out.println("");
        System.out.println("---------FIN FORMULARIO---------");
        
        return alquiler;
        
    }
    
    
    public void mostrarAlquiler(Alquiler alquiler){
        
        System.out.println("-----RESUMEN ALQUILER-----");
        System.out.println("");
        System.out.println("Nombre del Cliente: " + alquiler.getNombre());
        System.out.println("Documento: " + alquiler.getDocumento());
        System.out.println("Fecha de Alquiler: " + alquiler.getFechaAlquiler().toString()  );
        System.out.println("Fecha de Devolucion: " + alquiler.getFechaDevolucion().toString());
        System.out.println("Posicion Amarre: " + alquiler.getPosicionAmarre());
        System.out.println("Barco: "+ alquiler.getBarco().getClass().getSimpleName());
    }
    
    public void CalcularAlquiler(Alquiler alquiler, double modulo){
        
        long dias =  (alquiler.getFechaDevolucion().getTime() - alquiler.getFechaAlquiler().getTime());
        
        int dif = (int) (dias * 0.000000012);
        
       
        System.out.println("TOTAL ALQUILER: $" + dif * modulo);
        
    }
    
}



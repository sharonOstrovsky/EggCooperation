
package pooej3;

import Entidades.Operacion;
import Servicio.OperacionServicio;


public class POOej3 {

    
    public static void main(String[] args) {
       
        OperacionServicio os = new OperacionServicio();
        Operacion op = os.crearOperacion();
        
        int suma = os.sumar(op);
        System.out.println("suma = "+ suma);
        
        int resta = os.restar(op);
        System.out.println("resta = "+ resta);
        
        int multiplicacion = os.multiplicar(op);
        System.out.println("multiplicacion = "+ multiplicacion);
        
        int div = os.dividir(op);
        System.out.println("division = "+ div);
        
    }
    
}

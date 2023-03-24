
package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;


public class CuentaServicio {
    
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        
        Cuenta c = new Cuenta();
        
        System.out.println("Ingrese el numero de cuenta");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        c.setDNI(leer.nextLong());
        System.out.println("Ingrese el saldo actual");
        c.setSaldo(leer.nextInt());
        
        return c;
    }
    
    public Cuenta ingresar(Cuenta c, int dinero){
        int saldo = c.getSaldo() + dinero;
        c.setSaldo(saldo);
        return c;
    }
    
    public Cuenta retirar(Cuenta c, int dinero){
        if(c.getSaldo()< dinero){
            System.out.println("Saldo insuficiente ");
           
        }else{
            int saldo = c.getSaldo() - dinero;
            c.setSaldo(saldo);
        
        }
        
        return c;
    }
     
    public Cuenta extraccionRapida(Cuenta c, int dinero){
        
        if(dinero > c.getSaldo() * 0.2){
            System.out.println("No puede retirar mas del 20% del saldo ");
           
        }else{
            int saldo = c.getSaldo() - dinero;
            c.setSaldo(saldo);
        
        }
        
        return c;
    }
    
    public void consultarSaldo(Cuenta c){
        System.out.println("El saldo actual es "+c.getSaldo());
    }
    
    public void consultarDatos(Cuenta c){
        System.out.println(c.toString());
    }
}

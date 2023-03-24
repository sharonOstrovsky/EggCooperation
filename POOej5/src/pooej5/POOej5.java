/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidades.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class POOej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        Cuenta c = cs.crearCuenta();
        
        System.out.println("Ingrese la cantidad de dinero a agregar");
        int dinero = leer.nextInt();
        cs.ingresar(c, dinero);
        System.out.println("Saldo modificado por ingresar = "+ c.getSaldo());
        
        System.out.println("Ingrese la cantidad de dinero a retirar");
        int retirar = leer.nextInt();
        cs.retirar(c, retirar);
        System.out.println("Saldo modificado por retirar= "+ c.getSaldo());
        
        System.out.println("Ingrese la cantidad de dinero a retirar");
        int extraer = leer.nextInt();
        cs.extraccionRapida(c, extraer);
        System.out.println("Saldo modificado por extraccion rapida= "+ c.getSaldo());
        
        cs.consultarSaldo(c);
        
        cs.consultarDatos(c);
        
    }
    
    
    
}

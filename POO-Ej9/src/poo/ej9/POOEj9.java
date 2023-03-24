/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej9;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author sharo
 */
public class POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica m = ms.crearMatematica();
        
        ms.devolverMayor(m);
        
        System.out.println(m.getNum1());
        System.out.println(m.getNum2());
        System.out.println("potencia = "+ms.calcularPotencia(m));
        
        System.out.println("raiz = "+ms.calculaRaiz(m));
    }
    
  
}

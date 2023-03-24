/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Circunferenciaa;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class CircunferenciaServicio {
    
    public Circunferenciaa CrearCircunferencia(){
       
        Circunferenciaa c1 = new Circunferenciaa();
               
        Scanner leer = new Scanner(System.in);
            
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextFloat());
        
        return c1;
        
    }
    
    public Circunferenciaa Area(Circunferenciaa c){
        
        float radio = c.getRadio();   
        System.out.println("Area = "+ PI * radio * radio );
        return c;

    }
    
    public Circunferenciaa Perimetro(Circunferenciaa c){
        float radio = c.getRadio();
        System.out.println("Perimetro = "+ PI * 2 * radio);
        return c;
    }
    
}

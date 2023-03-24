
package Servicio;

import Entidades.Puntos;
import java.util.Scanner;


public class PuntosServicio {
    
    public Puntos crearPuntos(){
        Scanner input = new Scanner(System.in);
        
        Puntos p = new Puntos();
        
        System.out.println("ingrese el punto 1");
        p.setX1(input.nextInt());
        p.setY1(input.nextInt());
        System.out.println("ingrese el punto 2");
        p.setX2(input.nextInt());
        p.setY2(input.nextInt());
        
        return p;
    }
    
    public Double distancia(Puntos p){
       
       return  Math.sqrt( (int) Math.pow(p.getX2()-p.getX1(),2) + (int) Math.pow(p.getY2()-p.getY1(),2) );
    }
    
}

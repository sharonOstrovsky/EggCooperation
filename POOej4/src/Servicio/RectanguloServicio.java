
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;


public class RectanguloServicio {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingrese la base");
        r.setBase(leer.nextInt());
        System.out.println("Ingrese la altura");
        r.setAltura(leer.nextInt());
        return r;
    }
    
    public int Superficie(Rectangulo r){
        return r.getAltura() * r.getBase();
    }
    
    public int Perimetro(Rectangulo r){
        return (r.getAltura() + r.getBase())*2;
    }
    
    public void DibujarRectangulo(Rectangulo r){
        int base = r.getBase();
        int altura = r.getAltura();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0 || i == altura-1 || j==0 || j==base-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    
}

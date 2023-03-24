
package Servicio;

import Entidades.Raices;


public class RaicesServicio {
    
    
    public Raices crearRaices(){
        Raices r = new Raices();
        return r;
    }
    
    /*
    getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public double getDiscriminante(Raices r){
        return ((double) Math.pow(r.getB(), 2)) - 4*r.getA()*r.getC();
    }
    
    /*
    tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r) >= 0;
    }
    
    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
    */
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r) == 0;
    }
    
    /*
    obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
    (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
    */
    public void obtenerRaices(Raices r){
        double raiz1, raiz2;
        if(tieneRaices(r)){
            double raiz = (double) ((Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC()));
            double dividoPor = (double) (2*r.getA());
            double principio = (double) ( -r.getB());
            double dividoA = principio + (Math.sqrt(raiz));
            
            raiz1 = (double) (dividoA / dividoPor);
            
            dividoA = principio - (Math.sqrt(raiz));
            
            raiz2 = (double) (dividoA / dividoPor);
            
            //raiz1 = (double) ( ((   ( -r.getB())   +  (  Math.sqrt(( ( Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC()) )       ) /   ((double)(2*r.getA()))   );
           // raiz2 = (double) ( Math.sqrt((-r.getB()) - (double)( (Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC()) ) ) /(double) (2*r.getA()));
            System.out.println("raiz 1 = "+ raiz1 + "\nraiz 2 = " + raiz2);
        }
    }
    
    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
    */
    public void obtenerRaiz(Raices r){
        double raiz;
        if(tieneRaiz(r)){
            //raiz = (double) ( Math.sqrt((-r.getB()) + ( (Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC()) ) ) / (2*r.getA()));
            
            raiz = (double) ( (double) ( -r.getB()) + (Math.sqrt((double) ((Math.pow(r.getB(), 2)) - (4*r.getA()*r.getC())))) );
            System.out.println("raiz = "+ raiz );
        }
    }
    
    
    /*
    calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
    */
    public void calcular(Raices r){
        if(tieneRaices(r)){
            obtenerRaices(r);
        }else if(tieneRaiz(r)){
            obtenerRaiz(r);
        }else{
            System.out.println("no tiene raices");
        }
    }
}

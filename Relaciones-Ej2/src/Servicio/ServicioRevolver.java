
package Servicio;

import Entidades.RevolverDeAgua;


public class ServicioRevolver {
    
    public RevolverDeAgua crearRevolver(){
        
        RevolverDeAgua revolver = new RevolverDeAgua();
        
        return revolver;
    }
    
   // • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
    public void llenarRevolver(RevolverDeAgua revolver, int cantJuagadores){
        
        revolver.setPosicionActual(Aleatorio(1,cantJuagadores-1));
        revolver.setPosicionAgua(Aleatorio(1,cantJuagadores-1));
        
        System.out.println("acutual: " + revolver.getPosicionActual());
        System.out.println("agua: "+ revolver.getPosicionAgua());
        
    }
    
    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(RevolverDeAgua revolver){
        if(revolver.getPosicionActual() == revolver.getPosicionAgua()){
            return true;
        }else{
            return false;
        }
        
      //  return revolver.getPosicionActual() == revolver.getPosicionAgua();
        
    }
    
    //• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(RevolverDeAgua revolver, int cantJugadores){
        
        
        if(revolver.getPosicionActual() == cantJugadores-1){
            revolver.setPosicionActual(0);
        }else{
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
        
    }
    
    public static int Aleatorio(int min, int max) {
        
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}

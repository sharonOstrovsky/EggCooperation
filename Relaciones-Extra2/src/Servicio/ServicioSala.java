
package Servicio;

import Entidades.Sala;


public class ServicioSala {
    
    public Sala crearSala(String[][] matrizSala){
        
        Sala sala = new Sala();
        
        sala.setSala(matrizSala);
        
        return sala;
        
    }
    
    public void mostrarSala(Sala sala){
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" "+sala.getSala()[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

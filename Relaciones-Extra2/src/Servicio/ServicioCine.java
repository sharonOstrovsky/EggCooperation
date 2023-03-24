
package Servicio;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Sala;
import Enumeraciones.Filas;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioCine {
    
   // ServicioEspectador servEspectador = new ServicioEspectador();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ServicioSala servSala = new ServicioSala();
    
    public Cine crearCine(){
        
        ServicioCine servCine = new ServicioCine();
        
        ServicioPelicula servPelicula = new ServicioPelicula();
        Cine cine = new Cine();
        ArrayList<Sala> salas = new ArrayList<>();
        
        //en este caso el cine solo tiene una sala pero puede tener mas en el futuro
        String[][] matrizSala = new String[8][6];
        Sala sala = servSala.crearSala(matrizSala);
        salas.add(sala);
        cine.setSalas(salas);
        cine.setPelicula(servPelicula.crearPelicula());
        System.out.print("Cual es el precio de la entrada a la pelicula "+ cine.getPelicula().getTitulo()+"? ");
        cine.setPrecioEntrada(input.nextDouble());
        
        return cine;
    }
    
    public void mostrarSalas(Cine cine){
        
        for (Sala aux : cine.getSalas()) {
            servSala.mostrarSala(aux);
        }
        
    }
    
    
    /*
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
    */
    public void llenarMatrizSala(Cine cine){
        
        for (Sala sala : cine.getSalas()) {
            
            String matrizSala[][] = sala.getSala();
            int k;
            for (int i = 0; i < 6; i++) {
                k = 8;
                for (int j = 0; j < 8; j++) {
                    if(i==0){
                        matrizSala[j][i] = (" "+k+" A ");
                        k--; 
                    }else{
                        if(i==1){
                            matrizSala[j][i] = (" "+k+" B ");
                            k--;
                        }else{
                            if(i==2){
                                matrizSala[j][i] = (" "+k+" C ");
                                k--;
                            }else{
                                if(i==3){
                                matrizSala[j][i] = (" "+k+" D ");
                                k--;
                            }else{
                                if(i==4){
                                    matrizSala[j][i] = (" "+k+" E ");
                                    k--;
                                }else{
                                    if(i==5){
                                        matrizSala[j][i] = (" "+k+" F ");
                                        k--;
                                        }
                                }
                                }
                            }
                        }
                    }
                
                
                }
            }
            
        }
    }
    /*
    sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
    */
    public boolean tieneEspectadorDineroSuficiente(Cine cine, Espectador espectador){
        
        return cine.getPrecioEntrada() <= espectador.getDineroDisponible();
    }
    
    public boolean tieneEdadRequerida(Cine cine, Espectador espectador){
        return cine.getPelicula().getEdadMinima() <= espectador.getEdad();
    }
    
    public boolean hayEspacioLibreSala(Cine cine){
        boolean libre = false;
        String matrizSala[][]= cine.getSalas().get(0).getSala();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(matrizSala[i][j].isEmpty()){
                    libre = true;
                }
            }
            
        }
        return libre;
    }
    
    public boolean esAsientoLibre(Cine cine, int fila, int colum){
       
        String matrizSala[][]= cine.getSalas().get(0).getSala();

        int tam = matrizSala[fila][colum].length();
  
        if(matrizSala[fila][colum].substring(tam-1).equalsIgnoreCase("X")){
            return false;
        }else{
            return true;
            }

        
    }
    
    
    
    public void ubicarEspectadorAleatoriamente(Cine cine, Espectador espectador){
        String matrizSala[][]= cine.getSalas().get(0).getSala();
        ArrayList<Sala> salas = new ArrayList<>();
        int fila;
        int colum;
        boolean ubicado = false;
        while(!ubicado){
            fila = Aleatorio(0, 7);
            colum = Aleatorio(0, 5);
            if(esAsientoLibre(cine, fila, colum)){
    
                matrizSala[fila][colum] = matrizSala[fila][colum]+" X";
                ubicado = true;
            }
        }
        
        Sala sala = servSala.crearSala(matrizSala);
        salas.add(sala);
        cine.setSalas(salas);
        
    }
    
    public boolean espectadorSentado(Cine cine, Espectador espectador){
        if(tieneEdadRequerida(cine, espectador) || tieneEspectadorDineroSuficiente(cine, espectador) || hayEspacioLibreSala(cine)   ){
            
            ubicarEspectadorAleatoriamente(cine, espectador);
            return true;
        }else{
            return false;
        }
        
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
    
}

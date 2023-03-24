
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;


public class AhorcadoServicio {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
    */
    public Ahorcado crearJuego(){
        String palabra;
        int cantJugadasMaximas;
        
        Ahorcado juego = new Ahorcado();
        
        System.out.println("ingrese la palabra");
        palabra = input.next();
        System.out.println("ingrese la cantidad de jugadas maxima");
        cantJugadasMaximas = input.nextInt();
        
        String[] palabraBuscada = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            palabraBuscada[i] = palabra.substring(i, i+1);
        }
        

        juego.setJugadasMaximas(cantJugadasMaximas);
        juego.setPalabras(palabraBuscada);
        juego.setLetrasEncontradas(0);
        
        return juego;
        
    }
    
    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
    */
    public void longitud(Ahorcado juego){
        System.out.println("Longitud de la palabra: "+ juego.getPalabras().length);
    }
    
    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    public boolean buscar(Ahorcado juego, String letra){
        boolean encontrado = false;
        for (int i = 0; i < juego.getPalabras().length; i++) {
//            System.out.println(juego.getPalabras()[i].equals(letra));
            if(juego.getPalabras()[i].equals(letra)){
                encontrado = true;
                juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
            }
        }
        
        if(encontrado){
            System.out.println("Mensaje: La letra pertenece a la palabra");
        }else{
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
        
        return encontrado;
    }
    
    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    //Número de letras (encontradas, faltantes): (3,4)
    public boolean encontradas(Ahorcado juego, String letra){
        boolean encontrado = false;
        if(buscar(juego,letra)){
            encontrado = true;
            System.out.println("Número de letras (encontradas, faltantes): (" + juego.getLetrasEncontradas() + ","+(juego.getPalabras().length -juego.getLetrasEncontradas()) + ")");
 //       }
        }else{
            juego.setJugadasMaximas(juego.getJugadasMaximas() - 1);
            System.out.println("Número de letras (encontradas, faltantes): (" + juego.getLetrasEncontradas() + ","+(juego.getPalabras().length -juego.getLetrasEncontradas()) + ")");
        }
        
        return encontrado;
    }
    
    /*
    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    */
    public void intentos(Ahorcado juego){
        System.out.println("Número de oportunidades restantes: "+ juego.getJugadasMaximas());
    }
    
    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
    */
    public void juego(Ahorcado juego){
        String letra;
        boolean encont;
        
        System.out.println("\n\nINICIO DEL JUEGO\n");
        
        do{
            System.out.println();
            System.out.println("Ingrese una letra:");
            letra = input.next();
            longitud(juego);
            encont = encontradas(juego, letra);
            intentos(juego);
            if(juego.getLetrasEncontradas() == juego.getPalabras().length ){
                juego.setJugadasMaximas(-1);
            }
            
        }while(juego.getJugadasMaximas() > 0);
        
        if(juego.getJugadasMaximas() == 0){
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        }
        if(juego.getJugadasMaximas() == -1){
            System.out.println("Mensaje: ¡Felicidades! Ha encontrado la palabra " + Arrays.toString(juego.getPalabras()) );
        }
    }
             
}

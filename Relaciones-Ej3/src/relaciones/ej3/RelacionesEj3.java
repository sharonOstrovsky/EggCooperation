/*
3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/
package relaciones.ej3;

import Entidades.Baraja;
import Servicio.ServicioBaraja;
import java.util.Scanner;
import javax.xml.transform.Source;


public class RelacionesEj3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        ServicioBaraja serv = new ServicioBaraja();
        Baraja baraja =serv.crearBaraja();
        System.out.println(baraja.toString());
        System.out.println("-----------------");
        
        while(continuar){
            
            System.out.println("MENU\n");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Cartas Disponibles");
            System.out.println("4. Dar Cartas");
            System.out.println("5. Mostrar Cartas del Monton");
            System.out.println("6. Mostrar Baraja");
            System.out.println("7. Partido Terminado");
            
            switch(input.nextInt()){
                case 1:
                    serv.barajar(baraja);
                    break;
                case 2:
                    serv.siguienteCarta(baraja);
                    break;
                case 3:
                    serv.cartasDisponibles(baraja);
                    break;
                case 4:
                    serv.darCartas(baraja);
                    break;
                case 5:
                    serv.cartasMonton(baraja);
                    break;
                case 6:
                    serv.mostrarBaraja(baraja);
                    break;
                case 7:
                    System.out.println("---------------------");
                    System.out.println("PARTIDO TERMINADO");
                    System.out.println("---------------------");
                    continuar = false;
                    break;
            }
        }


    }
    
}

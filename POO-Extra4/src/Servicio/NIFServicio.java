
package Servicio;

import Entidades.NIF;
import java.util.Scanner;


public class NIFServicio {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    String[] letraNIF = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    
    public NIF crearNIF(){
        long DNI = 0;
        int posicion;
        String letra;
        
        do{
            System.out.println("ingrese DNI");
            DNI = input.nextLong();
        }while(Long.toString(DNI).length() != 8 && Long.toString(DNI).length() != 7 )   ;
        
        posicion = (int) DNI % 23;
        letra = letraNIF[posicion];
        
        return new NIF(DNI,letra);
    }
    
    /*
    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
    */
    public void mostrar(NIF nif){
        System.out.println("El numero de NIF es: " + nif.getDNI() + "-" + nif.getLetra());
    }

    

}

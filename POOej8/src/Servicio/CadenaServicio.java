
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    
    public Cadena crearCadena(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        Cadena c = new Cadena();
        
        System.out.println("Ingrese una frase");
        String frase = input.next();
        
        c.setFrase(frase);
        c.setLongitud(frase.length());
        
        return c;
    }
    
    //deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(Cadena c){
        String carac;
        int vocales = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            carac = c.getFrase().substring(i,i+1);
            if(carac.equalsIgnoreCase("a") || carac.equalsIgnoreCase("e") || carac.equalsIgnoreCase("i") || carac.equalsIgnoreCase("o") || carac.equalsIgnoreCase("u") ){
                vocales++;
            }
        }
        return vocales;
    }
    
   // deberá invertir la frase ingresada y mostrarla por pantalla.
    public void invertirFrase(Cadena c){
     
        int tam = c.getLongitud();
        
        for (int i = 0; i < tam; i++) {
            System.out.print(c.getFrase().substring(tam-i-1, tam-i));
        }
        System.out.println();
    }
    
    //letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase,
    public int vecesRepetido(Cadena c, String letra){
        
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud() ; i++) {

            if(c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                cont++;
            }
        }
        
        return cont;
    }
    
    //comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena c, String frase){
        
        if(c.getLongitud() == frase.length()){
            System.out.println("Las longitudes son iguales");
        }else if(c.getLongitud() < frase.length()){
            System.out.println("La longitud de la frase ingresada es mayor a la que compone la clase");
        }else{
            System.out.println("La longitud de la frase ingresada es menor a la que compone la clase");
        }    
    }
    
    //unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena c, String frase){
        String CadenaConcat = c.getFrase().concat(frase);
        System.out.println(CadenaConcat);
    }
    
    //reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(Cadena c){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa caracter");
        char carac = input.nextLine().charAt(0);
        c.setFrase(c.getFrase().replace('a', carac));
        
        System.out.println(c.getFrase());
    }

   // comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(String letra, Cadena c){
        return c.getFrase().contains(letra);
    }
}

/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/
/*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
package collect.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class CollectEj1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        boolean seguir = true;
        String perro;
        ArrayList<String> razaPerros = new ArrayList();
        
        
        while(seguir){
            System.out.println("ingrese una raza de perro");
            razaPerros.add(input.next());
            System.out.println("¿quiere guardar otro perro? (s/n)");
            if(input.next().equalsIgnoreCase("s")){
                seguir = true;
            }else{
                seguir = false;
            }
        }
        System.out.println("\n Los perros guardados son:\n");
        for (String aux : razaPerros) {
            System.out.println(aux);
        }
        
        System.out.println("");
        System.out.println("Ingrese un Perro");
        perro = input.next();
        boolean encontrado = false;
        
        Iterator<String> it = razaPerros.iterator();
        while(it.hasNext()){
            if(it.next().equals(perro)){
                it.remove();
                encontrado = true;
            }   
        }
        if(!encontrado){
            System.out.println("La raza no ha sido encontrada");
        }
            
        
      //  razaPerros.remove(perro);
        
        Collections.sort(razaPerros);
        
        System.out.println("\n Los perros guardados son:\n");
        for (String aux : razaPerros) {
            System.out.println(aux);
        }
        
    }
        
    
}

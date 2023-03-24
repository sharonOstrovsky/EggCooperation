/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class LibroServicio {
    
    public Libro cargarLibro(){
        
        Libro l1 = new Libro();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro");
        l1.setISBN(leer.nextDouble());
        System.out.println("Ingrese el titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de paginas del libro");
        l1.setPaginas(leer.nextInt());
        return l1;
    }
    
    public Libro mostrarLibro(Libro l1){
        
        System.out.println(l1.toString());
        return l1;
    }
    
}

//Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese el nombre del vendedor");
//        v1.setNombre(leer.next());
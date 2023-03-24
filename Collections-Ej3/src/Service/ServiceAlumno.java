
package Service;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ServiceAlumno {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    /*
    bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
    */
    
    public ArrayList<Alumno> crearListaAlumnos(){
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String opcion = "s";
        
        do{
            Alumno alumno = crearAlumno();
            alumnos.add(alumno);
            do{
                System.out.println("Desea ingresar otro alumno?  (s/n)");
                opcion = input.next();
                System.out.println("");
            }while(! (opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n") ) );
        }while( opcion.equalsIgnoreCase("s") );
        
        return alumnos;
    }

    
    public Alumno crearAlumno(){
        
        Alumno alumno = new Alumno();
        Integer[] notas = new Integer[3];
        
        
        System.out.print("ingrese el nombre del alumno: ");
        alumno.setNombre(input.next());
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota del alumno " + alumno.getNombre() + ": ");
            notas[i] = input.nextInt();
        }
        alumno.setNotas(notas);

        return alumno;
    }
    
    public void mostrarLista(ArrayList<Alumno> alumnos){
        System.out.println("NOMBRE\tNOTA1\tNOTA2\tNOTA3");
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
        }
    }
    
    /*
    El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
    */
    
    public void calcularPromedioAlumno(ArrayList<Alumno> alumnos){
        
        System.out.print("Ingrese el nombre del alumno a calcular el promedio: ");
        String nombre = input.next();
        boolean encontro = false;
        int suma = 0;
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                double promedio = calcularPromedio(alumno);
                System.out.println("El promedio del alumno " + nombre + " es: " + promedio);
                encontro = true;
            }
        }
//        Iterator<Alumno> itAlumnos = alumnos.iterator();
//        while(itAlumnos.hasNext()){
//            if(itAlumnos.next().getNombre().equalsIgnoreCase(nombre)){
//                double promedio = calcularPromedio(alumno);
//                encontro = true;
//                System.out.println("El promedio del alumno " + nombre + " es: " + promedio);
//                        
//            }
//        }
        if(!encontro){
            System.out.println("El alumno no se encuentra en la lista");
        }
    }
    
    public double calcularPromedio(Alumno alumno){
        int suma = 0;
      //  double promedio;
       for (Integer nota : alumno.getNotas()) {
            suma += nota;
        }
       return suma / 3;
        
    }
    
}

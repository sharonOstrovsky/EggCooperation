
package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;


public class ServicioEstudiante extends ServicioPersona{
    
    Scanner input = new Scanner(System.in);
    //• Matriculación de un estudiante en un nuevo curso.
    public void matriculacionCurso(Estudiante estudiante){
        
        System.out.print("Ingrese el nombre del nuevo curso: ");
        estudiante.getCursos().add(input.next());
    }
    
    public void eliminarCuso(Estudiante estudiante){
        
        System.out.println("Ingrese el curso que desea eliminar: ");
        String curso = input.next();
        
        for (String aux : estudiante.getCursos()) {
            
            if( curso.equalsIgnoreCase(aux) ){
                
                estudiante.getCursos().remove(aux);
            }
            
        }
    }
    
    public void mostrarCursos(Estudiante estudiante){
        System.out.println("cursos estudiante");
        for (String curso : estudiante.getCursos()) {
            System.out.println(curso);
        }
    }
}


package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioPersona {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    //para crear a la persona hay que pasarle su perro
    public Persona crearPersona(){
        
        Persona persona = new Persona();
        
        System.out.print("Ingrese el nombre de la Persona: ");
        persona.setNombre(input.next());
        
        System.out.print("Ingrese el apellido de la Persona: ");
        persona.setApellido(input.next());
        
        System.out.print("Ingrese la edad de la Persona: ");
        persona.setEdad(input.nextInt());
        
        System.out.print("Ingrese el documento de la Persona: ");
        persona.setDocumento(input.nextInt());
          
        return persona;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona.toString());
    }
    
    public void adopcionPerro(Persona persona,ArrayList<Perro> perros, ArrayList<Perro> perrosAdoptados){
        
        boolean encontrado = true;
        System.out.println("\nGracias por elegir la adopcion "+ persona.getNombre()+"!");
        System.out.println("PERROS ESPERANDO SER ADOPTADOS:");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
       
        
        System.out.print("\nIngrese el nombre del perro que tendra una nueva familia: ");
        String nombrePerro = input.next();
        
        while(encontrado){
            for (Perro perroAdoptado : perrosAdoptados) {
                if(perroAdoptado.getNombre().equalsIgnoreCase(nombrePerro)){
                    System.out.println("Lamentamos informarle que " + nombrePerro + " ya ha sido adoptado.");
                    System.out.println("pero tenemos muchos otros perros esperandote!");
                    System.out.print("\nIngrese el nombre del perro que tendra una nueva familia: ");
                    nombrePerro = input.next();
                }
            }
            encontrado = false;
        }
        
        for (Perro perro : perros) {
            if(perro.getNombre().equalsIgnoreCase(nombrePerro)){
                persona.setPerro(perro);  
            }
        }
        
    }
    
}

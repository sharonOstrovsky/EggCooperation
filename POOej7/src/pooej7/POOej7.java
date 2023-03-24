/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
*/



package pooej7;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.io.EOFException;


public class POOej7 {


    public static void main(String[] args) {
       PersonaServicio ps = new PersonaServicio();
       
//       int[] IMC = new int[4];
//       boolean[] mayorEdad = new boolean[4];
//       int mayores = 0, menores = 0;
//       int debajo = 0, ideal = 0, encima = 0;
//       
//       Persona p1 = ps.crearPersona();
//       Persona p2 = ps.crearPersona();
//       Persona p3 = ps.crearPersona();
//       Persona p4 = ps.crearPersona();
//       
//       System.out.println("");
//       
//       ps.mostrarPersona(p1);
//       ps.mostrarPersona(p2);
//       ps.mostrarPersona(p3);
//       ps.mostrarPersona(p4);
//       
//       System.out.println("");
//       
//       IMC[0] = ps.calcularIMC(p1);
//       mayorEdad[0] = ps.esMayorDeEdad(p1);
//       IMC[1] = ps.calcularIMC(p2);
//       mayorEdad[1] = ps.esMayorDeEdad(p2);
//       IMC[2] = ps.calcularIMC(p3);
//       mayorEdad[2] = ps.esMayorDeEdad(p3);
//       IMC[3] = ps.calcularIMC(p4);
//       mayorEdad[3] = ps.esMayorDeEdad(p4);
//       
//        for (int i = 0; i < 4; i++) {
//            switch(IMC[i]){
//                case -1:
//                    debajo++;
//                    break;
//                case 0:
//                    ideal++;
//                    break;
//                case 1:
//                    encima++;
//                    break;
//            
//            }
//            if(mayorEdad[i]){
//                mayores++;
//            }else{
//                menores++;
//            }
//        }
//        
//        System.out.println("");
//         
//        System.out.println("Personas por debajo de su peso "+debajo/4.0*100+"%"+
//                "\nPersonas en su peso ideal "+ideal/4.0*100+"%"+
//                "\nPersonas por encima de su peso "+encima/4.0*100+"%");
//        
//        System.out.println("Personas mayores de edad "+mayores/4.0*100+"%"+
//                "\nPersonas menores de edad "+menores/4.0*100+"%");
//        
        
        //EXCEPCIONESS
        //public Persona(String nombre, int edad, String sexo, float peso, float altura)
        try{
            System.out.println("hola");
            Persona persona = new Persona();
            persona.getEdad();
            System.out.println(ps.esMayorDeEdad(persona));
        }catch(NullPointerException e){
            System.out.println("El valor es null");
        }
        
        
    }
    
}

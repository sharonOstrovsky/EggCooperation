package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona nuevaPersona = new Persona();
        String sexo = "";
        boolean bandera = false;

        System.out.println("Ingrese el nombre de la persona: ");
        nuevaPersona.setNombre(sc.next());
        
        System.out.println("Ingrese la edad: ");
        nuevaPersona.setEdad(sc.nextInt());

        do {
            if (bandera == true) {
                System.out.println("La opción ingresada no es válida.");
                System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro): ");
                sexo = sc.next();
            } else {
                System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro): ");
                sexo = sc.next();
                bandera = true;
            }
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));

        nuevaPersona.setSexo(sexo);

        System.out.println("Ingrese el peso en kg: ");
        nuevaPersona.setPeso(sc.nextFloat());

        System.out.println("Ingrese la altura en mts: ");
        nuevaPersona.setAltura(sc.nextFloat());

        return nuevaPersona;
    }

    public int calcularIMC(Persona personaActual) {
        int resultado;
        float peso = personaActual.getPeso();
        float altura = personaActual.getAltura();
        float imc = (float) (peso / (Math.pow(altura, 2)));

        if (imc < 20) {
            resultado = -1;
        } else if (imc <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(Persona personaActual){
        boolean resultado = false;
        
        if(personaActual.getEdad() > 17){
            resultado = true;
        }
        return resultado;
    }
    
    
}

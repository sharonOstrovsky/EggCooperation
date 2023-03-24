/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
*/
package herencia.ej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import Servicio.ServicioCaballo;
import Servicio.ServicioGato;
import Servicio.ServicioPerro;


public class HerenciaEj1 {


    public static void main(String[] args) {
        
        ServicioPerro servPerro = new ServicioPerro();
        ServicioGato servGato = new ServicioGato();
        ServicioCaballo servCaballo = new ServicioCaballo();

        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stich", "Carnivoro",15, "Doberman");
        servPerro.Alimentarse(perro1);
        
        //Declaracion de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahue");
        servPerro.Alimentarse(perro2);
        
        //Declaracion del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        servGato.Alimentarse(gato1);
        
        //Declaracion del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        servCaballo.Alimentarse(caballo1);
    }
    
}

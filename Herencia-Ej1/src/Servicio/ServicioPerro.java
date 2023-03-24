
package Servicio;

import Entidades.Animal;


public class ServicioPerro extends ServicioAnimal {

    @Override
    public void Alimentarse(Animal p) {
        
        System.out.println("El perro se alimenta de " + p.getAlimento());
    }
}

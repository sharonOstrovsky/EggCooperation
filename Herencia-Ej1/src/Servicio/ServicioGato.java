
package Servicio;

import Entidades.Animal;


public class ServicioGato extends ServicioAnimal {

    @Override
    public void Alimentarse(Animal g) {
        System.out.println("El gato se alimenta de " + g.getAlimento());
    }


    
}

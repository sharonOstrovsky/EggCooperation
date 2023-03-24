
package Servicio;

import Entidades.Animal;


public class ServicioCaballo extends ServicioAnimal{

    @Override
    public void Alimentarse(Animal c) {
       System.out.println("El caballo se alimenta de " + c.getAlimento());
    }


    
}

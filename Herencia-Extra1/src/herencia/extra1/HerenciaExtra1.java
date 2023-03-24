/*
1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
*/
package herencia.extra1;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import Servicio.ServicioAlquiler;
import Servicio.ServicioBarco;
import Servicio.ServicioBarcoMotor;
import Servicio.ServicioVelero;
import Servicio.ServicioYate;
import java.util.ArrayList;
import java.util.Scanner;


public class HerenciaExtra1 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        ServicioAlquiler servAlquiler = new ServicioAlquiler();
        ServicioBarco servBarco = new ServicioBarco();
        ServicioVelero servVelero = new ServicioVelero();
        ServicioBarcoMotor servBarcoMotor = new ServicioBarcoMotor();
        ServicioYate servYate = new ServicioYate();
        
        Barco barco = new Barco("B-1520-135",300,2012);
        Velero velero = new Velero(2,"25917A",2.40,2015);
        BarcoMotor barcoMotor = new BarcoMotor(40,"S39915",8,2018);
        Yate yate = new Yate(2000,5,"SH1996",20,2020);
        
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(barco);
        barcos.add(velero);
        barcos.add(barcoMotor);
        barcos.add(yate);
        
        System.out.println("BARCOS DISPONIBLES:");
        System.out.println("Se encuentran a disposicion diferentes barcos y barcos especiales:");
        System.out.println("");
        
        servBarco.mostrarBarco(barco);
        System.out.println("");
        servVelero.mostrarVelero(velero);
        System.out.println("");
        servBarcoMotor.mostrarBarcoMotor(barcoMotor);
        System.out.println("");
        servYate.mostrarYate(yate);
        
        System.out.println("");
        System.out.println("POR FAVOR UNA VEZ ELEGIDO EL BARCO A ALQUILAR COMPLETAR EL SIGUIENTE FORMULARIO:");
     
        System.out.println("Que barco desea alquilar?");
        System.out.println("-Barco\n-Velero\n-BarcoMotor\n-Yate");
        String op = input.next();
        
        for (Barco aux : barcos) {
            
            if( aux.getClass().getSimpleName().equalsIgnoreCase(op) ){
                Alquiler alquiler = servAlquiler.crearAlquiler(aux);
                System.out.println("");
                servAlquiler.mostrarAlquiler(alquiler);
                if(aux.getClass().getSimpleName().equalsIgnoreCase("Barco")){
                    servAlquiler.CalcularAlquiler(alquiler, servBarco.calculoModulo(aux));
                }else{
                    if(aux.getClass().getSimpleName().equalsIgnoreCase("Velero")){
                        servAlquiler.CalcularAlquiler(alquiler, servVelero.calculoModulo(aux));
                    }else{
                        if(aux.getClass().getSimpleName().equalsIgnoreCase("BarcoMotor")){
                            servAlquiler.CalcularAlquiler(alquiler, servBarcoMotor.calculoModulo(aux));
                        }else{
                            if(aux.getClass().getSimpleName().equalsIgnoreCase("Yate")){
                                servAlquiler.CalcularAlquiler(alquiler, servYate.calculoModulo(aux));
                            }
                        }
                    }
                }
            }
            
        }
        
        
        
        
    }
    
}

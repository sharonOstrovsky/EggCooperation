/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package herencia.ej02biss.servicios;

import herencia.ej02biss.entidades.Electrodomestico;
import herencia.ej02biss.entidades.Televisor;
import librerias.Consola;

public class TelevisorServicio extends ElectrodomesticoServicio {
    public Televisor crearTelevisor(){
        Televisor nuevoTelevisor = new Televisor();
        boolean TDT = false;
        int opcion; 
        
        super.crearElectrodomestico(nuevoTelevisor);
        
        nuevoTelevisor.setResolucion(Consola.leerEntero("Ingrese la resolución del televisor en pulgadas: "));
        
        System.out.println("¿El televisor tiene sintonizador TDT?");
        opcion = Consola.leerEntero("1. SI         2. NO");
        while (opcion != 1 && opcion != 2) {
            System.out.println("La opción ingresada no es válida, inténtelo de nuevo.");
            System.out.println("¿El televisor tiene sintonizador TDT?");
            opcion = Consola.leerEntero("1. SI         2. NO");
        }
        if(opcion == 1){
            TDT = true;
        }
        
        precioFinal(nuevoTelevisor, opcion, TDT);
        
        return nuevoTelevisor;
    }

    public void precioFinal(Electrodomestico elec, int resolucion, boolean TDT){
        super.precioFinal(elec);
        
        if(resolucion > 40){
            elec.setPrecio(elec.getPrecio() * 1.3);
        }
        if(TDT == true){
            elec.setPrecio(elec.getPrecio() + 500);
        }
    }
}

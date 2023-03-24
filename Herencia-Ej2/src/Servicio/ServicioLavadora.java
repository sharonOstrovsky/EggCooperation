
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioLavadora extends ServicioElectrodomestico{
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
    */
    public Lavadora crearLavadora(){
        
        Lavadora l = new Lavadora();
        
        System.out.println("LAVADORA");
        
        Electrodomestico e = super.crearElectrodomestico();
        
        System.out.print("Ingrese la carga de la Lavadora (kg): ");
        int carga = input.nextInt();
        l.setCarga(carga);
        

        l.setColor(e.getColor());
        l.setConsumoEnergetico(e.getConsumoEnergetico());
        l.setPeso(e.getPeso());

        
        return l;
        
    }
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */
    public void precioFinal(Lavadora l){
   
        super.precioFinal(l);
        
        int precio = l.getPrecio();
        
        if(l.getCarga() >= 30){
            precio+=500;
        }
        
        l.setPrecio(precio);
    }
    

    public void mostrarLavadora(Lavadora l){
        //System.out.println("LAVADORA");
        System.out.println("Carga: "+ l.getCarga());
        System.out.println("Color: "+ l.getColor());
        System.out.println("Consumo Energetico: "+l.getConsumoEnergetico());
        System.out.println("Peso: "+l.getPeso());
        System.out.println("PRECIO: " + l.getPrecio());
    }
    



    
}

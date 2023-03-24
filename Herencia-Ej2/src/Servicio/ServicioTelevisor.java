
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;


public class ServicioTelevisor extends ServicioElectrodomestico{
    
    Scanner input = new Scanner(System.in);
    
    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    public Televisor crearTelevisor(){
        
        System.out.println("TELEVISOR");
        
        Televisor t = new Televisor();
        Electrodomestico e = super.crearElectrodomestico();
        
        t.setColor(e.getColor());
        t.setConsumoEnergetico(e.getConsumoEnergetico());
        t.setPeso(e.getPeso());
        t.setPrecio(e.getPrecio());
       
        System.out.print("Ingrese la resolucion en pulgadas: ");
        int resolucion = input.nextInt();
        t.setResolucion(resolucion);
        System.out.println("tiene sintonizador TDT (s/n): ");
        String letra = input.next();
        Boolean TDT;
        if(letra.equalsIgnoreCase("s")){
            TDT = true;
        }else{
            TDT = false;
        }
        t.setTDT(TDT);
        
        return t;
    }
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
    */
    public void precioFinal(Televisor t){
        
        super.precioFinal(t);
        
        int precio = t.getPrecio();
        
        if(t.getResolucion()>=40){
            precio*=1.3;
        }
        if(t.isTDT()){
            precio+=500;
        }
        
        t.setPrecio(precio);
    }
    

    public void mostrarTelevisor(Televisor t){
        //System.out.println("TELEVISOR");
        System.out.println("Resolucion: " + t.getResolucion());
        if(t.isTDT()){
            System.out.println("sintonizador TDT: SI");
        }else{
            System.out.println("sintonizador TDT: NO");
        }
        System.out.println("Color: "+ t.getColor());
        System.out.println("Consumo Energetico: "+t.getConsumoEnergetico());
        System.out.println("Peso: "+t.getPeso());
        System.out.println("PRECIO: " + t.getPrecio());
    }
}

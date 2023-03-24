
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import static java.lang.Character.toUpperCase;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;


public class ServicioElectrodomestico {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
/*    
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
  */
    private boolean comprobarConsumoEnergetico(char letra){
        
        return letra >= 'A' && letra <= 'F';
    }
    
    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    private boolean comprobarColor(String color){
        
        return color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris");
    }
    
    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
    */
    public Electrodomestico crearElectrodomestico(){
        
        Electrodomestico e = new Electrodomestico();
        

        System.out.println("Ingrese el color: ");
        System.out.println("Colores disponibles:\n Blanco, Negro, Rojo, Azul y Gris ");
        String color = input.next();
        if(!comprobarColor(color)){
            color = "blanco"; 
        }
        e.setColor( toLowerCase(color) );
        
        System.out.println("Ingrese el consumo energetico: ");
        System.out.println("letras entre A y F");
        String letra = input.next();
        char consumo = letra.charAt(0);
        if(!comprobarConsumoEnergetico( toUpperCase(consumo) )){
            consumo = 'F';
        }
        e.setConsumoEnergetico( toUpperCase(consumo) );
        
        System.out.print("Ingrese el peso(kg): ");
        e.setPeso(input.nextInt());
        
        return e;
    }
    
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA   PRECIO
A       $1000
B       $800
C       $600
D       $500
E       $300
F       $100

   PESO P          RECIO
Entre 1 y 19 kg    $100
Entre 20 y 49 kg   $500
Entre 50 y 79 kg   $800
Mayor que 80 kg    $1000
    */
    public void precioFinal(Electrodomestico e){
        
        char consumo = e.getConsumoEnergetico();
        int peso = e.getPeso();
        int precio = e.getPrecio();
        
        switch(toUpperCase(consumo)){
            
            case 'A':
                precio+=1000;
                break;
            case 'B':
                precio+=800;
                break;
            case'C':
                precio+=600;
                break;
            case 'D':
                precio+=500;
                break;
            case 'E':
                precio+=300;
                break;
            case 'F':
                precio+=100;
                break;
    
        }
        
        if(peso >= 1 && peso <= 19){
            precio+=100;
        }else{
            if(peso >= 20 && peso <= 49){
                precio+=500;
            }else{
                if(peso >= 50 && peso <= 79){
                    precio+=800;
                }else{
                    if(peso >= 80){
                        precio+=1000;
                    }
                }
            }
        }
        
        e.setPrecio(precio);
    }
    
    public void mostrarPrecioFinal(Electrodomestico e){
        
        System.out.println("PRECIO: " + e.getPrecio() );
        
    }
    

    
    public void mostrarPrecioElectrodomestico(ArrayList<Electrodomestico> electrodomesticos){
        
        int precioTotal = 0;
        int precioLavadora = 0;
        int precioTelevisor = 0;
        int numl = 1;
        int numt = 1;
        System.out.println("");
        System.out.println("-----PRECIOS FINALES-----");
        System.out.println("");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            
            precioTotal += electrodomestico.getPrecio();
           
            String nombre = electrodomestico.getClass().getSimpleName();
            if(nombre.equalsIgnoreCase("Lavadora")){
                System.out.println("Precio Final de Lavadora " + numl + ": $"+ electrodomestico.getPrecio());
                precioLavadora = precioLavadora + electrodomestico.getPrecio();
                numl++;
            }else{
                if(nombre.equalsIgnoreCase("Televisor")){
                    System.out.println("Precio Final de Televisor " + numt +": $" + electrodomestico.getPrecio());
                    precioTelevisor += electrodomestico.getPrecio();
                    numt++;
                }
            }
           
        }
        System.out.println("");
        System.out.println("-----PRECIOS TOTALES-----");
        System.out.println("");
        System.out.println("\nPRECIO TOTAL DE LAVADORAS: $" + precioLavadora);
        System.out.println("\nPRECIO TOTAL DE TELEVISORES: $" + precioTelevisor);
        System.out.println("\nPRECIO TOTAL DE ELECTRODOMESTICOS: $" + precioTotal);
    }
        



}
    
    



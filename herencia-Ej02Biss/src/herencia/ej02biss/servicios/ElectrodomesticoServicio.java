/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.

• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */

package herencia.ej02biss.servicios;

import herencia.ej02biss.entidades.Electrodomestico;
import librerias.Consola;

public abstract class ElectrodomesticoServicio {
    private String comprobarConsumoEnergetico(String letra){
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") || letra.equalsIgnoreCase("d")
            || letra.equalsIgnoreCase("f")){
            return letra;
        }else{
            return "f";
        }
    }
    
    private String comprobarColor(String color){
        if(color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("rojo")
            || color.equalsIgnoreCase("azul")){
            return color;
        }else{
            return "blanco";
        }
    }
    
    protected void crearElectrodomestico(Electrodomestico elec){
        elec.setPrecio(1000);
        elec.setColor(comprobarColor(Consola.leer("Ingrese el color del electrodoméstico: ")));
        elec.setConsumoEnerg(comprobarConsumoEnergetico(Consola.leer("Ingrese el tipo de consumo energético: ")));
        elec.setPeso(Consola.leerDouble("Ingrese el peso: "));
    }
    
    protected void precioFinal(Electrodomestico elec){
        String consumoEnerg = elec.getConsumoEnerg().toLowerCase();
        double precio = elec.getPrecio();
        double peso = elec.getPeso();
        
        switch(consumoEnerg){
            case "a":
                precio += 1000;
                break;
            case "b":
                precio += 800;
                break;
            case "c":
                precio += 600;
                break;
            case "d":
                precio += 500;
                break;
            case "e":
                precio += 300;
                break;
            case "f":
                precio += 100;     
        }
         
        if(peso > 0 && peso < 20){
            precio += 100;
        }else if(peso < 50){
            precio += 500;
        }else if(peso < 80){
            precio += 800;
        }else{
            precio += 1000;
        }  
        elec.setPrecio(precio);
    }
}

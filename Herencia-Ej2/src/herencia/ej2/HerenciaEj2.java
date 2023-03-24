/*
2. Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
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

A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.

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

Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
*/
/*
3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/
package herencia.ej2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicio.ServicioElectrodomestico;
import Servicio.ServicioLavadora;
import Servicio.ServicioTelevisor;
import java.util.ArrayList;


public class HerenciaEj2 {


    public static void main(String[] args) {
        
//-----------------------EJERCICIO 2-------------------------
//        ServicioLavadora servLavadora = new ServicioLavadora();
//        System.out.println("LAVADORA:");
//        Lavadora lavadora = servLavadora.crearLavadora();
//        servLavadora.precioFinal(lavadora);
//
//        ServicioTelevisor servTelevisor = new ServicioTelevisor();
//        System.out.println("TELEVISOR: ");
//        Televisor televisor = servTelevisor.crearTelevisor();
//        servTelevisor.precioFinal(televisor);
//        
//        System.out.println("------ELECTRODOMESTICOS------");
//        servLavadora.mostrarLavadora(lavadora);
//        System.out.println("");
//        servTelevisor.mostrarTelevisor(televisor);
        
//----------------------EJERCICIO 3--------------------------------
        ServicioElectrodomestico servElectrodomestico = new ServicioElectrodomestico();

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        ServicioLavadora servLavadora = new ServicioLavadora();
        ServicioTelevisor servTelevisor = new ServicioTelevisor();
        
        Lavadora lavadora1 = servLavadora.crearLavadora();
        Televisor televisor1 = servTelevisor.crearTelevisor();
        Lavadora lavadora2 = servLavadora.crearLavadora();
        Televisor televisor2 = servTelevisor.crearTelevisor();
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(televisor1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(televisor2);
        
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            
            if(electrodomestico.getClass().getSimpleName().equalsIgnoreCase("Lavadora")){
                
                servLavadora.precioFinal(electrodomestico);
            }else{
                if( electrodomestico.getClass().getSimpleName().equalsIgnoreCase("Televisor") ){
                    
                    servTelevisor.precioFinal(electrodomestico);
                }
            }
        }
        
        System.out.println("");
        
        int numlav = 1;
        int numtele = 1;
        
        System.out.println("");
        System.out.println("-----ELECTRODOMESTICOS-----");
        System.out.println("");
        for (Electrodomestico electrodomestico : electrodomesticos) {

            String nombre = electrodomestico.getClass().getSimpleName();
            
            if(nombre.equalsIgnoreCase("Lavadora")){
                System.out.println("LAVADORA " + numlav );
                servLavadora.mostrarLavadora((Lavadora) electrodomestico);
                numlav++;
                System.out.println("");
            }else{
                if(nombre.equalsIgnoreCase("Televisor")){
                    System.out.println("TELEVISOR " + numtele );
                    servTelevisor.mostrarTelevisor((Televisor) electrodomestico);
                    numtele++;
                    System.out.println("");
                }
            }
           
        }
        
        System.out.println("");
        servElectrodomestico.mostrarPrecioElectrodomestico(electrodomesticos);
        
        
          
    }
    
}

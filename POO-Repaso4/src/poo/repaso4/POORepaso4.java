/*
Ejercicio 4
Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
● Crear un método para verificar si el año ingresado es bisiesto
 */
package poo.repaso4;

import Entidades.Fecha;
import Servicio.FechaServicio;
import java.util.Scanner;


public class POORepaso4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FechaServicio fs = new FechaServicio();
        Fecha f = new Fecha();
        
        int dia, mes, anio;
        System.out.println("ingrese la fecha dia/mes/año");
        dia = input.nextInt();
        mes = input.nextInt();
        anio = input.nextInt();
        
        if(fs.verificarAnio(f, anio)){
            fs.ingresarFecha(f, dia, mes, anio);
        }
        
        fs.cantidadDiasDelMes(f);

        fs.diaAnterior(f);
        
        fs.diaPosterior(f);
        
    }
    
}

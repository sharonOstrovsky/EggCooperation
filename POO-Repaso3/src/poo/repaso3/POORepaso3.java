/*
Ejercicio 3
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package poo.repaso3;

import Entidades.Pass;
import Servicio.PassServicio;
import java.util.Scanner;


public class POORepaso3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        

        PassServicio ps = new PassServicio();
        Pass p = new Pass();
        
        while(continuar){
            
            System.out.println("MENU");
            System.out.println("A. Ingresar contraseña");
            System.out.println("B. Tipo de Nivel");
            System.out.println("C. Modificar contraseña");
            System.out.println("D. Modificar Nombre");
            System.out.println("E. Modificar DNI");
            System.out.println("F. Salir");
            switch(input.next()){
                case "A":
                    ps.crearPass(p);
                    break;
                case "B":
                    ps.analizarPass(p);
                    break;
                case "C":
                    ps.modificarClave(p);
                    break;
                case "D":
                    ps.modificarNombre(p);
                    break;
                case "E":
                    ps.modificarDNI(p);
                    break;
                case "F":
                    continuar = false;
                    break;
                
            }
        }
        
        // ps.crearPass();
        //ps.analizarPass(p);
        
        
    }
    
}

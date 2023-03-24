
package Servicio;

import Entidades.Pass;
import java.util.Scanner;


public class PassServicio {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    /*
    ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
    */
    public void crearPass(Pass p){
     //   Pass p = new Pass();
        System.out.println("ingrese la contraseña");
        String clave = input.next();
        while(clave.length() != 10) {
            System.out.println("tamaño incorrecto. vuelva a intentarlo");
            System.out.println("ingrese la contraseña");
            clave = input.next();
        }
        p.setPass(clave);
        //       return p;
    }
    
    /*
    ● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
    */
    public void analizarPass(Pass p){
        boolean letraZ = false;
        boolean letraA = false;
        int A = 0;
        
        for (int i = 0; i < p.getPass().length()-1; i++) {
            if(p.getPass().substring(i, i+1).equalsIgnoreCase("z")) {
                letraZ = true;
            }
            if(p.getPass().substring(i, i+1).equalsIgnoreCase("a")) {
                A++;           
            }
            if(A > 2){
                letraA = true;
            }

        }
        if(letraA){
            System.out.println("CONTRASEÑA NIVEL ALTO");
        }else if(letraZ){
            System.out.println("CONTRASEÑA NIVEL MEDIO");
        }else{
            System.out.println("CONTRASEÑA NIVEL BAJO");
        }
        
    }
    
    /*
    ● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
    */
    public void modificarNombre(Pass p){
       
        System.out.println("ingrese la contraseña");
        if(input.next().equals(p.getPass())){
            System.out.println("ingrese su nombre");
            p.setNombre(input.next());
        }else{
            System.out.println("contraseña incorrecta");
        }
    }
    
    public void modificarDNI(Pass p){
        
        System.out.println("ingrese la contraseña");
        if(input.next().equals(p.getPass())){
            System.out.println("ingrese su DNI");
        p.setDni(input.nextInt());
        }else{
            System.out.println("contraseña incorrecta");
        }
        
    }
    
    //Modificar contraseña, donde primero debe poner su contraseña anterior para dar permiso
    
    public void modificarClave(Pass p){
        System.out.println("ingrese la contraseña anterior");
        if(input.next().equals(p.getPass())){
            System.out.println("ingrese la nueva contraseña");
            crearPass(p);
        }else{
            System.out.println("contraseña incorrecta");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
*/
package extra21;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] notas = new double[10];
        float tp1, tp2, int1, int2;
        double promedio;
        int aprobados=0;
        for(int i = 0; i < 10; i++){
            System.out.println("ALUMNO/A " + (i+1));
            System.out.println("ingrese nota primer tp");
            tp1 = leer.nextFloat();
            System.out.println("ingrese nota segundo tp");
            tp2 = leer.nextFloat();
            System.out.println("ingrese nota primer integrador");
            int1 = leer.nextFloat();
            System.out.println("ingrese nota segundo integrador");
            int2 = leer.nextFloat();
            
            promedio = (tp1*0.1 + tp2*0.15 + int1*0.25 + int2*0.5);
            notas[i] = promedio;
        }
        
        for(int i = 0; i < 10; i++){
            if(notas[i] >= 7){
                aprobados++;
            }
        }
        
        System.out.println("aprobados = " + aprobados + "\ndescaprobados = " + abs(10-aprobados));
    }
    
}

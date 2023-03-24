/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random(). 
*/
package extra23;

import java.util.Scanner;


/**
 *
 * @author sharo
 */
public class extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        int cont = 0;
        String palabra;
        int tamPalabra;
        inicializarMatriz(sopa,20,20);
        while(cont < 5){
            System.out.println("ingrese una palabra");
            palabra = leer.nextLine();
            tamPalabra = palabra.length();
            if(tamPalabra > 2 && tamPalabra < 6){
                cont++;
                agregarPalabraSopa(sopa, palabra);
              //  System.out.println(palabra.substring(3,4));
            }
        }
        
        
       llenarMatriz(sopa,20,20);
       imprimirMatriz(sopa,20,20);
        
        
        
    }
    
    public static void agregarPalabraSopa(String[][] sopa, String palabra){
        int fila = Aleatorio(0,19);
        int tam = palabra.length();
        for(int i = 0; i < tam; i++){
            sopa[fila][i] = palabra.substring(i,i+1);
        }
    }
    
    public static void inicializarMatriz(String[][] sopa, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sopa[i][j] = " ";
                                   
            } 
            
        }
    }
    
    public static void llenarMatriz(String[][] sopa, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(sopa[i][j].equals(" ")){  //sopa[i][j].isEmpty()
                   sopa[i][j] = Integer.toString(Aleatorio(1,9));
                   
                } 
               // matriz[i][j] = Aleatorio(1,10);
               //Integer.toString(i)
            }
        }
    }
    
    public static void imprimirMatriz(String[][] sopa, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
}


package poo.ej10;

import java.util.Arrays;


public class POOEj10 {

    //Arrays.fill(arreglo, int desde, int hasta, variable)
    //Arrays.toString(arreglo)
    //Arrays.sort(arreglo)
    public static void main(String[] args) {
        float[] vecA = new float[50];
        float[] vecB = new float[20];
        
        //lleno el vector A con numeros aleatorios
        for (int i = 0; i < 50; i++) {
            Arrays.fill(vecA,i,i+1,(float) (Math.random()*10));
        }
        //imprimo el vector A
        System.out.println(Arrays.toString(vecA));
        //ordeno el vector A de menor a mayor
        Arrays.sort(vecA);
        //copiar los primeros 10 números ordenados al arreglo B
        System.arraycopy(vecA, 0, vecB, 0, 10);
        //imprimo el vector A ordenado
        System.out.println(Arrays.toString(vecA));
        //rellenar los 10 últimos elementos del vector B con el valor 0.5.
        Arrays.fill(vecB,10,20,0.5F);
        //imprimo el vector B
        System.out.println(Arrays.toString(vecB));
    }
    
}

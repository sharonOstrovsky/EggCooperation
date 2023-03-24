/*
2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
package exception.ej2;


public class ExceptionEj2 {

    
    public static void main(String[] args) {
        
        int vec[] = new int[3];
        
        for( int i = 0; i<3;i++){
            vec[i] = i;
        } 
        try{
            
            for( int i = 0; i<3;i++){
                System.out.print(vec[i] + " ");
            }
            
            vec[4] = 5;
            
            for( int i = 0; i<3;i++){
             System.out.print(vec[i] + " ");
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nPasaste el limite del vector");
        }
        
    }
    
}

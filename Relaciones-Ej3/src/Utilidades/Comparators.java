
package Utilidades;

import Entidades.Carta;
import java.util.Comparator;


public class Comparators {
  
    
    public static Comparator<Carta> comparaNumero = new Comparator<Carta>(){
        @Override
        public int compare(Carta t, Carta t1) {
            
           
            return Integer.compare(t.getNumero(), t1.getNumero());
        }
        
    };
    
    public static Comparator<Carta> comparaPalo = new Comparator<Carta>(){
        @Override
        public int compare(Carta t, Carta t1) {
            
            return t.getPalo().compareTo(t1.getPalo());
        }
        
    };
    
    /**
     *
     * @param comparaNumero
     * @param comparaPalo
     */
    public Comparators(Comparator<Carta> comparaNumero, Comparator<Carta> comparaPalo){
        Comparators.comparaNumero = comparaNumero;
        Comparators.comparaPalo = comparaPalo;
       
    };
    
    /*
     public ComplexComparator(Comparator<Student> one,
            Comparator<Student> another) {
        this.comparatorOne = one;
        this.comparatorTwo = another;
    }
    */
}
//t.getTitulo().compareTo(t1.getTitulo());
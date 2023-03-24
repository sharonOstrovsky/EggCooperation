
package Servicio;

//métodos para sumar, restar, multiplicar y dividir fracciones.
//num/dem

import Entidades.Fraccion;
import java.util.Scanner;

public class FraccionServicio {
    Scanner input = new Scanner(System.in);
    
    //crea dos fracciones para poder comenzar con las operaciones
    public Fraccion crearFraccion(){
        Fraccion f = new Fraccion();
        
        System.out.println("ingrese el primer numerador");
        f.setNumerador1(input.nextInt());
        System.out.println("ingrese el primer denominador");
        f.setDenominador1(input.nextInt());
        
        System.out.println("ingrese el segundo numerador");
        f.setNumerador2(input.nextInt());
        System.out.println("ingrese el segundo denominador");
        f.setDenominador2(input.nextInt());
        
        return f;
    }
    
    public void sumar(Fraccion f){
        int num, den;
        num = (f.getNumerador1()+f.getNumerador2());
        den = (f.getDenominador1()*f.getDenominador2());
        System.out.println(f.getNumerador1()+"/"+f.getDenominador1()+" + "+f.getNumerador2()+"/"+f.getDenominador2()+" = "+num+"/"+den);
    }
    
    public void restar(Fraccion f){
        int num, den;
        num = (f.getNumerador1()-f.getNumerador2());
        den = (f.getDenominador1()*f.getDenominador2());
        System.out.println(f.getNumerador1()+"/"+f.getDenominador1()+" - "+f.getNumerador2()+"/"+f.getDenominador2()+" = "+num+"/"+den);
        
    }
    
    public void multiplicar(Fraccion f){
        int num, den;
        num = (f.getNumerador1()*f.getNumerador2());
        den = (f.getDenominador1()*f.getDenominador2());
        System.out.println(f.getNumerador1()+"/"+f.getDenominador1()+" * "+f.getNumerador2()+"/"+f.getDenominador2()+" = "+num+"/"+den);
    }
    
    public void dividir(Fraccion f){
        int num, den;
        num = ( f.getNumerador1()*f.getDenominador2() );
        den = ( f.getDenominador1()*f.getNumerador2() );
        System.out.println(f.getNumerador1()+"/"+f.getDenominador1()+" % "+f.getNumerador2()+"/"+f.getDenominador2()+" = "+num+"/"+den);
    }
}

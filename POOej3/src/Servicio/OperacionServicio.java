/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class OperacionServicio {
    
    public Operacion crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        Operacion op = new Operacion();
        
        System.out.println("Ingrese el numero 1");
        op.setNum1(leer.nextInt());
        
        System.out.println("Ingrese el numero 2");
        op.setNum2(leer.nextInt());
        
        return op;
    }
    
    public int sumar(Operacion op){
        return op.getNum1() + op.getNum2();
    }
    
    public int restar(Operacion op){
        return op.getNum1() - op.getNum2();
    }
    
    public int multiplicar(Operacion op){
        int num1 = op.getNum1();
        int num2 = op.getNum2();
        if(num1 == 0 || num2 == 0){
            System.out.println("ERROR: esta queriendo multiplicar por cero");
            return 0;
        }else{
            return num1*num2;
        }
    }
    
    public int dividir(Operacion op){
        int num1 = op.getNum1();
        int num2 = op.getNum2();
        if(num2 == 0){
            System.out.println("ERROR: esta queriendo dividir por cero");
            return 0;
        }else{
            return num1/num2;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Matematica;
import static java.lang.Math.round;

/**
 *
 * @author sharo
 */
public class MatematicaServicio {
    
    public Matematica crearMatematica(){
        Matematica m = new Matematica();
        float num = (float) (Math.random()*10);
        m.setNum1(num);
        num = (float) (Math.random()*10);
        m.setNum2(num);
        return m;
    }
    
    //retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(Matematica m){
        if(m.getNum1() > m.getNum2()){
            System.out.println(m.getNum1() + " es mayor");
        }else{
            System.out.println(m.getNum2() + " es mayor");
        }        
    }
    
    //calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    public double calcularPotencia(Matematica m){
        double potencia;
        int num1 = round(m.getNum1());
        int num2 = round(m.getNum2());
//        System.out.println(num1);
//        System.out.println(num2);
        if(num1 >= num2){
            potencia =  Math.pow(num1, num2);
        }else{
            potencia =  Math.pow(num2, num1);
        }
        return potencia;
    }
    
    //calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calculaRaiz(Matematica m){
        double num;
        if(m.getNum1() < m.getNum2()){
            num = Math.abs(m.getNum1());
        }else{
            num = Math.abs(m.getNum2());
        }
        return Math.sqrt(num);
    }
}

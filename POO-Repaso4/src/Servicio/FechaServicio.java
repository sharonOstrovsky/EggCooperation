
package Servicio;

import Entidades.Fecha;
import java.util.Scanner;


public class FechaServicio {
    Scanner input = new Scanner(System.in);
    
    public void ingresarFecha(Fecha f, int dia, int mes, int anio){
        if(verificarAnio(f, anio)){
            f.setDia(dia);
            f.setMes(mes);
            f.setAnio(anio);
        }
        
    }  
 
    
    /*
    ● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
    */
    public boolean verificarAnio(Fecha f, int anio){
        boolean correcto = false;
        if(anio >= 1900 || anio <= 2021 ){
            correcto = true;
        }
        
        return correcto;
    }
        
    /*
    ((anio MOD 4 == 0) Y (anio MOD 100 <> 0) O ((anio MOD 100 == 0) Y (anio MOD 400 == 0)))
    */
    public boolean esBisiesto(Fecha f){
        boolean rta = false;
        if( (f.getAnio() % 4 == 0) && (f.getAnio() % 100 != 0) || ( (f.getAnio() % 100 == 0) && (f.getAnio() % 400 == 0) ) ){
            rta = true;
        }
        return rta;
    }
    
    /*
    ● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
    */
    public void cantidadDiasDelMes(Fecha f){
        switch(f.getMes()){
            case 1:
                System.out.println("USTED INGRESO MES 1 (ENERO), QUE TIENE 31 días");
                break;
            case 2:
                System.out.println("USTED INGRESO MES 2 (FEBRERO), QUE TIENE 29 días");
                break;
            case 3:
                System.out.println("USTED INGRESO MES 3 (MARZO), QUE TIENE 31 días");
                break;
            case 4:
                System.out.println("USTED INGRESO MES 4 (ABRIL), QUE TIENE 30 días");
                break;
            case 5:
                System.out.println("USTED INGRESO MES 5 (MAYO), QUE TIENE 31 días");
                break;
            case 6:
                System.out.println("USTED INGRESO MES 6 (JUNIO), QUE TIENE 30 días");
                break;
            case 7:
                System.out.println("USTED INGRESO MES 7 (JULIO), QUE TIENE 31 días");
                break;
            case 8:
                System.out.println("USTED INGRESO MES 8 (AGOSTO), QUE TIENE 31 días");
                break;
            case 9:
                System.out.println("USTED INGRESO MES 9 (SEPTIEMBRE, QUE TIENE 30 días");
                break;
            case 10:
                System.out.println("USTED INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días");
                break;
            case 11:
                System.out.println("USTED INGRESO MES 11 (NOVIEMBRE), QUE TIENE 30 días");
                break;
            case 12:
                System.out.println("USTED INGRESO MES 12 (DICIEMBRE), QUE TIENE 31 días");
                break;
            
            
        }
    }
    
    /*
    ● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
    */
    public void diaAnterior(Fecha f){
        if(f.getDia() != 1 ){
            System.out.println("Dia Anterior: "+(f.getDia()-1)+"/"+(f.getMes())+"/"+f.getAnio());
        }else if(f.getMes() == 1){
            System.out.println("Dia Anterior: 31/12/"+ (f.getAnio()-1) );
        }else if(f.getMes() == 2 || f.getMes() == 4 || f.getMes() == 6 || f.getMes() == 8 || f.getMes() == 9 || f.getMes() == 11){
            System.out.println("Dia Anterior: "+31+"/"+(f.getMes()-1)+"/"+f.getAnio());
        }else if(f.getMes() == 5 || f.getMes() == 7 || f.getMes() == 10 || f.getMes() == 12){
            System.out.println("Dia Anterior: "+30+"/"+(f.getMes()-1)+"/"+f.getAnio());
        }else if(f.getMes() == 3){
            if(esBisiesto(f)){
                System.out.println("Dia Anterior: "+29+"/"+(f.getMes()-1)+"/"+f.getAnio());
            }else{
                System.out.println("Dia Anterior: "+28+"/"+(f.getMes())+"/"+f.getAnio());
            }
        }
    }
    
    /*
    ● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
    */
    public void diaPosterior(Fecha f){
        int mes = f.getMes();
        if(mes == 2 ){
            if(f.getDia()<28){
                System.out.println("Dia Posterior: "+(f.getDia()+1)+"/"+(f.getMes())+"/"+f.getAnio());
            }else if(esBisiesto(f) && f.getDia() == 28){
                System.out.println("Dia Posterior: "+(f.getDia()+1)+"/"+(f.getMes())+"/"+f.getAnio());
            }else if(esBisiesto(f) && f.getDia() == 29){
                System.out.println("Dia Posterior: "+1+"/"+(f.getMes()+1)+"/"+f.getAnio());
            }else if(!esBisiesto(f) && f.getDia() == 28){
                System.out.println("Dia Posterior: "+1+"/"+(f.getMes()+1)+"/"+f.getAnio());
            }  
            
        }
        
        if(f.getDia() <= 29 && mes != 2){
            System.out.println("Dia Posterior: "+(f.getDia()+1)+"/"+(f.getMes())+"/"+f.getAnio());
        }else if(f.getDia() == 30  &&  ( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) ){
            System.out.println("Dia Posterior: "+1+"/"+(f.getMes()+1)+"/"+f.getAnio());
        }else if(f.getDia() == 31 && ( mes == 1 || mes == 3 || mes ==  5 || mes == 7 || mes ==  8 || mes == 10 )){
            System.out.println("Dia Posterior: "+1+"/"+(f.getMes())+"/"+f.getAnio());
        }else if(mes == 12 && f.getDia() == 31){
            System.out.println("Dia Posterior: 1/1/"+(f.getAnio()+1));
        }
    }
}

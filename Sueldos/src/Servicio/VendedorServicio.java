package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;


public class VendedorServicio {
    
    public Vendedor altaVendedor(){
        
        //instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        
        //lleno los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia en que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que comenzo a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
        
    }
    
    public void SueldoMensual(Vendedor v1){
        
        System.out.println("Ingrese cuales fueron las ventas totales del vendedos");
        Scanner leer = new Scanner(System.in);
        Double ventas = leer.nextDouble();
        v1.setComusiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComusiones());
        System.out.println("El sueldo mensual del vendedor:"
        +v1.getNombre() +"es de $" + v1.getSueldoMensual() );
    }
    
    public void Vacaciones(Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if(antiguedad<5){
            System.out.println("Le corresponden 14 dias de vacaciones");
        }else if(antiguedad<10){
            System.out.println("Le corresponden 21 dias");
        }else if(antiguedad<20){
            System.out.println("Le corresponden 28 dias");
        }else if(antiguedad>20){
            System.out.println("Le corresponden 35 dias");
        }else{
            System.out.println("El empleado tiene vacacines proporcionales");
        }
    }
}

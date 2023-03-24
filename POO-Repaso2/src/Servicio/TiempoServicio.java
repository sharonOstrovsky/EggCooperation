
package Servicio;

import Entidades.Tiempo;
import java.util.Scanner;


public class TiempoServicio {
    Scanner input = new Scanner(System.in);
    
    public Tiempo crearTiempo(){
        
        int hs, min, seg;        
        
        Tiempo t = new Tiempo();
        
        System.out.println("ingrese las horas");
        hs = input.nextInt();
        while(hs > 24 || hs < 0){
            System.out.println("hora no valida");
            hs = input.nextInt();
        }
        t.setHora(hs);
        
        System.out.println("ingrese los minutos");
        min = input.nextInt();
        while(min > 60 || min < 0){
            System.out.println("minutos no validos");
            min = input.nextInt();
        }
        t.setMinutos(min);
        
        System.out.println("ingrese los segundos");
        seg = input.nextInt();
        while(seg > 60 || seg < 0){
            System.out.println("segundos no validos");
            seg = input.nextInt();
        }
        t.setSegundos(seg);
        

        return t;
    }
    
    public void imprimirHoraCompleta(Tiempo t){
        System.out.println(t.getHora()+" horas "+t.getMinutos()+" minutos "+t.getSegundos()+" segundos ");
        System.out.println(t.getHora()+":"+t.getMinutos()+":"+t.getSegundos());
    }
    
    public void simularTiempo(Tiempo t){
        int hs, min, seg;
        hs = t.getHora();
        min = t.getMinutos();
        seg = t.getSegundos();
     //   int cont = 0;
        
        for (int i = 0; i < 221; i++) {
           // System.out.println((hs+cont)+":"+(min+cont)+":"+(seg+cont));

            if(seg < 59){
                seg++;
            }else if(min == 59){
                min = 0;
                seg = 0;
                hs++;
            }else if(hs == 24){
                hs = 0;
                min = 0;
                seg = 0;
            }else{
                seg = 0;
                min++;
            }
           // System.out.println(hs+":"+min+":"+seg);
            
            if(hs < 10 || min < 10 || seg < 10){
                if(hs < 10 && min < 10 && seg < 10){
                    System.out.println("0"+hs+":"+"0"+min+":"+"0"+seg);
                }else if(hs < 10 && min < 10){
                    System.out.println("0"+hs+":0"+min+":"+seg);
                }else if(min < 10 && seg < 10){
                    System.out.println(hs+":0"+min+":0"+seg);
                }else if(hs < 10){
                System.out.println("0"+hs+":"+min+":"+seg);
                } else if(min < 10){
                System.out.println(hs+":0"+min+":"+seg);
                }else if(seg < 10){
                System.out.println(hs+":"+min+":0"+seg);
                }
            }else{
                System.out.println(hs+":"+min+":"+seg);
            }
        //    System.out.println(hs+":"+min+":"+seg);
        }
        

    }
}

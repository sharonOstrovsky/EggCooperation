/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author sharo
 */
public class ServicioEdificioDeOficinas extends ServicioEdificio{
    
    Scanner input = new Scanner(System.in);
    
    public EdificioDeOficinas crearEdificioDeOficinas(){
        
        EdificioDeOficinas edificio = new EdificioDeOficinas();
        
        System.out.println("Cuantas personas entran en cada oficina?");
        int personasPorOficinas = input.nextInt();
        edificio.setPersonasPorOficina(personasPorOficinas);
        System.out.println("Cuantas oficinas hay?");
        int cantOficinas = input.nextInt();
        edificio.setCantOficinas(cantOficinas);
        System.out.println("cuantos pisos hay? ");
        int cantPisos = input.nextInt();
        edificio.setCantPisos(cantPisos);
        
        int alto, largo, ancho;
        alto = (int) (Math.random() * 10 + 1);
        largo = (int) (Math.random() * 10 + 1);
        ancho = (int) (Math.random() * 10 + 1);
        
        edificio.setAlto(alto);
        edificio.setAncho(ancho);
        edificio.setLargo(largo);
        
        return edificio;
        
    }
            
        /*
    clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
    */
    public void cantPersonas(EdificioDeOficinas edificio){
         //en cada piso hay una oficina
       
        System.out.println("Cantidad de personas por piso: " + edificio.getPersonasPorOficina() );
        System.out.println("Cantidad de personas en todo el edificio: " + edificio.getPersonasPorOficina()*edificio.getCantOficinas());
    }
}

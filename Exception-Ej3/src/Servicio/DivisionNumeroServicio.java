
package Servicio;

import Entidad.DivisionNumero;


public class DivisionNumeroServicio {
    
    public DivisionNumero crearDivision(String dividendo, String divisor){
        
        DivisionNumero division = new DivisionNumero();
        
        division.setDividendo(Integer.parseInt(dividendo));
        division.setDivisor(Integer.parseInt(divisor));
        
        return division;
    }
    
    public double dividir(DivisionNumero division){
        
        return division.getDividendo() / division.getDivisor();
        
    }
    
}

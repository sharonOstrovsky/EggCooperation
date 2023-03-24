
package Entidad;


public class DivisionNumero {
 
    private int divisor;
    private int dividendo;

    public DivisionNumero(int divisor, int dividendo) {
        this.divisor = divisor;
        this.dividendo = dividendo;
    }

    public DivisionNumero() {
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }
    
    
    
}

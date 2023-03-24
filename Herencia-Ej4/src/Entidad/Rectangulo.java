
package Entidad;

import Interfaces.calculosFormas;


public class Rectangulo implements calculosFormas{
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    

    @Override
    public void calcularArea() {
        System.out.println("Area Rectangulo = " + getBase() * getAltura() );
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Rectangulo = " + (getBase() + getAltura() ) * 2 );
    }
    
    
    
}

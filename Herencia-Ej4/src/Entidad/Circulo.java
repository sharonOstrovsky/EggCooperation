
package Entidad;

import Interfaces.calculosFormas;


public class Circulo implements calculosFormas {
    
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("Area del Circulo = " + (getRadio() * getRadio() * PI));
    }
    
    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro del Circulo = " + ( PI * getRadio() * 2 ));
    }
    
}

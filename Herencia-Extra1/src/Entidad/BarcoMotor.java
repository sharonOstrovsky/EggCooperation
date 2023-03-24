//• Potencia en CV para barcos a motor.
package Entidad;


public class BarcoMotor extends Barco{
    
    private double potencia; //en CV

    public BarcoMotor() {
    }
 
    public BarcoMotor(double potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(double potencia, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia=" + potencia + super.toString() +'}';
    }
    
    
}

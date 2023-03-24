
package Entidad;

//• Potencia en CV y número de camarotes para yates de lujo.
public class Yate extends Barco{
    
    private double potencia; //en CV
    private int numCamarotes;

    public Yate() {
    }

    public Yate(double potencia, int numCamarotes) {
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public Yate(double potencia, int numCamarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "potencia=" + potencia + ", numCamarotes=" + numCamarotes + super.toString() + '}';
    }
    
    
    
}

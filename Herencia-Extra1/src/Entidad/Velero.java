
package Entidad;

//• Número de mástiles para veleros.
public class Velero extends Barco{
    
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(int numMastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero:" + "numMastiles=" + numMastiles + super.toString();
    }

    

   
    
    
}


package Entidad;


public class Camping extends ExtraHoteleros{
    
    private int capacidadMaxCarpas;
    private int cantBanios;
    private boolean restautante;

    public Camping() {
    }

    public Camping(int capacidadMaxCarpas, int cantBanios, boolean restautante) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBanios = cantBanios;
        this.restautante = restautante;
    }

    public Camping(int capacidadMaxCarpas, int cantBanios, boolean restautante, boolean privado, int metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBanios = cantBanios;
        this.restautante = restautante;
    }

    public Camping(int capacidadMaxCarpas, int cantBanios, boolean restautante, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBanios = cantBanios;
        this.restautante = restautante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestautante() {
        return restautante;
    }

    public void setRestautante(boolean restautante) {
        this.restautante = restautante;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad Maxima de Carpas = " + capacidadMaxCarpas + "\nCantidad de Baños = " + cantBanios + "\nTiene Restautante = " + restautante;
    }
    
    
}

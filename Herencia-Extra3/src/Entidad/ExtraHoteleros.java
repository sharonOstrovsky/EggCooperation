
package Entidad;


public class ExtraHoteleros extends Alojamiento{
    
    protected boolean privado;
    protected int metrosCuadrados;//cantidad de metros cuadrados que ocupa

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(boolean privado, int metrosCuadrados) {
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public ExtraHoteleros(boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "\nesPrivado = " + privado + "\nMetros Cuadrados = " + metrosCuadrados;
    }
    
    
    
    
}

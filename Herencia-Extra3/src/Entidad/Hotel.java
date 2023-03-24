
package Entidad;


public class Hotel extends Alojamiento{
    
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad de Habitaciones = " + cantHabitaciones + "\nNumero de Camas = " + numCamas + "\nCantidad de Pisos = " + cantPisos + "\nPrecio por Habitacion = " + precioHabitacion ;
    }
    
    
    
}

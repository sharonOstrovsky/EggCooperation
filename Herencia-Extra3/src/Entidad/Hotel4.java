
package Entidad;


public class Hotel4 extends Hotel{
    
    private char gimnasio;//tipo A o tipo B
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(char gimasio, String nombreRestaurante, int capacidadRestaurante) {
        this.gimnasio = gimasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4(char gimasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.gimnasio = gimasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4(char gimasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public char getGimasio() {
        return gimnasio;
    }

    public void setGimasio(char gimasio) {
        this.gimnasio = gimasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGimasio = " + gimnasio + "\nNombre del Restaurante = " + nombreRestaurante + "\nCapacidad del Restaurante = " + capacidadRestaurante;
    }
    
  

    
    
}

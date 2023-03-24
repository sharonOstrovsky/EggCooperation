
package Entidad;


public class Hotel5 extends Hotel4{
    
    private int cantConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantConferencia, int cantSuites, int cantLimosinas) {
        this.cantConferencia = cantConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(int cantConferencia, int cantSuites, int cantLimosinas, char gimasio, String nombreRestaurante, int capacidadRestaurante) {
        super(gimasio, nombreRestaurante, capacidadRestaurante);
        this.cantConferencia = cantConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(int cantConferencia, int cantSuites, int cantLimosinas, char gimasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        super(gimasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.cantConferencia = cantConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(int cantConferencia, int cantSuites, int cantLimosinas, char gimasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantConferencia = cantConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantConferencia() {
        return cantConferencia;
    }

    public void setCantConferencia(int cantConferencia) {
        this.cantConferencia = cantConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad de Salones para Conferencia = " + cantConferencia + "\nCantidad de Suites = " + cantSuites + "\nCantidad de Limosinas = " + cantLimosinas;
    }
    
    

}


package Entidades;


public class Alumno {
    
    private String nombreCompleto;
    private int DNI;
    private int cantVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int DNI, int cantVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantVotos = cantVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", DNI=" + DNI + ", cantVotos=" + cantVotos + '}';
    }
    
    
    
}

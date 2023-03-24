
package Entidad;

import Enumeraciones.Departamento;
import Enumeraciones.EstadoCivil;


public class Profesor extends Empleado{
    
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(Departamento departamento) {
        this.departamento = departamento;
    }

    public Profesor(Departamento departamento, int anioIncorporacoin, int numDespacho) {
        super(anioIncorporacoin, numDespacho);
        this.departamento = departamento;
    }

    public Profesor(Departamento departamento, int anioIncorporacoin, int numDespacho, String nombre, String apellido, int documento, EstadoCivil estadoCivil) {
        super(anioIncorporacoin, numDespacho, nombre, apellido, documento, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento = " + departamento;
    }
    
    
    
}

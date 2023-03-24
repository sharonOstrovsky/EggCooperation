
package Entidad;

import Enumeraciones.EstadoCivil;
import Enumeraciones.Seccion;


public class PersonalServicio extends Empleado{
    
    private Seccion seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(Seccion seccion) {
        this.seccion = seccion;
    }

    public PersonalServicio(Seccion seccion, int anioIncorporacoin, int numDespacho) {
        super(anioIncorporacoin, numDespacho);
        this.seccion = seccion;
    }

    public PersonalServicio(Seccion seccion, int anioIncorporacoin, int numDespacho, String nombre, String apellido, int documento, EstadoCivil estadoCivil) {
        super(anioIncorporacoin, numDespacho, nombre, apellido, documento, estadoCivil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nSeccion = " + seccion;
    }
    
    
    
}

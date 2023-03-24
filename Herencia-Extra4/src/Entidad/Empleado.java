
package Entidad;

import Enumeraciones.EstadoCivil;


public class Empleado extends Persona{
    
    protected int anioIncorporacoin;
    protected int numDespacho;
    protected int idEmpleado;
    protected static int CONTADOR_EMPLEAADO;

    public Empleado() {
        this.idEmpleado = ++CONTADOR_EMPLEAADO;
    }

    public Empleado(int anioIncorporacoin, int numDespacho) {
        this();
        this.anioIncorporacoin = anioIncorporacoin;
        this.numDespacho = numDespacho;
        
    }

    public Empleado(int anioIncorporacoin, int numDespacho,String nombre, String apellido, int documento, EstadoCivil estadoCivil) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.estadoCivil = estadoCivil;
        //super(nombre, apellido, documento, estadoCivil);
        this.anioIncorporacoin = anioIncorporacoin;
        this.numDespacho = numDespacho;
       
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    

    public int getAnioIncorporacoin() {
        return anioIncorporacoin;
    }

    public void setAnioIncorporacoin(int anioIncorporacoin) {
        this.anioIncorporacoin = anioIncorporacoin;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nid Empleado = " + idEmpleado + "\nAño Incorporacion = " + anioIncorporacoin + "\nNumero de Despacho = " + numDespacho ;
    }
    
    
}

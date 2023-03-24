
package Entidad;

import Enumeraciones.EstadoCivil;
import java.util.ArrayList;


public class Estudiante extends Persona{
    
    private ArrayList<String> cursos;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int documento, EstadoCivil estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
    }

    public Estudiante(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public Estudiante(ArrayList<String> cursos, String nombre, String apellido, int documento, EstadoCivil estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.cursos = cursos;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCursos = " + cursos ;
    }
    
    
}

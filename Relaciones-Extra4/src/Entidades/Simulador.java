
package Entidades;

import java.util.ArrayList;


public class Simulador {
    private ArrayList<String> nombres;
    private ArrayList<String> Apellidos;

    public Simulador() {
    }

    public Simulador(ArrayList<String> nombres, ArrayList<String> Apellidos) {
        this.nombres = nombres;
        this.Apellidos = Apellidos;
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public void setNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }

    public ArrayList<String> getApellidos() {
        return Apellidos;
    }

    public void setApellidos(ArrayList<String> Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String toString() {
        return "Simulador{" + "nombres=" + nombres + ", Apellidos=" + Apellidos + '}';
    }
    
    
}


package Entidades;

import Enumeraciones.RazaPerro;

public class Perro {
    
    private String nombre;
    private RazaPerro raza;
    private int edad;
    private double tam; //tamaño

    public Perro() {
    }

    public Perro(String nombre, RazaPerro raza, int edad, double tam) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tam = tam;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tam=" + tam + '}';
    }
    
    
    
    
}


package Entidades;

import java.util.ArrayList;


public class Cine {
    
    private Pelicula pelicula;
    private ArrayList<Sala> salas;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, ArrayList<Sala> salas, double precioEntrada) {
        this.pelicula = pelicula;
        this.salas = salas;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", salas=" + salas + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
}

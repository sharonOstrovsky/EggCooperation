
package Entidad;


public class Jugador {
    
    private String nobmre;
    private int edad;
    private double altura;
    private double peso;
    private String nacionalidad;

    public Jugador() {
    }

    public Jugador(String nobmre, int edad, double altura, double peso, String nacionalidad) {
        this.nobmre = nobmre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidad = nacionalidad;
    }

    public String getNobmre() {
        return nobmre;
    }

    public void setNobmre(String nobmre) {
        this.nobmre = nobmre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return nobmre + "\t" + edad + "\t" + altura + "\t" + peso + "\t" + nacionalidad;
    }
    
    
    
}

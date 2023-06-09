
package Entidad;

import java.util.Objects;


public class Mascota2 implements Comparable<Mascota2>{
     private String nombre;
    private String apodo;
    //conejo, gato, perro, loro, carpincho
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private String raza;
    
    private int energia;
    
    public Mascota2(){
        //cada vez que creo una mascota esta empieza con 1000 de energia
        energia = 1000;
    }
    
    public Mascota2(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho") ){
            this.tipo = tipo;
        }
        this.energia = 1000;
        
    }

    public Mascota2(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    
    
    //SET para poder modificar un atributo
    public void setNombre(String nombre){
        //this.nombre = nombre;
        if(nombre.length() > 0){
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //GET  permite entrar a la clase, obtener el atributo que necesito e irme
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    /**
     * Funcion destinada a pasear
     * 
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        
       // energia = energia - energiaRestar;
        energia -= energiaRestar;
        
        return energia;
    }
    
    /**
     * Funcion destinada a pasear por vueltas
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
    
        return energia;
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apodo);
        hash = 23 * hash + Objects.hashCode(this.tipo);
        hash = 23 * hash + Objects.hashCode(this.color);
        hash = 23 * hash + Objects.hashCode(this.edad);
        hash = 23 * hash + (this.cola ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.raza);
        hash = 23 * hash + this.energia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota2 other = (Mascota2) obj;
        if (this.cola != other.cola) {
            return false;
        }
        if (this.energia != other.energia) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }

    
    
    
    //insert toString -> permite generar un texto ya armado con todos los datos de la mascota
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

    @Override
    public int compareTo(Mascota2 t) {
        return t.getNombre().compareTo(this.nombre);
    }
}

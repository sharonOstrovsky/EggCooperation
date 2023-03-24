/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import enumeraciones.RazaPerruna;
import enumeraciones.SexoAnimal;
import java.util.Objects;

/**
 *
 * @author sharo
 */
public class Mascota3 <T>{
    
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private T raza;
    private SexoAnimal sexo;
    
    private int energia;

    public Mascota3() {
        this.energia = 1000;
    }

    public Mascota3(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho") ){
            this.tipo = tipo;
        }
        this.energia = 1000;
    }

    public Mascota3(String nombre, String apodo, String tipo, String color, Integer edad, boolean cola, T raza, SexoAnimal sexo, int energia) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.sexo = sexo;
        this.energia = 1000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
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
        final Mascota3 other = (Mascota3) obj;
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

   //@Override
    public int compareTo(Mascota3 t) {
        return t.getNombre().compareTo(this.nombre);
    }


    
    
    
    
    
    
}


package Entidad;


public class Polideportivo extends Edificio{
    
    private String nombre;
    private String tipoInstalacion; //Techado o Abierto

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(String nombre, String tipoInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }

 
    
    

    @Override
    public void calcularSuperficio() {
        System.out.println("Superficie del Polideportivo " + getNombre() + ": " + getLargo() * getAncho() );
    }

    @Override
    public void calcularVolumen() {
        if( getTipoInstalacion().equalsIgnoreCase("Techado") ){
            System.out.println("Volumen del Polideportivo " + getNombre() + ": " + getLargo() * getAlto() * getAncho());
        }else{
            if( getTipoInstalacion().equalsIgnoreCase("Abierto")){
                System.out.println("Volumen del Polideportivo " + getNombre() + ": " + getLargo() * getAncho());
            }
        }
        
    }
    
}

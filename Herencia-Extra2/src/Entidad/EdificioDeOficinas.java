
package Entidad;


public class EdificioDeOficinas extends Edificio{
    
    //número de oficinas, cantidad de personas por oficina y número de pisos.
    private int cantOficinas;
    private int PersonasPorOficina;
    private int cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantOficinas, int PersonasPorOficina, int cantPisos) {
        this.cantOficinas = cantOficinas;
        this.PersonasPorOficina = PersonasPorOficina;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas(int cantOficinas, int PersonasPorOficina, int cantPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.PersonasPorOficina = PersonasPorOficina;
        this.cantPisos = cantPisos;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getPersonasPorOficina() {
        return PersonasPorOficina;
    }

    public void setPersonasPorOficina(int PersonasPorOficina) {
        this.PersonasPorOficina = PersonasPorOficina;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

 
    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "cantOficinas=" + cantOficinas + ", PersonasPorOficina=" + PersonasPorOficina + ", cantPisos=" + cantPisos + '}';
    }
    
    

    @Override
    public void calcularSuperficio() {
        System.out.println("Superficie del Efificio de oficinas: " + getLargo() * getAncho());
        
    }

    @Override
    public void calcularVolumen() {
        
        System.out.println("Volumen del Edificio de oficinas: " + getLargo() * getAlto() * getAncho());
    }
    
//    public void cantPersonas(EdificioDeOficinas edificio){
//         //en cada piso hay una oficina
//        
//       System.out.println("Cantidad de personas por piso: " + edificio.PersonasPorOficina );
//    }
    
}

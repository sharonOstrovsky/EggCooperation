
package Entidades;


public class Sala {
    
    private String[][] sala;

    public Sala() {
    }

    public Sala(String[][] sala) {
        this.sala = sala;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + sala + '}';
    }
    
    
}

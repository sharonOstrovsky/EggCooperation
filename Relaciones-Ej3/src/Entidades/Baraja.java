
package Entidades;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


public class Baraja {
    private TreeSet<Carta> cartasBasto;
    private TreeSet<Carta> cartasEspada;
    private TreeSet<Carta> cartasOro;
    private TreeSet<Carta> cartasCopa;
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasMonton;

    public Baraja() {
    }

    public Baraja(TreeSet<Carta> cartasBasto, TreeSet<Carta> cartasEspada, TreeSet<Carta> cartasOro, TreeSet<Carta> cartasCopa, ArrayList<Carta> cartas) {
        this.cartasBasto = cartasBasto;
        this.cartasEspada = cartasEspada;
        this.cartasOro = cartasOro;
        this.cartasCopa = cartasCopa;
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }
    
    
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    

    public TreeSet<Carta> getCartasBasto() {
        return cartasBasto;
    }

    public void setCartasBasto(TreeSet<Carta> cartasBasto) {
        this.cartasBasto = cartasBasto;
    }

    public TreeSet<Carta> getCartasEspada() {
        return cartasEspada;
    }

    public void setCartasEspada(TreeSet<Carta> cartasEspada) {
        this.cartasEspada = cartasEspada;
    }

    public TreeSet<Carta> getCartasOro() {
        return cartasOro;
    }

    public void setCartasOro(TreeSet<Carta> cartasOro) {
        this.cartasOro = cartasOro;
    }

    public TreeSet<Carta> getCartasCopa() {
        return cartasCopa;
    }

    public void setCartasCopa(TreeSet<Carta> cartasCopa) {
        this.cartasCopa = cartasCopa;
    }

    @Override
    public String toString() {
        return "Baraja{\n" + cartas +"\n"+ '}';
    }
    
    
    



    

 

    
}

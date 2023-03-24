
package Enumeraciones;


public enum Columnas {

    /**
     *
     */
    UNO("1"),DOS("2"),TRES("3"),CUATRO("4"),CINCO("5"),SEIS("6"),SIETE("7"),OCHO("8");

    private String valor;
    
    private Columnas(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}


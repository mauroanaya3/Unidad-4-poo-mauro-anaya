package Taller1.Ejemplos;

public class Coche {
    String marca;
    String modelo;
    
    // Parametrizado
    public Coche(String marca) {
        this.marca = marca;
    }
    
    // Llamada al construntor anterior
    public Coche(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }
}

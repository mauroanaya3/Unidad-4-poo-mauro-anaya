package Taller1.Ejemplos;

public class Coche extends Vehiculo {
    String marca;    

    // Llamada al construntor de la clase usando 'super()'
    public Coche(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }
}

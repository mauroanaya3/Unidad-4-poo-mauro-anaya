package Taller1.Ejemplos;

public class Coche {
    String marca;
    String modelo;
    
    
    // Por defecto
    public Coche() {
        marca = "Desconocida";
    }
    
    // Parametrizado
    public Coche(String marca) {
        this.marca = marca;
    }
    
    // Sobrecargado o con dos parametros
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

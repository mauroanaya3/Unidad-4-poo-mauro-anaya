package Taller6.Ejemplos;

// Clase derivada en el mismo paquete
 public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String marca, double velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    public void mostrarInformacion() {
        mostrarDetalles(); // Accede al método protegido de la clase base
        System.out.println("Número de puertas: " + puertas);
    }
}
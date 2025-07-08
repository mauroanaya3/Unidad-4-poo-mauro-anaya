package Taller8.Ejercicios;

// Ejercicio 1
public class Vehiculo {

    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Vehículo - Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }

}

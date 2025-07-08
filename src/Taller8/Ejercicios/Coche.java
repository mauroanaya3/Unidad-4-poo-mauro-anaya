package Taller8.Ejercicios;

// Ejercicio 1
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(int numeroDePuertas, String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase padre
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}

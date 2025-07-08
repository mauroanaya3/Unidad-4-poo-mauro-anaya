package Taller5.Ejercicios.vehiculos;
// Ejercicio 2

public class Moto extends Vehiculo {

    String modelo;

    Moto(String tipo, String modelo) {
        super(tipo);
        this.modelo = modelo;
    }

    void mostrarModelo() {
        System.out.println("Modelo: " + modelo);
    }
}

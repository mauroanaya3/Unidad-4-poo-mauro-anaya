
package Taller12.Ejemplos;

// Interfaz Vehiculo con un método abstracto y un método predeterminado
public interface Vehiculo {

    void acelerar();

    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}

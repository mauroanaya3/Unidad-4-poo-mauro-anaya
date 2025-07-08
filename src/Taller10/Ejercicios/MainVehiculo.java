package Taller10.Ejercicios;

// Ejercicio 2
public class MainVehiculo {

    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Bicicleta(); // Polimorfismo

        // Llamar al método
        System.out.println("--- Comportamiento del vehículo genérico ---");
        vehiculo1.moverse();

        System.out.println("\n--- Comportamiento de la bicicleta ---");
        vehiculo2.moverse();

        
        System.out.println("\n--- Demostración con arreglo ---");
        Vehiculo[] vehiculos = {new Vehiculo(), new Bicicleta()};

        for (Vehiculo v : vehiculos) {
            v.moverse();
        }
    }
}

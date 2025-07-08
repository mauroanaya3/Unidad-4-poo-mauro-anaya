package Taller5.Ejercicios;
// Ejercicio 2

import Taller5.Ejercicios.vehiculos.Vehiculo;
import Taller5.Ejercicios.vehiculos.Moto;

public class MainVehiculo {

    public static void main(String[] args) {
        // Crear instancias
        Vehiculo vehiculo = new Vehiculo("Automóvil");  // Error: constructor no visible
        Moto moto = new Moto("Deportiva", "2021");  // Error: constructor no visible

        // Acceder a propiedades
        vehiculo.tipo = "Camión";  // Error: tipo no es visible
        moto.modelo = "2021";  // Error: modelo no es visible

        // Llamar a métodos
        vehiculo.mostrarTipo();  // Error: mostrarTipo no es visible
        moto.mostrarModelo();  // Error: mostrarModelono es visible
    }
}

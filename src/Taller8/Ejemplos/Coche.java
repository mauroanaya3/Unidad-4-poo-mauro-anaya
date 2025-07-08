package Taller8.Ejemplos;

public class Coche extends Vehiculo {

    public void mostrarMarca() {
        System.out.println(marca); // Error de compilación: 'marca' tiene acceso privado
    }
}

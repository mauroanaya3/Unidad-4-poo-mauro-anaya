package Taller6.Ejercicios.paquete1;

// Ejercicio 2
public class MainVehiculo {

    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Honda", 750);

        // Estos accesos generarán errores de compilación:
        System.out.println("Marca: " + moto.marca); // Error: marca tiene acceso protected
        System.out.println("Tipo: " + moto.getTipo()); // Error: getTipo() es protected
        System.out.println("Cilindrada: " + moto.cilindrada); // Error: cilindrada es protected

        // Solo podemos acceder a miembros públicos desde otro paquete
        System.out.println("Solo podemos crear el objeto, pero no acceder a sus miembros protected");
    }
}

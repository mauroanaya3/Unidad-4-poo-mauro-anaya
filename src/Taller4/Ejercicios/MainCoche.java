package Taller4.Ejercicios;

public class MainCoche {

    public static void main(String[] args) {
        int velocidad1 = 20;
        int velocidad2 = -5;

        Coche c = new Coche("AKT", "CR4", 90);

        // Intentar acceder directamente a propiedades privadas
        /*
        System.out.println(coche.marca); // Error de compilación
        System.out.println(coche.velocidadMaxima); // Error de compilación
         */
        
        // Acceso correcto
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Velocidad inicial: " + c.getVelocidadMaxima()
                + " km/h");

        // Metodo acelerar
        System.out.println("\n" + "El coche acelero " + velocidad1 + " k/h");
        System.out.println(c.acelerar(velocidad1)); // Velocidad Valida

        System.out.println("\n" + "El coche acelero " + velocidad2 + " k/h");
        System.out.println(c.acelerar(velocidad2)); // Velocidad Invalida
        System.out.println("\nVelocidad final: " + c.getVelocidadMaxima()
                + " km/h");
    }
}

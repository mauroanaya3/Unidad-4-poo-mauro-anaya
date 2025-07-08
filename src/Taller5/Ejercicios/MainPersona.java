package Taller5.Ejercicios;

// Ejercicio 3
public class MainPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        // Acceso al atributo privado
        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Carlos");

        // Acceso directo al atributo de paquete
        System.out.println("Edad: " + persona.edad);
        persona.edad = 35;

        // Llamada a método de paquete
        persona.mostrarInfo();

        // Acceso al atributo privado directamente
        System.out.println(persona.nombre); // Error nombre es privado
    }
}

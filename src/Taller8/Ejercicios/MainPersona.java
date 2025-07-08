package Taller8.Ejercicios;

// Ejercicio 3
public class MainPersona {

    public static void main(String[] args) {
        // Crear una persona
        Persona persona = new Persona("Mauro Anaya", 28);
        System.out.println("|||| Información de Persona ||||");
        persona.mostrarInformacion();

        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Carlos Garcia", 20, "123456");
        System.out.println("\n|||| Información de Estudiante ||||");
        estudiante.mostrarInformacion();

        // Modificar datos del estudiante
        estudiante.setEdad(25);
        estudiante.setMatricula("A654321");

        System.out.println("\n|||| Información Actualizada ||||");
        estudiante.mostrarInformacion();
    }
}

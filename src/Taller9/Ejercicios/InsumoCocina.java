package Taller9.Ejercicios;

// Ejercicio 3
public class InsumoCocina {

    private String codigo;

    public void mostrarDetalles() {
        // ERROR: No se puede usar super aquí porque no hay clase padre
        super.toString(); // Esto fallará
        System.out.println("Código: " + codigo);
    }
}

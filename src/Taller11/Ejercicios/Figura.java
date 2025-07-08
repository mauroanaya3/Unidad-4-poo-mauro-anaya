package Taller11.Ejercicios;

// Ejercicio 1
public abstract class Figura {

    // Método abstracto 
    public abstract double calcularArea();

    // Método concreto
    public void mostrarArea() {
        System.out.println("El area es: " + calcularArea());
    }
}

package Taller11.Ejercicios;

// Ejercicio 2
public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que cada subclase debe implementar
    public abstract double calcularSalario();

    // Método concreto que muestra los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}

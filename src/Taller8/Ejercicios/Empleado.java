package Taller8.Ejercicios;

// Ejercicio 4
public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("||| Detalles del Empleado |||");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

package Taller7.Ejercicios;

// Ejercicio 1
public class Empleado {

    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException(
                    "El salario no puede ser menor que 0");
        }
        this.salario = salario;
    }

}

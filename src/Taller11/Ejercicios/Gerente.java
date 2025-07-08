package Taller11.Ejercicios;

// Ejercicio 2
public class Gerente extends Empleado {

    private double salarioBase;
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

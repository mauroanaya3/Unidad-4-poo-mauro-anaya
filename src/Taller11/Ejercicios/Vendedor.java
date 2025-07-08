package Taller11.Ejercicios;

// Ejercicio 2
public class Vendedor extends Empleado {

    private double salarioBase;
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}

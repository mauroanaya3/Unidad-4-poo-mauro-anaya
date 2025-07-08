package Taller6.Ejercicios;


// Ejercicio 1
public class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    protected String getNombre() {
        return nombre;
    }

    protected double getSalario() {
        return salario;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    protected void mostrarInformacion () {
        System.out.println("Nombre: " + nombre + " | Salario: $" + salario);
    }
}

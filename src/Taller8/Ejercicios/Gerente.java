package Taller8.Ejercicios;

// Ejercicio 4
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llama al constructor de Empleado
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Departamento: " + departamento);
        System.out.println("Puesto: Gerente");
    }

    
    public String getDepartamento() {
        return departamento;
    }
}

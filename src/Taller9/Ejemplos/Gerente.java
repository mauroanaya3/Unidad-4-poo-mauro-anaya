package Taller9.Ejemplos;

/**
 *
 * @author Mauro
 */
public class Gerente extends Empleado {

    private String departamento;

    @Override
    public void mostrarNombre() {
        super.mostrarNombre(); // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }
}

package Taller8.Ejercicios;

// Ejercicio 4
public class MainEmpleado {

    public static void main(String[] args) {
        // Crear un empleado normal
        Empleado empleado1 = new Empleado("Mauro Anaya", 25000.0);

        // Crear dos gerentes
        Gerente gerente1 = new Gerente("William Orozco", 50000.0, "Ventas");
        Gerente gerente2 = new Gerente("Damaris Quintana", 55000.0, "Operaciones");

        // Mostrar detalles de todos
        System.out.println("|||| Información de Empleados ||||");
        empleado1.mostrarDetalles();

        System.out.println("\n|||| Información de Gerentes ||||");
        gerente1.mostrarDetalles();
        System.out.println(); // salto de linea
        gerente2.mostrarDetalles();

    }
}

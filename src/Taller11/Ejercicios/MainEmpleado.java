package Taller11.Ejercicios;

// Ejercicio 2
public class MainEmpleado {

    public static void main(String[] args) {
        Empleado e1 = new Gerente("Laura", 3000000, 800000);
        Empleado e2 = new Vendedor("Carlos", 1500000, 500000);

        e1.mostrarDetalles();
        e2.mostrarDetalles();
    }
}

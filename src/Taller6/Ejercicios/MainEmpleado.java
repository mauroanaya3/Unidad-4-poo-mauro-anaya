package Taller6.Ejercicios;

// Ejercicio 1
public class MainEmpleado {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Mauro Anaya", 1200000);
        Gerente gerente = new Gerente("William Orozco", 2000000, "Ventas");

        System.out.println("||||| Informacion del Empleado |||||");
        empleado.mostrarInformacion();

        System.out.println("\n||||| Informacion del Gerente |||||");
        gerente.mostrarInformacion();
    }
}

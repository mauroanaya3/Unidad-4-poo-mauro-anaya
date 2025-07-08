package Taller4.Ejercicios;

import java.util.Scanner;

public class MainEstudiante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();

        System.out.println("=== REGISTRO DE ESTUDIANTE ===");

        // Ingreso de nombre
        boolean datoValido = false;
        while (!datoValido) {
            try {
                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();
                estudiante.setNombre(nombre);
                datoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Ingreso de edad
        datoValido = false;
        while (!datoValido) {
            try {
                System.out.print("Ingrese la edad del estudiante (0-120): ");
                int edad = Integer.parseInt(scanner.nextLine());
                estudiante.setEdad(edad);
                datoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero entero valido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Ingreso de nota
        datoValido = false;
        while (!datoValido) {
            try {
                System.out.print("Ingrese la nota promedio (0.0-5.0): ");
                double nota = Double.parseDouble(scanner.nextLine());
                estudiante.setNotaPromedio(nota);
                datoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero valido (ej: 4.5).");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Mostrar resultados
        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad() );
        System.out.printf("Nota promedio: %.2f\n", estudiante.getNotaPromedio());

        scanner.close();
    }
}

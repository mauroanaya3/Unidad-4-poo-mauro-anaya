package Taller3.Ejercicios;

import java.util.Scanner;

public class PruebaMatematicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   CALCULADORA   ");
        System.out.println("=================");

        // Ingreso de números
        System.out.print("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        // Menú de operaciones
        int opcion;
        do {
            System.out.println("\n|||| OPERACIONES ||||");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. MultiplicaciOn");
            System.out.println("4. DivisiOn");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion (1-5): ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nResultado:" + Matematicas.sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("\nResultado: " + Matematicas.restar(numero1, numero2));
                    break;
                case 3:
                    System.out.printf("\nResultado: " + Matematicas.multiplicar(numero1, numero2));
                    break;
                case 4:
                    try {
                        System.out.printf("\nResultado: " + Matematicas.dividir(numero1, numero2));
                    } catch (ArithmeticException e) {
                        System.out.println("\nError: " + e.getMessage());
                    }
                    break;                
                case 5:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente nuevamente.");
            }

            if (opcion >= 1 && opcion <= 4) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine(); 
                scanner.nextLine(); 
            }
        } while (opcion != 5);

        scanner.close();
    }

}

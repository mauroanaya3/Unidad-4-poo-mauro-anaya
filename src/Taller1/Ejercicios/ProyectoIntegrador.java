package Taller1.Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProyectoIntegrador {
    private static List<Libro> libros = new ArrayList<>();
    private static List<Estudiante> estudiantes = new ArrayList<>();
    private static List<CuentaBancaria> cuentas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    crearEstudiante();
                    break;
                case 3:
                    crearCuentaBancaria();
                    break;
                case 4:
                    mostrarObjetos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while(opcion != 5);
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n||||| MENU PRINCIPAL |||||");
        System.out.println("1. Crear Libro");
        System.out.println("2. Crear Estudiante");
        System.out.println("3. Crear Cuenta Bancaria");
        System.out.println("4. Mostrar todos los objetos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    
    private static void crearLibro() {
        System.out.println("\n** CREAR NUEVO LIBRO **");
        System.out.println("¿Desea usar valores por defecto? (s/n)");
        String opcion = scanner.nextLine();
        
        Libro libro;
        if(opcion.equalsIgnoreCase("s")) {
            libro = new Libro();
        } else {
            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            
            System.out.print("Numero de paginas: ");
            int paginas = Integer.parseInt(scanner.nextLine());
            
            libro = new Libro(titulo, autor, paginas);
        }
        
        libros.add(libro);
        System.out.println("¡Libro creado exitosamente!");
    }
    
    private static void crearEstudiante() {
        System.out.println("\n** CREAR NUEVO ESTUDIANTE **");
        System.out.println("¿Desea usar valores por defecto? (s/n)");
        String opcion = scanner.nextLine();
        
        Estudiante estudiante;
        if(opcion.equalsIgnoreCase("s")) {
            estudiante = new Estudiante();
        } else {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Edad: ");
            String edad = scanner.nextLine();
            
            System.out.print("¿Desea asignar curso? (s/n)");
            opcion = scanner.nextLine();
            
            if(opcion.equalsIgnoreCase("s")) {
                System.out.print("Curso: ");
                String curso = scanner.nextLine();
                estudiante = new Estudiante(nombre, edad, curso);
            } else {
                estudiante = new Estudiante(nombre, edad);
            }
        }
        
        estudiantes.add(estudiante);
        System.out.println("¡Estudiante creado exitosamente!");
    }
    
    private static void crearCuentaBancaria() {
        System.out.println("\n** CREAR NUEVA CUENTA BANCARIA **");
        System.out.println("¿Desea usar valores por defecto? (s/n)");
        String opcion = scanner.nextLine();
        
        CuentaBancaria cuenta;
        if(opcion.equalsIgnoreCase("s")) {
            cuenta = new CuentaBancaria();
        } else {
            System.out.print("Numero de cuenta: ");
            String numero = scanner.nextLine();
            
            System.out.print("Tipo de cuenta: ");
            String tipo = scanner.nextLine();
            
            System.out.print("¿Desea ingresar saldo inicial? (s/n)");
            opcion = scanner.nextLine();
            
            if(opcion.equalsIgnoreCase("s")) {
                System.out.print("Saldo inicial: ");
                double saldo = Double.parseDouble(scanner.nextLine());
                cuenta = new CuentaBancaria(numero, saldo, tipo);
            } else {
                cuenta = new CuentaBancaria(numero, tipo);
            }
        }
        
        cuentas.add(cuenta);
        System.out.println("¡Cuenta bancaria creada exitosamente!");
    }
    
    private static void mostrarObjetos() {
        System.out.println("\n||||| OBJETOS CREADOS |||||");
        
        System.out.println("\n** LIBROS **");
        if(libros.isEmpty()) {
            System.out.println("No hay libros creados.");
        } else {
            libros.forEach(System.out::println);
        }
        
        System.out.println("\n** ESTUDIANTES **");
        if(estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes creados.");
        } else {
            estudiantes.forEach(System.out::println);
        }
        
        System.out.println("\n** CUENTAS BANCARIAS **");
        if(cuentas.isEmpty()) {
            System.out.println("No hay cuentas bancarias creadas.");
        } else {
            cuentas.forEach(System.out::println);
        }
    }
}

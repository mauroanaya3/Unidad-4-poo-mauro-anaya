package Taller7.Ejercicios;
//Ejercicio 1
public class MainEmpleado {
    public static void main(String[] args) {
        // Creación de un empleado
        Empleado em = new Empleado("Mauro Anaya", 1200000);
        
        // Acceso a la propiedad pública nombre
        System.out.println("Nombre del empleado: " + em.nombre);
        
        // Acceso al salario mediante getter
        System.out.println("Salario actual: $" + em.getSalario());
        
        // Modificación del salario mediante setter (correcto)
        em.setSalario(2600000);
        System.out.println("\nNuevo salario: $" + em.getSalario());
        
        // Intentar establecer salario negativo (generará excepción)
        try {
            em.setSalario(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al actualizar salario: " + e.getMessage());
        }
        
        // Modificación directa del nombre (por ser público)
        em.nombre = "Mauro Anaya Jaraba";
        System.out.println("\nNombre actualizado: " + em.nombre);
        
        // Mostrar información final del empleado
        System.out.println("\nResumen final del empleado:");
        System.out.println("Nombre: " + em.nombre);
        System.out.println("Salario: $" + em.getSalario());
    }
}

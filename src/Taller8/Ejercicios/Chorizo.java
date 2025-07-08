package Taller8.Ejercicios;

// Ejercicio 5

// ESTO GENERARÁ ERROR - No se puede heredar de dos clases
public class Chorizo extends Producto, Embutido { 
    private String presentacion;
    
    public void mostrarPresentacion() {
        System.out.println("Presentacion de: " + presentacion);
    }
}

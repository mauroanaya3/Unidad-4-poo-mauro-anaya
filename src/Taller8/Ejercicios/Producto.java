package Taller8.Ejercicios;

// Ejercicio 5
public class Producto {

    private String codigo;
    private double precio;

    public Producto(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public void mostrarPrecio() {
        System.out.println("Precio: $" + precio);
    }
}

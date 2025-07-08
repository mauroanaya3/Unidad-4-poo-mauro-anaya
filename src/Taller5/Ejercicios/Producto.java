package Taller5.Ejercicios;
// Ejercicio 1
public class Producto {

    String nombre;
    double precio;
    double stock;

    public Producto(String nombre, double precio, double stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    String getNombre() {
        return nombre;
    }

    double getPrecio() {
        return precio;
    }

    double getStock() {
        return stock;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setPrecio(double precio) {
        this.precio = precio;
    }

    void setStock(double stock) {
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Producto :" + nombre + " | Precio: $" + precio
                + " | Stock: " + stock);
    }
}

package Taller5.Ejemplos;

// Clase Producto con nivel de acceso de paquete
class Producto {

    String nombre; // Atributo de paquete (default)
    double precio; // Atributo de paquete (default)

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }
}

package Taller5.Ejercicios;

// Ejercicio 1
public class MainProducto {

    public static void main(String[] args) {
        Producto p = new Producto("Salchicha Americana", 22500.00, 10);

        // Accediendo directamente a las propiedades
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Precio: " + p.precio);
        System.out.println("Stock: " + p.stock);

        // Modificando propiedades
        p.precio = 21200.00;
        p.stock = 8;

        p.mostrarInfo();
    }
}

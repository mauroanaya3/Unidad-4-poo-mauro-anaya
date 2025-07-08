package Taller10.Ejercicios;

// Ejercicio 3
public class ProductoImportado extends Producto {
    // Error: diferente firma del método
    @Override
    public void calcularPrecio() {
        System.out.println("Calculando precio del producto importado.");
    }
}
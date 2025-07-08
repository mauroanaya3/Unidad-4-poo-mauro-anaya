package Taller9.Ejercicios;

// Ejercicio 3
public class Ingrediente {

    private double precioCompra; 
}

public class Carne extends Ingrediente {

    private String corte;

    public void mostrarCosto() {
        // ERROR: No se puede acceder al precio
        System.out.println("Costo: " + super.precioCompra);
    }
}

package Taller9.Ejercicios;

// Ejercicio 3
public class Utensilio extends InsumoCocina {

    private String material;

    public void mostrarDetalles() {
        super.mostrarDetalles(); // llama al método del padre
        System.out.println("Material: " + material);
    }
}

package Taller9.Ejercicios;

// Ejercicio 2
public class Pez extends Animal {

    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Llama al constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llama al método de Animal
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

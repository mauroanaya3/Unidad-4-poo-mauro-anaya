package Taller2.Ejercicios;

public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante() {
        this("Sin asignar", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}

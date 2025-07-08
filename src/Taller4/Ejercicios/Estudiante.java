package Taller4.Ejercicios;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Estudiante() {
        
    }

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120 años");
        }
        this.edad = edad;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio < 0.0 || notaPromedio > 5.0) {
            throw new IllegalArgumentException("La nota debe estar entre 0.0 y 5.0");
        }
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        return String.format("Estudiante: %s | Edad: %d | Nota: %.2f",
                nombre, edad, notaPromedio);
    }

}

package Taller2.Ejemplos;

public class Persona {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre; 
        
        this.mostrarNombre();
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

package Taller1.Ejercicios;

public class Estudiante {
    private String nombre;
    private String edad;
    private String curso;
    
    // Constructor por defecto
    public Estudiante () {
        nombre = "No especificado";
        edad = "N/A";
        curso = "No asignado";
    }
    
    //Constructor con dos parametros
    public Estudiante (String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
        curso = "No asignado";
    }
    
    // Constructor que llama a otro
    public Estudiante (String nombre, String edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    @Override
    public String toString() {
        return "Estudiante: " + nombre + "| Edad: " + edad
                + " | Curso: " + curso;
    }
}

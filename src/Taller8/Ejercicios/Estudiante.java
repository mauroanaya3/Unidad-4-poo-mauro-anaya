package Taller8.Ejercicios;
//Ejercicio 2
public class Estudiante extends Persona {

    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    // Getter y setter para matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de Persona
        System.out.println("Matrícula: " + matricula);
    }
}

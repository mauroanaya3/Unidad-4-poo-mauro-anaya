
package Taller10.Ejercicios;

// Ejercici 1
public class MainPersona {
    public static void main(String[] args) {
        // Crear instancias
        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); // Polimorfismo
        Persona profesor = new Profesor(); // Polimorfismo
        
        // Invocar métodos
        persona.presentarse();   
        estudiante.presentarse(); 
        profesor.presentarse();   
        
        // También podemos usar un arreglo polimórfico
        Persona[] personas = {
            new Persona(),
            new Estudiante(),
            new Profesor()
        };
        
        System.out.println("\nPresentación usando arreglo:");
        for (Persona p : personas) {
            p.presentarse(); // Se llama al método adecuado para cada tipo
        }
    }
}

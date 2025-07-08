package Taller3.Ejercicios;

public class EjercicioStatic {

    private String direccion;
    
    
    /*
    //Método estático intentando acceder a atributo no estático
    public static void mostrarDireccion() {
        System.out.println("Direccion: " + direccion); // Error de compilacion
    }

    public static void main(String[] args) {
        mostrarDireccion();
    }
    */
    
    
    // Método sin Error
    public void mostrarDireccion() {
        System.out.println("Direccion: " + this.direccion);
    }

    public static void main(String[] args) {
        EjercicioStatic eS = new EjercicioStatic();
        eS.direccion = "Calle 93 # 49C 105";
        eS.mostrarDireccion(); // Llama al método desde la instancia
    }
    
}

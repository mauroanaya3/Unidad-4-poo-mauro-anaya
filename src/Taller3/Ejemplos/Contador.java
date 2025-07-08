package Taller3.Ejemplos;

public class Contador {

    static int contadorGlobal = 0; 

    public Contador() {
        contadorGlobal++; 
    }

    public static void mostrarContador() {
        System.out.println("Contador global: " + contadorGlobal);
    }
}

public class Main {

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        Contador.mostrarContador(); 
    }
}

package Taller3.Ejemplos;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {
        int resultado = Calculadora.sumar(5, 7); 
        System.out.println("Resultado: " + resultado);
    }
}

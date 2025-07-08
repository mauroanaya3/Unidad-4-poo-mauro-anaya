package Taller7.Ejercicios;

// Ejercicio 2
public class MainCuentaBancaria {
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 545000, "Ahorros");

        // Intentar acceder directamente a numeroCuenta
        System.out.println("Número de cuenta: " + cuenta.numeroCuenta); // ERROR: numeroCuenta es privado
        
        
    }
}

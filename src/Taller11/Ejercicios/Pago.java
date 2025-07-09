package Taller11.Ejercicios;

// Ejercicio 3
public class Pago extends Transaccion {

    @Override
    public void registrar() {
        System.out.println("Pago registrado en módulo contable.");
    }
}

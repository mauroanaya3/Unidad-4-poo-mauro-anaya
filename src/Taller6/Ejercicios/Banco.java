package Taller6.Ejercicios;

// Ejercicio 3
public class Banco {

    protected double saldo;  // Propiedad crítica expuesta

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    protected void depositar(double monto) {
        this.saldo += monto;
    }

    protected void retirar(double monto) {
        this.saldo -= monto;
    }
    
    /*
    private double saldo;  // Ahora es privado

    public Banco(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.saldo = saldoInicial;
    }

    // Métodos públicos 
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo");
        }
        this.saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo");
        }
        if (monto > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        this.saldo -= monto;
    }

    // Getter sin setter (el saldo solo se modifica mediante operaciones)
    public double consultarSaldo() {
        return saldo;
    }
    */

}

package Taller7.Ejercicios;

// Ejercicio 2
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    public CuentaBancaria(String numeroCuenta, double saldoInicial, 
            String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void mostrarDetalles() {
        System.out.println("|||| Detalles de la cuenta ||||");
        System.out.println("Tipo: " + tipoCuenta);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}

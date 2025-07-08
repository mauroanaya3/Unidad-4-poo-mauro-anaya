package Taller6.Ejercicios;

// Ejercicio 2
public class Moto extends Vehiculo {

    protected int cilidrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilidrada = cilindrada;
    }

    protected int getCilindrada(int cilindrada) {
        return cilindrada;
    }

    protected void setCilindrada(int cilindrada) {
        this.cilidrada = cilindrada;
    }
}

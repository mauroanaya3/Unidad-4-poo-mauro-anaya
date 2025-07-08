package Taller6.Ejercicios;

// Ejercicio 2
public class Vehiculo {

    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    protected String getTipo() {
        return tipo;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }
}

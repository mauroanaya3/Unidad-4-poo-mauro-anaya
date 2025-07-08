package Taller4.Ejercicios;

public class Coche {

    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public String acelerar(int velocidad) {
        if (velocidad > 0) {
            this.velocidadMaxima += velocidad;
            return "Nueva velocidad maxima: " + velocidadMaxima + 
                    " k/h";
        } else {
            return "La velocidad debe ser mayor que 0";
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    @Override
    public String toString() {
        return "La velocidad maxima del coche " + marca + ", " + modelo + 
                " es de: " + velocidadMaxima + " k/h";
    }
}

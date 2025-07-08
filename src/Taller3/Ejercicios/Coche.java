package Taller3.Ejercicios;

public class Coche {

    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarCoches() {
        System.out.println("Total coches: " + contadorCoches);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public static int getContadorCoches() {
        return contadorCoches;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void setContadorCoches(int contadorCoches) {
        Coche.contadorCoches = contadorCoches;
    }
    
    
}

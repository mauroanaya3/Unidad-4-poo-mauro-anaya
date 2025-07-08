package Taller11.Ejercicios;

public class MainFigura {
     public static void main(String[] args) {
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 3);

        f1.mostrarArea(); 
        f2.mostrarArea(); 
    }
}

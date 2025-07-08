package Taller7.Ejercicios;

// Ejercicio 3
public class MainUtilidades {

    public static void main(String[] args) {

        double resultadoSuma = Utilidades.sumar(5.5, 3.2);
        System.out.println("5.5 + 3.2 = " + resultadoSuma);

        double resultadoResta = Utilidades.restar(10, 4.5);
        System.out.println("10 - 4.5 = " + resultadoResta);

        double resultadoMulti = Utilidades.multiplicar(3, 2.5);
        System.out.println("3 * 2.5 = " + resultadoMulti);

        double resultadoDiv = Utilidades.dividir(10, 2);
        System.out.println("10 / 2 = " + resultadoDiv);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejemplos;

// Clase incorrecta que implementa una interfaz innecesaria
public class Casa implements Movible {

    @Override
    public void moverse() {
        // La lógica aquí no tiene sentido para una Casa
        System.out.println("Las casas no se mueven.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejemplos;

// Interfaz Nadador
public interface Nadador {

    default void despegar() {
        System.out.println("Nadador despega.");
    }
}

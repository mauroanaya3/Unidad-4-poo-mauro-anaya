/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejemplos;

public abstract class Animal {

    protected String nombre;
    // Constructor

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    // Método abstracto (sin cuerpo)

    public abstract void hacerSonido();
    // Método concreto

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

package Taller2.Ejercicios;

public class Empleado {

    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Forma incorrecta de usar this
    /*
    public static void mostrarEmpleado() {
         System.out.println(this.nombre);
    }
     */
    // Solucion al error
    public void mostrarEmpleado() {
        System.out.println(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

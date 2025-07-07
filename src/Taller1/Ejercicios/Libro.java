package Taller1.Ejercicios;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    // Contructor por defecto
    public Libro() {
        this.titulo = "No especificado";
        this.autor = "No especificado" ;
        this.numeroPaginas = 0;
    }
    
    // Cosntructor parametrizado
     public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Metodos Getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Metodos Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
     
    // Metodo para mostrar la informacion del libro
    @Override
    public String toString() {
        return "Libro: " + titulo + " / Autor: " + autor + " / Paginas: " 
              + numeroPaginas;
    }
     
}

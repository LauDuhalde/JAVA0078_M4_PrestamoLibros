package clases;

/**
 * La clase Libro representa un libro en una biblioteca o sistema de gestión.
 * Contiene información básica como el título, el autor y el precio de reemplazo.
 * 
 * <p>Permite crear instancias de libros y acceder o modificar sus atributos
 * mediante getters y setters. También redefine el método toString()
 * para mostrar una representación legible del libro.</p>
 * 
 * @author Laura Duhalde
 */
public class Libro {
    
    //atributos
    private String titulo;
    private String autor;
    private double precioDeReemplazo;
    
    //constructor
    /**
     * Constructor de la clase Libro.
     * 
     * @param titulo título del libro
     * @param autor autor del libro
     * @param precioDeReemplazo precio de reemplazo del libro
     */
    public Libro(String titulo, String autor, double precioDeReemplazo) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioDeReemplazo = precioDeReemplazo;
    }
    
    /**
     * Obtiene el título del libro.
     * 
     * @return título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * 
     * @param titulo nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param autor nuevo autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el precio de reemplazo del libro.
     * 
     * @return precio de reemplazo
     */
    public double getPrecioDeReemplazo() {
        return precioDeReemplazo;
    }

    /**
     * Establece el precio de reemplazo del libro.
     * 
     * @param precioDeReemplazo nuevo precio de reemplazo
     */
    public void setPrecioDeReemplazo(double precioDeReemplazo) {
        this.precioDeReemplazo = precioDeReemplazo;
    }

    /**
     * Devuelve una representación en cadena del libro,
     * incluyendo el título y el autor.
     * 
     * @return una cadena con el formato: "Libro: {titulo}, autor: {autor}"
     */
    @Override
    public String toString() {
        return "Libro: " + titulo + ", autor: " + autor;
    }
}

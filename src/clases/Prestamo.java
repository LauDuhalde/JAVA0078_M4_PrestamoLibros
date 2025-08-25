package clases;

import java.util.ArrayList;

/**
 * La clase Prestamo representa un préstamo de libros realizado por un usuario.
 * Contiene la información del usuario, la lista de libros prestados y el estado del préstamo.
 * 
 * Permite agregar libros al préstamo, mostrar detalles del mismo,
 * verificar el estado (activo/inactivo) y calcular el valor total de reemplazo
 * de los libros prestados.
 * 
 * @author Laura Duhalde
 */
public class Prestamo {
    // atributos
    private String nombre;
    private ArrayList<Libro> libros;
    private boolean estatus;

    /**
     * Constructor por defecto.
     * Crea un préstamo con nombre de usuario "Invitado", 
     * sin libros asociados y con estatus activo.
     */
    public Prestamo() {
        this.nombre = "Invitado";
        this.libros = new ArrayList<Libro>();
        this.estatus = true;
    }

    /**
     * Constructor que permite crear un préstamo con un usuario específico y su estatus.
     * 
     * @param nombre  Nombre del usuario asociado al préstamo.
     * @param estatus Estado del préstamo (true = activo, false = inactivo).
     */
    public Prestamo(String nombre, boolean estatus) {
        this.nombre = nombre;
        this.estatus = estatus;
        this.libros = new ArrayList<Libro>();
    }

    // getters & setters

    /**
     * Obtiene el nombre del usuario asociado al préstamo.
     * 
     * @return nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario asociado al préstamo.
     * 
     * @param nombre nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la lista de libros asociados al préstamo.
     * 
     * @return lista de libros.
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Establece la lista de libros asociados al préstamo.
     * 
     * @param libros nueva lista de libros.
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Verifica si el préstamo está activo o inactivo.
     * 
     * @return true si el préstamo está activo, false si está inactivo.
     */
    public boolean isEstatus() {
        return estatus;
    }

    /**
     * Establece el estado del préstamo.
     * 
     * @param estatus true para activo, false para inactivo.
     */
    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    // métodos

    /**
     * Agrega un libro a la lista de libros del préstamo.
     * 
     * @param libro libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    /**
     * Muestra en consola el estado del préstamo (activo o inactivo).
     */
    public void mostrarEstatus() {
        String mensaje = this.estatus ? "Préstamo activo" : "Préstamo inactivo";
        System.out.println(mensaje);
    }

    /**
     * Muestra en consola los detalles del préstamo: nombre del usuario
     * y la lista de libros asociados.
     */
    public void mostrarDetallesDelPrestamo() {
        System.out.println("Usuario: " + this.nombre);
        for (Libro libro : this.libros) {
            System.out.println(libro);
        }
        System.out.println("Total de reemplazo: $"+calcularTotalDeReemplazo());
    }

    /**
     * Calcula el valor total de reemplazo de los libros asociados al préstamo.
     * 
     * @return suma del precio de reemplazo de todos los libros.
     */
    public double calcularTotalDeReemplazo() {
        double total = 0;
        for (Libro libro : this.libros) {
            total += libro.getPrecioDeReemplazo();
        }
        return total;
    }

}

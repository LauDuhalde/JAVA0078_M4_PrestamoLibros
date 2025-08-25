package clases;
/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * 
 * <p>Simula un sistema de préstamos de libros, donde se crean diferentes 
 * usuarios (prestamos) y se les asignan libros. También muestra en consola 
 * los detalles de cada préstamo y su estatus (activo o inactivo).</p>
 * 
 * @author Laura Duhalde
 */
public class Aplicacion {
	/**
     * Método principal de la aplicación. 
     * 
     * <p>Dentro de este método se realizan las siguientes operaciones:</p>
     * <ul>
     *   <li>Se crean dos préstamos con usuarios no especificados (invitados).</li>
     *   <li>Se crean tres préstamos personalizados con distintos nombres y estados.</li>
     *   <li>Se instancian diez libros y se asignan a los distintos préstamos.</li>
     *   <li>Se muestran en consola los detalles de cada préstamo y su estatus.</li>
     * </ul>
     */
	public static void main(String[] args) {
		
		//Crea 2 préstamos con usuarios no especificados.
		Prestamo prestamo1 = new Prestamo();
		Prestamo prestamo2 = new Prestamo();
		
		//Crea 3 préstamos personalizados con nombres diferentes.
		Prestamo prestamo3 = new Prestamo("Anastasia",true);
		Prestamo prestamo4 = new Prestamo("Bianca",false);
		Prestamo prestamo5 = new Prestamo("Catalina",true);
		
		//Crea y añade al menos 2 libros a cada préstamo.
		Libro libro1 = new Libro("Tu admiradora secreta", "Tessa Bailey", 15000);
		Libro libro2 = new Libro("Happy Place", "Emily Henry", 21990);
		Libro libro3 = new Libro("Book lovers", "Emily Henry", 16490);
		Libro libro4 = new Libro("Slow Dance", "Rainbow Rowell", 18990);
		Libro libro5 = new Libro("Beach Read", "Emily Henry", 17500);
		Libro libro6 = new Libro("Gente que conocemos en vacaciones", "Emily Henry", 18990);
		Libro libro7 = new Libro("Solo para siempre", "Abby Jimenez", 16990);
		Libro libro8 = new Libro("Un amor de verano complicado", "Ali Hazelwood", 24990);
		Libro libro9 = new Libro("La teoría del amor", "Ali Hazelwood", 21000);
		Libro libro10 = new Libro("La hipótesis del amor", "Ali Hazelwood", 19990);
		
		prestamo1.agregarLibro(libro1);
		prestamo1.agregarLibro(libro2);
		
		prestamo2.agregarLibro(libro3);
		prestamo2.agregarLibro(libro4);
		prestamo2.agregarLibro(libro5);
		
		prestamo3.agregarLibro(libro6);
		prestamo3.agregarLibro(libro7);
		prestamo3.agregarLibro(libro8);
		prestamo3.agregarLibro(libro9);
		
		prestamo4.agregarLibro(libro10);
		prestamo4.agregarLibro(libro9);
		
		prestamo5.agregarLibro(libro8);
		prestamo5.agregarLibro(libro7);
		prestamo5.agregarLibro(libro6);
		
		//Muestra los detalles de cada préstamo usando el método mostrarDetallesDelPrestamo
		//Comprobar la funcionalidad mostrarEstatus
		System.out.println("Prestamo 1:");
		prestamo1.mostrarDetallesDelPrestamo();
		prestamo1.mostrarEstatus();
		
		System.out.println("Prestamo 2:");
		prestamo2.mostrarDetallesDelPrestamo();
		prestamo2.mostrarEstatus();
		
		System.out.println("Prestamo 3:");
		prestamo3.mostrarDetallesDelPrestamo();
		prestamo3.mostrarEstatus();
		
		System.out.println("Prestamo 4:");
		prestamo4.mostrarDetallesDelPrestamo();
		prestamo4.mostrarEstatus();
		
		System.out.println("Prestamo 5:");
		prestamo5.mostrarDetallesDelPrestamo();
		prestamo5.mostrarEstatus();

	}

}

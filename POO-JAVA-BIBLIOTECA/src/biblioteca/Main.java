package biblioteca;

import usuario.Usuario;
import libro.Libro;

/*
 * Clase principal que prueba el sistema de biblioteca.
 * 1) Crea usuarios y los registra.
 * 2) Crea libros y los agrega a la biblioteca.
 * 3) Prueba prestar libros y mostrar los disponibles.
 */
public class Main {
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear usuarios
        Usuario usuario1 = new Usuario("Luis Fernando", "luis@example.com");
        biblioteca.registrarUsuarios(usuario1);

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponible();

        // Prestar un libro
        biblioteca.prestarLibro("Cien años de soledad", usuario1);

        // Mostrar libros disponibles nuevamente
        biblioteca.mostrarLibrosDisponible();
    }
}

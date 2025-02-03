package gestion;

import libro.Libro;
import persona.Cliente;
import persona.Empleado;

import java.nio.file.Watchable;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Fer", "12", 2);
        Cliente cliente2 = new Cliente("Mon", "34", 3);
        Cliente cliente3 = new Cliente("Des", "14", 4);

        cliente1.mostrarInfo();
        cliente2.mostrarInfo();
        cliente3.mostrarInfo();


        Empleado empleado1 = new Empleado("gu", "56", "Conserje");
        Empleado empleado2 = new Empleado("jui", "98", "director");
        Empleado empleado3 = new Empleado("liu", "78", "cecnador");


        Libro libro1 = new Libro("Caballero carmelo", "Adrian Garcia", true);
        Libro libro2 = new Libro("Paco Yunque", "Cesar Vallejo", true);
        Libro libro3 = new Libro("El mundo de Riley", "Nick Fury", true);
        Libro libro4 = new Libro("Aprendiendo a vivir", "Hermanos Ruso", true);


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarUsuario(cliente1, cliente2, cliente3, empleado1, empleado2, empleado3);

        biblioteca.registrarLibro(libro1,libro2,libro3,libro4);

        biblioteca.prestarLibro("Paco Yunque", cliente1);
        biblioteca.prestarLibro("Paco Yunque", cliente1);

        biblioteca.mostrarLibros();



    }
}

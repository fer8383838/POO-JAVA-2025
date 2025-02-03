package gestion;
import persona.*;
import libro.*;
public class Biblioteca {

    private Usuario [] usuario = new Usuario[10];
    private Libro [] libro = new Libro[10];
    private int contadorUsuario = 0;
    private int contadorLibro = 0;

    public void registrarUsuario(Usuario ... nuevoUsuario){
        for (Usuario usuario:nuevoUsuario) {
            if (contadorUsuario < this.usuario.length) {
                this.usuario[contadorUsuario++] = usuario;
                System.out.println("Usuario registrado "+contadorUsuario);
            } else {
                System.out.println("No se pueden registrar más usuarios.");
            }

        }
    }

    public void registrarLibro(Libro ... nuevoLibro){
        for (Libro libro:nuevoLibro) {
            if (contadorLibro < this.libro.length){
                this.libro[contadorLibro++] = libro;
                System.out.println("Libro registrado "+contadorLibro);
            }else{
                System.out.println("No se pueden registrar mas libros");
            }
        }
    }

    public void prestarLibro(String titulo, Cliente cliente){
        for(int i = 0; i < contadorLibro; i++){
            boolean valor = libro[i].getDisponible();
            if(libro[i].getTitulo().equalsIgnoreCase(titulo) && valor){
                System.out.println("");
                System.out.println("Libro registrado "+titulo);
                System.out.println("Cliente "+cliente.getNombre());
                libro[i].setDisponible(false);
                return;
            }
        }
        System.out.println("");
        System.out.println("El libro no esta disponible");
    }

    public void mostrarLibros() {
        for (int i = 0; i < contadorLibro; i++) {
            libro[i].mostrarInfo();
        }
    }


}

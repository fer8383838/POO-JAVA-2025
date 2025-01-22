package biblioteca;

import usuario.Usuario;
import libro.Libro;

public class Biblioteca {
    private Usuario[] usuarios = new Usuario[10];
    private Libro[] libros = new Libro[10];

    public int contadorUsuarios = 0;
    public int contadorLibros = 0;

    public void registrarUsuarios(Usuario usuario){

        if(this.contadorUsuarios < this.usuarios.length) {
            this.usuarios[this.contadorUsuarios] = usuario;
            contadorUsuarios++;
        }else{
            System.out.println("No se pueden registrar mas usuarios");
        }


    }

    public void agregarLibro(Libro libro){

        if(this.contadorLibros < this.libros.length) {
            this.libros[contadorLibros] = libro;
            contadorLibros++;
        }else{
            System.out.println("No se pueden registrar mas libros");
        }
    }


    public void prestarLibro(String tittle, Usuario usuario){

        for (int  i = 0; i< contadorLibros; i++){
            if(this.libros[i].getTitulo().equalsIgnoreCase(tittle) && this.libros[i].isDisponible()){
                this.libros[i].setDisponible(false);
                System.out.println("El libro "+ tittle+" fue prestado a "+ usuario.getNombre());
                return;
            }
        }

        System.out.println("El libro no esta disponible o no existe");

    }

    public void mostrarLibrosDisponible(){
        for(int i=0; i < contadorLibros; i++){
            if (this.libros[i].isDisponible()){
                System.out.println("1. Titulo: "+libros[i].getTitulo() + " || Autor: "+ libros[i].getAutor());
            }
        }
    }

}

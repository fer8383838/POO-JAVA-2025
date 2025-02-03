package libro;

public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public boolean getDisponible(){
        return this.disponible;
    }
    public void setDisponible(boolean a){
        this.disponible = a;
    }

    public void mostrarInfo(){
        System.out.println("");
        System.out.println("Autor "+this.autor);
        System.out.println("Titulo "+this.titulo);
        System.out.println("Disponible "+this.disponible);
    }
}

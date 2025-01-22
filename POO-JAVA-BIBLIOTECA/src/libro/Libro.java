package libro;

public class Libro {

    protected String titulo;
    protected String autor;
    protected boolean disponible = true;

    public Libro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

}

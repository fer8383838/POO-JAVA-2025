package persona;

public abstract class Usuario {

    protected String nombre;
    protected String id;

    protected int contadorUsuario = 0;

    public Usuario (String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }
    abstract void mostrarInfo();
}

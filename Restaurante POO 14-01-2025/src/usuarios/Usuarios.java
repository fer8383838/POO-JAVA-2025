package usuarios;

public class Usuarios {

    protected String nombre;
    protected String email;

    public Usuarios (String nombre, String email){

        this.nombre = nombre;
        this.email = email;

    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }
}

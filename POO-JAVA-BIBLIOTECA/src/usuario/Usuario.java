package usuario;

public class Usuario {

    protected String nombre;
    protected String email;


    public Usuario (String nombre, String email){
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

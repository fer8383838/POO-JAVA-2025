package propietario;

public class Propietario {
    protected String nombre;
    protected String dni;

    public Propietario (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDni(){
        return this.dni;
    }
}

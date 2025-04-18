package personas;

public abstract class Persona {

    private String nombre;
    private String id;

    public Persona(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getId(){
        return this.id;
    }

    abstract void mostrarInfo();
}

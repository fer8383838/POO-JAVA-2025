package personas;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String id){
        super(nombre, id);
    }


    @Override
    public void mostrarInfo(){
        System.out.println("Nombre estuidante: " + getNombre() + "  ||  Id estudiante: "+getId());
    }
}

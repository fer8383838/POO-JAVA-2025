package personas;

public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String nombre, String id, String especialidad){
        super(nombre, id);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre profesor: " + getNombre() + "  ||  Id profesor: "+getId()+"  ||  Especialidad: "+getEspecialidad());
    }
}

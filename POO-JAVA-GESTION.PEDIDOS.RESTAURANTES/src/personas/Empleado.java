package personas;

public class Empleado extends Persona{

    private static int contCliente;
    private int id;
    private String puesto;

    public Empleado(String nombre, String puesto){
        super(nombre);
        this.puesto = puesto;
        this.id = ++contCliente;
    }

    public int getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del empleado: "+this.nombre);
        System.out.println("Id: "+id);
        System.out.println("Puesto: "+this.puesto);
    }
}

package persona;

public class Empleado extends Usuario{

    private String puesto;

    public Empleado(String nombre, String id, String puesto){
        super(nombre,id);
        this.puesto = puesto;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Informacion del empleado");
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Id: "+ this.id);
        System.out.println("Puesto: "+ this.puesto);
    }
}

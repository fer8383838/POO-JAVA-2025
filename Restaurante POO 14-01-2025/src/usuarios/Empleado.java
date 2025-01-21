package usuarios;

public class Empleado extends Usuarios{

    private String puesto;

    public Empleado (String nombre, String email, String puesto){

        super(nombre, email);
        this.puesto = puesto;
    }

    public String getPuesto(){
        return puesto;
    }

}

public class PersonalSistemas {

    private String Codigo;
    private String Apellidos;
    private String Nombres;
    private String DNI;
    private String Categoria;
    private String Especialidad;

    public PersonalSistemas(String codigo, String apellidos, String nombres, String DNI, String categoria, String especialidad) {
        Codigo = codigo;
        Apellidos = apellidos;
        Nombres = nombres;
        this.DNI = DNI;
        Categoria = categoria;
        Especialidad = especialidad;
    }

    private double  ObtenerSueldoBase() {
        if (Categoria.equals("Senior")) {
            return 2900;
        } else {
            return 3700;
        }
    }

    private double  ObtenerBonificacion() {
        if (Especialidad.equals("Java Developer")) {
            return 0.19*ObtenerSueldoBase();
        } else {
            return 0.21*ObtenerSueldoBase();
        }
    }

    private double  ObtenerSueldoFinal() {
        return ObtenerSueldoBase() + ObtenerBonificacion();
    }

    public String Mostrar(){
        return "---- Datos del Personal de Sistemas ----" +
                "\nNombres: " + Apellidos + " " + Nombres +
                "\nDNI: " + DNI +
                "\nBonificacion: " + ObtenerBonificacion() +
                "\nSueldo Base: " + ObtenerSueldoBase() +
                "\nSueldo Final: " + ObtenerSueldoFinal();
    }
}

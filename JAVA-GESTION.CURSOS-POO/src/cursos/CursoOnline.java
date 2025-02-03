package cursos;

public class CursoOnline extends Curso {

    private String plataforma;

    public CursoOnline(String nombre, int capacidad, String plataforma){
        super(nombre, capacidad);
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre curso: "+getNombre()+"  ||  Capacidad curso: "+getCapacidad()+"  ||  Cantidad Estudiante: "+getContadorEst());
    }
}

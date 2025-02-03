package cursos;
import personas.*;

public abstract class Curso {

    private String nombre;
    private int capacidad;
    private Estudiante [] estudiante;
    private int contadorEst;

    public Curso(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiante = new Estudiante[this.capacidad];
        contadorEst = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public int getContadorEst(){
        return contadorEst;
    }

    public void inscribirEstudiante(Estudiante estudiante){
        if(contadorEst < capacidad){
            this.estudiante[contadorEst] = estudiante;

            System.out.println("Se incribió el estudiante "+this.estudiante[contadorEst].getNombre()+ "Al curso "+this.nombre);
            contadorEst++;
        }else{
            System.out.println("El curso "+this.nombre+" esta lleno");
        }
    }

    public void inscribirEstudiante(Estudiante... estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            inscribirEstudiante(estudiante); // Llama al método que inscribe un solo estudiante
        }
        mostrarDetalles();
    }

    abstract void mostrarDetalles();
}

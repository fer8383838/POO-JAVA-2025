package cursos;

import personas.Estudiante;

public class CursoPresencial extends Curso {

    private String sala;

    public CursoPresencial(String nombre, int capacidad, String sala){
        super(nombre, capacidad);
        this.sala = sala;
    }



    @Override
    public void mostrarDetalles(){
        System.out.println("Nombre curso "+getNombre()+"  ||  Capacidad curso: "+getCapacidad()+"  || Cantidad Estudiante: "+getContadorEst());
    }


}

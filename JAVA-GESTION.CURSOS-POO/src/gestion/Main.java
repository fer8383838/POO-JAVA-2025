package gestion;

import cursos.CursoOnline;
import cursos.CursoPresencial;
import personas.Estudiante;
import personas.Profesor;

public class Main
{
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Fer", "002");
        estudiante1.mostrarInfo();
        Estudiante estudiante2 = new Estudiante("Jos", "003");
        estudiante2.mostrarInfo();
        Estudiante estudiante3 = new Estudiante("Lus", "34");
        estudiante3.mostrarInfo();

        Profesor profesor = new Profesor("Mon", "001", "Programación");
        profesor.mostrarInfo();

        CursoPresencial math = new CursoPresencial("Algebra", 10,"Principal");
        math.inscribirEstudiante(estudiante1,estudiante2,estudiante3);


        CursoOnline programacion = new CursoOnline("POO", 10, "BackBoard");
        programacion.inscribirEstudiante(estudiante1, estudiante2, estudiante3);

    }
}

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner Entrada= new Scanner(System.in);
        float Examen1, Examen2, Examen3, ExamenFinal, Promedio;

        System.out.println("Ingrese la nota del examen 1: ");
        Examen1 = Entrada.nextFloat();

        System.out.println("Ingrese la nota del examen 2: ");
        Examen2 = Entrada.nextFloat();

        System.out.println("Ingrese la nota del examen 3: ");
        Examen3 = Entrada.nextFloat();

        System.out.println("Ingrese la nota del examen final: ");
        ExamenFinal = Entrada.nextFloat();

        Promedio = ((Examen1 + Examen2 + Examen3 + ExamenFinal) / 4);

        System.out.println("El promedio final es:  " + Promedio);
    }
}
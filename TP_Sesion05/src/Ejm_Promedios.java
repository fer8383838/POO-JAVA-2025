import java.util.Scanner;

//Ingrese las 3 notas de practicas de los 12 alumnos de TP y calcule su promedio
public class Ejm_Promedios {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double[][] Notas=new double[3][4];
        double Valor, Acumulador=0;
        System.out.println("REGISTRO DE NOTAS DEL CURSO TALLER DE PROGRAMACION");

        //leyendo las notas
        for (int f=0;f<Notas.length;f++)
        {
            Acumulador=0;
            System.out.println("Alumno " + (f+1));
            for (int c=0;c<Notas[0].length-1;c++)
            {
                System.out.print("Nota de Practica " + (c+1) + ": ");
                Valor = Entrada.nextDouble();
                Notas[f][c]=Valor;
                Acumulador=Acumulador+Valor;
            }
            Notas[f][3]=Acumulador/3;
        }
        System.out.println(Notas[2][3]);
        System.out.println("\nRegistro de Notas");
        System.out.printf("Alumno\t\tPrac01\t\tPrac02\t\tPrac03\t\tProm.\n");
        //Mostrar la matriz
        for (int f=0;f<Notas.length;f++)
        {
            System.out.print("Alumno " + (f+1));
            for (int c=0;c<Notas[0].length;c++)
            {
                System.out.printf("\t\t\t%.0f",Notas[f][c]);
            }
            System.out.print("\n");
        }


    }
}

/*Calcular el promedio del curso, sabiendo que hay 3 Practicas y
un Examen Final. Si el promedio obtenido esta entre 10  y 12
inclusive y su examen fue más de 15, aumentarle 2 puntos.*/
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        int Nota1,Nota2,Nota3,Nota4;
        float Promedio;
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese nota de PC1: ");
        Nota1=Entrada.nextInt();
        System.out.print("Ingrese nota de PC2: ");
        Nota2=Entrada.nextInt();
        System.out.print("Ingrese nota de PC3: ");
        Nota3=Entrada.nextInt();
        System.out.print("Ingrese nota del EXAMEN FINAL: ");
        Nota4=Entrada.nextInt();

        Promedio=(float)(Nota1+Nota2+Nota3+Nota4)/4;

        if (Promedio < 9){
            System.out.println("DESAPROBADO");
            System.out.printf("Nota1: %d; \tNota2: %d; \tNota3: %d; \tNota4: %d",Nota1,Nota2,Nota3,Nota4);
            System.out.println("Su promedio es: "+Promedio);
        }
        if(Promedio >= 10 && Promedio <= 12 && Nota4>=15) {
            System.out.println("APROBADO");
            System.out.printf("Nota1: %d; \tNota2: %d; \tNota3: %d; \tNota4: %d",Nota1,Nota2,Nota3,Nota4,"\n");
            System.out.println("Su promedio es: "+(Promedio+2)+". Se le agregó dos puntos al promedio");
        }else if(Promedio >= 10 && Promedio <= 12 && Nota4<=15){
            System.out.println("DESAPROBADO");
            System.out.printf("Nota1: %d; \tNota2: %d; \tNota3: %d; \tNota4: %d",Nota1,Nota2,Nota3,Nota4);
        }else if(Promedio > 12){
            System.out.println("APROBADO");
            System.out.printf("Nota1: %d; \tNota2: %d; \tNota3: %d; \tNota4: %d",Nota1,Nota2,Nota3,Nota4,"\n");
            System.out.println("Su promedio es: "+Promedio);
        } else {
            System.out.println("DESAPROBADO");
            System.out.printf("El promedio obtenido es: %.1f",Promedio);
        }
    }

}

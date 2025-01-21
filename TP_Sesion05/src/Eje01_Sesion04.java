import java.util.Scanner;

//Elaborarunprogramaparaalmacenarlasnotas(3)delosalumnos(10)deTallerdeProgramación,ycalcularsusrespectivospromediosindicandosiaprobaronodesaprobaronelcurso.
public class Eje01_Sesion04 {
    public static void main(String[] args) {
        int[] vNota1=new int[3];
        int[] vNota2=new int[3];
        int[] vNota3=new int[3];
        int Nota;
        double Promedio;
        Scanner Entrada=new Scanner(System.in);

        System.out.println("Ingreso de Notas");
        for (int i=0;i<vNota1.length;i++)
        {
            System.out.println("Alumno " + (i+1));
            System.out.print("Nota 1: ");
            Nota=Entrada.nextInt();
            vNota1[i]=Nota;
            System.out.print("Nota 2: ");
            Nota=Entrada.nextInt();
            vNota2[i]=Nota;
            System.out.print("Nota 3: ");
            Nota=Entrada.nextInt();
            vNota3[i]=Nota;
        }

        System.out.println("\nResultados");
        for (int i=0;i<vNota1.length;i++)
        {
            Promedio=((double)(vNota1[i]+vNota2[i]+vNota3[i]))/3;
            System.out.printf("Alumno %d su promedio es %.1f \n",i+1,Promedio);
        }

    }
}

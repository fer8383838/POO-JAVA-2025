import java.util.Arrays;
import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[]  Numeros = new int[40];

        for(int i=0; i< Numeros.length; i++)
            Numeros[i]=(int)(Math.random()*100);

        System.out.println("Mostrando los numero del array ");
        System.out.println(Arrays.toString(Numeros));
        System.out.println("Consultar el Numero: ");
        int Consulta = sc.nextInt();

        for (int X: Numeros){
            if(X == Consulta){
                System.out.println("Numeros si existe en el Array");
                break;
            }
        }

    }
}

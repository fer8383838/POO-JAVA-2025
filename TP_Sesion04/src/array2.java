import java.lang.reflect.Array;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] Numeros = new int[10];
        int N;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            Numeros[i] = i;
            System.out.println(Numeros[i]);
        }
        System.out.println(Numeros);

        for (int i = 0; i <= Numeros.length; i++){
            System.out.println("Ingrese numero de la posicion " + i + ": ");
            N = sc.nextInt();
            Numeros[i] = N;
        }
        System.out.println("Los valores del array son: ");


    }
}

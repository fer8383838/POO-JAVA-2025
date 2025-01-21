import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int i, N;
        int[] Numeros = new int[6]; //declaro mi arreglo de tamaño 5
        Scanner Entrada = new Scanner(System.in);

        //llenar mi vector - ayudar de un for
        for (i=0;i<Numeros.length;i++)
        {
            System.out.print("Ingrese numero de la posicion " + i + ": ");
            N=Entrada.nextInt();
            Numeros[i]= N ;
        }

        System.out.println("Los valores del array son: ");
        //Imprimir los valores del array
        for (i=0;i<Numeros.length;i++)
        {
            System.out.printf("Numero[%d] es %d \n",i,Numeros[i]);
        }

    }
}

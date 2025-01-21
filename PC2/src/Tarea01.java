//1. Ingrese 50 números aleatorios en un array y determine
// cuántosnúmeros repetidos existen en él.

import java.util.Arrays;
public class Tarea01 {
    public static void main(String[] args) {
        int [] ar = new int[50];
        for (int i=0; i< ar.length; i++){
            ar[i]=(int)(Math.random()*100+1);;
        }
        //int[] ar = {1,1,2,3,4,5,5,8,8};
        System.out.println("El el array: ");
        for (int x:ar) {
            System.out.print(x+"\t");
        }
        Arrays.sort(ar);
        int[]copy = Arrays.copyOf(ar,ar.length);

        System.out.print("\n");
        int e = 0;
        int[]array= new int[ar.length];
        int[]contadores = new int[ar.length];

        int contador=0;
        int aux=ar[0];
        int c=0;
        for (int i = 0; i < ar.length; i++) {

            if(aux == ar[i]){
                contador++;

                if(contador==2){
                    array[e] = aux;
                    e++;
                }
            }
            if(aux != ar[i]){
                if (contador>1){
                    contadores[c] = contador;
                    c++;
                }
                contador=1;
                aux=ar[i];
            }

        }
        contadores[contadores.length-1]= contador;
        System.out.print("\n");


        System.out.print("Los numeros ");
        for (int x:array) {
            if(x!=0) {
                System.out.print(x + "\t");

            }
        }
        System.out.print("\n");
        System.out.print("Se repiten  ");
        for (int x:contadores) {
            if(x!=0) {
                System.out.print(x + "\t");

            }
        }
        System.out.print(" veces");

    }
}

/*Ingrese 6 números y determine cuántos números repetidos existen.
*/
import java.util.Arrays;
public class Ejer03 {
    public static void main(String[] args) {
        int[] ar = {1,1,2,3,4,5,5,8,8};
        Arrays.sort(ar);
        int[]copy = Arrays.copyOf(ar,9);
        for (int x:ar) {
            System.out.print(x+"\t");
        }
        System.out.print("\n");
        for (int x:copy) {
            System.out.print(x+"\t");
        }
        System.out.print("\n");
        int e = 0;
        int[]array= new int[9];
        int[]contadores = new int[9];

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

    }
}

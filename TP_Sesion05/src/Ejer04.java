//Ordene un array de 15 números según la forma que se indique: A (ascendente) o D (descendente).

public class Ejer04 {
    public static void main(String[] args) {
        int[] ar = {8,5,9,6,6,5,2,4,1};
        int[]contadores = new int[9];
        int contador=0;
        int max=ar[0];

        /*for (int i = 0; i < ar.length-1; i++) {
            if(ar[i+1] > max){
                max= ar[i+1];
                System.out.println(max);
            }
        }
        //int[] ar = {8,5,9,7,6,3,2,4,1};

        for (int j =1; j < ar.length; j++) {
            if (ar[j-1] > ar[j]) {
                int max2 = ar[j-1];
                ar[j-1] = ar[j];
                ar[j] = max2;
            }
        }
        for (int x:ar) {
            System.out.print(x+"\t");
        }
        System.out.print("\n");
        for (int j =1; j < ar.length; j++) {
            if (ar[j-1] < ar[j]) {
                int max2 = ar[j-1];
                ar[j-1] = ar[j];
                ar[j] = max2;
            }
        }
        for (int x:ar) {
            System.out.print(x+"\t");
        }
        System.out.print("\n");*/

        System.out.println("Cadena de numeros ASCENDENTE");
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int max2 = ar[i];
                    ar[i] = ar[j];
                    ar[j] = max2;
                }
            }
        }
        for (int x:ar) {
            System.out.print(x+"\t");
        }
        System.out.print("\n");

        System.out.println("Cadena de numeros DESCENDENTE");
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    int max2 = ar[i];
                    ar[i] = ar[j];
                    ar[j] = max2;
                }
            }
        }
        for (int x:ar) {
            System.out.print(x+"\t");
        }

    }
}

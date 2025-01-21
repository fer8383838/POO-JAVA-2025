import java.util.Arrays;

public class dgsd {
    public static void main(String[] args) {
        int[] ar = {3, 62, 62, 13, 1, 3, 54, 13,4};
        Arrays.sort(ar);
        for (int x:ar) {
            System.out.print(x+"\t");
        }
        int contador=0;
        int aux=ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(aux == ar[i]){
                contador++;
            } else {
                if(contador>1) {
                    System.out.print(contador + ",");
                }
                contador=1;
                aux=ar[i];
            }
        }
        System.out.print(contador );
    }
}

//Ingrese 12 números en una matriz de 4x3 y obtenga el numero mayor y menor ingresado
public class Ejer05 {
    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int max = array[0][0];
        int min = array[0][0];
        String indice1 = "0,0";
        String indice2 = "0,0";

        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indice1 = i + "," + j;
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                    indice2 = i + "," + j;
                }
            }
        }
        System.out.println("El número mayor de la matriz es " + max + " en la posición " + indice1);
        System.out.println("El número menor de la matriz es " + min + " en la posición " + indice2);
    }
}

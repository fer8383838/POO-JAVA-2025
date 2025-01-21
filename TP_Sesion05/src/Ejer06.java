import java.sql.SQLOutput;

public class Ejer06 {
    public static void main(String[] args) {

        int [][] A = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j<A[0].length; j++) {
                System.out.print(A[i][j]+"\t");
            }
        }
        int sumaA = 0;
        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sumaA += A[i][j];
            }
        }
        System.out.print(sumaA+"\n");

        int [][] B = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for (int i = 0; i<B.length; i++) {
            for (int j = 0; j<B[0].length; j++) {
                System.out.print(B[i][j]+"\t");
            }
        }
        int sumaB = 0;
        for (int i = 0; i<B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                sumaB += B[i][j];
            }
        }
        System.out.print(sumaB+"\n");


        int suma = 0;
        for (int i = 0; i<B.length; i++) {
            for (int j = 0; j<B[0].length; j++) {
                suma = A[i][j]+B[i][j];
                System.out.print(suma+"\t");
            }
        }


    }
}

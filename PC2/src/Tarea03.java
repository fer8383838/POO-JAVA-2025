//3.  Ingrese 20 números aleatorios y almacénelos en un vector A, y
// otros 20 números en un vector B, y determine cuántos números
// de A se encuentran en B y cuantos de B se encuentran en A.

public class Tarea03 {
    public static void main(String[] args) {

        int []A = new int[20];
        for (int i=0; i< A.length; i++){
            A[i]=(int)(Math.random()*100+1);;
        }
        for (int j = 0; j<A.length; j++) {
            System.out.print(A[j]+"\t");
        }
        System.out.print("\n");


        int [] B = new int[20];
        for (int i=0; i< B.length; i++){
            B[i]=(int)(Math.random()*20+1);;
        }
        for (int j = 0; j<B.length; j++) {
            System.out.print(B[j]+"\t");
        }
        System.out.print("\n");

        System.out.println("\n");
        int cont1 = 0;
        System.out.println("Los nuemros de A que se repiten en B son: ");
        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j<A.length; j++) {
                int contador = 0;
                if(A[i] == B[j]){
                    contador++;
                    if(contador>0) {
                        System.out.print(A[i] + "\t");
                        cont1++;
                    }
                }
            }
        }
        System.out.println("\n");
        System.out.println("La cantidad de numeros que se repiten es: "+cont1);

        System.out.println("\n");
        int cont2=0;
        System.out.println("Los numeros de B que se repiten en A son: ");
        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j<A.length; j++) {
                int contador = 0;
                if(B[i] == A[j]){
                    contador++;
                    if(contador>0) {
                        System.out.print(B[i] + "\t");
                        cont2++;
                    }
                }
            }
        }
        System.out.println("\n");
        System.out.println("La cantidad de numeros que se repiten es: "+ cont2);
    }
}
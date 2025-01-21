import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num;
        int Min, Max;
        int[] Numero = new int[5];
        for(int i = 0; i <Numero.length; i++){
            System.out.println("Ingrese Numero " + (i+1) + ": ");
            Num = sc.nextInt();
            Numero[i]=Num;
        }
        Min=Numero[0];
        Max=Numero[0];
        for(int i = 0; i < Numero.length; i++){
            if(Numero[i]<Min){
                Min=Numero[i];
            }
            if(Numero[i]>Max){
                Max = Numero[i];
            }
        }
        System.out.println("El numero minimo es: " + Min);
    }
}


import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        float neto;

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Ingrese cuanto son sus ingresos");
        neto = sc.nextFloat();

        if(edad >= 65 && neto < 930){
            System.out.println("Usted califica para el bono Yanapay");
        }else{
            System.out.println("Usted no califica para el bono Yanapay");
        }
    }
}

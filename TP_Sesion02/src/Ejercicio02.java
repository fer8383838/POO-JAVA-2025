import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int Num1,Num2;
        String Mensaje;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        Num1=Entrada.nextInt();
        System.out.print("Ingrese numero 2: ");
        Num2=Entrada.nextInt();
//        //forma1: con opTernario
//        Mensaje=(Num1>Num2)?"Numero 1 es mayor que el numero 2":"Numero 2 es mayor que el numero 1";
//        System.out.println(Mensaje);

        //forma2: Con if else
        if(Num1>Num2)
        {
            System.out.println("Numero 1 es mayor que el numero 2");
        }
        else
        {
            System.out.println("Numero 2 es mayor que el numero 1");
        }

    }
}

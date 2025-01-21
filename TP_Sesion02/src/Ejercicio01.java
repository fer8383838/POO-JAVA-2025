import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        double Num1,Num2;
        double Resultado;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Ingrese Numero 1: ");
        Num1=Entrada.nextDouble();
        System.out.print("Ingrese Numero 2: ");
        Num2=Entrada.nextDouble();
        Resultado=Num1*Num2;
        System.out.println("La Multiplicacion es: " + Resultado);
        if(Num2==0)
        {
            System.out.println("No es posible la division entre cero");
        }
        else
        {
            Resultado=Num1/Num2;
            System.out.printf("La division es: %f", Resultado);
        }
    }
}

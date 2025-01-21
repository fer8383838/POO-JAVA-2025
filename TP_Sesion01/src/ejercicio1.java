import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        float Soles, Dolares, TC;

        System.out.println("Ingrese la cantidad de soles: ");
        Soles = Entrada.nextFloat();

        System.out.println("Ingrese el tipo de cambio: ");
        TC = Entrada.nextFloat();

        Dolares = Soles / TC;

        System.out.printf("Convertido a dólares es: $ %.0f", Dolares);
    }
}

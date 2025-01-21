import java.util.Scanner;

public class ejercicio4 {

    static final double RMV = 1050;

    public static void main(String[] args) {

        Scanner Entrada= new Scanner(System.in);
        float Sueldo;
        double total;

        System.out.println("Ingrese sueldo: ");
        Sueldo = Entrada.nextFloat();


        total = Sueldo-(Sueldo*0.135 + Sueldo*0.02 + Sueldo*0.08)+(RMV*0.1 + RMV*0.4);

        System.out.println("El monto a pagar es:  " + total);
    }
}

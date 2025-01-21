import java.sql.SQLOutput;
import java.util.Scanner;

public class AppGasfitero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Nombres;
        String DNI;
        String Telefono;
        String esAlbañil;
        int Edad;
        double  Costo;


        System.out.print("Ingrese Nombres: ");
        Nombres = sc.nextLine();
        System.out.print("Ingrese DNI: ");
        DNI = sc.nextLine();

        System.out.print("Ingrese Telefono: ");
        Telefono = sc.nextLine();
        System.out.print("Es albañil? [true - false]: ");
        esAlbañil = sc.nextLine();
        System.out.print("Ingrese su edad [18 - 80]: ");
        Edad = sc.nextInt();
        System.out.print("Ingrese costo por hora: ");
        Costo = sc.nextDouble();

        Gasfitero c = new Gasfitero(Nombres, DNI, Telefono, esAlbañil, Edad, Costo);
        c.validarDNI();
        c.validarEdad();
        c.validarTelefono();
        System.out.println(c.Mostrar());


    }
}

import java.time.LocalDate;
import java.util.Scanner;

public class AppConsola {
    public static void main(String[] args) {
        String Nombre;
        Scanner Entrada = new Scanner(System.in);

        Cuenta objC = new Cuenta();  //Creacion de un objeto de loa clase cuenta
        objC.setTitular("Percy Gonzales");
        objC.setSaldo(500);
        objC.setFechaAper(LocalDate.of(2022,05,25));

        objC.Deposito(1000);
        objC.Retiro(300);
        objC.Deposito(800);

        System.out.println(objC.Mostrar());
    }
}

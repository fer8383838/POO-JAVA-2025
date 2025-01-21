import java.time.LocalDate;
import java.util.Scanner;

public class AppConsolaii {
    public static void main(String[] args) {
        String Nombre;
        Scanner Entrada = new Scanner(System.in);

        Cuentaii objC = new Cuentaii("Percy Gonzales", 500, LocalDate.of(2022,
                07,12));  //Creacion de un objeto de loa clase cuenta

        objC.Deposito(1000);
        objC.Retiro(300);
        objC.Deposito(800);

        Cuentaii obj2C = new Cuentaii("Jorge Castro", 50, LocalDate.of(2022,
                9, 1));

        System.out.println(objC.Mostrar());
        System.out.println(obj2C.Mostrar());
    }
}

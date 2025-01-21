import java.util.Scanner;

public class EmbarqueConsola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo de ladrillo [King Kong] [Pandereta]");
        String TipoLadrillo = sc.next();
        System.out.println("Ingresar  cantidad de ladrillos");
        double cantidad = sc.nextDouble();
        System.out.println("Ingrese Tipo de Envio [Paletizados] [Guinche]");
        String TipoEnvio = sc.next();

        Embarque objE = new Embarque("E001", "Percy Gonzales",
                 "King Kong", "Guinche", 2500);


        System.out.println(objE.Mostrar());
    }

}

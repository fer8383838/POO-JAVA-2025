import java.util.Scanner;

public class AppCantante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Codigo;
        String NombreArtistico;
        String NombreManager;
        String CancionPrincipal;
        int Albumes;
        int Celular;


        System.out.print("Ingrese codigo[int]: ");
        Codigo= sc.nextInt();
        System.out.print("Ingrese nombre artistico: ");
        NombreArtistico = sc.next();
        System.out.print("Ingrese nombre manager: ");
        NombreManager = sc.next();
        System.out.print("Ingrese cancion principal: ");
        CancionPrincipal = sc.next();
        System.out.print("Ingrese numero de Albumes: ");
        Albumes = sc.nextInt();
        System.out.print("Ingrese numero de celular: ");
        Celular = sc.nextInt();

        Cantante c = new Cantante(Codigo, NombreArtistico, NombreManager, CancionPrincipal, Albumes, Celular);
        c.validarCodigo();
        c.validarNombreArtistico();
        c.validarNombreManager();
        c.validarAlbumes();
        c.validarCelular();

        System.out.println(c.Imprimir());


    }

}

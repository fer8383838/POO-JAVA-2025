import java.util.Scanner;

public class Cantante {

    private int Codigo;
    private String NombreArtistico;
    private String NombreManager;
    private String CancionPrincipal;
    private int Albumes;
    private int Celular;


    public Cantante(int codigo, String nombreArtistico, String nombreManager, String cancionPrincipal, int albumes, int celular) {
        Codigo = codigo;
        NombreArtistico = nombreArtistico;
        NombreManager = nombreManager;
        CancionPrincipal = cancionPrincipal;
        Albumes = albumes;
        Celular = celular;
    }

    Scanner sc = new Scanner(System.in);

    public int validarCodigo(){
        while(!(Codigo >= 1000 && Codigo <= 10000)){
            System.out.println("El codigo no es valido");
            Codigo = sc.nextInt();
        }
        return Codigo;
    }

    public String validarNombreArtistico(){
        while(NombreArtistico.length() == 0){
            System.out.println("El nombre artistico esta vacio");
            NombreArtistico = sc.nextLine();
        }
        return NombreArtistico;
    }

    public String validarNombreManager(){
        while(NombreManager.length() == 0){
            System.out.println("El nombre manager esta vacio");
            NombreManager = sc.nextLine();
        }
        return NombreManager;
    }

    public int validarAlbumes(){
        while(!(Albumes >= 1 && Albumes <= 80)){
            System.out.println("Ingrese un numero valido");
            Albumes = sc.nextInt();
        }
        return Albumes;
    }

    public int validarCelular(){
        while(Celular <= 0){
            System.out.println("El campo celular esta vacio");
            Celular = sc.nextInt();
        }
        return Celular;
    }

    public String Imprimir(){
        return "---- Datos del Personal de Sistemas ----" +
                "\nCodigo: " + Codigo +
                "\nNombre Artistico: " + NombreArtistico +
                "\nNombre Manager: " + NombreManager +
                "\nCancion Principal: " + CancionPrincipal +
                "\nAlbumes: " + Albumes +
                "\nCelular: " + Celular;
    }

}

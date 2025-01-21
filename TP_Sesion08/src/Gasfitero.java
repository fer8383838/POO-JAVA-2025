import java.util.Scanner;

public class Gasfitero {

    private String Nombres;
    private String DNI;
    private String Telefono;
    private String EsAlbañil;
    private int Edad;
    private double Costo;

    Scanner sc = new Scanner(System.in);

    public Gasfitero(String nombres, String DNI, String telefono, String esAlbañil, int edad, double costo) {
        Nombres = nombres;
        this.DNI = DNI;
        Telefono = telefono;
        EsAlbañil = esAlbañil;
        Edad = edad;
        Costo = costo;
    }

    public String validarDNI(){
        while(DNI.length() != 8){
            System.out.println("Ingrese un DNI valido");
            DNI = sc.nextLine();
        }
        return DNI;
    }

    private String esAlbañil(){
        if (EsAlbañil.equals("true")){
            return "Es albañil";
        }else{
            return "No es albañil";
        }
    }

    public String validarTelefono(){
        while(Telefono.length() == 0){
            System.out.println("El telefono esta vacio");
            Telefono = sc.nextLine();
        }
        return Telefono;
    }

    public int validarEdad(){
        while(!(Edad >= 18 && Edad <= 80)){
            System.out.println("La edad no es valida");
            Edad = sc.nextInt();
        }
        return Edad;
    }

    public String Mostrar(){
        return "---- Datos del Personal de Sistemas ----" +
                "\nNombres: " + Nombres +
                "\nDNI: " + DNI +
                "\nTelefono: " + Telefono +
                "\n" + esAlbañil() +
                "\nEdad: " + Edad +
                "\nCosto por hora: " + Costo;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var mes = sc.nextLine();

        var result = switch(mes){
            case "Enero", "Febrero", "Diciembre" -> "Invierno";
            case "Marzo", "Abril", "Mayo"-> "Verano";
            case "Junio", "Julio", "Agosto" ->  "Otoño";
            case "Septiembre", "Octubre", "Noviembre" -> "Primavera";
            default -> "Ingrese un mes valido";
        };

        System.out.printf("El mes: %s ingresado corres a la estación %s ", mes, result);
    }
}

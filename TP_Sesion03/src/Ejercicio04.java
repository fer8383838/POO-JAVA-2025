
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Ingrese el numero del mes");
        mes = sc.nextInt();

        switch (mes){
            case 1:
                System.out.println("Es el mes de Enero");
                break;
            case 2:
                System.out.println("Es el mes de Febrero");
                break;
            case 3:
                System.out.println("Es el mes de Marzo");
                break;
            case 4:
                System.out.println("Es el mes de Abril");
                break;
            case 5:
                System.out.println("Es el mes de Mayo");
                break;
            case 6:
                System.out.println("Es el mes de Junio");
                break;
            case 7:
                System.out.println("Es el mes de Julio");
                break;
            case 8:
                System.out.println("Es el mes de Agosto");
                break;
            case 9:
                System.out.println("Es el mes de Septiembre");
                break;
            case 10:
                System.out.println("Es el mes de Octubre");
                break;
            case 11:
                System.out.println("Es el mes de Noviembre");
                break;
            case 12:
                System.out.println("Es el mes de Diciembre");
                break;
            default:
                System.out.println("Numero no valido");
        }

        switch (mes){
            case 12,1,2:
                System.out.println("Estamos en verano");
                break;
            case 3,4,5:
                System.out.println("Estamos en Otoño");
                break;
            case 6,7,8:
                System.out.println("Estamos en Invierno");
                break;
            case 9,10,11:
                System.out.println("Estamos en Primavera");
                break;

            default:
                System.out.println("Numero no valido");
        }
    }


}

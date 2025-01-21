import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        float Temperatura;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese temperatura: ");
        Temperatura=Entrada.nextFloat();

        if(Temperatura <=18 && Temperatura >=0){
            System.out.println("FRIO");
            System.out.println("FRIO ACEPTABLE");
        }else if(Temperatura < 0){
            System.out.println("MUCHO FRIO");
        } else if(Temperatura>18 && Temperatura<=30)
        {
            System.out.println("CALOR");
            System.out.println("CALOR ACEPTABLE");

        }else
        {
            System.out.println("MUCHO CALOR");
        }



    }
}
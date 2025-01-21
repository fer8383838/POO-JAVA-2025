import java.util.Scanner;

//Aplicar un aumento de sueldo para los hombres 10% del sueldo y para las mujeres 12% del sueldo
public class ClaseIfElse {
    public static void main(String[] args) {
        Scanner Entrada =new Scanner(System.in);
        double Sueldo;
        String Sexo;
        String Mensaje;
        System.out.print("Ingrese sueldo del trabajador: ");
        Sueldo= Double.parseDouble(Entrada.nextLine());
        System.out.print("Ingrese Sexo[H/M]: ");
        Sexo=Entrada.nextLine();

        //Operador Ternario
        Mensaje=(Sexo.equals("H"))?"Se aplico 10% de aumento":"Se aplico un 12% de aumento";

        if(Sexo.equals("H"))       //si
        {
            Sueldo=Sueldo+Sueldo*0.10;
        }
        else                //sino
        {
            Sueldo=Sueldo+Sueldo*0.12;
        }
        System.out.println(Mensaje);
        System.out.println("El nuevo sueldo es: " + Sueldo);

    }
}

/*Elaborar un programa para realizar la venta de productos de una bodega-Limite de productos(5) e
imprimir la boleta.*/
import java.util.Scanner;

public class Tarea05 {

    //procedimiento
    public static void MostrarOpciones()
    {
        System.out.println("********************* MENU DE OPCIONES ***********************");
        System.out.println("1.- Pollo 1Kg Precio: S/10.00");
        System.out.println("2.- Carne 1Kg Precio: S/40.00");
        System.out.println("3.- Leche 1L Precio: S/6.00");
        System.out.println("4.- Lata Atun Precio: S/7.00");
        System.out.println("5.- Yogurt 1L Precio: S/12.00");
        System.out.println("6.- Caja de ceral Precio: S/21.00");
        System.out.println("7.- Calcular");
    }

    public static void  RegistrarCliente(String[] Clientes, int IA)
    {
        String Var;
        Scanner sc = new Scanner(System.in);
        System.out.println("REGISTRAR UN NUEVO CLIENTE");
        System.out.print("Ingrese Nombre completo de Cliente: ");
        Var=sc.nextLine();
        Clientes[IA]=Var;
        IA+=1;
    }

    //funciones
    public static int LeerOpcion()
    {
        int N;
        Scanner sc = new Scanner(System.in);
        float total;
        float pollo = 0;
        float carne = 0;
        float leche = 0;
        float atun = 0;
        float yogurt = 0;
        float cereal = 0;

        do {
            System.out.print("Ingrese Opcion[1-7]: ");
            N=sc.nextInt();

            switch (N)
            {
                case 1:
                    System.out.println("Ingrese la cantidad que desee");
                    int cantidad = sc.nextInt();
                    pollo = 10 * cantidad;
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desee");
                    int cantidad2 = sc.nextInt();
                    carne = 40 * cantidad2;
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad que desee");
                    int cantidad3 = sc.nextInt();
                    leche = 6 * cantidad3;
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad que desee");
                    int cantidad4 = sc.nextInt();
                    atun = 7 * cantidad4;
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad que desee");
                    int cantidad5 = sc.nextInt();
                    yogurt = 12 * cantidad5;
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad que desee");
                    int cantidad6 = sc.nextInt();
                    cereal = 21 * cantidad6;
                    break;
                case 7:
                    System.out.println("FIN DEL PROGRAMA");
                    total = pollo + carne + leche + atun + yogurt + cereal;
                    System.out.printf("El total es %f \n", total);
                    break;
                default:
                    System.out.println("Error");
            }
        }while(N>7);
        return N;
    }

}

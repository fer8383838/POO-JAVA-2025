import java.util.Scanner;

public class Modularizacion {

    //procedimiento
    public static void MostrarOpciones()
    {
        System.out.println("********************* MENU DE OPCIONES ***********************");
        System.out.println("1.- Registrar Clientes");
        System.out.println("2.- Registrar Productos");
        System.out.println("3.- Registrar Ventas");
        System.out.println("4.- Listar Ventas");
        System.out.println("5.- Registrar Compras");
        System.out.println("6.- Listar Compras");
        System.out.println("7.- Salir");
    }

    public static void  RegistrarCliente(String[] Clientes, int IA)
    {
        String Var;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("REGISTRAR UN NUEVO CLIENTE");
        System.out.print("Ingrese Nombre completo de Cliente: ");
        Var=Entrada.nextLine();
        Clientes[IA]=Var;
        IA+=1;
    }

    //funciones
    public static int LeerOpcion()
    {
        int N;
        Scanner Entrada = new Scanner(System.in);

        do {
            System.out.print("Ingrese Opcion[1-7]: ");
            N=Entrada.nextInt();
        }while(N>7);

        return N;

    }

    public static void main(String[] args) {
        String[] Clientes=new String[100];
        int IA=0; //indice actual
        int op;

        do {
            MostrarOpciones();
            op=LeerOpcion();
            switch (op)
            {
                case 1:
                    RegistrarCliente(Clientes,IA);
                    break;
                case 2:
                    //RegistrarProducto();
                    break;
                case 7:
                    System.out.println("FIN DEL PROGRAMA");
            }
        }while (op!=7);

    }
}

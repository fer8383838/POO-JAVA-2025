import java.util.Scanner;


public class RestauranteV4 {

    static int IA = 0; //indice actual

    public static void MostrarOpciones() {
        System.out.println("****************** MENU DE OPCIONES *********************");
        System.out.println("1.- Registrar Cliente y Registrar Venta"); //registrar cliente y venta
        System.out.println("2.- Borrar Clientes"); //borra cliente y su venta
        System.out.println("3.- Buscar Clientes"); //lista venta y pregunta a cliente si está correcta
        System.out.println("4.- Imprimir Boleta de Venta"); //imprimir boleta por nombre de cliente y pedido
        System.out.println("5.- Platillo más vendido del día"); //Muestra los 3 primeros platillos más vendidos por total de pedidos acumulados
        System.out.println("6.- Listar Clientes"); //muestra lista de clientes
        System.out.println("7.- Salir");
    }

    public static void RegistrarCliente(String[] Clientes, String[] Sexo, int[] Edad, Object Orden[], Object Total[]) {
        String Var;
        String sex;
        int edad;
        int rpta;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("REGISTRAR UN NUEVO CLIENTE");
        System.out.print("Ingrese nombre completo de Cliente: ");
        Var = Entrada.nextLine();
        System.out.print("Ingrese sexo del cliente (M/F): ");
        sex = Entrada.next();
        System.out.print("Ingrese edad del cliente: ");
        edad = Entrada.nextInt();
        Clientes[IA] = Var;
        Sexo[IA] = sex;
        Edad[IA] = edad;

        do {
            System.out.println("Desea Grabar Cliente <1: Si | 2: No >?");
            rpta = Entrada.nextInt();
        } while (rpta < 1 || rpta > 2);

        if (rpta == 1) {
            int opcion, orden;
            int[] ordenes = new int[5];
            int total = 0;
            float totales[] = new float[5];
            String[] Platos = {"Arroz con pato", "Arroz con cabrito", "Causa Ferreñafa", "Lomo Saltado", "Ceviche Personal"};

            System.out.println("              RESTAURANTE SABOR CRIOLLO               ");
            System.out.println(" ");
            System.out.println("====== PLATOS A LA CARTA ======");
            System.out.println("(1) Arroz con pato S/.32.00");
            System.out.println("(2) Arroz con cabrito S/. 25.00");
            System.out.println("(3) Causa Ferreñafana S/. 30.00");
            System.out.println("(4) Lomo Saltado S/. 25.00");
            System.out.println("(5) Ceviche Personal S/. 25.00");
            System.out.println("(0) TERMINAR PEDIDO");

            do {
                System.out.println("Escoja una opción");
                opcion = Entrada.nextInt();

                if (opcion == 0) {
                    System.out.println("Ha finalizado su compra.....");
                } else {
                    do {
                        System.out.println("¿Cuántos platillos desea ordenar?");
                        orden = Entrada.nextInt();
                    } while (orden <= 0);

                    switch (opcion) {
                        case 1:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 32 * orden;
                            break;
                        case 2:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 25 * orden;
                            break;
                        case 3:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 30 * orden;
                            break;
                        case 4:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 25 * orden;
                            break;
                        case 5:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 25 * orden;
                            break;
                        default:
                            break;
                    }
                }
                total = total + 1;
            } while (opcion > 0 && opcion <= 5);
            System.out.println("Su pedido es.... ");
            for (int i = 0; i < Platos.length; i++) {
                if (ordenes[i] > 0) {
                    System.out.printf(" %s  -> %d   %f \n", Platos[i], ordenes[i], totales[i]);
                }
            }
            Orden[IA] = ordenes;
            Total[IA] = totales;
        }
        IA += 1;
    }

    public static void BorrarCliente(String[] Clientes) {
        String borra;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de cliente a borrar: ");
        borra = Entrada.nextLine();
        for (int x = 0; x < IA; x++) {
            if (Clientes[x].equals(borra)) {
                for (int z = x; z <= IA; z++) {
                    Clientes[z] = Clientes[z + 1];
                }
                IA--;
            }
        }
    }

    public static void BuscarCliente(String[] Clientes, String[] Sexo, int[] Edad) {
        Scanner Entrada = new Scanner(System.in);

        int pos;
        if (IA > 0) {
            muestraCliente(Clientes);
            do {
                System.out.println("Ingrese numero de cliente: ");
                pos = Entrada.nextInt();
            } while (pos < 1 || pos > IA);
            System.out.printf("%d -> %s, sexo %s, edad %s años \n", pos, Clientes[pos - 1], Sexo[pos - 1], Edad[pos - 1]);
        } else {
            System.out.println("No hay cliente registrado");
        }
    }

    public static void muestraCliente(String[] Clientes) {
        for (int i = 0; i < IA; i++) {
            System.out.printf("%d -> %s \n", (i + 1), Clientes[i]);
        }
    }

    public static void Imprimirboleta(String[] Clientes, Object[] Orden, Object[] Total) {
        Scanner Entrada = new Scanner(System.in);
        float total = 0;
        String[] Platos = {"Arroz con pato", "Arroz con cabrito", "Causa Ferreñafa", "Lomo Saltado", "Ceviche Personal"};
        int pos;
        if (IA > 0) {
            muestraCliente(Clientes);
            do {
                System.out.println("====== BOLETA DE VENTA ======");
                System.out.println("Ingrese numero de cliente: ");
                pos = Entrada.nextInt();
            } while (pos < 1 || pos > IA);
            System.out.printf("Cliente: %s\n", Clientes[pos - 1]);
            for (int j = 0; j < Platos.length; j++) {
                int[] ordenes = (int[]) Orden[pos - 1];
                float[] totales = (float[]) Total[pos - 1];
                if (ordenes[j] > 0) {
                    System.out.println("Plato: " + Platos[j]);
                    System.out.println("Cantidad: " + ordenes[j]);
                    System.out.println("Totales: " + totales[j]);
                    total = total + totales[j];
                    System.out.println("===================================");
                }
            }
        } else {
            System.out.println("No hay cliente registrado");
        }
    }

    public static void Platillomásvendido(Object[] Orden) {
        String[] Platos = {"Arroz con pato", "Arroz con cabrito", "Causa Ferreñafa", "Lomo Saltado", "Ceviche Personal"};
        Object num;
        int Min;
        int Max;
        if (IA > 0) {
            for (int j = 0; j < Platos.length; j++) {
                int[] ordenes = (int[]) Orden[0];
                {
                    Min= (int) Orden[0];
                    Max= (int) Orden[0];
                    for (int i = 0; i < Orden.length;i++)
                    {
                        if((int) Orden[i] < Min)
                        {
                            Min= (int) Orden[i];
                        }
                        if ((int)Orden[i]>Max)
                        {
                            Max=(int)Orden[i];
                        }

                    }
                    System.out.println("El platillo menos vendido es: " + Min);
                    System.out.println("El platillo más vendido es: " + Max);
                }
            }
        }
    }


    public static void ListarCliente(String[] Clientes, String[] Sexo, int[] Edad) {
        System.out.println("Lista de clientes: ");
        for (int x = 0; x < IA; x++) {
            System.out.printf("%d -> %s, sexo %s, edad %s años \n", (x+1), Clientes[x], Sexo[x], Edad[x]);

        }
    }

    //funciones
    public static int LeerOpcion() {
        int N;
        Scanner Entrada = new Scanner(System.in);

        do {
            System.out.print("Ingrese Opcion[1-7]: ");
            N = Entrada.nextInt();
        } while (N > 7);

        return N;

    }

    public static void main(String[] args) {
        String[] Clientes = new String[100];
        String[] Sexo = new String[100];
        int[] Edad = new int[100];
        Object[] Orden = new Object[100];
        Object[] Total = new Object[100];

        int op;

        do {
            MostrarOpciones();
            op = LeerOpcion();
            switch (op) {
                case 1:
                    RegistrarCliente(Clientes, Sexo, Edad, Orden, Total);
                    break;
                case 2:
                    BorrarCliente(Clientes);
                    break;
                case 3:
                    BuscarCliente(Clientes, Sexo, Edad);
                    break;
                case 4:
                    Imprimirboleta(Clientes, Orden, Total);
                    break;
                case 5:
                    Platillomásvendido(Orden);
                    break;
                case 6:
                    ListarCliente(Clientes, Sexo, Edad);
                    break;
                case 7:
                    System.out.println("FIN DEL PROGRAMA");
            }
        } while (op != 7);

    }

}


import java.util.Scanner;


public class AppRestaurante {

    static int IA = 0; //indice actual

    public static void MostrarOpciones() {
        System.out.println("****************** MENU DE OPCIONES *********************");
        System.out.println("1.- Registrar Cliente y Registrar Venta"); 
        System.out.println("2.- Borrar Clientes");
        System.out.println("3.- Buscar Clientes"); 
        System.out.println("4.- Imprimir Boleta de Venta"); 
        System.out.println("5.- Platillo más vendido del día"); 
        System.out.println("6.- Listar Clientes"); 
        System.out.println("7.- Salir");
    }

    public static void RegistrarCliente(String[] Clientes, String[] Sexo, int[] Edad, Object Orden[], Object Total[]) {
        String sex;
        int edad;
        int rpta;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("REGISTRAR UN NUEVO CLIENTE");
        
        NombreTeclado in = new  NombreTeclado ();
        String s1 = in.getString("Ingrese nombre completo");

        do {
        System.out.print("Ingrese sexo del cliente (M/F): ");
        sex = Entrada.next();
        }while (!(sex.equals("M") || sex.equals("F")));
        do {
        System.out.print("Ingrese edad del cliente: ");
        edad = Entrada.nextInt();
        }while (!(edad >0 && edad <120));
        Clientes[IA] = s1;
        Sexo[IA] = sex;
        Edad[IA] = edad;

        do {
            System.out.println("Desea Grabar Cliente <1: Si | 2: No >?");
            rpta = Entrada.nextInt();
        } while (rpta < 1 || rpta > 2);

        if (rpta == 1) {
            int opcion, orden;
            int[] ordenes = new int[10];
            int total = 0;
            float totales[] = new float[10];
            String[] Platos = {"Arroz con pato", "Arroz con cabrito", "Causa Ferreñafa", "Lomo Saltado", "Ceviche Personal","Fuente de ceviche",
            		"Gaseosa Inka Cola Personal", "Gaseosa Inka Cola 2L","Jarra de Chicha Morada","Jarra de Limonada"};

            System.out.println("              RESTAURANTE SABOR CRIOLLO               ");
            System.out.println(" ");
            System.out.println("====== PLATOS A LA CARTA ======");
            System.out.println("(1) Arroz con pato S/.32.00");
            System.out.println("(2) Arroz con cabrito S/. 25.00");
            System.out.println("(3) Causa Ferreñafana S/. 30.00");
            System.out.println("(4) Lomo Saltado S/. 25.00");
            System.out.println("(5) Ceviche Personal S/. 25.00");
            System.out.println("(6) Fuente de ceviche S/. 50.00");
            System.out.println("====== CARTA DE BEBIDAS ======");
            System.out.println("(7) Gaseosa Inka Cola Personal S/.3.00");
            System.out.println("(8) Gaseosa Inka Cola 2L S/.9.00");
            System.out.println("(9) Jarra de Chicha Morada S/.15.00");
            System.out.println("(10) Jarra de Limonada S/.20.00");
            System.out.println("(0) TERMINAR PEDIDO");

            do {
                do {
            	System.out.println("Escoja una opción");
                opcion = Entrada.nextInt();
                }while (!(opcion <11));
                if (opcion == 0) {
                    System.out.println("Ha finalizado su compra.....");
                } else {
                    do {
                        System.out.println("¿Cuántos platillos o bebidas desea ordenar?");
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
                        case 6:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 50 * orden;
                            break;
                        case 7:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 3 * orden;
                            break;
                        case 8:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 9 * orden;
                            break;
                        case 9:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 15 * orden;
                            break;
                        case 10:
                            ordenes[opcion - 1] += orden;
                            totales[opcion - 1] += 20 * orden;
                            break;
                        default:
                    }
                }
                total = total + 1;
            } while (opcion > 0 && opcion <= 10);
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
        int vTotalOrdenes[] = new int[Platos.length];
        int posMin = 0, posMax = 0;
        if (IA > 0) {
            for (int j = 0; j < IA; j++) {
                int[] ordenes = (int[]) Orden[j];
                //acumulamos el totald e ordenes
                for (int i = 0; i < Platos.length; i++) {
                    vTotalOrdenes[i] += ordenes[i];
                }
            }
            int Min = 0;
            int Max = vTotalOrdenes[0];
            for (int i = 0; i < Platos.length; i++) {
                if (vTotalOrdenes[i] < Min) {
                    Min = vTotalOrdenes[i];
                    posMin = i;
                }

                if (vTotalOrdenes[i] > Max) {
                    Max = vTotalOrdenes[i];
                    posMax = i;
                }
            }

            System.out.println("El platillo más vendido es: " + Platos[posMax] + " - " + Max + " pedidos");
        }
    }

    public static void ListarCliente(String[] Clientes, String[] Sexo, int[] Edad) {
        System.out.println("Lista de clientes: ");
        for (int x = 0; x < IA; x++) {
            System.out.printf("%d -> %s, sexo %s, edad %s años \n", (x + 1), Clientes[x], Sexo[x], Edad[x]);

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
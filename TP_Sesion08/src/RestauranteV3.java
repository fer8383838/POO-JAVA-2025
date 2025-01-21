/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantev3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RestauranteV3 {

    static int IA = 0; //indice actual

    public static void MostrarOpciones() {
        System.out.println("****************** MENU DE OPCIONES *********************");
        System.out.println("1.- Registrar Clientes");
        System.out.println("2.- Borrar Clientes");
        System.out.println("3.- Mostrar Carta y Registrar Venta");
        System.out.println("4.- Listar Venta");
        System.out.println("5.- Listar Clientes");
        System.out.println("6.- Salir");
    }

    public static void RegistrarCliente(String[] Clientes) {
        String Var;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("REGISTRAR UN NUEVO CLIENTE");
        System.out.print("Ingrese Nombre completo de Cliente: ");
        Var = Entrada.nextLine();
        Clientes[IA] = Var;
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

    public static void muestraCliente(String[] Clientes) {
        for (int i = 0; i < IA; i++) {
            System.out.printf("%d -> %s \n", (i + 1), Clientes[i]);
        }
    }

    public static void MostrarCarta(String[] Clientes, Object Orden[], Object Total[]) {
        Scanner Entrada = new Scanner(System.in);
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

        int rpta;
        do {
            System.out.println("Desea Grabar Pedido <1: Si | 2: No >?");
            rpta = Entrada.nextInt();
        } while (rpta < 1 || rpta > 2);

        if (IA > 0) {
            if (rpta == 1) {
                muestraCliente(Clientes);
                int pos;
                do {
                    System.out.println("Ingrese Numero de Cliente: ");
                    pos = Entrada.nextInt();
                } while (pos < 1 || pos > IA);

                Orden[pos - 1] = ordenes;
                Total[pos - 1] = totales;

            }
        } else {
            System.out.println("No hay clientes registrados");
        }

    }

    public static void ListarVenta(String[] Clientes, Object[] Orden, Object[] Total) {
        float total = 0;
        String[] Platos = {"Arroz con pato", "Arroz con cabrito", "Causa Ferreñafa", "Lomo Saltado", "Ceviche Personal"};

        System.out.println("============== PEDIDO ==========");
        for (int i = 0; i < IA; i++) {
            total = 0;
            System.out.printf("Cliente: %s\n", Clientes[i]);
            for (int j = 0; j < Platos.length; j++) {
                int[] ordenes = (int[]) Orden[i];
                float[] totales = (float[]) Total[i];
                if (ordenes[j] > 0) {
                    System.out.println("Plato: " + Platos[j]);
                    System.out.println("Cantidad: " + ordenes[j]);
                    System.out.println("Totales: " + totales[j]);
                    total = total + totales[j];
                    System.out.println("===================================");
                }

            }

            System.out.println("Total Consumido: " + total);
            System.out.println("===========================================");
        }
    }

    public static void ListarCliente(String[] Clientes) {
        System.out.println("Lista de clientes: ");
        for (int x = 0; x < IA; x++) {
            System.out.println(Clientes[x] + ",");

        }
    }

    //funciones
    public static int LeerOpcion() {
        int N;
        Scanner Entrada = new Scanner(System.in);

        do {
            System.out.print("Ingrese Opcion[1-6]: ");
            N = Entrada.nextInt();
        } while (N > 6);

        return N;

    }

    public static void main(String[] args) {
        String[] Clientes = new String[100];
        Object[] Ordenes = new Object[100];
        Object[] Totales = new Object[100];

        int op;

        do {
            MostrarOpciones();
            op = LeerOpcion();
            switch (op) {
                case 1:
                    RegistrarCliente(Clientes);
                    break;
                case 2:
                    BorrarCliente(Clientes);
                    break;
                case 3:
                    MostrarCarta(Clientes, Ordenes, Totales);
                    break;
                case 4:
                    ListarVenta(Clientes, Ordenes, Totales);
                    break;
                case 5:
                    ListarCliente(Clientes);
                    break;
                case 6:
                    System.out.println("FIN DEL PROGRAMA");
            }
        } while (op != 6);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RestauranteV3 {

    static int IA = 0; //indice actual

    public static void MostrarOpciones() {
        System.out.println("****************** MENU DE OPCIONES *********************");
        System.out.println("1.- Registrar Alumnos");
        System.out.println("2.- Borrar Alumnos");
        System.out.println("3.- Listar Alumnos");
        System.out.println("0.- Salir");
    }

    public static void IngresarDatos(String[] Alumnos) {
        String Var;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("REGISTRAR UN NUEVO Alumno");
        System.out.print("Ingrese Nombre completo de Alumno: ");
        Var = Entrada.nextLine();
        Alumnos[IA] = Var;
        IA += 1;
    }

    public static void BorrarAlumno(String[] Alumnos) {
        String borra;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de cliente a borrar: ");
        borra = Entrada.nextLine();
        for (int x = 0; x < IA; x++) {
            if (Alumnos[x].equals(borra)) {
                for (int z = x; z <= IA; z++) {
                    Alumnos[z] = Alumnos[z + 1];
                }
                IA--;
            }
        }
    }

    public static void muestraCliente(String[] Alumnos) {
        for (int i = 0; i < IA; i++) {
            System.out.printf("%d -> %s \n", (i + 1), Alumnos[i]);
        }
    }

    public static void MostrarDatos(String[] Alumnos) {
        Scanner Entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Escoja una opción");
            opcion = Entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Ha finalizado su registro.....");
            }
        } while (opcion > 0 && opcion <= 5);
        System.out.println("Su pedido es.... ");


        int rpta;
        do {
            System.out.println("Desea Grabar Pedido <1: Si | 2: No >?");
            rpta = Entrada.nextInt();
        } while (rpta < 1 || rpta > 2);



    }

    public static void MostrarAlumno(String[] Alumnos) {

        System.out.println("============== PEDIDO ==========");
        for (int i = 0; i < IA; i++) {
            System.out.printf("Alumnos: %s\n", Alumnos[i]);

            System.out.println("===========================================");
        }
    }

    public static void ListarCliente(String[] Alumnos) {
        System.out.println("Lista de Alumnos: ");
        for (int x = 0; x < IA; x++) {
            System.out.println(Alumnos[x] + ",");

        }
    }

    //funciones
    public static int LeerOpcion() {
        int N;
        Scanner Entrada = new Scanner(System.in);

        do {
            System.out.print("Ingrese Opcion[1-3]: ");
            N = Entrada.nextInt();
        } while (N > 5);

        return N;

    }

    public static void main(String[] args) {
        String[] Alumnos = new String[100];


        int op;

        do {
            MostrarOpciones();
            op = LeerOpcion();
            switch (op) {
                case 1:
                    IngresarDatos(Alumnos);
                    break;
                case 2:
                    BorrarAlumno(Alumnos);
                    break;
                case 3:
                    MostrarAlumno(Alumnos);
                    break;
                case 0:
                    System.out.println("FIN DEL PROGRAMA");
            }
        } while (op != 4);

    }

}

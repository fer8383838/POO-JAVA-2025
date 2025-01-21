package extra;

import extra.Secretaria;

import java.util.Scanner;

public class AppScretaria {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        String Codigo, Nombres;
        char Categoria, Condicion;
        System.out.print("Ingrese Codigo de extra.Secretaria: ");
        Codigo = Entrada.nextLine();
        System.out.print("Ingrese Nombres de extra.Secretaria: ");
        Nombres = Entrada.nextLine();
        System.out.print("Ingrese Categoria de extra.Secretaria[A-B]: ");
        Categoria = Entrada.nextLine().charAt(0);
        System.out.print("Ingrese Condicion de extra.Secretaria[E-C]: ");
        Condicion = Entrada.nextLine().charAt(0);


        Secretaria S1 = new Secretaria(Codigo, Nombres, Categoria, Condicion);
        Secretaria S2 = new Secretaria("S001", "Angela Morante", 'B', 'E');
        System.out.println(S1.Mostrar());
        System.out.println(S2.Mostrar());

    }
}

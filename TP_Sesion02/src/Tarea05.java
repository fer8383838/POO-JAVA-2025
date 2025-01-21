/*Escribir un programa que determine si un año es bisiesto. Un año es bisiesto si es múltiplo de 4 (por
ejemplo 1984)*/

import java.util.Scanner;

public class Tarea05 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un año");
        int ano = sn.nextInt();

        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0)) {
            System.out.println("El año " + ano + " es bisiesto");
        } else {
            System.out.println("El año " + ano + " no es bisiesto");
        }

    }

}

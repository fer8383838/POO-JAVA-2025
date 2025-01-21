/*Se requiere un programa que permita ingresar la edad de un Alumno. Si el usuario ingresa un valor
 errado(negativo o mayor a 80), deberá pedir nuevamente la edad. Si el valor ingresado es valido, el
programa mostrar la edad ingresada*/

import java.util.Scanner;

public class Tarea01 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese la edad del alumno");
            edad = sc.nextInt();

        }while(edad<0 || edad>20);

        System.out.println("La edad ingresada es: " + edad);

    }
}

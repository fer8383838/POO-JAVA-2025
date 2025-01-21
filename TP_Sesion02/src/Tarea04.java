/*Se ingresarán la cantidad de hombres, la cantidad de mujeres de un salón y el sistema mostrará los
porcentajes de hombres y mujeres. Determinar también como se distribuiría en grupos, según sea
Múltiplo de 5 y los sobrantes.*/


import java.util.Scanner;

public class Tarea04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hombres, mujeres;
        float total;
        System.out.println("Ingrese cantidad de hombres");
        hombres = sc.nextInt();
        System.out.println("Ingrese numero de mujeres");
        mujeres = sc.nextInt();
        total = hombres + mujeres;

        System.out.println("El porcentaje de hombres es "+(float)(hombres*100/total)+"%");
        System.out.println("El porcentaje de mujeres es "+(float)(mujeres*100/total)+"%");
    }
}

/*Se ingresarán la cantidad de niños, la cantidad de niñas de un
salón  de  clases  y  el  sistema  mostrará  los  porcentajes  de
hombres y mujeres. Determinar también como se distribuiría en
grupos, según sea Múltiplo de 6 y los sobrantes.*/

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hombres, mujeres;
        float total;
        System.out.println("Ingrese cantidad de hombres");
        hombres = sc.nextInt();
        System.out.println("Ingrese numero de mujeres");
        mujeres = sc.nextInt();
        total = hombres + mujeres;

        int sobran1 = hombres%6;
        int sobran2 = mujeres%6;
        int grupos1 = (int) ((hombres-sobran1)/6);
        int grupos2 = (int) ((mujeres-sobran2)/6);

        System.out.println("El porcentaje de hombres es "+(float)(hombres*100/total)+"%");
        System.out.printf("Los hombres se repartirian en %d grupos de 6 personas ", grupos1);
        System.out.printf(" y sobrarian %d hombres \n", sobran1);
        System.out.println("El porcentaje de mujeres es "+(float)(mujeres*100/total)+"%");
        System.out.printf("Las mujeres se repartirian en %d grupos de 6 personas", grupos2);
        System.out.printf(" y sobrarian %d mujeres", sobran2);
    }
}
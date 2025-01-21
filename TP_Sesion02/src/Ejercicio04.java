import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        int CH,CM;
        double Total,PH,PM;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Ingrese cantidad de hombres: ");
        CH=Entrada.nextInt();
        System.out.print("Ingrese cantidad de mujeres: ");
        CM=Entrada.nextInt();
        Total = CH+CM;
        PH=(CH*100)/Total;
        PM=(CM*100)/Total;
        System.out.printf("Porcentaje de Hombres: %.1f  \n",PH );
        System.out.printf("Porcentaje de Mujeres: %.1f  \n",PM );

        System.out.printf("Del total %.0f,Se formaran %.0f grupos de a 5 \n",Total,Math.floor(Total / 5) );
        System.out.println("Sobrantes: " + (Total % 5));


    }
}

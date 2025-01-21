import java.util.Scanner;

public class Restaurante2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion, orden;
        int []ordenes = new int[5];

        int total = 0;

        int totales [] = new int[5];



        System.out.println("======= A LA CARTA =======");
        String [] platos = {"(1) Arroz con pato S/.32.00","(2) Cabrito norteño S/. 25.00",
        "(3) Causa Ferreñafana S/. 30.00","(4) Arroz con mariscos S/. 25.00","(5) Ceviche S/. 25.00"};
        System.out.println("(0) TERMINAR PEDIDO");

        for (String al:platos) {
            System.out.println(al);
        }

        do{
            System.out.println("Escoja una opción");
            opcion = sc.nextInt();

            if(opcion == 0){
                System.out.println("Ha finalizado su compra.....");
            }else{
                do {
                    System.out.println("¿Cuántos platillos desea ordenar?");
                    orden = sc.nextInt();
                }while(orden <=0 );

                if(opcion == 1){
                    ordenes[opcion-1] = orden;
                    totales[opcion-1] = 32 * orden;

                }else if(opcion == 2){
                    ordenes[opcion-1] = orden;
                    totales[opcion-1]= 25 * orden;

                }else if(opcion == 3){
                    ordenes[opcion-1] = orden;
                    totales[opcion-1] = 30 * orden;

                }else if(opcion == 4){
                    ordenes[opcion-1] = orden;
                    totales[opcion-1] = 25 * orden;

                }else if(opcion == 5){
                    ordenes[opcion-1] = orden;
                    totales[opcion-1] = 25 * orden;

                }
            }
        } while(opcion > 0 && opcion <= 5);


        System.out.println("============== PEDIDO ==========" + "== CANTIDAD ==" + "== TOTAL ==");

        for (int i = 0; i < platos.length; i++) {
            if(ordenes[i] != 0){
                System.out.println(platos[i] +  "      ========= " + ordenes[i] + "  ======= S/." + totales[i]);

            }else{
                System.out.println("");
            }
        }

        /*for (int al:totales) {
            total += al;
        }
        System.out.println("=========================================================================");
        System.out.println(" ======================================= TOTAL ============== S/." + total);*/


        /*System.out.println("============== PEDIDO ==========" + "== CANTIDAD ==" + "== TOTAL ==");
        System.out.println("(1) Arroz con pato      S/. 32.00 ========= " + ordenes[0] + "  ======= S/." + totales[0]);
        System.out.println("(2) Cabrito norteño     S/. 25.00 ========= " + ordenes[1] + "  ======= S/." + totales[1]);
        System.out.println("(3) Causa Ferreñafana   S/. 30.00 ========= " + ordenes[2] + "  ======= S/." + totales[2]);
        System.out.println("(4) Arroz con mariscos  S/. 25.00 ========= " + ordenes[3] + "  ======= S/." + totales[3]);
        System.out.println("(5) Ceviche             S/. 25.00 ========= " + ordenes[4] + "  ======= S/." + totales[4]);
        System.out.println("=========================================================================");
        System.out.println(" ======================================= TOTAL ============== S/." + total);*/

    }
}
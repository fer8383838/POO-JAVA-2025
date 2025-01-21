import java.util.Scanner;

public class RestauranteSazonCriolla {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        int opcion, orden, orden1, orden2, orden3, orden4, orden5;
        double total, total1, total2, total3, total4, total5;
        orden1 = 0;
        orden2 = 0;
        orden3 = 0;
        orden4 = 0;
        orden5 = 0;
        total1 = 0;
        total2 = 0;
        total3 = 0;
        total4 = 0;
        total5 = 0;


        System.out.println("======= A LA CARTA =======");
        System.out.println("(1) Arroz con pato S/.32.00");
        System.out.println("(2) Cabrito norteño S/. 25.00");
        System.out.println("(3) Causa Ferreñafana S/. 30.00");
        System.out.println("(4) Arroz con mariscos S/. 25.00");
        System.out.println("(5) Ceviche S/. 25.00");
        System.out.println("(0) TERMINAR PEDIDO");

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
                    orden1 = orden;
                    total1 = 23 * orden;

                }else if(opcion == 2){
                    orden2 = orden;
                    total2 = 19 * orden;

                }else if(opcion == 3){
                    orden3 = orden;
                    total3 = 21 * orden;

                }else if(opcion == 4){
                    orden4 = orden;
                    total4 = 23 * orden;

                }else if(opcion == 5){
                    orden5 = orden;
                    total5 = 25 * orden;

                }
            }
        } while(opcion > 0 && opcion <= 5);

        total = total1 + total2 + total3 + total4 + total5;
        System.out.println("============== PEDIDO ==========" + "== CANTIDAD ==" + "== TOTAL ==");
        System.out.println("(1) Arroz con pato      S/. 32.00 ========= " + orden1 + "  ======= S/." + total1);
        System.out.println("(2) Cabrito norteño     S/. 25.00 ========= " + orden2 + "  ======= S/." + total2);
        System.out.println("(3) Causa Ferreñafana   S/. 30.00 ========= " + orden3 + "  ======= S/." + total3);
        System.out.println("(4) Arroz con mariscos  S/. 25.00 ========= " + orden4 + "  ======= S/." + total4);
        System.out.println("(5) Ceviche             S/. 25.00 ========= " + orden5 + "  ======= S/." + total5);
        System.out.println("=========================================================================");
        System.out.println(" ======================================= TOTAL ============== S/." + total);

    }
}

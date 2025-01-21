import java.util.Scanner;

public class Tarea01 {
    public static void main(String[] args) {

        int alum;
        Scanner sc = new Scanner(System.in);
        int[] Alum1 = new int[3];
        int[] Alum2 = new int[3];
        int[] Alum3 = new int[3];
        int[] Alum4 = new int[3];
        int[] Alum5 = new int[3];
        int[] Alum6 = new int[3];
        int[] Alum7 = new int[3];
        int[] Alum8 = new int[3];
        int[] Alum9 = new int[3];
        int[] Alum10 = new int[3];

        //float Promedio;

        System.out.println("Ingrese alumno: ");
        alum = sc.nextInt();
        switch (alum){
            case 1:
                float Suma = 0;
                float Promedio;
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i+1);
                    Alum1[i] = sc.nextInt();
                    Suma += Alum1[i];
                }
                for (int al:Alum1) {
                    System.out.println(al);

                }

                Promedio = (Suma/Alum1.length);
                System.out.println("El promedio es " + Promedio);
                break;
            case 2:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum2[i] = sc.nextInt();
                }
                for (int al:Alum2) {
                    System.out.println(al);
                }
                break;
            case 3:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum3[i] = sc.nextInt();
                }
                for (int al:Alum3) {
                    System.out.println(al);
                }
                break;
            case 4:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum4[i] = sc.nextInt();
                }
                for (int al:Alum4) {
                    System.out.println(al);
                }
                break;
            case 5:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum5[i] = sc.nextInt();
                }
                for (int al:Alum5) {
                    System.out.println(al);
                }
                break;

            case 6:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum6[i] = sc.nextInt();
                }
                for (int al:Alum6) {
                    System.out.println(al);
                }
                break;

            case 7:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum7[i] = sc.nextInt();
                }
                for (int al:Alum7) {
                    System.out.println(al);
                }
                break;
            case 8:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum8[i] = sc.nextInt();
                }
                for (int al:Alum8) {
                    System.out.println(al);
                }
                break;
            case 9:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum9[i] = sc.nextInt();
                }
                for (int al:Alum9) {
                    System.out.println(al);
                }
                break;
            case 10:
                for (int i = 0; i <=2; i++){
                    System.out.printf("Ingrese nota %d: ", i);
                    Alum10[i] = sc.nextInt();
                }
                for (int al:Alum10) {
                    System.out.println(al);
                }
                break;
        }
        /*for (int i = 1; i <= 3; i++){

        }*/

    }
}
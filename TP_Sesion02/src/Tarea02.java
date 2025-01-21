//Elaborar un programa que pida un número y determine cual es mayor y cual es menor.
import java.util.Scanner;

 class Tarea02 {
     public static void main(String[] args) {
         int n1, n2;
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el primer numero");
         n1 = sc.nextInt();
         System.out.println("Ingrese el segundo numero");
         n2 = sc.nextInt();

         if (n1 != n2){
             if (n1 < n2){
                 System.out.printf("%d es el numeor mayor", n2);

             } else{
                 System.out.printf("%d es el numero mayor", n1);
             }
         } else {
             System.out.println("Los numeros son iguales");
         }


     }
}

/*Solicitar el salario de un trabajador, Si el salario es mayor que 3,000 Soles, la suma otorgada por
concepto de Aguinaldo será del 20% del salario básico. Si el salario es igual o menor que 3,000 Soles,
la suma por concepto de Aguinaldo otorgado al empleado será del 30% del salario básico. Realizar
dichos cálculos para obtener el Neto.*/

import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        float salario, neto, aguinaldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el salario");
        salario = sc.nextFloat();
        if(salario > 3000){
            aguinaldo = (float) (salario* 0.2);
            neto = (salario + aguinaldo);
            System.out.println("El aguinaldo es :"+ aguinaldo);
            System.out.println("El salario neto es :"+ neto);
        }else{
            aguinaldo = (float)(salario*0.3);
            neto = (salario + aguinaldo);
            System.out.println("El aguinaldo es :"+ aguinaldo);
            System.out.println("El salario neto es: "+ neto);
        }
    }
}

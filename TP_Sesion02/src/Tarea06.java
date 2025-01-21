/*Ingresar las horas laboradas por un trabajador y su valor hora, con estos datos calcule su sueldo bruto.
Se le descontará 15% del sueldo bruto si pertenece a AFP o 13% si es ONP. Muestre el sueldo bruto, el
descuento en dinero y el sueldo neto.*/

import java.util.Scanner;

public class Tarea06 {
    public static void main(String[] args) {

        float horas, valor;
        float sueldo_bruto, descuento = 0, neto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de horas");
        horas = sc.nextFloat();
        System.out.println("Ingrese su valor hora");
        valor = sc.nextFloat();

        sueldo_bruto = horas * valor;
        System.out.println("El sueldo bruto es: "+ sueldo_bruto);
        System.out.println("Ingrese si pertenece al AFP o al ONP");
        String entrada = sc.next();
        if (entrada.equals("AFP"))  {
            descuento = (float)(sueldo_bruto*0.15);
            
        }else if (entrada.equals("ONP") ){
            descuento = (float)(sueldo_bruto*0.13);
        }else {
            System.out.println("Ingrese un string válido");
            entrada = sc.next();
        }
        System.out.println("El descuento es :"+ descuento);
        neto = sueldo_bruto - descuento;
        System.out.println("El sueldo neto es: "+neto);

    }
}

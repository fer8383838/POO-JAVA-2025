
import java.util.Scanner;

public class Tarea01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anno, anno_siguiente, dia, dia_siguiente, mes;
        int mes_siguiente;
        System.out.print("Ingresa el valor de anno: ");
        anno = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de dia: ");
        dia = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de mes: ");
        mes = in.nextInt();
        in.nextLine();
        if((dia==30&&(mes==4||mes==6||mes==9||mes==11))||dia==31||(mes==2&&(dia==29||(dia==28&&(anno%4!=0||anno%100==0)&&anno%400!=0))))
        {
            dia_siguiente=1;
            mes_siguiente=mes+1;
        }
        else
        {
            dia_siguiente=dia+1;
            mes_siguiente=mes;
        }
        if(mes_siguiente==13)
        {
            anno_siguiente=anno+1;
            mes_siguiente=1;
        }
        else
            anno_siguiente=anno;
        if(dia<1||dia>31||(mes==2&&dia>29)||((mes==4||mes==6||mes==9||mes==11)&&dia==31)||(mes==2&&dia==29&&(anno%4!=0||anno%100==0)&&anno%400!=0))
        {
            dia_siguiente=0;
            mes_siguiente=0;
            anno_siguiente=0;
            System.out.println("Dia incorrecto");
        }
        if(mes<1||mes>12)
        {
            dia_siguiente=0;
            mes_siguiente=0;
            anno_siguiente=0;
            System.out.println("Mes incorrecto");
        }
        /*if(anno<1000||anno>=10000)
        {
            dia_siguiente=0;
            mes_siguiente=0;
            anno_siguiente=0;
            System.out.println("Año incorrecto");
        }*/
        System.out.println("Valor de anno siguiente: " + anno_siguiente);
        System.out.println("Valor de dia siguiente: " + dia_siguiente);
        System.out.println("Valor de mes siguiente: " + mes_siguiente);
    }

}

import java.util.Scanner;

//Ingrese un numero que represente las 4 operaciones basicas "SRMD" y muestre el resultado para operar 2 numeros
public class ClaseSwitch {

    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in);
        int op;
        int Num1, Num2;
        double Resultado=0;
        System.out.print("Ingrese Numero 1: ");
        Num1=Entrada.nextInt();
        System.out.print("Ingrese Numero 2: ");
        Num2=Entrada.nextInt();
        System.out.print("Ingrese Operacion a realizar[1-4]: ");
        op=Entrada.nextInt();

    switch (op)
    {
        case 1:     //SUMA
            System.out.println("Operacion SUMA");
            Resultado=Num1+Num2;
            break;
        case 2:     //RESTA
            System.out.println("Operacion RESTA");
            Resultado=Num1-Num2;
            break;
        case 3:     //Multiplicacion
            System.out.println("Operacion MULTIPLICACION");
            Resultado=Num1*Num2;
            break;
        case 4:     //Division
            System.out.println("Operacion DIVISION");
            Resultado=Num1/Num2;
            break;
        default:    //otros casos
            System.out.println("Opcion NO valida");
    }
    if(Resultado>0)
        System.out.println("El resultado es: " + Resultado);

    }
}

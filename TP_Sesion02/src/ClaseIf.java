import java.util.Scanner;

//Si una compra sobrepasa los 500 soles, aplicar un descuento del 10%, Mostrar los importes
public class ClaseIf {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double MontoCompra, Descuento;
        System.out.print("Ingrese Monto de compra: ");
        MontoCompra=Entrada.nextDouble();
        if(MontoCompra>=500)
        {   //Aplicar el descuento
            Descuento=MontoCompra*0.1;
            System.out.println("Se aplico dscto 10%: " + Descuento);
            //MontoCompra=MontoCompra-Descuento;
            MontoCompra-=Descuento;
        }
        System.out.println("El total a pagar es: " + MontoCompra);
    }
}

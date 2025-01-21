package utilidades;
import modelos.Vehiculo;

public class CalculadoraImpuestos {

    public static void calcularImpuesto(Vehiculo vehiculo){
        System.out.println(vehiculo.getPrecio()*0.10);

    }

}
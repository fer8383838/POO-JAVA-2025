package modelos;

public class Moto extends Vehiculo{
    private final double cilindrada;

    public Moto(String marca, String modelo, double precio, double cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.print(" Cilindrada: "+getCilindrada()+"cc");
        System.out.printf("%n%n");
    }
}

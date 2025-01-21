package modelos;

public class Auto extends Vehiculo{

    private final String tipo;

    public Auto(String marca, String modelo, double precio, String tipo ) {
        super(marca, modelo, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.print(" Tipo: "+ getTipo());
        System.out.printf("%n%n");
    }


}

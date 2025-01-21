package modelos;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Vehiculo(){

    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarInfo(){
        System.out.printf("""
                        Información de los vehículos:
                        Marca: %s, Modelo: %s, 
                        Precio: $%.2f,                        
                        """.stripTrailing(), this.marca, this.modelo, this.precio
                );


    }

}

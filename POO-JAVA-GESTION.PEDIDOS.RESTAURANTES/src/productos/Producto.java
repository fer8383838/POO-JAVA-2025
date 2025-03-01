package productos;

public abstract class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
    public abstract void mostrarInfo();


}

public class Producto {

    private int id;
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    private static int contador = 0;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        Producto.contador++;
        this.id = contador;

    }
    public int getId(){
        return this.id;
    }

    public double getPrecio(){
        return this.precio;
    }
}

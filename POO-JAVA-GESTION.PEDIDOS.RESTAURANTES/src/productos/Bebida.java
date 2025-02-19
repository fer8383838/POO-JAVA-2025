package productos;

public class Bebida extends Producto{

    private String tamaño;

    public Bebida(String nombre, double precio, String tamaño){

        super(nombre, precio);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Información de la bebida");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Tamaño: "+this.tamaño);
    }
}

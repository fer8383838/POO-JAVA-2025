package productos;

public class Plato extends Producto{

    private String plato;

    public Plato(String nombre, double precio, String plato){
        super(nombre, precio);
        this.plato = plato;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Informacion Bebida");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Tipo: "+this.plato);
    }
}

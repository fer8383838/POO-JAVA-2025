public class Orden {

    private Producto [] productos;
    private int id = 0;
    private static int contador;

    public Orden(){
        contador++;
        this.id = contador;
        this.productos = new Producto[10];
    }



    public void agregarProductor(Producto producto){
        this.productos[producto.getId()-1] = producto;
        System.out.println("El producto ha sido agregado");

    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.productos.length; i++){
            if(productos[i] != null)
            total += productos[i].getPrecio();

        }
        return total;
    }
    public int getId(){
        return this.id;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: "+ this.getId());
        System.out.println("Total de la Orden: "+ calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < productos.length; i++){

            if(productos[i] != null) {
                Producto p = productos[i];
                System.out.println("  {id: " + p.getId() + ", nombre: " + p.getNombre() + ", precio: " + p.getPrecio() + "}" +
                        (i < contador - 1 ? "," : ""));
            }
        }
    }

}
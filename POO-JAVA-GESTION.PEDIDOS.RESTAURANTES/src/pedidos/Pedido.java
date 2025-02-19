package pedidos;
import personas.*;
import productos.*;

public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private double total;
    private int contador;

    public Pedido( Cliente cliente){
        this.cliente = cliente;
        this.productos = new Producto[10];
        this.total = 0;
        this.contador = 0;
    }

    public void agregarProducto(Producto p){
        if(p != null && contador < this.productos.length){
            productos[++contador] = p;
            total += p.getPrecio();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void calcularTotal(){
        System.out.println("Pedido de "+this.cliente.getNombre());
        System.out.println("El precio total es: "+this.total);
        System.out.println("El total de pedidos es: "+this.contador);
    }




}

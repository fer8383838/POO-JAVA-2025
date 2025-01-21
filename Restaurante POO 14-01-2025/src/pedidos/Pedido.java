package pedidos;

import usuarios.Cliente;
import productos.Producto;

public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private int contador;

    public Pedido (Cliente c) {

        this.cliente = new Cliente(c.getNombre(), c.getEmail(), c.getPuntosFidelidad());
        this.productos = new Producto[10];
        this.contador = 0;

    }

    public void agregarProducto(Producto producto){

        if(contador < productos.length){
            productos[contador] = producto;
            contador++;
        } else {
            System.out.println("No puede agregar mas productos");
        }
    }

    public void mostrarDetalle(){
        System.out.println("Pedido de: "+cliente.getNombre());

        for (int i = 0; i < contador; i++) {
            System.out.println("-"+ productos[i].getNombre() + " || Precio: "+ productos[i].getPrecio());

        }
    }

    public void calcularTotal(){
        double total = 0;

        for (int i = 0; i < productos.length; i++) {

            if(productos[i] == null){
                continue;
            }
            total += productos[i].getPrecio();

        }

        System.out.println("El toal del pedido es: "+ total);
    }


}

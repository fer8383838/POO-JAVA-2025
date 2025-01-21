package main;

import productos.Bebida;
import productos.Plato;
import usuarios.Cliente;
import pedidos.Pedido;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Fer", "h@mail.com",50);

        Pedido pedido1 = new Pedido(cliente1);

        Plato plato1 = new Plato("Lomo saltado", 18.00);
        Bebida bebida1 = new Bebida("Aeropuerto", 15.00);

        pedido1.agregarProducto(plato1);
        pedido1.agregarProducto(bebida1);

        pedido1.mostrarDetalle();

        pedido1.calcularTotal();





    }
}

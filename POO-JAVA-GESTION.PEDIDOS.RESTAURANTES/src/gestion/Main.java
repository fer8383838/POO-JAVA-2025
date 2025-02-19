package gestion;

import personas.Cliente;
import personas.Empleado;
import productos.Plato;
import productos.Bebida;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        // 🟢 Registrar clientes
        Cliente cliente1 = new Cliente("Luis");
        Cliente cliente2 = new Cliente("Ana");

        restaurante.registrarCliente(cliente1);
        restaurante.registrarCliente(cliente2);

        // 🟢 Registrar empleados
        Empleado empleado1 = new Empleado("Carlos", "Cocinero");
        Empleado empleado2 = new Empleado("Marta", "Mesera");

        restaurante.registrarEmpleado(empleado1);
        restaurante.registrarEmpleado(empleado2);

        // 🟢 Registrar productos
        restaurante.registrarProducto(new Plato("Lomo Saltado", 25.0, "Plato Fuerte"));
        restaurante.registrarProducto(new Plato("Arroz con Pollo", 20.0, "Plato Principal"));
        restaurante.registrarProducto(new Bebida("Chicha Morada", 5.0, "Mediano"));
        restaurante.registrarProducto(new Bebida("Jugo de Naranja", 6.0, "Grande"));

        // 🟢 Crear pedidos
        restaurante.crearPedido(001); // Pedido para Luis
        restaurante.crearPedido(002); // Pedido para Ana

        // 🟢 Agregar productos a pedidos
        restaurante.agregarProductoAPedido(001, "Lomo Saltado");
        restaurante.agregarProductoAPedido(001, "Chicha Morada");

        restaurante.agregarProductoAPedido(002, "Arroz con Pollo");
        restaurante.agregarProductoAPedido(002, "Jugo de Naranja");

        // 🟢 Mostrar todos los pedidos
        restaurante.mostrarPedidos();
    }
}

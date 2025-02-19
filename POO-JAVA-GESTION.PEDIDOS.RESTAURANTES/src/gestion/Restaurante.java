package gestion;

import personas.Cliente;
import personas.Empleado;
import productos.Producto;
import pedidos.Pedido;

public class Restaurante {
    private Cliente[] clientes;
    private Empleado[] empleados;
    private Producto[] productos;
    private Pedido[] pedidos;

    private int contadorClientes;
    private int contadorEmpleados;
    private int contadorProductos;
    private int contadorPedidos;

    public Restaurante() {
        this.clientes = new Cliente[10];
        this.empleados = new Empleado[5];
        this.productos = new Producto[20];
        this.pedidos = new Pedido[10];

        this.contadorClientes = 0;
        this.contadorEmpleados = 0;
        this.contadorProductos = 0;
        this.contadorPedidos = 0;
    }

    // 1️⃣ Registrar un cliente
    public void registrarCliente(Cliente c) {
        if (contadorClientes < clientes.length) {
            clientes[contadorClientes++] = c;
            System.out.println("Cliente registrado: " + c.getNombre());
        } else {
            System.out.println("No se pueden registrar más clientes.");
        }
    }

    // 2️⃣ Registrar un empleado
    public void registrarEmpleado(Empleado e) {
        if (contadorEmpleados < empleados.length) {
            empleados[contadorEmpleados++] = e;
            System.out.println("Empleado registrado: " + e.getNombre());
        } else {
            System.out.println("No se pueden registrar más empleados.");
        }
    }

    // 3️⃣ Registrar un producto
    public void registrarProducto(Producto p) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos++] = p;
            System.out.println("Producto agregado al menú: " + p.getNombre());
        } else {
            System.out.println("No se pueden registrar más productos.");
        }
    }

    // 4️⃣ Crear un pedido para un cliente específico
    public void crearPedido(int idCliente) {
        Cliente cliente = buscarCliente(idCliente); // Busca el cliente por ID
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        if (contadorPedidos >= pedidos.length) {
            System.out.println("No se pueden registrar más pedidos.");
            return;
        }

        Pedido nuevoPedido = new Pedido(cliente);
        pedidos[contadorPedidos++] = nuevoPedido;

        System.out.println("Pedido creado para: " + cliente.getNombre());
    }

    // 5️⃣ Agregar un producto a un pedido existente
    public void agregarProductoAPedido(int idCliente, String nombreProducto) {
        Pedido pedido = buscarPedidoPorCliente(idCliente); // Busca el pedido asociado al cliente
        Producto producto = buscarProducto(nombreProducto); // Busca el producto en el menú

        if (pedido == null) {
            System.out.println("No hay un pedido activo para este cliente.");
            return;
        }
        if (producto == null) {
            System.out.println("El producto no existe en el menú.");
            return;
        }

        pedido.agregarProducto(producto);
        System.out.println("Producto agregado al pedido de " + pedido.getCliente().getNombre());
    }

    // 6️⃣ Mostrar todos los pedidos registrados
    public void mostrarPedidos() {
        if (contadorPedidos == 0) {
            System.out.println("No hay pedidos registrados.");
            return;
        }
        System.out.println("\n📋 Lista de Pedidos:");
        for (int i = 0; i < contadorPedidos; i++) {
            pedidos[i].calcularTotal();
        }
    }

    // 🔍 Métodos de búsqueda interna

    private Cliente buscarCliente(int idCliente) {
        for (int i = 0; i < contadorClientes; i++) {
            if (clientes[i].getId() == idCliente) {
                return clientes[i];
            }
        }
        return null;
    }

    private Pedido buscarPedidoPorCliente(int idCliente) {
        for (int i = 0; i < contadorPedidos; i++) {
            if (pedidos[i].getCliente().getId() == idCliente) {
                return pedidos[i];
            }
        }
        return null;
    }

    private Producto buscarProducto(String nombreProducto) {
        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombreProducto)) {
                return productos[i];
            }
        }
        return null;
    }
}


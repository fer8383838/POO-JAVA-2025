package main;

import dao.ClienteDao;
import modelo.Cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClienteDao ClienteDao = new ClienteDao();

        // Crear un nuevo cliente y insertarlo en la base de datos
        Cliente nuevoCliente = new Cliente("Luis Fernando", "luis@example.com");
        ClienteDao.insertCliente(nuevoCliente);
        System.out.println("Cliente insertado.");



        // Recuperar y mostrar todos los clientes
        List<Cliente> clientes = ClienteDao.getAllClientes();
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Actualizar un cliente (ejemplo: cambiar nombre)
        if (!clientes.isEmpty()) {
            Cliente clienteAActualizar = clientes.get(0);
            clienteAActualizar.setNombre("Luis F.");
            ClienteDao.updateCliente(clienteAActualizar);
            System.out.println("Cliente actualizado.");
        }

        // Eliminar un cliente (ejemplo: eliminar el primer cliente)
        if (!clientes.isEmpty()) {
            int idClienteEliminar = clientes.get(0).getId();
            ClienteDao.deleteCliente(idClienteEliminar);
            System.out.println("Cliente eliminado.");
        }
    }
}

package dao;

import modelo.Cliente;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * ClienteDAO:
 * - Se encarga de la comunicación con la base de datos para operaciones CRUD de Cliente.
 * - Métodos:
 *   - insertCliente(Cliente): Inserta un nuevo cliente.
 *   - getAllClientes(): Recupera la lista de clientes.
 *   - updateCliente(Cliente): Actualiza los datos de un cliente.
 *   - deleteCliente(int id): Elimina un cliente por su id.
 */
public class ClienteDao {

    // Inserta un nuevo cliente en la tabla 'clientes'
    public void insertCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombre, email) VALUES (?, ?)";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Recupera todos los clientes de la tabla 'clientes'
    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                Cliente cliente = new Cliente(id, nombre, email);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    // Actualiza un cliente en la base de datos
    public void updateCliente(Cliente cliente) {
        String sql = "UPDATE clientes SET nombre = ?, email = ? WHERE id = ?";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getEmail());
            ps.setInt(3, cliente.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Elimina un cliente de la base de datos
    public void deleteCliente(int id) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


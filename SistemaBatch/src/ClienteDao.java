import java.sql.*;
import java.util.*;

public class ClienteDao {
    // Batch insert
    public void insertClientesBatch(List<Cliente> nuevos) {
        String sql = "INSERT INTO clientes(nombre,email) VALUES (?, ?)";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            con.setAutoCommit(false);
            for (Cliente c : nuevos) {
                ps.setString(1, c.getNombre());
                ps.setString(2, c.getEmail());
                ps.addBatch();
            }
            int[] resultados = ps.executeBatch();
            con.commit();
            System.out.println("Batch insert completado. Filas afectadas: " + Arrays.toString(resultados));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Batch update
    public void updateEmailsBatch(Map<Integer,String> nuevosEmails) {
        String sql = "UPDATE clientes SET email = ? WHERE id = ?";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            con.setAutoCommit(false);
            for (Map.Entry<Integer,String> e : nuevosEmails.entrySet()) {
                ps.setString(1, e.getValue());
                ps.setInt(2, e.getKey());
                ps.addBatch();
            }
            int[] resultados = ps.executeBatch();
            con.commit();
            System.out.println("Batch update completado. Filas afectadas: " + Arrays.toString(resultados));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Recuperar todos (para verificar)
    public List<Cliente> getAllClientes() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection con = ConnectionFactory.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
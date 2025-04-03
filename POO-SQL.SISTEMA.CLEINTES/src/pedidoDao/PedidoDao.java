package pedidoDao;

import pedido.Pedido;
import util.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDao {
    public List<Pedido> getPedidosPorCliente(int clienteId) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos WHERE cliente_id = ? ORDER BY fecha";

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, clienteId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    pedidos.add(new Pedido(
                            rs.getInt("id"),
                            rs.getInt("cliente_id"),
                            rs.getDate("fecha"),
                            rs.getDouble("total")
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
}

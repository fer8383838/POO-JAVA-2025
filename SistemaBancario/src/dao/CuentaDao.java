package dao;

import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CuentaDao {

    /**
     * Realiza una transferencia entre dos cuentas.
     * Se descuenta un monto de la cuenta origen y se acredita en la cuenta destino.
     * Si algo falla, se realiza rollback.
     *
     * @param cuentaOrigen id de la cuenta origen.
     * @param cuentaDestino id de la cuenta destino.
     * @param monto monto a transferir.
     * @throws SQLException en caso de error.
     */
    public void transferir(int cuentaOrigen, int cuentaDestino, double monto) throws SQLException {
        String debitar = "UPDATE cuentas SET saldo = saldo - ? WHERE id = ?";
        String acreditar = "UPDATE cuentas SET saldo = saldo + ? WHERE id = ?";

        try (Connection con = ConnectionFactory.getConnection()) {
            try {
                con.setAutoCommit(false);

                try (PreparedStatement psDebitar = con.prepareStatement(debitar)) {
                    psDebitar.setDouble(1, monto);
                    psDebitar.setInt(2, cuentaOrigen);
                    int filasDebitar = psDebitar.executeUpdate();
                    if (filasDebitar != 1) {
                        throw new SQLException("Error al debitar la cuenta origen.");
                    }
                }

                try (PreparedStatement psAcreditar = con.prepareStatement(acreditar)) {
                    psAcreditar.setDouble(1, monto);
                    psAcreditar.setInt(2, cuentaDestino);
                    int filasAcreditar = psAcreditar.executeUpdate();
                    if (filasAcreditar != 1) {
                        throw new SQLException("Error al acreditar la cuenta destino.");
                    }
                }

                con.commit();
                System.out.println("Transferencia completada exitosamente.");
            } catch (SQLException ex) {
                con.rollback();
                System.err.println("Transferencia fallida. Se realizó rollback.");
                throw ex;
            } finally {
                con.setAutoCommit(true);
            }
        }
    }

    // Método para obtener el saldo de una cuenta
    public double obtenerSaldo(int cuentaId) throws SQLException {
        String sql = "SELECT saldo FROM cuentas WHERE id = ?";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, cuentaId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("saldo");
                } else {
                    throw new SQLException("Cuenta no encontrada.");
                }
            }
        }
    }
}

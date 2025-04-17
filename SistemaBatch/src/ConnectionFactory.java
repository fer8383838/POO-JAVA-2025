import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:sqlserver://localhost;databaseName=SistemaClientes;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";      // o "sa"
    private static final String PASS = "Password123";     // tu contraseña

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

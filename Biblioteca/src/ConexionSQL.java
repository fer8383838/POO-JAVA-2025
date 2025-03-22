import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    public static void main(String[] args) {
        // Forzamos a la JVM a usar TLS 1.2.
        System.setProperty("jdk.tls.client.protocols", "TLSv1.2");

        // Asumiendo que el servidor ya acepta TLS 1.2.
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Biblioteca;"
                + "encrypt=true;trustServerCertificate=true;enabledTLSProtocols=TLSv1.2";

        String usuario = "sa";
        String contrasena = "Password123";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            if (conexion != null) {
                System.out.println("¡Conexión exitosa a la base de datos 'biblioteca' usando TLS 1.2!");
            }
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
    }
}
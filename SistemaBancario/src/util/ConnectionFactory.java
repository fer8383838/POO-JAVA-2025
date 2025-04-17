package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // Ajusta la URL, usuario y contraseña según tu configuración.
    // Aquí usamos la base de datos SistemaBancario sin cifrado para desarrollo.
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=SistemaBancario;encrypt=false;trustServerCertificate=true";
    private static final String USER = "sa";         // O el usuario que estés usando
    private static final String PASS = "Password123";    // Asegúrate de que sea la contraseña correcta

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

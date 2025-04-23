import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Lee db.properties y proporciona conexiones JDBC.
 */
public class ConnectionFactory {
    private static final String PROPS_FILE = "src/db.properties";
    private static String url, user, pass;

    // Este bloque se ejecuta una sola vez al cargar la clase
    static {
        Properties cfg = new Properties();
        try (FileInputStream fis = new FileInputStream(PROPS_FILE)) {
            cfg.load(fis);
            url  = cfg.getProperty("jdbc.url");
            user = cfg.getProperty("jdbc.user");
            pass = cfg.getProperty("jdbc.password");
        } catch (IOException e) {
            throw new ExceptionInInitializerError("No se pudo cargar " + PROPS_FILE + ": " + e.getMessage());
        }
    }

    /**
     * Devuelve una conexión JDBC usando los valores leídos.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
}
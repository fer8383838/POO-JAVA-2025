package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=SistemaClientes;encrypt=false;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "Password123";




    public static Connection getConnection() throws SQLException {
        System.out.println("Url: "+ URL);
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

}

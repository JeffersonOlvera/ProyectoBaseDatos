package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jeff
 */
public class ConexionBD {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // Cargar el driver JDBC
        Class.forName("oracle.jdbc.OracleDriver");

        // Establecer la conexión
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "DBPRUEBA";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
    
    
}

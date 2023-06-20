package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    // Conexión

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("oracle.jdbc.OracleDriver");

        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String username = "USUARIO";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }

}

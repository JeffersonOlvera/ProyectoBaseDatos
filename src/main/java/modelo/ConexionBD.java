package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

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

    public static void consultaCliente(Connection connection, String query) throws SQLException {
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Crear la declaración y ejecutar la consulta
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
 
                int idCliente = resultSet.getInt("id_cliente");
                System.out.println("Haciendo consulta...\n");
                System.out.println("id_cliente: " + idCliente);
            }
        } finally {
            // Cerrar el ResultSet, el Statement y la Connection
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }

}

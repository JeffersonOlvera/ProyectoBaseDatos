package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {

    public Connection conexion = null;

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@//localhost:1521/xe";
            String username = "USUARIO";
            String password = "root";
            conexion = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el driver JDBC de Oracle.");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al establecer la conexión con la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    }
}

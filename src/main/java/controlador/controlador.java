package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modelo.ConexionBD;

public class Controlador {

    public void inicio() {
        Connection connection = null;

        try {
            // Uso del0 metodo getConnection()
            connection = ConexionBD.getConnection();
                     
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontró el driver JDBC de Oracle.");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al establecer la conexión con la base de datos.");
            e.printStackTrace();
        } finally {
            // Cerrar la conexión para liberar recursos
            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
                try {
                    connection.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        }
    }
}

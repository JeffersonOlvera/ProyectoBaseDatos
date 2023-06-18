package controlador;

import java.sql.Connection;
import java.sql.SQLException;
import modelo.ConexionBD;

public class controlador {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Obtener la conexión utilizando el método getConnection()
            connection = ConexionBD.getConnection();
            
            System.out.println("CONEXIÓN CREADA CON EXITO");
            // Hacer algo con la conexión...
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver JDBC de Oracle.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión con la base de datos.");
            e.printStackTrace();
        } finally {
            // Cerrar la conexión
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        }
    }
}

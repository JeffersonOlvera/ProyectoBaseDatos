package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Validaciones {

    public static boolean verificarCorreoRegistrado(String correo) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sql = "SELECT COUNT(*) AS count FROM Usuario WHERE Correo = ?";

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, correo);
            result = statement.executeQuery();

            if (result.next()) {
                int count = result.getInt("count");
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean verificarPlaca(String placa) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sql = "SELECT COUNT(*) AS count FROM Camion WHERE N_Placa = ?";

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, placa);
            result = statement.executeQuery();

            if (result.next()) {
                int count = result.getInt("count");
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
    //Valida que las dos contraseñas sean iguale
    public static boolean validacionContrasena(String contrasena1, String contrasena2) {
        if (contrasena1.equals(contrasena2)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return false;
        }
    }
    
    

}

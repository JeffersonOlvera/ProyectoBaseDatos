package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GestionUsuarios {

    // Registro del cliente a la BD
    public static boolean registroCliente(Cliente newCliente) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;

        String sql = "INSERT INTO cliente (nombre, correo, contrasena) values (?,?,?)";

        try {

            statement = connection.prepareStatement(sql);
            statement.setString(1, newCliente.getNombre());
            statement.setString(2, newCliente.getCorreo());
            statement.setString(3, newCliente.getContrasena());

            // Ejecutar la consulta
            statement.execute();
            connection.close();
            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente.");
            e.printStackTrace();
        }
        return false;
    }

    // Registro del conductor a la BD
    public static boolean registroConductor(Conductor newConductor) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;

        String sql = "INSERT INTO conductor (nombre, correo, contrasena, modelo_camion, numero_placa) values (?,?,?,?,?)";

        try {
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, newConductor.getNombre());
            statement.setString(2, newConductor.getCorreo());
            statement.setString(3, newConductor.getContrasena());
            statement.setString(4, newConductor.getModeloCamion());
            statement.setString(5, newConductor.getNumPlaca());

            // Ejecutar la consulta
            statement.execute();
            connection.close();
            JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el conductor.");
            e.printStackTrace();
        }
        return false;
    }

    public static boolean autentificacionCliente(String correo, String contrasena) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sql = "SELECT correo, contrasena from cliente where correo = ? and contrasena = ?";

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, correo);
            statement.setString(2, contrasena);
            result = statement.executeQuery();

            while (result.next()) {

                return true;
            }
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un usuario y contraseña validos");
            e.printStackTrace();
        }
        return false;
    }

}

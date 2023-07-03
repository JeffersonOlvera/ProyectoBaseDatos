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
            //"Cliente registrado exitosamente."
            return true;

        } catch (SQLException e) {
            //"Error al registrar el cliente."
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
            //"Conductor registrado exitosamente."
            return true;

        } catch (SQLException e) {
            //"Error al registrar el conductor."
            e.printStackTrace();
        }
        return false;
    }

    public static String autentificacionUsuario(String correo, String contrasena) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sql = "SELECT 'cliente' AS tipo FROM cliente WHERE correo = ? AND contrasena = ? "
                + "UNION "
                + "SELECT 'conductor' AS tipo FROM conductor WHERE correo = ? AND contrasena = ?";

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, correo);
            statement.setString(2, contrasena);
            statement.setString(3, correo);
            statement.setString(4, contrasena);
            result = statement.executeQuery();

            if (result.next()) {
                String tipoUsuario = result.getString("tipo");
                connection.close();
                return tipoUsuario;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al autenticar el usuario");
            e.printStackTrace();
        }
        return null;

    }
}

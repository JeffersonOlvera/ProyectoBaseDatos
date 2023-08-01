package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.JOptionPane;

public class GestionUsuarios {

    // Registro del cliente a la BD
    public static boolean registroCliente(Cliente newCliente) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statementUsuario = null;
        PreparedStatement statementCliente = null;

        String sqlUsuario = "INSERT INTO Usuario (Id_Usuario, Nombre, Apellido, Correo, Contrasenia) VALUES (?, ?, ?, ?, ?)";
        String sqlCliente = "INSERT INTO Cliente (Id_Cliente, Id_Usuario) VALUES (?, ?)";

        try {

            int idCliente = generarId();
            int idUsuario = generarId();

            // Insertar en la tabla "Usuario"
            statementUsuario = connection.prepareStatement(sqlUsuario);
            statementUsuario.setInt(1, idUsuario);
            statementUsuario.setString(2, newCliente.getNombre());
            statementUsuario.setString(3, newCliente.getApellido());
            statementUsuario.setString(4, newCliente.getCorreo());
            statementUsuario.setString(5, newCliente.getContrasena());
            statementUsuario.executeUpdate();

            // Insertar en la tabla "Cliente"
            statementCliente = connection.prepareStatement(sqlCliente);
            statementCliente.setInt(1, idCliente);
            statementCliente.setInt(2, idUsuario);
            statementCliente.executeUpdate();

            connection.close();
            //"Cliente registrado exitosamente."
            return true;

        } catch (SQLException e) {
            //"Error al registrar el cliente."
            e.printStackTrace();
        }
        return false;
    }

//     Registro del conductor a la BD
    public static boolean registroConductor(Conductor newConductor) {
        Connection connection = ConexionBD.conectar();

        PreparedStatement statementUsuario = null;
        PreparedStatement statementConductor = null;
        PreparedStatement statementCamion = null;

        String sqlUsuario = "INSERT INTO Usuario (Id_Usuario, Nombre, Apellido, Correo, Contrasenia) VALUES (?, ?, ?, ?, ?)";
        String sqlConductor = "INSERT INTO Conductor (Id_Conductor, Id_Usuario, N_Conductor) VALUES (?, ?, ?)";
        String sqlCamion = "INSERT INTO Camion (Id_Camion, N_Placa, Modelo, Id_Conductor) VALUES (?, ?, ?, ?)";

        try {

            int idConductor = 2 * generarId();
            int idUsuario = 2 * generarId();
            int idCamion = 2 * generarId();
            // TENGO QUE BORRAR ESTO
            int N_conductor = 2 * generarId();

            System.out.println("ID Us " + idUsuario + idCamion + idConductor);
            statementUsuario = connection.prepareStatement(sqlUsuario);
            statementUsuario.setInt(1, idUsuario);
            statementUsuario.setString(2, newConductor.getNombre());
            statementUsuario.setString(3, newConductor.getApellido());
            statementUsuario.setString(4, newConductor.getCorreo());
            statementUsuario.setString(5, newConductor.getContrasena());
            statementUsuario.executeUpdate();

            statementConductor = connection.prepareStatement(sqlConductor);
            statementConductor.setInt(1, idConductor);
            statementConductor.setInt(2, idUsuario);
            statementConductor.setInt(3, N_conductor);
            statementConductor.executeUpdate();

            statementCamion = connection.prepareStatement(sqlCamion);
            statementCamion.setInt(1, idCamion);
            statementCamion.setString(2, newConductor.getNumPlaca());
            statementCamion.setString(3, newConductor.getModeloCamion());
            statementCamion.setInt(4, idConductor);
            statementCamion.executeUpdate();

            connection.close();
            //"Conductor registrado exitosamente."
            return true;

        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            //"Error al registrar el conductor."
            JOptionPane.showMessageDialog(null, "El usuario ya se encuentra registrado");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Antentificación / LOGIN 
    public static String autentificacionUsuario(String correo, String contrasena) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sqlCliente = "SELECT 'cliente' AS tipo FROM usuario u "
                + "JOIN cliente c ON u.Id_Usuario = c.Id_Usuario "
                + "WHERE u.correo = ? AND u.contrasenia = ?";

        String sqlConductor = "SELECT 'conductor' AS tipo FROM usuario u "
                + "JOIN conductor c ON u.Id_Usuario = c.Id_Usuario "
                + "WHERE u.correo = ? AND u.contrasenia = ?";

        try {
            // Comprobar si es un cliente
            statement = connection.prepareStatement(sqlCliente);
            statement.setString(1, correo);
            statement.setString(2, contrasena);
            result = statement.executeQuery();

            if (result.next()) {
                String tipoUsuario = result.getString("tipo");
                connection.close();
                return tipoUsuario;
            }

            // Comprobar si es un conductor
            statement = connection.prepareStatement(sqlConductor);
            statement.setString(1, correo);
            statement.setString(2, contrasena);
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

    //Generar los IDS para los usuarios
    private static int generarId() {
        UUID uuid = UUID.randomUUID();
        return uuid.hashCode();
    }

}

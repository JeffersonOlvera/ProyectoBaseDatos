package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.JOptionPane;

public class GestionUsuarios {

    // Registro del cliente a la BD
    public static boolean registroCliente(Cliente newCliente) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statementUsuario = null;
        PreparedStatement statementCliente = null;

        String sqlUsuario = "INSERT INTO Usuario (Id_Usuario, Nombre, Apellido, Correo, Contrasenia) VALUES (Inc_Usuario.NEXTVAL, ?, ?, ?, ?)";
        String sqlCliente = "INSERT INTO Cliente (Id_Cliente, Id_Usuario) VALUES (Inc_Cliente.NEXTVAL, Inc_Usuario.CURRVAL)";

        try {
            // Insertar en la tabla "Usuario"
            statementUsuario = connection.prepareStatement(sqlUsuario);
            statementUsuario.setString(1, newCliente.getNombre());
            statementUsuario.setString(2, newCliente.getApellido());
            statementUsuario.setString(3, newCliente.getCorreo());
            statementUsuario.setString(4, newCliente.getContrasena());
            statementUsuario.executeUpdate();

            // Insertar en la tabla "Cliente"
            statementCliente = connection.prepareStatement(sqlCliente);
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

        String sqlUsuario = "INSERT INTO Usuario (Id_Usuario, Nombre, Apellido, Correo, Contrasenia) VALUES (Inc_Usuario.NEXTVAL, ?, ?, ?, ?)";
        String sqlConductor = "INSERT INTO Conductor (Id_Conductor, Id_Usuario) VALUES (Inc_Conductor.NEXTVAL, Inc_Usuario.CURRVAL)";
        String sqlCamion = "INSERT INTO Camion (N_Placa, Modelo, Id_Conductor) VALUES (?, ?, Inc_Conductor.CURRVAL)";

        try {
            // Insertar en la tabla "Usuario"
            statementUsuario = connection.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS);
            statementUsuario.setString(1, newConductor.getNombre());
            statementUsuario.setString(2, newConductor.getApellido());
            statementUsuario.setString(3, newConductor.getCorreo());
            statementUsuario.setString(4, newConductor.getContrasena());
            statementUsuario.executeUpdate();

            // Insertar en la tabla "Conductor"
            statementConductor = connection.prepareStatement(sqlConductor);
            statementConductor.executeUpdate();

            // Insertar en la tabla "Camion"
            statementCamion = connection.prepareStatement(sqlCamion);
            statementCamion.setString(1, newConductor.getNumPlaca());
            statementCamion.setString(2, newConductor.getModeloCamion());
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

    public static AutenticacionResultado autenticacionUsuario(String correo, String contrasena) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sqlCliente = "SELECT u.Id_Usuario, 'cliente' AS tipo FROM usuario u "
                + "JOIN cliente c ON u.Id_Usuario = c.Id_Usuario "
                + "WHERE u.correo = ? AND u.contrasenia = ?";

        String sqlConductor = "SELECT u.Id_Usuario, 'conductor' AS tipo FROM usuario u "
                + "JOIN conductor c ON u.Id_Usuario = c.Id_Usuario "
                + "WHERE u.correo = ? AND u.contrasenia = ?";

        try {
            // Comprobar si es un cliente
            statement = connection.prepareStatement(sqlCliente);
            statement.setString(1, correo);
            statement.setString(2, contrasena);
            result = statement.executeQuery();

            if (result.next()) {
                int idCliente = result.getInt("Id_Usuario");
                String tipoUsuario = result.getString("tipo");
                connection.close();
                return new AutenticacionResultado(idCliente, tipoUsuario);
            }

            // Comprobar si es un conductor
            statement = connection.prepareStatement(sqlConductor);
            statement.setString(1, correo);
            statement.setString(2, contrasena);
            result = statement.executeQuery();

            if (result.next()) {
                int idConductor = result.getInt("Id_Usuario");
                String tipoUsuario = result.getString("tipo");
                connection.close();
                return new AutenticacionResultado(idConductor, tipoUsuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al autenticar el usuario");
            e.printStackTrace();
        }
        return null;
    }
}

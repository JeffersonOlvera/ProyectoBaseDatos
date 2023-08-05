package modelo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

    public static boolean verificarCedula(String cedula) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sql = "SELECT COUNT(*) AS count FROM Remitente WHERE Cedula = ?";

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, cedula);
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

    public static boolean verificarCodigoEnvio(int codEnvio) {
        Connection connection = ConexionBD.conectar();
        PreparedStatement statement = null;
        ResultSet result = null;

        String sql = "SELECT COUNT(*) AS count FROM Envio WHERE Codigo = ?";

        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, codEnvio);
            result = statement.executeQuery();

            if (result.next()) {
                int count = result.getInt("count");
                return count > 0;  // Retorna verdadero si count es mayor que cero, falso en caso contrario.
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

    public static void aplicarLimitadorDeLongitud(JTextField campo, int maximoCaracteres) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (campo.getText().length() >= maximoCaracteres) {
                    e.consume();
                }
            }
        });
    }

}

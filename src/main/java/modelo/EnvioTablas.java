package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EnvioTablas {

    public static DefaultTableModel obtenerEntregasAsignadas(int idUsuario) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JButton btnSeleccionar = new JButton("Seleccionar");
        btnSeleccionar.setBackground(new java.awt.Color(97, 150, 171));
        btnSeleccionar.setFont(new java.awt.Font("Arial Black", 1, 12));
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));

        model.addColumn("Nombre Remitente");
        model.addColumn("Apellido Remitente");
        model.addColumn("Direccion Remitente");
        model.addColumn("Nombre Destinatario"); // Agregado: Nombre del Destinatario
        model.addColumn("Direccion Destinatario");
        model.addColumn("Estado Envío");
        model.addColumn("Codigo Envio");
        model.addColumn("");
        String sql = "SELECT Remitente.Nombre AS NombreRemitente, Remitente.Apellido AS ApellidoRemitente, "
                + "Remitente.Direccion_P AS DireccionRemitente, Destinatario.Nombre AS NombreDestinatario, " // Agregado: Nombre del Destinatario
                + "Destinatario.Direccion_P AS DireccionDestinatario, Estado.Estado, Envio.Codigo "
                + "FROM Usuario "
                + "JOIN Conductor ON Usuario.Id_Usuario = Conductor.Id_Usuario "
                + "JOIN Camion ON Conductor.Id_Conductor = Camion.Id_Conductor "
                + "JOIN Envio ON Camion.Id_Camion = Envio.Id_Camion "
                + "JOIN Remitente ON Envio.Id_Remitente = Remitente.Id_Remitente "
                + "JOIN Destinatario ON Envio.Id_Destinatario = Destinatario.Id_Destinatario "
                + "JOIN Estado ON Envio.Id_Estado = Estado.Id_Estado "
                + "WHERE Usuario.Id_Usuario = ?";

        try (Connection connection = ConexionBD.conectar(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idUsuario);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {

                    Object[] row = new Object[8]; // Ajustado a 8 columnas
                    row[0] = resultSet.getString("NombreRemitente");
                    row[1] = resultSet.getString("ApellidoRemitente");
                    row[2] = resultSet.getString("DireccionRemitente");
                    row[3] = resultSet.getString("NombreDestinatario"); // Agregado: Nombre del Destinatario
                    row[4] = resultSet.getString("DireccionDestinatario");
                    row[5] = resultSet.getString("Estado");
                    row[6] = resultSet.getString("Codigo");
                    row[7] = btnSeleccionar;
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de envío.");
        }

        return model;
    }

    public static DefaultTableModel obtenerHistorialEnvios(int idUsuario) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Nombre Remitente");
        model.addColumn("Apellido Remitente");
        model.addColumn("Cedula Remitente");
        model.addColumn("Estado Envio");
        model.addColumn("Direccion Remitente");
        model.addColumn("Direccion Destinatario");
        model.addColumn("Codigo Envio");

        String sql = "SELECT Remitente.Nombre, Remitente.Apellido, Remitente.Cedula, Estado.Estado, "
                + "Remitente.Direccion_P AS DireccionRemitente, Destinatario.Direccion_P AS DireccionDestinatario, Envio.Codigo "
                + "FROM Usuario "
                + "JOIN Conductor ON Usuario.Id_Usuario = Conductor.Id_Usuario "
                + "JOIN Camion ON Conductor.Id_Conductor = Camion.Id_Conductor "
                + "JOIN Envio ON Camion.Id_Camion = Envio.Id_Camion "
                + "JOIN Remitente ON Envio.Id_Remitente = Remitente.Id_Remitente "
                + "JOIN Destinatario ON Envio.Id_Destinatario = Destinatario.Id_Destinatario "
                + "JOIN Estado ON Envio.Id_Estado = Estado.Id_Estado "
                + "WHERE Usuario.Id_Usuario = ?";

        try (Connection connection = ConexionBD.conectar(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idUsuario);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] row = new Object[7];
                    row[0] = resultSet.getString("Nombre");
                    row[1] = resultSet.getString("Apellido");
                    row[2] = resultSet.getString("Cedula");
                    row[3] = resultSet.getString("Estado");
                    row[4] = resultSet.getString("DireccionRemitente");
                    row[5] = resultSet.getString("DireccionDestinatario");
                    row[6] = resultSet.getInt("Codigo");
                    model.addRow(row);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de envío.");
        }

        return model;
    }

    public static DefaultTableModel obtenerHistorialCliente(int idUsuario) {

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Codigo Envio");
        model.addColumn("Direccion Remitente");
        model.addColumn("Direccion Destinatario");
        model.addColumn("Estado Envio");
        model.addColumn("Num de Placa del Camion");

        String sql = "SELECT Envio.Codigo, Remitente.Direccion_P AS DireccionRemitente, Destinatario.Direccion_P AS DireccionDestinatario, Estado.Estado, Camion.N_Placa "
                + "FROM Usuario "
                + "JOIN Cliente ON Usuario.Id_Usuario = Cliente.Id_Usuario "
                + "JOIN Envio ON Cliente.Id_Cliente = Envio.Id_Cliente "
                + "JOIN Remitente ON Envio.Id_Remitente = Remitente.Id_Remitente "
                + "JOIN Destinatario ON Envio.Id_Destinatario = Destinatario.Id_Destinatario "
                + "JOIN Estado ON Envio.Id_Estado = Estado.Id_Estado "
                + "JOIN Camion ON Envio.Id_Camion = Camion.Id_Camion "
                + "WHERE Usuario.Id_Usuario = ?";

        try (Connection connection = ConexionBD.conectar(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idUsuario);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] row = new Object[5];
                    row[0] = resultSet.getInt("Codigo");
                    row[1] = resultSet.getString("DireccionRemitente");
                    row[2] = resultSet.getString("DireccionDestinatario");
                    row[3] = resultSet.getString("Estado");
                    row[4] = resultSet.getString("N_Placa");
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de envío.");
        }

        return model;
    }

    public static void completarEnvios(String codigoEnvio) {
        String updateSql = "UPDATE Envio SET Id_Estado = ? WHERE Codigo = ?";
        int codEnvio = Integer.parseInt(codigoEnvio);

        try (Connection connection = ConexionBD.conectar(); PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
            int nuevoIdEstado = 1; // Cambia a 1 = "Completado"
            updateStatement.setInt(1, nuevoIdEstado);
            updateStatement.setInt(2, codEnvio);
            int rowsUpdated = updateStatement.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El envío con código: " + codigoEnvio + "Ha sido entregado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo entregar el envío con código: " + codigoEnvio);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al devolver el envio. Intente otra vez.");
        }
    }

    public static void cancelarEnvios(String codigoEnvio) {
        String updateSql = "UPDATE Envio SET Id_Estado = ? WHERE Codigo = ?";
        int codEnvio = Integer.parseInt(codigoEnvio);

        try (Connection connection = ConexionBD.conectar(); PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
            int nuevoIdEstado = 3; // Cambia a 3 = "Cancelado"
            updateStatement.setInt(1, nuevoIdEstado);
            updateStatement.setInt(2, codEnvio);
            int rowsUpdated = updateStatement.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El envío con código: " + codigoEnvio + "Ha sido devuelto");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo devolver el envío con código: " + codigoEnvio);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al devolver el envio. Intente otra vez.");
        }
    }

    public static DefaultTableModel buscarEnvioConCodigo(int codigoEnvio) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Nombre Remitente");
        model.addColumn("Apellido Remitente");
        model.addColumn("Cedula Remitente");
        model.addColumn("Estado Envio");
        model.addColumn("Direccion Remitente");
        model.addColumn("Direccion Destinatario");
        model.addColumn("Codigo Envio");

        String sql = "SELECT Remitente.Nombre, Remitente.Apellido, Remitente.Cedula, Estado.Estado, "
                + "Remitente.Direccion_P AS DireccionRemitente, Destinatario.Direccion_P AS DireccionDestinatario, Envio.Codigo "
                + "FROM Envio "
                + "JOIN Remitente ON Envio.Id_Remitente = Remitente.Id_Remitente "
                + "JOIN Destinatario ON Envio.Id_Destinatario = Destinatario.Id_Destinatario "
                + "JOIN Estado ON Envio.Id_Estado = Estado.Id_Estado "
                + "WHERE Envio.Codigo = ?";

        try (Connection connection = ConexionBD.conectar(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, codigoEnvio);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] row = new Object[7];
                    row[0] = resultSet.getString("Nombre");
                    row[1] = resultSet.getString("Apellido");
                    row[2] = resultSet.getString("Cedula");
                    row[3] = resultSet.getString("Estado");
                    row[4] = resultSet.getString("DireccionRemitente");
                    row[5] = resultSet.getString("DireccionDestinatario");
                    row[6] = resultSet.getInt("Codigo");
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de envío.");
        }

        return model;
    }

    public static DefaultTableModel generarFactura(int codEnvio) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Descripción");
        model.addColumn("Precio");

        String sql = "SELECT Destinatario.Descripcion, Metodo_Pago.Monto_Total "
                + "FROM Envio "
                + "JOIN Destinatario ON Envio.Id_Destinatario = Destinatario.Id_Destinatario "
                + "JOIN Metodo_Pago ON Envio.Id_Metodo_Pago = Metodo_Pago.Id_Metodo_Pago "
                + "WHERE Envio.Codigo = ?";

        try (Connection connection = ConexionBD.conectar(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, codEnvio);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] row = new Object[2];
                    row[0] = resultSet.getString("Descripcion");
                    row[1] = resultSet.getDouble("Monto_Total");
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de envío.");
        }

        return model;

    }

}
